package dao;

import model.Autos;
import model.Persons;

import java.util.Set;

public interface Dao {
    Persons getPersonById(int id);
    Autos getAutoByID(int id);
    Set<Autos> getSetAutoByID();
    void safePerson(Persons person);
}
