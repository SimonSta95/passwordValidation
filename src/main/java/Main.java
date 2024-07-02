import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        String pw = createSecurePassword();

        System.out.println("length check: " + checkLength(pw));
        System.out.println("digits check: " + checkDigits(pw));
        System.out.println("upper lower check: " + checkForUpperAndLower(pw));
        System.out.println("common check: " + checkCommon(pw));
        System.out.println("special char check: " + checkSpecialChar(pw));
        System.out.println("password: " + pw);
    }

    public static boolean checkLength(String pw){
        return pw.length() >= 8;
    }

    public static boolean checkDigits(String pw){
        for(int i = 0; i < pw.length(); i++){
            char ch = pw.charAt(i);

            if(ch >= '0' && ch <= '9'){
                return true;
            }
        }
        return false;
    }

    public static boolean checkForUpperAndLower(String pw){
        return checkForUpper(pw) && checkForLower(pw);
    }

    public static boolean checkForUpper(String pw){
        for(int i = 0; i < pw.length(); i++){
            char ch = pw.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                return true;
            }
        }
        return false;
    }

    public static boolean checkForLower(String pw){
        for(int i = 0; i < pw.length(); i++){
            char ch = pw.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                return true;
            }
        }
        return false;
    }


    public static boolean checkCommon(String pw){
        String[] commonPw = {"TestPw69","Test1234","Passwort"};

        for(String p : commonPw){
            if(pw.equals(p)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkSpecialChar(String pw){
        for(int i = 0; i < pw.length(); i++){
            char ch = pw.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return true;
            }
        }
        return false;
    }

    public static String createSecurePassword(){
        String UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        String DIGITS = "0123456789";
        String SPECIAL_CHARACTERS = "!@#$%^&*()-_+=<>?";
        String ALL_CHARACTERS = UPPER_CASE + LOWER_CASE + DIGITS + SPECIAL_CHARACTERS;

        SecureRandom random = new SecureRandom();

        int PASSWORD_LENGTH = random.nextInt(16-8) + 8;

        StringBuilder password = new StringBuilder(PASSWORD_LENGTH);

        //Create random chars and digit and append to string to meet criteria
        password.append(UPPER_CASE.charAt(random.nextInt(UPPER_CASE.length())));
        password.append(LOWER_CASE.charAt(random.nextInt(LOWER_CASE.length())));
        password.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        //fill rest of password
        for (int i = 4; i < PASSWORD_LENGTH; i++) {
            password.append(ALL_CHARACTERS.charAt(random.nextInt(ALL_CHARACTERS.length())));
        }

        //shuffle password
        StringBuilder shuffledPassword = new StringBuilder(password.length());
        while (!password.isEmpty()) {
            int index = random.nextInt(password.length());
            shuffledPassword.append(password.charAt(index));
            password.deleteCharAt(index);
        }

        return shuffledPassword.toString();
    }
}
