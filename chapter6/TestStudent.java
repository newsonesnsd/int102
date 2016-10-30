public class TestStudent {

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setStudentName("Jirapong");
        String studentName = std1.getStudentName();
        long stdID = std1.studentID();
        String stdSec = std1.sec();
        String stdMail = std1.mail();
        std1.setSubject("INT102");
        String subject = std1.getSubject();
        std1.drop(subject);


    }
}
