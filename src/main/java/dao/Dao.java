package dao;

import model.Autos;
import model.Persons;

import java.util.List;
import java.util.Set;

public interface Dao {
    Persons getPersonById(int id);
    Autos getAutoByID(int id);
    List<Autos> getListAuto();
    void safePerson(Persons person);
    void update(Persons persons);
}
