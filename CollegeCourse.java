import java.util.Scanner;
public class CollegeCourse {
    String dept;
    int courseNumber,credit;
    double fee;
    
    CollegeCourse(String dept, int courseNumber,int credit){
        this.dept = dept;
        this.courseNumber = courseNumber;
        this.credit = credit;
        
        this.fee = 4000 * credit;
    }
    void display(){
        System.out.println("Department = " + dept);
        System.out.println("Course Number = " + courseNumber);
        System.out.println("Credit Hourse = " + credit);
        System.out.println("Fees = " + fee);
    }
}
class LabCourse extends CollegeCourse{
    LabCourse(String dept, int courseNumber, int credit){
        super(dept,courseNumber,credit);
        fee += 3000;
    }
     void display(){
        super.display();
    }
}

class UseCourse{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Department : ");
        String depart = inp.nextLine();
        System.out.print("Enter Course Number : ");
        int courseNumber = inp.nextInt();
        System.out.print("Enter Credit Hours : ");
        int credit = inp.nextInt();
        LabCourse lc = new LabCourse(depart,courseNumber,credit);
        switch(depart){
            
            case "phy":
                
                lc.display();
                break;
             case "cis":
                
                lc.display();
                break;
                case "chm":
                
                lc.display();
                break;
                default:
                    CollegeCourse c = new CollegeCourse(depart,courseNumber,credit);
                    c.display();
        
        }

}
}
