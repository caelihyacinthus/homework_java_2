public class Student extends Person{
    private int credit = 0;

    public Student(String name, String address){
        super(name, address);
    }

    public int credits(){
        return credit;
    }

    public void study(){
        credit++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  study credits " + credit;
    }
}
