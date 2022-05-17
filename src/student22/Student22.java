/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package student22;

/**
 *
 * SYST17796 Fundamentals of Software Design and Development
 * @author Colin Teasdale   
 */
public class Student22 
{
    public static void main(String[] args)
    {
       Student s1 = new Student(1, "Colin");
       Student s2 = new Student(2, "Josh");
       Student s3 = new Student(3, "Eric");
       
       Student [] studentList = new Student[3];
       studentList[0] = s1;
       studentList[1] = s2;
       studentList[2] = s3;
       
       System.out.println(studentList[1].getStudentName());
               
    }
}
