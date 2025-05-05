package java_oop.OOPs.Module1.Create_your_own_class;

public class Student {

    private String studentId , name;
    private double grade;
    private boolean isActive;

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return  name;
    }

    public double getGrade() {
        return  grade;
    }

    public boolean getIsActive() {
        return  isActive;
    }

    public void setStudent(String studentId  ,String name  , double grade , boolean isActive) {
        if (grade > 0 && grade < 100) {
        this.studentId = studentId ;
        this.name = name;
        this.grade = grade;
        this.isActive = isActive;
        } else {
            System.out.println("the grade is invalid!");
        }
    }

    public void displayInfo() {
        System.out.println("student id is : " + studentId + "/ his name is : " + name + "/ grade is :" + grade + "/ and his active status :" + isActive);
    }

    public String letterGrade() {
        if (grade >= 90 && grade <= 100) {
            return  "you have an A Grade";
        } else if (grade >= 80 && grade < 90) {
            return "you have a B Grade";
        } else if (grade >= 70 && grade < 80) {
            return  "you have a C Grade";
        } else if (grade >= 60 && grade < 70) {
            return  "you took a D Grade";
        } else {
            return "F grade / you failed";
        }

    }


    public String isPassing() {
        if (grade >= 60) {
            return  "congratulation -" + name + "- you passed!";
        };
        return "you didnt make it -" + name + "- , we wish you the best next time ";

    }


}

