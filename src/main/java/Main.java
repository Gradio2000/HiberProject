import model.Autos;
import model.Persons;
import services.AutoService;
import services.PersonsService;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {
        AutoService autoService = new AutoService();
        Map<String, List<String>> map = autoService.getCarByPerson();
        for (String key : map.keySet()){
            System.out.println(key);
            for (String car : map.get(key)){
                System.out.println(car);
            }
        }

        Persons persons = new Persons(2, "Pupa", 240, "qq@qq.com", "Москва");
        autoService.updatePerson(persons);
    }
}