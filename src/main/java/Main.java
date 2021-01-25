import model.Persons;
import services.UserService;

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
    }
}