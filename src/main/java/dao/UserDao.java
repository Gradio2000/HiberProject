package dao;

import model.Persons;
import util.ConnectFactory;

public class UserDao {
    public Persons getPersonById(int id){
        return ConnectFactory.getSession().get(Persons.class, id);
    }
}
