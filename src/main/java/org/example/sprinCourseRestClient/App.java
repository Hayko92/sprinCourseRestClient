package org.example.sprinCourseRestClient;

import org.example.sprinCourseRestClient.conf.MyConfig;
import org.example.sprinCourseRestClient.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        for (Employee employee : allEmployees) {
//            System.out.println(employee);
//        }
//        System.out.println("+++++++++++++++++++++++++++++++");
//
//        Employee employee = communication.getEmployee(8);
//        System.out.println(employee);
//        System.out.println("==========================");
//        Employee employee1 = new Employee("Hayk","Asatryan","IT",1500);
//        communication.saveEmployee(employee1);
//        Employee employee2 = new Employee(8,"Hayk","Asatryan","IT",1500);
//        communication.saveEmployee(employee2);
        communication.deleteEmployee(8);

        ;

    }
}
