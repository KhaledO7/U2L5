public class U3L2 {
public static void main (String[] args){
// F-to-A, WITH ELSE-IF STATEMENTS:
    int score = 83;
    String grade = "";

    if (score < 60)
    {
        grade = "F";
    }
    else if (score >= 60)
    {
        grade = "D";
    }
    else if (score >= 70)
    {
        grade = "C";
    }
    else if (score >= 80)
    {
        grade = "B";
    }
    else
    {
        grade = "A";
    }
    System.out.println(grade);


}

}
