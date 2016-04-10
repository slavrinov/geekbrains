package ru.NEmpire.FreeProject;


import ru.NEmpire.FreeProject.Game.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        // Первый пункт.
        int[]  mas = new int[]{0, 1, 0, 1, 0, 1, 0, 1};
        System.out.println("First task.");
        print(mas);

        // Второй пункт.
        resive(mas);
        System.out.println("Second task.");
        print(mas);

        //Третий пункт
        int[] nMas = new int[8];
        nMas[0] = 1;
        for(int i = 1; i< nMas.length; i++){
            nMas[i] = nMas[i-1] + 3;
        }
        System.out.println("Three task.");
        print(nMas);

        // Пятый пункт.
        System.out.println("Fourth and fifth task");
        System.out.println("Result = " + div(multiplier(sum(2,3),5),2));
        //Task.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Write string: ");
            System.out.println("Number words: " + new CountWord().countWords(reader.readLine()));
            String g = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Крестики нолики.
        System.out.println("Press [Enter] for start game");
        // не доработано...
        Game game = new Game();
    }

    public static void resive(int[] mas){
        for(int i = 0; i<mas.length; i++){
            if(mas[i] == 0){
                mas[i] = 1;
            }
            else mas[i] = 0;
        }
    }
    public static void print(int[] mas){
        for(int i = 0; i<mas.length; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    // Четвертый пункт.
    public static int sum(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public static float div(float a, float b){
        return a/b;
    }
    public static int multiplier(int a, int b){
        return a*b;
    }
}
