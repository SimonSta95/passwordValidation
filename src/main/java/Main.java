public class Main {
    public static void main(String[] args) {

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
}
