package by.gsu.pmslab;

import java.util.*;

public class Sentence {

    String val;
    Set<Word> wordsInSentense;

    public Sentence(String string){
        val = string;
    }

    public String getVal() {
        return val;
    }

    public Set<Word> getWords() {
        if (wordsInSentense != null) return wordsInSentense;
        else {
            wordsInSentense = new HashSet<>();
            if (val != null && val.length() > 0) {
                int firstPos = 0;
                int i;
                for (i = firstPos; i < val.length(); i++) {
                    for (Punctuation punctuation : Text.allPunctuation) {
                        if (val.charAt(i) == punctuation.getSymbol()) {
                            if (firstPos < i) {
                                Word buffer = new Word(val.substring(firstPos, i));
                                wordsInSentense.add(buffer);
                            }
                            firstPos = i + 1;
                        }
                    }
                }
                if (firstPos < i) {
                    Word buffer = new Word(val.substring(firstPos,i));
                    wordsInSentense.add(buffer);
                }
            }
            return wordsInSentense;
        }
    }

    public boolean SimilarWord(Sentence sentence, Map<Word, Set<Sentence>> wordRange){
        for (Word word : sentence.getWords()) {
            if (wordRange.get(word).contains(this))
                return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sentence)) return false;
        Sentence sentence = (Sentence) obj;
        if (!val.equals(sentence.val)) return  false;
        return true;
    }

    @Override
    public int hashCode() {
        return val.hashCode();
    }
}
