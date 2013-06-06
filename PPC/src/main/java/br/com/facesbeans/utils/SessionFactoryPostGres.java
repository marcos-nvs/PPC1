/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.facesbeans.utils;

import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 *
 * @author eros
 */
public class SessionFactoryPostGres implements Serializable{

     private static SessionFactory sessionFactory;

    
    public static Session getCurrentSession4Faces(){
        
        if(sessionFactory == null ){
            System.out.println("Abrindo sessao!!");
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
            return  sessionFactory.openSession();
        }else{
            return sessionFactory.openSession();
        }
            
    }
    
}
