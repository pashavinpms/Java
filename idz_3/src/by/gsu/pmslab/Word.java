package by.gsu.pmslab;

public class Word {

    String val;

    public Word(String string){
        val = string;
    }

    public String getVal() {
        return val;
    }

    @Override
    public String toString() {
        return val;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Word)) return false;
        Word word = (Word) obj;
        if (!val.equals(word.val)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return val.hashCode();
    }
}
