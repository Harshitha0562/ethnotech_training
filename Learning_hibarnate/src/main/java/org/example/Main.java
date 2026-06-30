package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        SessionFactory fac=new Configuration().configure().buildSessionFactory();//creating
        Session session=fac.openSession();//opening
        Students st=new Students("Harshitha",79);//create obj for students class
        session.beginTransaction();//start transaction
        session.persist(st); //after version 6 we will use persist() instead of save()
        session.getTransaction().commit();//commit the session
        session.close();//close session
        fac.close();//close fac

    }
}