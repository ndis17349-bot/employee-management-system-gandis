package controller;

import service.UserService;

public class LoginController {

    private UserService service =
            new UserService();

    public boolean login(
            String username,
            String password
    ) {

        return service.login(
                username,
                password
        );

    }

}