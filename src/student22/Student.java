

package student22;

/**
 *
 * SYST17796 Fundamentals of Software Design and Development
 * @author Colin Teasdale   
 */
public class Student 
{
    private int studentNum;
    private String studentName;
    private String address;

    public Student(int studentNum, String studentName) 
    {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public int getStudentNum() 
    {
        return studentNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        studentName = name;
    }
    
    

}
