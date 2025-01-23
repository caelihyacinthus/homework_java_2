package mooc;

import mooc.logic.ApplicationLogic;
import mooc.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        ApplicationLogic app = new ApplicationLogic(new TextInterface());
        app.execute(3);
    }
}
