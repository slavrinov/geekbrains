package lesson6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Сергей on 28.02.2016.
 */

    class Incremenator extends Thread
    {
        private volatile boolean mIsIncrement = true;

        public void changeAction()	//Меняет действие на противоположное
        {
            mIsIncrement = !mIsIncrement;
        }

        Lock lock = new ReentrantLock();

        @Override
        public void run()
        {


            lock.lock();
            // something

            lock.unlock();

            do
            {
                if(!Thread.interrupted())	//Проверка прерывания
                {
                    if(mIsIncrement) Program.mValue++;	//Инкремент
                    else Program.mValue--;			//Декремент

                    //Вывод текущего значения переменной
                    System.out.print(Program.mValue + " ");
                }
                else
                    return;		//Завершение потока

                try{
                    Thread.sleep(1000);		//Приостановка потока на 1 сек.
                }catch(InterruptedException e){
                    return;	//Завершение потока после прерывания
                }
            }
            while(true);
        }
    }

    class Program
    {
        //Переменая, которой оперирует инкременатор
        public static int mValue = 0;

        static Incremenator mInc;	//Объект побочного потока

        public static void main(String[] args)
        {
            mInc = new Incremenator();	//Создание потока

            System.out.print("Значение = ");

            mInc.start();	//Запуск потока

            //Троекратное изменение действия инкременатора
            //с интервалом в i*2 секунд
            for(int i = 1; i <= 3; i++)
            {
                try{
                    Thread.sleep(i*2*1000);		//Ожидание в течении i*2 сек.
                }catch(InterruptedException e){}

                mInc.changeAction();	//Переключение действия
            }

            mInc.interrupt();	//Прерывание побочного потока
        }
    }

