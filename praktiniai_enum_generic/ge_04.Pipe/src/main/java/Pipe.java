import java.util.LinkedList;
import java.util.Queue;

public class Pipe<T> {
    Queue<T> pipes = new LinkedList<>();

    public void putIntoPipe(T item){
        pipes.add(item);
    }

    public T takeFromPipe(){
        return pipes.poll();
    }

    public boolean isInPipe(){
        return !pipes.isEmpty();
    }
}
