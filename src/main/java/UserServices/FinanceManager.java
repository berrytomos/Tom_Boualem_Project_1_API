package UserServices;
import model.User;
import UserServices.UserService;

import java.security.NoSuchAlgorithmException;


public class FinanceManager extends User {

    public void manager() throws NoSuchAlgorithmException {

        UserService login = new UserService();
        login.login();
    }

    public void viewAll() {

    }

    public void viewByType() {

    }

    public void approveOrDeny () {

    }


}
