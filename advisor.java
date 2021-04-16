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
public class advisor 
{
    public static String advisorName;

    public String getAdvisorName() {
        return advisorName;
    }

    public void setAdvisorName(String advisorName) {
        this.advisorName = advisorName;
    }

    private String advisorDesignation; 
    
    public String getAdvisorDesignation() {
        return advisorDesignation;
    }

    public void setAdvisorDesignation(String advisorDesignation) {
        this.advisorDesignation = advisorDesignation;
    }
    
    public static void addAdvisor(String name)
    {
        boolean flag = false;
        advisorName = name;
    }
    
}
