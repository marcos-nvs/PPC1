/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facesbeans.utils;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author f31389519880
 */
public class PostgresHelper {
    
    public static Session getSessionDude() {
        Session session = null;
        Transaction tx = null;

        if (session == null || !session.isOpen()) {
//            return session = SessionFactoryOracle.getCurrentSession4Faces();
                        return session = SessionFactoryPostGres.getCurrentSession4Faces();
        } else {
            return session;
        }
    }
    
    public static Object getObject(Class clazz, String id) {

        Session session = getSessionDude();//sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Object obj = null;
        try {
            obj = session.get(clazz, id);
            tx.commit();
            
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return obj;
    }
    
    public static Object getUsuario(Class clazz, String id) {

        Session session = getSessionDude();//sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();

        Object obj = null;
        try {
            obj = session.get(clazz, id);
            tx.commit();
            
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return obj;
    }
}
