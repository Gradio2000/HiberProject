package services;

import dao.UserDao;
import model.Persons;

public class UserService {
    UserDao dao = new UserDao();
    public Persons getPersonByIdFromDao(int id){
        return dao.getPersonById(id);
    }
}
