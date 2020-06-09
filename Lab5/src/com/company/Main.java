package com.company;

public class Main {

    private static void myMethod() {
        System.out.println("In myMethod()");
    }

    private static void myMethod(int a) {
        System.out.println("In myMethod(int a = " + a + ")");
    }

    public static void main(String[] args) {
        Text text2 = new Text("Артем Дромашко - місцевий бандит, фермер. З самого дитинства любив ооп, тому що його батько фермер" +
                " і він також фермер. В дитинстві він також хотів стати фермером, але ооп йому подобалось більше. Артем - зразок справжнього чоловіка.");
        System.out.println(text2);
        Client client = new Client(text2);
        client.startLiveInTheSystem();
        System.out.println("Done!");
    }
}