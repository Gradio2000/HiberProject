package services;

import dao.UserDaoImpl;
import model.Autos;
import model.Persons;

import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AutoService {
    UserDaoImpl dao = new UserDaoImpl();

    public Autos getAutosByIdFromDao(int id){
        return dao.getAutoByID(id);
    }

    public List<Autos> getListAuto(){
        return dao.getListAuto();
    }
    public Map<String, List<String>> getCarByPerson(){
        Map<String, List<String>> map = new HashMap<>();
        List<Autos> autosList = dao.getListAuto();
        for (Autos autos : autosList){
            String name = autos.getPerson().getName();
            String model = autos.getModel();
            List<String> list;
            if ((list = map.get(name)) != null){
                map.merge(name, list, (oldList, newList) -> {
                    newList.add(model);
                    return oldList;
                });
            }
            else {
                list = new ArrayList<>();
                list.add(model);
                map.put(name, list);
            }
        }
        return map;
    }

    public void updatePerson(Persons persons){
        dao.update(persons);
    }

}
