package org.builder;

import org.builder.domain.Address;
import org.builder.domain.Phone;

public class Main {
    public static void main(String[] args) {

    Employee employee = new Employee.EmployeeBuilder()

            .setAge(24)
            .setName("Santiago")
            .setGender("Male")

            .SetAddress(new Address("Calle 9", "Neiva", "Colombia", "410002"))

            .setPhone(new Phone("310310310", "movil"))

            .SetContact("Camilo",
                    new Phone("855022", "fijo"),
                    new Address("Carrera 2", "Bogota", "Colombia", "451564"))

            .build();

        System.out.println("employee = " + employee);

    }
}