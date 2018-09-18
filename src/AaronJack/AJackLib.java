package AaronJack;

public class AJackLib {
    public static String reverse(String input){
        String rstr = "";
        for(int i = input.length() - 1; i >= 0; i--){
            rstr = rstr + input.charAt(i);
        }
        return rstr;
    }
}
