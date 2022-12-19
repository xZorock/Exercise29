package it.develhope.exercise29;

public class Start {
    public static void main(String[] args) {

        String string1 = "Hello";
        String string2 = "How are you?";

        String string3 = string1.substring(0,2);
        String string4 = string2.substring(10,12);

        String string5 = string3 + string4;

        char[] charArray = string5.toCharArray();

        System.out.println(charArray);
    }
}
