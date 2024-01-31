package org.example;

import org.example.config.FactoryConfiguration;
import org.example.embeddable.FullName;
import org.example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        FullName name = new FullName("Dinelka","Lakshan");
        Employee employee = new Employee();
        employee.setId(7);
        employee.setName(name);
        employee.setAddress("Kandy");
        employee.setSalary(50000.00);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
       // session.update(employee);
        //session.delete(employee);
        transaction.commit();
        session.close();

    }
}