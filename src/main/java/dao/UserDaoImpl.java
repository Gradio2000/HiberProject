package dao;

import model.Autos;
import model.Persons;
import util.ConnectFactory;

public class UserDaoImpl implements Dao {
    public Persons getPersonById(int id){
        return ConnectFactory.getSession().get(Persons.class, id);
    }

    public Autos getAutoByID(int id) {
        return ConnectFactory.getSession().get(Autos.class, id);
    }
}
