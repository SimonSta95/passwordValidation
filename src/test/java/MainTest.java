import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Length check
    @Test
    public void pwLengthTest_whenInputLength8_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw69";

        //WHEN
        boolean actual = Main.checkLength(pw);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void pwLengthTest_whenInputLength4_thenReturnFalse(){
        //GIVEN
        String pw = "Test";

        //WHEN
        boolean actual = Main.checkLength(pw);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void pwLengthTest_whenInputLength10_thenReturnTrue(){
        //GIVEN
        String pw = "Test123456";

        //WHEN
        boolean actual = Main.checkLength(pw);

        //THEN
        assertTrue(actual);
    }


    //Digits check
    @Test
    public void pwCheckDigits_whenInputHasDigits_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw69";

        //WHEN
        boolean actual = Main.checkDigits(pw);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void pwCheckDigits_whenInputHasNoDigits_thenReturnFalse(){
        //GIVEN
        String pw = "Testhaha";

        //WHEN
        boolean actual = Main.checkDigits(pw);

        //THEN
        assertFalse(actual);

    }


    //UpperLowerCase check
    @Test
    public void pwCheckUpperLower_whenInputHasUpperLower_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw69";

        //WHEN
        boolean actual = Main.checkForUpperAndLower(pw);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void pwCheckUpperLower_whenInputNoHasUpper_thenReturnFalse(){
        //GIVEN
        String pw = "testpw69";

        //WHEN
        boolean actual = Main.checkForUpperAndLower(pw);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void pwCheckUpperLower_whenInputNoHasLower_thenReturnFalse(){
        //GIVEN
        String pw = "TESTPW69";

        //WHEN
        boolean actual = Main.checkForUpperAndLower(pw);

        //THEN
        assertFalse(actual);
    }

    //Common password check
    @Test
    public void pwCheckCommon_whenIsCommon_thenReturnFalse(){
        //GIVEN
        String pw = "TestPw69";

        //WHEN
        boolean actual = Main.checkCommon(pw);

        //THEN
        assertFalse(actual);
    }

    @Test
    public void pwCheckCommon_whenIsNotCommon_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw1234";

        //WHEN
        boolean actual = Main.checkCommon(pw);

        //THEN
        assertTrue(actual);
    }

    //Special character check
    @Test
    public void pwCheckSpecial_whenHasSpecialCharacters_thenReturnTrue(){
        //GIVEN
        String pw = "TestPw_69";

        //WHEN
        boolean actual = Main.checkSpecialChar(pw);

        //THEN
        assertTrue(actual);
    }

    @Test
    public void pwCheckSpecial_whenHasNoSpecialCharacters_thenReturnFalse(){
        //GIVEN
        String pw = "TestPw69";

        //WHEN
        boolean actual = Main.checkSpecialChar(pw);

        //THEN
        assertFalse(actual);
    }

    //Full test
    @Test
    public void checkRandomPassword(){
        //GIVEN
        String pw = Main.createSecurePassword();

        //WHEN
        boolean length = Main.checkLength(pw);
        boolean digits = Main.checkDigits(pw);
        boolean upperLower = Main.checkForUpperAndLower(pw);
        boolean common = Main.checkCommon(pw);
        boolean special = Main.checkSpecialChar(pw);

        //THEN
        assertTrue(length);
        assertTrue(digits);
        assertTrue(upperLower);
        assertTrue(common);
        assertTrue(special);
    }

}