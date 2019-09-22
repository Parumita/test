import javax.xml.bind.SchemaOutputResolver;
import java.util.*;

public class Main {


    public static void main(String[] args) {


        Employee e1 = new Employee("paru", "24-05-90", 27);
        Employee e2 = new Employee("tonmoy", "20-11-89", 30);
        Employee e3 = new Employee("prodip", "1-1-78", 44);

        Employee e4 = new Employee("prodip", "1-1-78", 44);

        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        ArrayList<Employee> sortedemployeeList = new ArrayList<Employee>();

        employeeList.add(e4);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e1);
        int maxAge, sumAge;


        employeeList.stream().sorted((emp1, emp2) -> emp2.age.compareTo(emp1.age)).forEach(employee -> {

            employee.setAddress("Pilvagen 70", "Stockholm", "Sweden");
            sortedemployeeList.add(employee);

        });
        sortedemployeeList.stream().filter(employee -> (employee.getName().equalsIgnoreCase("Paru"))).findAny().get().setAge(30);
        sortedemployeeList.stream().forEach(employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getEmployeeAge(employee.getName()));
            System.out.println(employee.getAddress());

        });

        System.out.println(sortedemployeeList.stream().count());
    }
}
