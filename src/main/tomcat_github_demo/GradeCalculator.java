package tomcat.tomcat_github_demo;


public class GradeCalculator {

    public String calculateGrade(int marks) {

        if (marks < 0 || marks > 100) {
            return "Invalid Marks";
        }
        else if (marks >= 90) {
            return "A+";
        }
        else if (marks >= 80) {
            return "A";
        }
        else if (marks >= 70) {
            return "B";
        }
        else if (marks >= 60) {
            return "C";
        }
        else if (marks >= 50) {
            return "D";
        }
        else {
            return "Fail";
        }
    }
}

