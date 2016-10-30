public class Student {
    private String studentName, learnSubject, studentSec, subjectStatus;
    private long studentID;
    private boolean subjectDrop = false;

    public void setStudentName(String name) {
        studentName = name;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentID() {
        studentID = (long) (Math.random()*(59130500143L-59130500001L+1))+59130500001L;
    }

    public String getStudentID() {
        return "Your ID is : " + studentID;
    }

    public void setStudentSec(){
        if (studentID <= (studentID / 2)) {
            studentSec = "A";
        }
        else {
            studentSec = "B";
        }
    }

    public String getStudentSec() {
        return "Your sec is : " + studentSec;
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

}
