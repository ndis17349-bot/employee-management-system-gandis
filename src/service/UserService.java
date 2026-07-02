package service;

import repository.UserRepository;

public class UserService {

    private UserRepository repository =
            new UserRepository();

    public boolean login(
            String username,
            String password
    ) {

        try {

            if (
                    username == null
                    || username.trim().isEmpty()
            ) {
                return false;
            }

            if (
                    password == null
                    || password.trim().isEmpty()
            ) {
                return false;
            }

            return repository.login(
                    username,
                    password
            );

        } catch (Exception e) {

            return false;

        }

    }

}