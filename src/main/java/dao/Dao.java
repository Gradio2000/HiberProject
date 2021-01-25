package dao;

import model.Autos;
import model.Persons;

public interface Dao {
    Persons getPersonById(int id);
    Autos getAutoByID(int id);
}
