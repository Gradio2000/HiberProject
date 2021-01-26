package dao;

import model.Autos;
import model.Persons;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.ConnectFactory;

import java.util.Set;

public class UserDaoImpl implements Dao {
    public Persons getPersonById(int id){
        return ConnectFactory.getSession().get(Persons.class, id);
    }
    public Autos getAutoByID(int id) {
        return ConnectFactory.getSession().get(Autos.class, id);
    }

    public Set<Autos> getSetAutoByID() {
        return null;
    }

    public void safePerson(Persons person) {
       Session session = ConnectFactory.getSession();
       Transaction tx = session.beginTransaction();
       session.saveOrUpdate(person);
       session.flush();
       tx.commit();
    }
}
