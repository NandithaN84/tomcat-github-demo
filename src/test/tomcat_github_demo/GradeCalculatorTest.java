package tomcat.tomcat_github_demo;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

    GradeCalculator calculator = new GradeCalculator();

    @Test
    public void testGradeAPlus() {
        assertEquals("A+", calculator.calculateGrade(95));
    }

    @Test
    public void testGradeA() {
        assertEquals("A", calculator.calculateGrade(85));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", calculator.calculateGrade(75));
    }

    @Test
    public void testGradeC() {
        assertEquals("C", calculator.calculateGrade(65));
    }

    @Test
    public void testGradeD() {
        assertEquals("D", calculator.calculateGrade(55));
    }

    @Test
    public void testFail() {
        assertEquals("Fail", calculator.calculateGrade(35));
    }

    @Test
    public void testInvalidMarks() {
        assertEquals("Invalid Marks", calculator.calculateGrade(110));
    }
}
