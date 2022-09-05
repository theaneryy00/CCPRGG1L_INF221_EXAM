public class Student {
    
    // Character attributes
    String surname; 
    String firstname;
    char middleInitial;
    int  dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean amIAwesome;



    // Character method
    public void sayMyStudentNumber() {
        System.out.println("My student number is " + studentNumber );
    }
    public void sayMystudentEmailAddress() {
        System.out.println( "My email address is " + studentEmailAddress) ;
    }
    public void sayMyamIAwesome() {
        System.out.println( amIAwesome );
    }

    // Constructor
    public Student(String sur , String firstn, char middleI, int dateOfB, int studentN, String studentE, boolean amIA) {
        surname = sur;
        firstname = firstn;
        middleInitial = middleI;
        dateOfBirth = dateOfB;
        studentNumber = studentN;
        studentEmailAddress = studentE;
        amIAwesome = amIA;
    }
}

