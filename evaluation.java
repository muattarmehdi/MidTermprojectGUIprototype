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
public class evaluation 
{
    private String evaluationTitle = new String(" ");

    public String getEvaluationTitle() {
        return evaluationTitle;
    }

    public void setEvaluationTitle(String evaluationTitle) {
        this.evaluationTitle = evaluationTitle;
    }
    
    private String rubrics = new String(" ");

    public String getRubrics() {
        return rubrics;
    }

    public void setRubrics(String rubrics) {
        this.rubrics = rubrics;
    }
    
    private int marks;

    public int getMarks() {
        return marks;
    }
    
    private String deadline;

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }
    
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public ArrayList<evaluation> evaluate = new ArrayList<>();    
    
    public evaluation(int marks, String deadline) {
        this.marks = marks;
        this.deadline = deadline;
    }
    
    
    
    
}
