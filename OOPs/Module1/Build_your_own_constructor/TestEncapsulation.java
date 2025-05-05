package java_oop.OOPs.Module1.Build_your_own_constructor;

// TestEncapsulation class to test the Employee class
public class TestEncapsulation {

    public static void main(String[] args) {

        // declaring the first employee with default values
        Employee emp1 = new Employee();

        Employee emp2 = new Employee("imad", 21, 4000);
        Employee emp3 = new Employee("mourad", 26, 4000);

        // displaying both employees
        emp1.displayEmployee();
        emp2.displayEmployee();

        // giving the second employee a raise by 20%
        emp2.giveRaise(20.0);

        try {
            // Cloning the second employee
            Employee clonedEmp2 = (Employee) emp2.clone();

            // modifying the original employee
            emp2.setName("reda");

            // verifying that the cloned is not touched
            emp2.displayEmployee();
            clonedEmp2.displayEmployee();



        }catch(CloneNotSupportedException error) {
            System.out.println(error.getMessage());
        }


        // comparing Emp2 to Emp3
        System.out.println(compareEmpSalary(emp2, emp3));

    }

    static String compareEmpSalary(Employee emp1, Employee emp2) {
        System.out.println("method for comparing two employees' salary :\n");

        // a bit cumbersome,but I still wanted to do it
        return emp1.getSalary() > emp2.getSalary() ? emp1.getName() + " has a bigger salary than " + emp2.getName() :
                emp1.getSalary() < emp2.getSalary() ? emp2.getName() + " has a bigger salary than " + emp1.getName() :
                       emp1.getSalary() == emp2.getSalary() ? "Equal salaries" : "";

    }

}