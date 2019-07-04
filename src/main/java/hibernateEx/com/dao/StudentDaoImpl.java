package hibernateEx.com.dao;

import hibernateEx.com.model.Student;
import hibernateEx.com.utıl.JpaUtil;
import org.hibernate.Transaction;
import org.hibernate.engine.transaction.internal.TransactionImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.LinkedList;
import java.util.List;

public class StudentDaoImpl implements StudentDao  {

    EntityManager entityManager ;

    public StudentDaoImpl() {
        entityManager = JpaUtil.getEntityManager();
    }

    @Override
    public Student findById(Integer id) {
        entityManager.getTransaction().begin();
        Student student = entityManager.find(Student.class,id);
        entityManager.getTransaction().commit();
        return student;
    }

    @Override
    public List<Student> findAll() {
        Student student;
        int id = 5;
        List<Student> students = new LinkedList<>();
        entityManager.getTransaction().begin();
        do {
            student = entityManager.find(Student.class,id);
            id++;
            if(student!=null)
            students.add(student);
        }while (student !=null);

        return students;
    }

    @Override
    public void insert(Student student) {

        entityManager.persist(student);
        entityManager.getTransaction().commit();

    }

    @Override
    public void deleteById(Integer id) {

        Student student = entityManager.find(Student.class,id);
        entityManager.remove(student);
        entityManager.getTransaction().commit();

    }



    @Override
    public void delete(Student student) {
                student = entityManager.find(Student.class,student.getStdNumber());
            entityManager.remove(student);
            entityManager.getTransaction().commit();
    }

    @Override
    public void update(Student student) {

     Student   student2 = entityManager.find(Student.class,student.getStdNumber());

     student2.setStdSurname(student.getStdSurname());
        student2.setStdName(student.getStdName());
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
