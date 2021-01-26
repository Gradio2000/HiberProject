package dao;

import model.Autos;
import model.Persons;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.ConnectFactory;

import java.sql.Connection;
import java.util.List;
import java.util.Set;

public class UserDaoImpl implements Dao {
    public Persons getPersonById(int id){
        return ConnectFactory.getSession().get(Persons.class, id);
    }
    public Autos getAutoByID(int id) {
        return ConnectFactory.getSession().get(Autos.class, id);
    }

    public List<Autos> getListAuto() {
        Session session = ConnectFactory.getSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Autos");
        List<Autos> autosList = query.list();
        tx.commit();
        session.close();

        return autosList;
    }

    public void safePerson(Persons person) {
       Session session = ConnectFactory.getSession();
       Transaction tx = session.beginTransaction();
       session.saveOrUpdate(person);
       session.flush();
       tx.commit();
    }
}
