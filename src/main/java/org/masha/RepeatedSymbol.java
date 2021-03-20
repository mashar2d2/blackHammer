package org.masha;

public class RepeatedSymbol {
    private char letter;
    private int count;

    public RepeatedSymbol() {
    }

    public RepeatedSymbol(char letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public char getLetter() {
        return letter;
    }

    public int getCount() {
        return count;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public void setCount(int count) {
        this.count = count;
    }

}


