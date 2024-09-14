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
    }
}
