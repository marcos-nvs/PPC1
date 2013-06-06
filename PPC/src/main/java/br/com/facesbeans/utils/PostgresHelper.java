/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.facesbeans.utils;

import br.com.ppc.entities.Usuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author f31389519880
 */
public class PostgresHelper {
    
    public static Session getSessionDude() {
        Session session = null;
        Transaction tx = null;
        if (session == null || !session.isOpen()) {
            System.out.println(".............................");
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
    
    public static Usuario getUsuario(String id) {

        Session session = getSessionDude();//sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();
        
        List result = null;
        Usuario u = null;
        
        try {
            Criteria criteria = session.createCriteria(Usuario.class);
            criteria.add(Restrictions.eq("strLogin", id));
            result = criteria.list();
            tx.commit();
            
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        if (result != null && result.size() > 0) {
            u =  (Usuario) result.get(0);
        }
        return u;
    }
}
