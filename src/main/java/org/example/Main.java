package org.example;

import org.example.config.FactoryConfiguration;
import org.example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Lashan");
        employee.setAddress("Galle");
        employee.setSalary(50000.00);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
       // session.save(employee);
        session.update(employee);
        transaction.commit();

        session.close();

    }
}