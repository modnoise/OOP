package com.company;

public class Client {
    private Text text;

    public Client(Text text) {
        this.text = text;
    }

    public void startLiveInTheSystem() {
        System.out.println("The word has been found in " + text.findWordEntrancesQuantity("фермером") + " sentences");
    }

}