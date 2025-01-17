
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Pipe<Integer> pipes = new Pipe<>();

        pipes.putIntoPipe(2);
        pipes.putIntoPipe(3);
        pipes.putIntoPipe(4);

        System.out.println(pipes.takeFromPipe());
        System.out.println(pipes.takeFromPipe());
        pipes.putIntoPipe(5);
        System.out.println(pipes.takeFromPipe());
        System.out.println(pipes.takeFromPipe());
        System.out.println(pipes.isInPipe());
        pipes.putIntoPipe(1);
        System.out.println(pipes.isInPipe());
        System.out.println(pipes.takeFromPipe());

    }
}
