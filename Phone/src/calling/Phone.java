package calling;

import itaphones.phone.MobilePhone;

public class Phone implements itaphones.phone.Phone {
    private final MobilePhone mobilePhone;
    private String response;

    public Phone(){
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
