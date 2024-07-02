import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Length check
    public void pwLengthTest_whenInputLength8_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw69";
        //WHEN
        boolean actual = Main.checkLength(pw);
        //THEN
        assertTrue(actual);
    }

    public void pwLengthTest_whenInputLength4_thenReturnFalse(){
        //GIVEN
        String pw = "Test";
        //WHEN
        boolean actual = Main.checkLength(pw);
        //THEN
        assertFalse(actual);
    }

    public void pwLengthTest_whenInputLength10_thenReturnTrue(){
        //GIVEN
        String pw = "Test123456";
        //WHEN
        boolean actual = Main.checkLength(pw);
        //THEN
        assertTrue(actual);
    }


    //Digits check
    public void pwCheckDigits_whenInputHasDigits_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw69";
        //WHEN
        boolean actual = Main.checkDigits(pw);
        //THEN
        assertTrue(actual);
    }

    public void pwCheckDigits_whenInputHasNoDigits_thenReturnFalse(){
        //GIVEN
        String pw = "Testhaha";
        //WHEN
        boolean actual = Main.checkDigits(pw);
        //THEN
        assertFalse(actual);

    }


    //UpperLowerCase check
    public void pwCheckUpperLower_whenInputHasUpperLower_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw69";
        //WHEN
        boolean actual = Main.checkForUpperAndLower(pw);
        //THEN
        assertTrue(actual);
    }

    public void pwCheckUpperLower_whenInputNoHasUpper_thenReturnFalse(){
        //GIVEN
        String pw = "testpw69";
        //WHEN
        boolean actual = Main.checkForUpperAndLower(pw);
        //THEN
        assertFalse(actual);
    }

    public void pwCheckUpperLower_whenInputNoHasLower_thenReturnFalse(){
        //GIVEN
        String pw = "TESTPW69";
        //WHEN
        boolean actual = Main.checkForUpperAndLower(pw);
        //THEN
        assertFalse(actual);
    }

    public void pwCheckCommon_whenIsCommon_thenReturnFalse(){
        //GIVEN
        String pw = "TestPw69";
        //WHEN
        boolean actual = Main.checkCommon(pw);
        //THEN
        assertFalse(actual);
    }

    public void pwCheckCommon_whenIsNotCommon_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw1234";
        //WHEN
        boolean actual = Main.checkCommon(pw);
        //THEN
        assertTrue(actual);
    }

}