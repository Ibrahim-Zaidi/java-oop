package java_oop.OOPs.Module1.Create_your_own_class;
public class StudentRegistry {
    public static void main(String[] args) {

        Student std1  = new Student();
        Student std2  = new Student();

        std1.setStudent("1", "adam", 888, true);
        std2.setStudent("2", "ibrahim", 80, true);


        std1.displayInfo();
        std2.displayInfo();

        System.out.println( gradeCompare(std1 , std2 ));
        
        // Test the letter grade method for both students

        System.out.println(std1.letterGrade());
        System.out.println(std2.letterGrade());
        
        //  Test the passing status method for both students

        System.out.println(std1.isPassing());
        System.out.println(std2.isPassing());
        
        // Change one student to inactive and display the updated information

        std1.setStudent("1", "adam", 54, false);
        std1.displayInfo();

    }


    
    // Create a static method to compare two students' grades and return the student with the higher grade
    // Hint: Take two Student objects as parameters

   public static String gradeCompare(Student std1 , Student std2) {
      return std1.getGrade() > std2.getGrade() ?  std1.getName() + " has higher grade" : std1.getGrade() < std2.getGrade() ? std2.getName() + " has higher grade " : std1.getName() + " and " + std2.getName() + "they both has the same grades";
  };


}
