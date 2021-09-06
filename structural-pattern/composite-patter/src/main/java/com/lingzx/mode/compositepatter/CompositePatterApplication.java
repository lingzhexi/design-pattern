package com.lingzx.mode.compositepatter;

import com.lingzx.mode.compositepatter.composite.Employee;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositePatterApplication {

    public static void main(String[] args) {

        Employee ceo = new Employee("张三", "CEO", 30000);

        Employee headSales = new Employee("李四","Head Sales", 20000);
        Employee headMarketing = new Employee("王五","Head Marketing", 20000);

        Employee clerk1 = new Employee("王六","Marketing", 10000);
        Employee clerk2 = new Employee("王七","Marketing", 10000);

        Employee salesExecutive1 = new Employee("王八","Sales", 10000);
        Employee salesExecutive2 = new Employee("王九","Sales", 10000);

        ceo.add(headSales);
        ceo.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        System.out.println("ceo");
        for (Employee headEmployee : ceo.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }

}
