package svidersky.andrey.hometask1;


public class Main
{

    private static int add(int a, int b)
    {
        return a+b;
    }

    private static int sub(int a, int b)
    {
        return a-b;
    }
    private static int mul(int a, int b)
    {
        return a*b;
    }
    private static double div(int a, double b)
    {
        return a/b;
    }

    public static void main(String[] args)
    {
        int[] mas={0,1,0,1,0,1,0,1,0,1};

        for(int i=0; i<mas.length; i++)
        {
            if(mas[i]==0)
            {
                mas[i] = 1;
            }
            else
            {
                mas[i] = 0;
            }

        }

        for (int elem:mas)
            System.out.print(elem);
        System.out.println();

        int[]arr = new int[8];
        for(int i=0,dif=1; i<arr.length; i++)
        {
            arr[i]=dif;
            dif+=3;
        }
        for (int elem:arr)
            System.out.print(elem);
        System.out.println();

        System.out.println(div(mul(add(2,3),5),2));

        //if(args!=null && args.length>0)
        //    System.out.println(GetSumOfNumbers.getSumOfNumbers(args[0]));
        String s ="12 some text 3    7";
        System.out.println(GetSumOfNumbers.getSumOfNumbers(s));
        System.out.println(CountWord.countWords(s));
        GetCorrectChange t = new GetCorrectChange();
        int tempCents=101;
        System.out.println("Dollars= "+t.getCorrectChange(tempCents).get_dollars());
        System.out.println("Quaters= "+t.getCorrectChange(tempCents).get_quarters());
        System.out.println("Dimes= "+t.getCorrectChange(tempCents).get_dimes());
        System.out.println("Nickels= "+t.getCorrectChange(tempCents).get_nickels());
        System.out.println("Cents= "+t.getCorrectChange(tempCents).get_cents());



        Game myGame=new Game();
        myGame.gameStart();
        myGame=null;

    }


}
