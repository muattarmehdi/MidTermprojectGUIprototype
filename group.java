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

public class group 
{
    
    project p = new project(" "," ");
    advisor a = new advisor();
    
    private String groupId;
    public String groupProject;
    public String getGroupId() {
        return groupId;
    }

    private String groupName;

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    
    public void addGroup(String id, String Name, String aName, String p)
    {
        group gg = new group();
        gg.groupId = id;
        gg.groupName = Name;
        gg.a.setAdvisorName(aName);
        gg.groupProject = p;
        
        groups.add(gg);
        
    }
    
    public ArrayList<group> groups = new ArrayList<>();
    
    public boolean deleteGroup(String number)
    {
        boolean flag = false;
        
        int i;
        for(i = 0 ; i < groups.size() ; i++)
        {
            for(int j = 0 ; j < groups.get(i).groupId.length(); j++)
            {
                if(groups.get(i).groupId.charAt(j) != number.charAt(j))
                {
                    flag = false;
                    break;
                }
                else
                {
                    flag = true;
                }
            }
        }
        if(flag == true)
        {
            groups.get(i).groupId = " ";
            groups.get(i).groupName = " ";
        }
    
        return flag;
    }
    public boolean editGroup(String number, String project, String name, String id, String advisorName)
    {
        boolean flag = false;
        
        int i;
        for(i = 0 ; i < groups.size() ; i++)
        {
            for(int j = 0 ; j < groups.get(i).groupId.length(); j++)
            {
                if(groups.get(i).groupId.charAt(j) != number.charAt(j))
                {
                    flag = false;
                    break;
                }
                else
                {
                    flag = true;
                }
            }
        }
        if(flag == true)
        {
            groups.get(i).groupId = id;
            groups.get(i).groupName = name;
            groups.get(i).groupProject = project;
            groups.get(i).a.setAdvisorName(advisorName);
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
                group loadGroup = new group();
                String [] load = line.split(",");
                loadGroup.groupId = load[0];
                loadGroup.groupName = load[1];
                loadGroup.groupProject = load[2];
                loadGroup.a.setAdvisorName(load[3]);
                
                groups.add(loadGroup);
            }while(line != null);
            reader.close();
            file.close();
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Unable to load file");
        }
        
    }
        public boolean saveGroupData(String filename)    
        {
            boolean flag = false;
            try
            {
                FileWriter file = new FileWriter(filename);
                BufferedWriter writer = new BufferedWriter(file);
                
                for(int i = 0 ; i < groups.size() ; i++)
                {
                    writer.write(groups.get(i).groupId + ","
                                + groups.get(i).groupName + ","
                                + groups.get(i).groupProject + ","
                                + groups.get(i).a.getAdvisorName());
                
                }
                writer.flush();
                writer.close();
                file.close();
                flag = true;
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null, "Unable to write on file");
                flag = false;
            }
        
            return flag;
        }
}
