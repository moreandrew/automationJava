public class Student {

    String firstName;
    String lastName;
    int[] grades = {};

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printName() {
        System.out.println(firstName+" "+lastName);
    }

    public void showGrades(){
        for(int grade: grades){
            System.out.println(grade);
        }
    }
}
