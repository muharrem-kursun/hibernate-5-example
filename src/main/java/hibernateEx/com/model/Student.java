package hibernateEx.com.model;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stdNumber")
    private int stdNumber;
    @Column(name = "stdName")
    private  String stdName;
    @Column(name = "stdSurname")
    private String stdSurname;

    @Override
    public String toString() {
        return "Student{" +
                "stdNumber=" + stdNumber +
                ", stdName='" + stdName + '\'' +
                ", stdSurname='" + stdSurname + '\'' +
                '}';
    }

    public Student(String stdName, String stdSurname) {
        this.stdName = stdName;
        this.stdSurname = stdSurname;
    }

    public Student() {
    }

    public int getStdNumber() {
        return stdNumber;
    }

    public void setStdNumber(int stdNumber) {
        this.stdNumber = stdNumber;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdSurname() {
        return stdSurname;
    }

    public void setStdSurname(String stdSurname) {
        this.stdSurname = stdSurname;
    }
}

