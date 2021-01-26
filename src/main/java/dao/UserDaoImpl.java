package dao;

import model.Autos;
import model.Persons;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.ConnectFactory;
import java.util.List;

public class UserDaoImpl implements Dao {
    public Persons getPersonById(int id){
        return ConnectFactory.getSession().get(Persons.class, id);
    }
    public Autos getAutoByID(int id) {
        return ConnectFactory.getSession().get(Autos.class, id);
    }

    public List<Autos> getListAuto() {
        Session session = ConnectFactory.getSession();
        Query query = session.createQuery("FROM Autos");
        List<Autos> autosList = query.list();
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

    @Override
    public Boolean update(Persons persons) {
        Session session = null;
        try{
            session = ConnectFactory.getSession();
            Persons newPersons = session.get(Persons.class, persons.getPersonId());
            String name = persons.getName();
            int age = persons.getAge();
            String email = persons.getEmail();
            String adress = persons.getAdress();

            newPersons.setName(name);
            newPersons.setAge(age);
            newPersons.setAdress(adress);
            newPersons.setEmail(email);

            Transaction tx = session.beginTransaction();
            tx.commit();
        }
        catch (Exception e){
            System.out.println("Ошибка обновления клиента");
            return false;
        }
        finally {
            session.close();
        }
        return true;
    }
}