package com.company;

public class Punctuation extends SentenceElement {
    private String symbols;


    public Punctuation(String symbols) {
        this.symbols = symbols;
    }

    @Override
    public String toString() {
        return symbols;
    }
}
