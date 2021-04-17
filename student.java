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
            buffer.flush();
            buffer.close();
            file.close();
        
        }
        catch(Exception ex)
        {
        
            JOptionPane.showMessageDialog(null,"File is unable to be saved");
        
        }
    
        return flag;
    }
   
    public void loadStudents(String filename)
    {
        try
        {
            FileReader file = new FileReader(filename);
            BufferedReader reader = new BufferedReader(file);
            
            String line = reader.readLine();
            
            do
            {
                String[] load = line.split(",");
                student loadStudent = new student();
                loadStudent.setGroupId(load[0]);
                loadStudent.setStudentName(load[1]);
                loadStudent.setStudentId(load[2]);
                loadStudent.setStudentAddress(load[3]);
                loadStudent.groupProject = load[4];
                
                studentList.add(loadStudent);
            }while(line != null);
            
            reader.close();
            file.close();
        }
        catch(Exception ex)
        {
        
            JOptionPane.showMessageDialog(null," Unable to load data from file");
        
        }
    
    }
    public boolean saveStudentCredentials(String filename)
    {
        boolean flag = false;
        
        try
        {
            FileWriter file = new FileWriter(filename);
            BufferedWriter buffer = new BufferedWriter(file);
    
            for(int i = 0; i < studentList.size(); i++)
            {
                buffer.write(studentList.get(i).studentEmail + ","  
                            + studentList.get(i).studentPassword);
            }
            buffer.flush();
            buffer.close();
            file.close();
            flag = true;
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to save file");
            flag = false;
        }
        return flag;
    }
    public void loadStudentCredentials(String filename)
    {
        try
        {
            FileReader file = new FileReader(filename);
            BufferedReader reader = new BufferedReader(file);
            
            String line = reader.readLine();
            do
            {
                student loadS = new student();
                String [] load = line.split(",");
                loadS.studentEmail = load[0];
                loadS.studentPassword = load[1];
            
              
            }while(line != null);
            reader.close();
            file.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to load file");
        }
    
    }



}
