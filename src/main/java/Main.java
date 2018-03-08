import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User azaUser = new User("Aza", 24);
        userService.saveUser(azaUser);
        Auto subaruXV = new Auto("Subaru XV", "white metallic");
        subaruXV.setUser(azaUser);
        azaUser.addAuto(subaruXV);
        Auto subaruForrester = new Auto("Subaru Forrester", "Gray");
        subaruForrester.setUser(azaUser);
        azaUser.addAuto(subaruForrester);
        userService.updateUser(azaUser);

    }
}
