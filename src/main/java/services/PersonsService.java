package services;

import dao.UserDaoImpl;
import model.Autos;
import model.Persons;

public class PersonsService {
    UserDaoImpl dao = new UserDaoImpl();
    public Persons getPersonByIdFromDao(int id){
        return dao.getPersonById(id);
    }

    public void addPerson(Persons person){
        dao.safePerson(person);
    }
}
