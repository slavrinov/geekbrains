package lesson1;

/**
 * Created by Сергей on 27.03.2016.
 */
public class Game {

    /*public Point yourStep() {

    return new Point(0,1);
    }

    public Point computerStep() {
        //логика
    }*/



    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            int n=3;
            try {
                n = Integer.parseInt(args[0]);
            }catch (Exception e) {
                e.printStackTrace();
            }

            int[][] table = new int[n][n];
            Game game = new Game();

        }

    }
    class Point{

        }
    }


