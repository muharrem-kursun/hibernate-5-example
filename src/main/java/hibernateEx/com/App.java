package hibernateEx.com;

import hibernateEx.com.dao.StudentDaoImpl;
import hibernateEx.com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        StudentDaoImpl studentDao = new StudentDaoImpl();
        Student student = new Student("muharrem","kursun");
        student.setStdNumber(7);
        System.out.println(studentDao.findById( 6).toString());
        System.out.println(studentDao.findAll());
        studentDao.deleteById(12);
        studentDao.delete(student);
        studentDao.update(student);
    }
}
