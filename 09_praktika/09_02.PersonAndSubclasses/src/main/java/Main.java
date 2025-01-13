import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("some", "somwhere 12, Ketterdam");
    }

    public static void printPersons(ArrayList<Person> persons){
        for (Person p: persons){
            System.out.println(p);
        }
    }
}
