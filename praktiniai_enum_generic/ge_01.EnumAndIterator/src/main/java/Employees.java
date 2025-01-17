import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Person> people;

    public Employees() {
        people = new ArrayList<>();
    }

    public void add(Person person) {
        people.add(person);
    }

    public void add(List<Person> people) {
        this.people.addAll(people);
    }

    public void print() {
        for (Person p : people) {
            System.out.println(p);
        }
    }


    public void print(Education education) {
        people.stream().filter(p -> p.getEducation() == education).forEach(System.out::println);
    }

    public void fire(Education education) {
        this.people = people.stream().filter(p -> p.getEducation() != education).toList();
    }
}
