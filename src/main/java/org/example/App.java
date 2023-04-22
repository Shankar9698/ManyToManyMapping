package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
        Session session=sessionFactory.openSession();
        Emp e1=new Emp();
        e1.setEmpId(1);
        e1.setEmpName("shankar");


        Emp e2=new Emp();
        e2.setEmpId(2);
        e2.setEmpName("rajashekar");


        EmpAdd a1=new EmpAdd();
        a1.setAId(99);
        a1.setAddName("hyd");

        EmpAdd a2=new EmpAdd();
        a2.setAId(100);
        a2.setAddName("bgl");

        List<Emp> emp1=Arrays.asList(e1,e2);
        List<EmpAdd> add1=Arrays.asList(a1,a2);

        e1.setEmpAdd(add1);
        e2.setEmpAdd(add1);

        a1.setEmp(emp1);
        a2.setEmp(emp1);






        Transaction transaction=session.beginTransaction();
        session.save(e1);
        session.save(e2);
        session.save(a1);
        session.save(a2);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
