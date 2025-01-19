import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Date;

public class JpaStarterMain {
    public static void main(String[] args) {

         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myApp");
         EntityManager entityManager = entityManagerFactory.createEntityManager();
         Employee employee1 = entityManager.find(Employee.class, 1);
         System.out.println(employee1);
         employee1.setAge(30);
         employee1.setType(EmployeeType.FULL_TIME);




//         Employee employee = new Employee();
//         employee.setName("Foo Bar");
//         employee.setAge(20);
//         employee.setDob(new Date());
//         employee.setSsn("123");
//         employee.setType(EmployeeType.CONTRACTOR);
//
//         Employee employee1 = new Employee();
//         employee1.setName("Foo Bat");
//         employee1.setAge(22);
//         employee1.setDob(new Date());
//         employee1.setSsn("1234");
//         employee1.setType(EmployeeType.FULL_TIME);
//
//
//
//
         EntityTransaction transaction = entityManager.getTransaction();
         transaction.begin();

         entityManager.persist(employee1);

         transaction.commit();
         entityManager.close();
         entityManagerFactory.close();
         
    }
}
