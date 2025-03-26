package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.saveUser("Nata", "Efremova", (byte) 28);
        userService.saveUser("Pavel", "Makeev", (byte) 31);
        userService.saveUser("Anna", "Novikiva", (byte) 54);
    }
}


