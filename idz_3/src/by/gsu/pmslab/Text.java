package by.gsu.pmslab;

import java.io.*;
import java.util.*;

public class Text {
    final static EnumSet<Punctuation> sentencePunctuation = EnumSet.range(Punctuation.EXCLAMATION, Punctuation.DISAMBIGUATION);
    final static EnumSet<Punctuation> nonSentencePunctuation = EnumSet.complementOf(sentencePunctuation);
    final static EnumSet<Punctuation> allPunctuation = EnumSet.allOf(Punctuation.class);

    private String fileAddress;

    private String wholeText;
    private List<Sentence> sentences;
    private Set<Word> words;

    public Text(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getWholeText() {
        return wholeText;
    }

    public void createtext() throws IOException{
        try (BufferedReader reader = new BufferedReader(new FileReader(fileAddress))){
            StringBuilder wholeTextBuilder = new StringBuilder();
            while (reader.ready()) {
                String buffer = reader.readLine();
                buffer = buffer.replaceAll("\\s+", " ");
                wholeTextBuilder.append(buffer);
                wholeTextBuilder.append('\r');
            }
            wholeText = wholeTextBuilder.toString();
        }catch (Exception e){
            throw e;
        }
    }

    public List<Sentence> getSentences(){
        if (sentences != null) return sentences;
        else {
            sentences = new ArrayList<>();
            if (wholeText != null && wholeText.length() > 0) {
                int startPosition = 0;
                int index;
                for (index = startPosition; index < wholeText.length(); index++) {
                    for (Punctuation punctuation : Text.sentencePunctuation) {
                        if (wholeText.charAt(index) == punctuation.getSymbol()) {
                            if (startPosition < index) {
                                Sentence buffer = new Sentence(getWholeText().substring(startPosition, index));
                                sentences.add(buffer);
                            }
                            startPosition = index + 1;
                        }
                    }
                }
                if (startPosition < index) {
                    Sentence buffer = new Sentence(getWholeText().substring(startPosition, index));
                    sentences.add(buffer);
                }
            }
            return sentences;
        }
    }

    public Set<Word> getWords(){
        if (words != null ) return words;
        else {
            words = new HashSet<>();
            if (sentences == null) {
                sentences = getSentences();
            }
            if (sentences.size() >0) {
                for (Sentence sentence : sentences){
                    words.addAll(sentence.getWords());
                }
            }
            return words;
        }
    }
}

