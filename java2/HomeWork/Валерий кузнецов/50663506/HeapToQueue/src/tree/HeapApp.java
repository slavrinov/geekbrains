package tree;

import java.util.Scanner;

public class HeapApp {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Heap<Integer> hp = new Heap<Integer>(); // создаем дженерик объект кучи выделяя под нее память
        Scanner sc = new Scanner(System.in); // создаем новый сканер строки
        System.out.print("Enter next int, 'done' to stop, 'delete' to stop and delete first element: "); //выводим строку введите следующее инт значение или нажмите "хорош"
        String line = sc.next(); // создаем строку ввода
        while (!line.equals("done")) { //пока в строке не введут "хорош"
            if (line.equals("delete")){int max = hp.delete();System.out.println(max + " " + hp); break;}
            else {
            hp.insert(Integer.parseInt(line)); //вызываем метод добавление в кучу элемента
            System.out.println(hp); // выводим кучу
            System.out.print("Enter next int, 'done' to stop, 'delete' to stop and delete first element: "); //выводим строку для ввода
            line = sc.next();} //генерируем новую строку для ввода
        }


    }

}