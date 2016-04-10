        package tree;

        import java.util.ArrayList;
        import java.util.NoSuchElementException;

public class Heap<T extends Comparable<T>> { // метод подключает интерфейс сортировки comparable

    private ArrayList<T> items; // создается доступная только из класса коллекция эррэйлист (расширяемый массив)

    public Heap() { //внешний метод бинарная куча
        items = new ArrayList<>(); //выделяется память под новую коллекцию
    }

    private void siftUp() { //метод отвечающий за перестановку элементов вверх по дереву
        int k = items.size() - 1; // переменная  К принимает значение последнего индекса эррейлиста
        while (k > 0) { //делаем прогон по всему эррейлисту
            int p = (k-1)/2; // переменная p отвечает за верхний узел дерева, в котором К является его ветвью (нижним элементом)
            T item = items.get(k); // задаем произвольному объекту индекс К в эррейлисте
            T parent = items.get(p); // задаем произвольному объекту-корню дерева индекс P в эррейлисте
            if (item.compareTo(parent) > 0) { // проверяем больше ли объект item чем объект parent согласно интерфейсу Comparable
                // swap меняем элементы местами
                items.set(k, parent); //меняем местами P и k
                items.set(p, item);

                // move up one level поднимаем элемент на уровень выше в дереве
                k = p; // приравниваем индекс листа дерева к его корню, повторяем операцию, пока объект не займет свое место в дереве
            } else {
                break;
            }
        }
    }

    public void insert(T item) { // метод добавления элемента в кучу
        items.add(item);
        siftUp();
    }

    private void siftDown() { // метод спускания элемента по ветвям
        int k = 0; // переменная берет начальный индекс эррейлиста
        int l = 2*k+1; // переменная берет первый индекс эррейлиста (l - левая ветвь)
        while (l < items.size()) { // проверяем на выход левой ветви за предел эррейлиста
            int max=l, r=l+1; // считаем максимальным значением левую ветвь,
            if (r < items.size()) { // there is a right child // проверяем на выход правой ветви за предел эррейлиста
                if (items.get(r).compareTo(items.get(l)) > 0) { //сравниваем объекты левой и правой ветвей
                    max++; // делаем максимумом правую ветвь
                }
            }
            if (items.get(k).compareTo(items.get(max)) < 0) { //проверяем
                // switch
                T temp = items.get(k); // заносим во временный элемент значение элемента k
                items.set(k, items.get(max)); // задаем k-му элементу значение содержащееся в элементе с max-индексом
                items.set(max, temp); //задаем элементу с индесом max значение хранимое в temp переменной (меняем элементы местами)
                k = max; // приравниваем индекс k индексу max (спускаемся вниз по дереву)
                l = 2*k+1; // приравниваем левому элементу новое значение  индекса ветви, повторяем операции пока не выдем за рамки эррейлиста
            } else {
                break;
            }
        }
    }

    public T delete()
            throws NoSuchElementException { //исключение об отсутствии элемента в ячейке (когда нет элемента в ячейке 0)
        if (items.size() == 0) {
            throw new NoSuchElementException();
        }
        if (items.size() == 1) {
            return items.remove(0); //опустошаем нулевую ячейку если не пуста
        }
        T hold = items.get(0);
        items.set(0, items.remove(items.size()-1));
        siftDown();
        return hold;
    }

    public int size() {
        return items.size();
    } //метод вызывающий размер кучи (эррейлиста)

    public boolean isEmpty() { //проверка на пустой эррейлист, возвращает сообщение о пустом массиве стандартными методами эррейлиста
        return items.isEmpty();

    }

    public String toString() {
        return items.toString();
    } // т.к. string не явялется потомком эррейлист, используем родителя абстракт коллекшн

    //public void deletefirst
}