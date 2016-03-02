/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.negocio;

import com.udea.modelo.Student;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author esteban
 */
@Local
public interface StudentDAOLocal {
    public void addStudent(Student student);
    public void editStudent(Student student);
    public void deleteStudent(Student student);
    public Student getStudent(int studentId);
    public List<Student> getAllStudent();
    
}
