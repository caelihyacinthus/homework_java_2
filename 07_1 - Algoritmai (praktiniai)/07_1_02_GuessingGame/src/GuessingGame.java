import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, otherwise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        while (lowerLimit != upperLimit){
            int newLimit = average(lowerLimit, upperLimit);
            boolean isGreater = isGreaterThan(newLimit);
            if (isGreater) {
                lowerLimit = newLimit + 1;
            } else {
                upperLimit = newLimit;
            }
        }
        System.out.println("The number you are thinking of is " + upperLimit);
    }

    public boolean isGreaterThan(int number){
        System.out.println("Is your number greater than " + number + "? (y/n)");
        char answer = reader.nextLine().charAt(0);
        return answer == 'y';
    }

    public int average(int num1, int num2){
        return (num1+num2)/2;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println();
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println();
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
