import services.StudentManagement;

public class testStudent {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        System.out.println("---------");
        management.addStudent();
        management.display();
    }    
}