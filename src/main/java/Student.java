public class Student {

    StudentService studentServices;

    Student(StudentService studentService){
        this.studentServices = studentService;
    }

    int getAverageMarks(){

        return studentServices.getTotalMarks()/studentServices.getTotalStudents();

    }
}
