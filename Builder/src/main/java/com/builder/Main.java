package com.builder;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()

                .setAge(24)
                .setName("Santiago")
                .setGender("male")
                .setAddress("Calle 39", "Neiva", "Colombia", "4100002")
                .setPhone("3103103102", "movil")

                .build();

        System.out.println("employee = " + employee);

    }
}

