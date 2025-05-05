package java_oop.OOPs.Module1.Build_your_own_constructor;

// Employee class to demonstrate encapsulation

public class Employee implements Cloneable {

    private String name;
    private int age;
    private double salary;

    public Employee() {
        name = "unkown";
        age = 18;
        salary = 0.0;
    }

    public Employee(String name , int age , double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name != "") {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 18 && age < 65) {
            this.age = age;
        } else {
            System.out.println("Age must be between 18 and 65 ");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be greater or equal 0");
        }
    }

    public double calculateAnnualSalary() {
        return this.salary * 12;
    }

    public void giveRaise(double percentage) {
        this.salary = this.salary + salary * ( percentage / 100 );
        System.out.println("the new raised salary is : " + this.salary);
    }

    public void displayEmployee() {
        System.out.println("name : " + this.name + ", age : " + this.age + ", monthly salary : " + this.salary + ", annual salary " + this.calculateAnnualSalary() );
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
