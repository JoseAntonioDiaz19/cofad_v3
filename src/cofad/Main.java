package cofad;

import views.login.Login;
import controllers.login.LoginController;

public class Main {

    public static void main(String[] args) {
        Login vista = new Login();
        LoginController ctrl = new LoginController(vista);
    }   
}