package service;

import repository.EmployeeRepository;

public class EmployeeService {

    private EmployeeRepository repository =
            new EmployeeRepository();

    public void save(
            String name
    ) {

        try {

            if (
                    name == null
                    || name.trim().isEmpty()
            ) {

                throw new Exception(
                        "Name required"
                );

            }

            repository.save(
                    name
            );

        } catch (
                Exception e
        ) {

            System.out.println(
                    e.getMessage()
            );

        }

    }

}