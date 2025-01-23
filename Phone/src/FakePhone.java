import itaphones.phone.MobilePhone;
import itaphones.phone.Phone;

public class FakePhone implements Phone {
    private MobilePhone mobilePhone;
    private String response;

    public FakePhone(){
        mobilePhone = new MobilePhone();
        response = "";
    }
    @Override
    public void dial(String s) {
        response = mobilePhone.dial(s);
    }

    @Override
    public String getReponse() {
        return response;
    }
}
