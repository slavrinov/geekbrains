package homework;



/**
 * Created by Zagorsky Vitaly on 07.04.2016.
 */
public class StackException extends Exception {

        public void PopException(GenericStack gs) throws StackException {
            if (gs.isEmpty())
                throw new StackException();
        }

        public void PushExeption(GenericStack gs) throws StackException {
            if (gs.isFull())
                throw new StackException();
        }
}
