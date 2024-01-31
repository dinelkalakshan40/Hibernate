package org.example.config;

import org.example.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {

    private static FactoryConfiguration factoryConfiguration;  //intance

    private SessionFactory sessionFactory; //return of sessionFactory
    private FactoryConfiguration(){Configuration configuration = new Configuration().configure()
            .addAnnotatedClass(Employee.class);
            sessionFactory=configuration.buildSessionFactory();

        }
    public static FactoryConfiguration getInstance(){
        return  (factoryConfiguration==null)?factoryConfiguration=
                new FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession() {
        return sessionFactory.openSession();
    }

}
