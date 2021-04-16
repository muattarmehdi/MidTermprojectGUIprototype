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
public class group 
{
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
    
    public void addGroup(String id, String Name)
    {
        groupId = id;
        groupName = Name;
    }
    
    public ArrayList<group> groups = new ArrayList<>();
    project p = new project(" "," ");
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
    public boolean editGroup(String number, String project, String name, String id)
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
        }
    
        return flag;
    }
            
    
}
