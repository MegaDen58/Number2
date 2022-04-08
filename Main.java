package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String word = in.nextLine();
        maxWordLength(word);
    }
    public static void maxWordLength(String word){
        String result = "";;
        int max = 0;
        String[] words = word.split(" ");
        for(String t : words){
            int c = t.length();
            if(c > max){
                max = c;
                result = t;
            }
        }
        System.out.printf("Максимально длинное(ые) слово(а) состоит(ят) из %d символа(ов)\nСлово(а): \n", max);
        for(String t : words){
            if(t.length() == max){
                result = t;
                System.out.println(result);
            }
        }
    }
}
