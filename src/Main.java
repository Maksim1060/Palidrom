public class Main {
    public static void main(String[] args) {
        String str = "кабак", reverseStr = "";
        int strLengh = str.length();
        for (int i = strLengh - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str+" Слово палидром");
        }else {

        }
    }
}