package com.javatechie.spring.entity;


//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "STUDENT_TBL")
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "STUDENT_NAME")
    private String name;
    @Column(name = "ROLL_NO")
    private int rollNo;
    @Column(name = "DEPT")
    private String dept;
//    @OneToMany(targetEntity = Courcse.class, fetch=FetchType.EAGER)
//    @JoinColumn(name="sfk")
//    List<Courcse> corses;
	public Student() {
	}
	public Student(int id, String name, int rollNo, String dept) {
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", dept=" + dept + "]";
	}
    
    
    

}
