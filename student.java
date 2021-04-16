/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiprototypemidtermproject;

/**
 *
 * @author Muattar Mehdi
 */
import java.util.*;
import java.io.*;
import javax.swing.*;

public class student extends group 
{
    private String StudentId;
    private String studentName;
    private String studentAddress;
    private String studentEmail;
    private String studentPassword;

    public String getStudentId() {
        return StudentId;
    }

    public void setStudentId(String StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
    
    public ArrayList<student> studentList = new ArrayList<>();
    
    
    boolean saveStudents(String filename)
    {
        boolean flag = false;
        
        try
        {
            FileWriter file = new FileWriter(filename);
            BufferedWriter buffer = new BufferedWriter(file);
        
            for(int i = 0 ; i < studentList.size(); i++)
            {
                   buffer.write(studentList.get(i).getGroupId() + "," + studentList.get(i).studentName + "," 
                                + studentList.get(i).studentName + ","+ studentList.get(i).studentAddress + ","
                                + studentList.get(i).groupProject);
            
            
            }
            
        
        }
        catch(Exception ex)
        {
        
            JOptionPane.showMessageDialog(null,"File is unable to be saved");
        
        }
    
        return flag;
    }
   
    

}
