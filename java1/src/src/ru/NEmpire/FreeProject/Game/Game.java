package ru.NEmpire.FreeProject.Game;

import java.util.Date;

/**
 * Created by Василий on 27.03.2016.
 */
public class Game {
    ru.NEmpire.FreeProject.Game.Table table;
    long time;
    //const v ;
    //final v;
    Date date = new Date();



    public Game(){
        table = new ru.NEmpire.FreeProject.Game.Table('▦');
        time = date.getTime();
        while (true){
            date = new Date();
            if(time + 100 < date.getTime()){
                table.render();
                time = date.getTime();
                System.out.println("cls");
            }

        }


    }

}
