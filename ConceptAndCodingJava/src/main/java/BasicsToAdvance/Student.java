package BasicsToAdvance;

public class Student {
    int studentID;
    String studentName;
    String studentAddress;

    public void updateAddress(String address) {
        this.studentAddress = address;
    }

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' + '}';
    }

    public static void main(String[] args) {
        Student EngineeringStudent1 = new Student();
        EngineeringStudent1.studentID = 13;
        EngineeringStudent1.studentName = "Nikesh";
        EngineeringStudent1.studentAddress = "San Francisco, CA";
        EngineeringStudent1.updateAddress("Bangalore, IND");
        System.out.println(EngineeringStudent1);

        TypesOfVariables t1 = new TypesOfVariables();
        TypesOfVariables t2 = new TypesOfVariables(15);
        System.out.println(TypesOfVariables.staticVariable);
        t1.memberVariable = 7; t2.memberVariable = 9;
        System.out.println(t1.memberVariable + " " + t2.memberVariable);
        t1.dummyMethod(); t2.dummyMethod();
        System.out.println( t1.dummyMethod2(13, 7) + t2.dummyMethod2(13, 9));
    }
}
