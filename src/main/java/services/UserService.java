package services;

import dao.UserDaoImpl;
import model.Autos;
import model.Persons;

public class UserService {
    UserDaoImpl dao = new UserDaoImpl();
    public Persons getPersonByIdFromDao(int id){
        return dao.getPersonById(id);
    }

    public Autos getAutosByIdFromDao(int id){
        return dao.getAutoByID(id);
    }
}
