package org.example.domain;

import org.example.exeption.UserAlreadyExistExeption;
import org.example.exeption.UserLoginFailedExeption;

import java.util.HashMap;
import java.util.Map;

public class UserData {
    private static Map<String, User> userMap = new HashMap<>();

    public void addUser(String login, String password) {

        if (login == null || login.isBlank() || password == null || password.isBlank()) {
            throw new UserAlreadyExistExeption();
        }
        boolean exist = userMap.containsKey(login);
        if (exist) {
            throw new UserAlreadyExistExeption();
        }
        User user = new User(login, password);
        userMap.put(login, user);

    }

    public void checkPassword(String login, String password) {
        boolean exist = userMap.containsKey(login);
        if (exist) {
            User user = userMap.get(login);

            if (password.equals(user.getPassword())) {
                return;
            }
        }
        throw new UserLoginFailedExeption();

    }
}
