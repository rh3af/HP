package com.example.restservice;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeManager {
    private static Employees list = new Employees();
    static
    {
        list.getEmployeeList().add
                (
                new Employee(
                        1,
                        "Hemanth",
                        "C",
                        "Tech Mahi",
                        "ram.hemanth3@gmail.com"

                )
            );
        list.getEmployeeList().add
                (
                        new Employee(
                                2,
                                "Shreya",
                                "D",
                                "IBM",
                                "spd.301297@gmail.com"

                        )
                );
        list.getEmployeeList().add
                (
                        new Employee(
                                3,
                                "Dhwani",
                                "P",
                                "RBC",
                                "dp.2311@gmail.com"

                        )
                );

    }
    public static Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee employee){
        list.getEmployeeList().add(employee);
    }
}
