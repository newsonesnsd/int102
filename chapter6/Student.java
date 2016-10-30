public class Student {
    private String studentName, learnSubject, studentSec, subjectStatus;
    private long studentID;
    private boolean subjectDrop = false;

    public void setStudentName(String name) {
        studentName = name;
    }

    public String getStudentName() {
        return "Name : " + studentName;
    }

    public void setSubject(String subject) {
        learnSubject = subject;
    }

    public String getSubject() {
        return learnSubject;
    }

    public boolean drop(String learnSubject) {
        subjectDrop = true;
        return subjectDrop;
    }

    public String status() {
        if (subjectDrop == true) {
            subjectStatus = learnSubject + " was dropped";
        }
        else {
            subjectStatus = learnSubject + " now lerning";
        }
        return subjectStatus;
    }

    public long studentID() {
        studentID = (long) (Math.random()*(59130500143L-59130500001L+1))+59130500001L;
        return studentID;
    }

    public String studentSec() {
        if (studentID <= (studentID / 2)) {
            studentSec = "A";
        }
        else {
            studentSec = "B";
        }
        return "Your sec is : " + studentSec;
    }

    public String mail() {
        return studentID + "@mail.kmutt.ac.th";
    }

}
