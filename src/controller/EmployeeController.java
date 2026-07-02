package controller;

import service.EmployeeService;

public class EmployeeController {

    private EmployeeService service =
            new EmployeeService();

    public void save(
            String name
    ) {

        service.save(
                name
        );

    }

}