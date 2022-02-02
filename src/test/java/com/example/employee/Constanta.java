package com.example.employee;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Constanta {

    public static final List<Employee> TRUE_LIST = List.of(
            new Employee("Ivanov", "Ivan", 30000, 1),
            new Employee("Gubin", "Andrey", 50000, 1),
            new Employee("Nigamatullin", "Ilyas", 60000, 2),
            new Employee("Nigamatullin", "Ildar", 80000, 2),
            new Employee("Khadiyatov", "Eduard", 45000, 3),
            new Employee("Krasnobayev", "Anton", 35000, 3)
        );
    public static final List<Employee> TRUE_LIST_1DEPARTMENT = List.of(
            new Employee("Ivanov", "Ivan", 30000, 1),
            new Employee("Gubin", "Andrey", 50000, 1)
    );

    public static final Map<Integer, List<Employee>> TRUE_MAPA = Map.ofEntries(
            Map.entry(1, List.of(new Employee("Ivanov", "Ivan", 30000, 1),
                    new Employee("Gubin", "Andrey", 50000, 1))),
            Map.entry(2, List.of(new Employee("Nigamatullin", "Ilyas", 60000, 2),
                    new Employee("Nigamatullin", "Ildar", 80000, 2))),
            Map.entry(3, List.of( new Employee("Khadiyatov", "Eduard", 45000, 3),
                    new Employee("Krasnobayev", "Anton", 35000, 3)))
    );


    public static final Employee DEPARTMENT1_MIN = new Employee("Ivanov", "Ivan", 30000, 1);
    public static final Employee DEPARTMENT1_MAX = new Employee("Gubin", "Andrey", 50000, 1);
    public static final Employee DEPARTMENT2_MIN = new Employee("Nigamatullin", "Ilyas", 60000, 2);
    public static final Employee DEPARTMENT2_MAX = new Employee("Nigamatullin", "Ildar", 80000, 2);
    public static final Employee DEPARTMENT3_MAX = new Employee("Khadiyatov", "Eduard", 45000, 3);
    public static final Employee DEPARTMENT3_MIN = new Employee("Krasnobayev", "Anton", 35000, 3);
}
