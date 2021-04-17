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
public class project 
{
    evaluation e = new evaluation(0, " ");
    advisor advisors = new advisor();
    
    
    private String projectTitle;
    
    public String getProjectTitle() 
    {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle)
    {
        this.projectTitle = projectTitle;
    }
    
    private String deadline;

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    public ArrayList<project> projectNames = new ArrayList<>();
    public void addProject (String project, String date, String advisor)

    {
        project p = new project(" ", " ");

                p.setProjectTitle(project);
                p.setDeadline(date);
                p.advisors.setAdvisorName(advisor);
                projectNames.add(p);
    }
   

    public boolean saveProjectsInformation(String filename)
    {
        boolean flag = false;
        
        try
        {
            FileWriter file = new FileWriter(filename);
            BufferedWriter buffer = new BufferedWriter(file);
    
            for(int i = 0; i < projectNames.size(); i++)
            {
                buffer.write(projectNames.get(i).getProjectTitle() + ","  
                            + projectNames.get(i).advisors.getAdvisorName() + ","
                            + projectNames.get(i).deadline);
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
    
    
    
    public project(String projectTitle, String deadline) {
        this.projectTitle = projectTitle;
        this.deadline = deadline;
    }
    
    public void loadProjectInformation(String filename)
    {
        try
        {
            FileReader file = new FileReader(filename);
            BufferedReader reader = new BufferedReader(file);
            
            String line = reader.readLine();
            do
            {
                project p = new project("", "");
                String [] load = line.split(",");
                p.setProjectTitle(load[0]);
                p.advisors.setAdvisorName(load[1]);
                p.setDeadline(load[2]);
                projectNames.add(p);
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
