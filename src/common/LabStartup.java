package common;

import java.util.*;

/**
 *
 * @author cscherbert1
 */
public class LabStartup {
    public static void main(String[] args) {
        
        System.out.println("Lab 2: \n");
        
        List employees = new ArrayList();
        employees.add(new Employee("Scherbert", "Collin", "123-45-6789"));
        employees.add(new Employee("Scherbert", "Emily", "987-65-4321"));
        employees.add(new Employee("Bean", "Archibald", "123-98-4567"));
        
        for(Object obj : employees){
            Employee e = (Employee)obj;
            System.out.println(e);
        }
        
        System.out.println("\nLab 3: \n");
        
        List <Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Scherbert", "Collin", "123-45-6789"));
        employeeList.add(new Employee("Scherbert", "Emily", "987-65-4321"));
        employeeList.add(new Employee("Bean", "Archibald", "123-98-4567"));
        
        for(Employee e : employeeList){
            System.out.println(e);
        }
                
        System.out.println("\nLab 4: \n");
        
        List <Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Fido", 1));
        dogs.add(new Dog("Spot", 2));
        dogs.add(new Dog("Sammi", 1));
        dogs.add(new Dog("Rocket", 3));
        
        Set<Dog> noDupes = new HashSet(dogs);
        List <Dog> noDupeDogs = new ArrayList<>(noDupes);
        
        for(Dog d : noDupeDogs){
            System.out.println(d);
        }
    }
}
