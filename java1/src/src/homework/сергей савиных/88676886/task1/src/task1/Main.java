package task1;

public class Main {

    public static void main(String[] args) {
        System.out.println("==========Task 1==========");
        int[] array0 = {0,1,0,1,0,1,0,1,0,1};
        System.out.println("This is an incoming array");
        for(int i=0;i<array0.length;i++) {
            System.out.print(" "+array0[i]);
        }

        System.out.println("\n\n==========Task 2==========");
        for(int i=0;i<array0.length;i++) {
            if (array0[i] == 1) {
                array0[i]=0;
            } else {
                array0[i] =1;
            }
        }
        System.out.println("This is an inverted array");
        for(int i=0;i<array0.length;i++) {
            System.out.print(" "+array0[i]);
        }

        System.out.println("\n\n==========Task 3==========");
        int array1[] = new int[8];
        array1[0]=1;
        for(int i=1;i<array1.length;i++){
            array1[i]=array1[i-1]+3;
        }
        System.out.println("Generated array");
        for(int i=0;i<array1.length;i++) {
            System.out.print(" "+array1[i]);
        }

        System.out.println("\n\n==========Task 4-5==========");
        System.out.println("((2+3)*5)/2 = " + devide(multiply(plus((float) 2,(float) 3),(float) 5),(float) 2));

        System.out.println("\n\n==========Task 6==========");
        for(int i=0;i<array1.length;i++) {
            array1[i]=(int) (Math.random()*50) - 25;
        }
        System.out.println("Generated array");
        for(int i=0;i<array1.length;i++) {
            System.out.print(" "+array1[i]);
        }
        int min=0,max=0;
        for(int i=0;i<array1.length;i++) {
            if (min>array1[i]) {
                min=array1[i];
            }
            if (max<array1[i]) {
                max=array1[i];
            }
        }
        System.out.println("\nMin =" +min+". Max=" +max);
        System.out.println("\n==========This is the end==========");
    }

    public static float plus(float a,float b) {
        return a+b;
    }
    public static float minus(float a,float b) {
        return a-b;
    }
    public static float multiply(float a,float b) {
        return a*b;
    }
    public static float devide(float a,float b) {
        return a/b;
    }
}
