package ru.NEmpire.FreeProject;



/**
 * Created by Сергей on 27.03.2016.
 */
public class CountWord {

    public static int countWords(String s) {
        s = s + " ";
        int nWord = 0;
        for(int i = 1; i<s.length(); i++){
            if(s.charAt(i) == ' ' && s.charAt(i-1) != ' '){
                nWord++;
            }
        }
        return nWord;
    }

    public static void main(String[] args) {
        int res = countWords(" j fff        frgr  fer fe f ef ");
        System.out.println("res = " + res);
    }
}
