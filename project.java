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
public class project 
{
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
    public boolean addProject(String project, String date, String advisor)
    {
        boolean flag = false;
        for(int i = 0 ; i < projectNames.size(); i++)
        {
            if(projectNames.get(i).projectTitle == " ")
            {
                projectNames.get(i).projectTitle = project;
                projectNames.get(i).deadline = date;
                projectNames.get(i).advisors.advisorName = advisor;
                flag = true;
                break;
            }
        
        }
        return flag;
    }
    
                                                
    
    evaluation e = new evaluation(0, " ");
    advisor advisors = new advisor();

    public project(String projectTitle, String deadline) {
        this.projectTitle = projectTitle;
        this.deadline = deadline;
    }

    
    
}
