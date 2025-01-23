import itaphones.phone.AutomaticDialer;
import itaphones.phone.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new calling.Phone();
        System.out.println(AutomaticDialer.dial(phone));
    }
}
