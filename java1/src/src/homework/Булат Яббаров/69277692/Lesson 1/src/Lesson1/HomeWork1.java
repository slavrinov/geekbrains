package Lesson1;

public class HomeWork1 {
    public static void main(String[] args) {
        //Создаю массив arr состоящий из элементов 0 1 0 1 0 1 0 1 0 1.
        int[] arr = new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
        System.out.print("#1: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println();
        // Инвертирую массив arr.
        System.out.print("#2: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //Создаю и заполняю массив arr2 с помощью цикла.
        System.out.print("#3: ");
        int[] arr2 = new int[8];
        int j = 1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = j;
            j = j + 3;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        //Использую четыре написанных метода (+ - * /).
        System.out.print("#4: ");
        float fourth = plus(6,2);
        System.out.print("6 + 2 = " + fourth);
        fourth = minus(6,2);
        System.out.print("; 6 - 2 = " + fourth);
        fourth = mult(6,2);
        System.out.print("; 6 * 2 = " +  fourth);
        fourth = div(6,2);
        System.out.print("; 6 / 2 = " + fourth);
        System.out.println();
        //Только с помощью методов вычисляю значение выражения ( (2 + 3) * 5 ) / 2).
        System.out.print("#5: ");
        float a = plus(2,3);
        float b = mult(a,5);
        float c = div(b,2);
        System.out.print("((2 + 3)*5)/2 = " + c);
        System.out.println();
        //Задаю массив и нахожу минимальный и максимальный элементы.
        System.out.print("#6: ");
        int[] arr3 = new int[]{9, 3, 2, 4, 6, 5};
        int k = 0, s = arr3[0];
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] > k){
                k = arr3[i];
            }
        }
        for(int i = 0; i < arr3.length; i++){
            if(arr3[i] < s){s = arr3[i];}
        }
        System.out.print("Максимальное значение: " + k + "; минимальное значение: " + s);
    }
    //Метод для сложения
    public static float plus(float y, float x){
        float z;
        z = x + y;
        return z;
    }
    //Метод для вычитания.
    public static float minus(float x, float y){
        float z = x - y;
        return z;
    }
    //Метод для умножения.
    public static float mult(float x, float y){
        float z = x * y;
        return z;
    }
    //Метод для деления.
    public static float div(float x, float y){
        float z = x/y;
        return z;
    }
}
