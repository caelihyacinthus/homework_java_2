package lt.techin;
import java.util.stream.Stream;

public class BimBam {
    public static void main(String[] args) {
        bimBam(15);
    }

    /*
    Method prints each number from 1 to number on a new line.
    For each multiple of 3, print "Bim" instead of the number.
    For each multiple of 5, print "Bam" instead of the number.
    For numbers which are multiples of both 3 and 5, print "BimBam" instead of the number.
    1
    2
    Bim
    4
    Bam
    Bim
    .....
    14
    BimBam
    16
    */
    public static void bimBam(int number) {
        Stream.iterate(1, n -> n+1).limit(number).map(n -> n%3 == 0 ? (n%5 == 0 ? "BimBam" : "Bim") : n%5 == 0 ? "Bam" : n).forEach(System.out::println);
    }
}