import org.junit.Before;
import org.junit.Test;import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void CreateStudent(){
    Student Destiney = new Student(1, "Destiney");
    assertNotNull(Destiney);
}

    @Test
    public void testId(){
        Student test = new Student(1L, "test");
        assertEquals(1L, test.getId());
    }

    @Test
    public void testName(){
        Student test = new Student(1L, "test");

        assertEquals("test", test.getName());
    }

    @Test
    public void testGrade() {
        Student test = new Student(1L, "test");
        assertEquals(0, test.getGrades().size());
    }

    @Test
    public void testGradeAvg(){
        Student test = new Student(1L, "test");
        test.addGrade(50);
        test.addGrade(75);
        test.addGrade(100);
        test.addGrade(100);
        assertEquals(81.25, test.getGradeAverage(), 0);
    }

}
