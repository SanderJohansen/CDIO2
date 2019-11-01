package Tests;

import com.company.Die;
import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    Die DieTest = new Die();


    @org.junit.Test
    public void getFacevalue() {
        for(int a = 0; a <1000; a++) {
            DieTest.Roll();
            int i = DieTest.GetFacevalue();
            junit.framework.Assert.assertTrue(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6);
        }
    }
}