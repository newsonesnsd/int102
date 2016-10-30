public class TestStudent {

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setStudentName("Jirapong");
        String studentName = std1.getStudentName();
        long stdID = std1.Id();
        String stdSec = std1.sec();
        String stdMail = std1.mail();
        std1.setSubject("INT102");
        String subject = std1.getSubject();
        System.out.println(studentName);
        System.out.println("ID : " + stdID);
        System.out.println(stdSec);
        System.out.println("Mail : " + stdMail);
        std1.drop(subject);
        String stdStatus = std1.status();

    }
}
