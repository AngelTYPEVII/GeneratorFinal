package org.example;
import java.util.Random;

public class Generator {
    public static void main(String[] args){
        Random r = new Random();
        String str = "abcdefghijklmnopqrstuvwxyz";

        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 26;j++){
                char ch = str.charAt(r.nextInt(str.length()) );
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
