import model.Autos;
import model.Persons;
import services.UserService;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(final String[] args) {

//        final Session session = getSession();
//        try {
//            System.out.println("querying all the managed entities...");
//            final Metamodel metamodel = session.getSessionFactory().getMetamodel();
//            for (EntityType<?> entityType : metamodel.getEntities()) {
//                final String entityName = entityType.getName();
//                final Query query = session.createQuery("from " + entityName);
//                System.out.println("executing: " + query.getQueryString());
//                for (Object o : query.list()) {
//                    System.out.println("  " + o);
//                }
//            }
//        } finally {
//            session.close();
//        }

        UserService userService = new UserService();

        Persons person = userService.getPersonByIdFromDao(1);
        System.out.println(person.getName() + "  " + person.getAge());

        Autos auto = userService.getAutosByIdFromDao(1);
        System.out.println(auto.getModel() + "  " + auto.getColor());

        Set<Autos> autosSet = new HashSet<Autos>();

        Persons person4 = new Persons(4, "asas", 22, "qq@qq.qq", "qwert");
        userService.addPerson(person4);

    }
}