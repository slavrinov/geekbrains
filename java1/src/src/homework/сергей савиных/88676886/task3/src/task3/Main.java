package task3;

import java.util.Scanner;

import static task3.CountPowerfullNumbers.countPowerfulNumbers;
import static task3.CountWord.countWords;
import static task3.GetCorrectChange.getCorrectChange;
import static task3.GetSumOfNumbers.getSumOfNumbers;

public class Main {

    public static void main(String[] args) {
        int dig;
        Scanner s;
        System.out.print("1: countWord\n2: GetCorrectChange\n3: getSumOfNumbers\n4: countPowerfulNumbers\nEnter the method number: ");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            dig = in.nextInt();
            switch (dig) {
                case 1:
                    System.out.println("Count of all words in line. Please enter the line");
                    s = new Scanner(System.in);
                    System.out.println("Word count=" + countWords(s.nextLine()));
                    break;
                case 2:
                    System.out.println("How much cents do you have?");
                    s= new Scanner(System.in);
                    if (s.hasNextInt()) {
                        GetCorrectChange.Change change = getCorrectChange(s.nextInt());
                        if (change != null) {
                            System.out.println("This is "+change.getDollars()+" dollar(s) "+change.getQuarters()+" qarter(s) "+change.getDimes()+" dime(s) "+change.getNickels()+" nikel(s) "+change.getCents()+" cent(s)");
                        } else {
                            System.out.println("Summ cab't be negative");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Summ of all numbers in line. Please enter the line");
                    s = new Scanner(System.in);
                    //MyMath.sqrt(100);
                    System.out.println("Summ =" + getSumOfNumbers(s.nextLine()));
                    break;
                case 4:
                    System.out.println("Enter the segment borders");
                    System.out.print("from:");
                    s = new Scanner(System.in);
                    if (s.hasNextInt()) {
                        int from = s.nextInt();
                        if (from < 0) {
                            System.out.println("Incorrect 'from'");
                            break;
                        }
                        System.out.print("to:");
                        s = new Scanner(System.in);
                        if (s.hasNextInt()) {
                            int to = s.nextInt();
                            if (to < 0) {
                                System.out.println("Incorrect 'from'");
                                break;
                            }
                            if (from < to) {
                                System.out.println("\nCount of powerful numbers = " + countPowerfulNumbers(from, to));
                            } else {
                                System.out.println("'to' must be more then 'from'");
                            }
                        } else {
                            System.out.println("Wrong 'to' format");
                        }
                    } else {
                        System.out.print("Wrong 'from' format");
                    }
                    break;
                default:
                    System.out.println("\nBye bye!");
                    break;
            }
        }
    }

    static class MyMath {

        static  double sqrt(double a){
            return Math.sqrt(a);
        }

    }
}
