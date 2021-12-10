package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("^\\s*(?:\\+?(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4,6})(?: *x(\\d+))?\\s*$");
        Matcher lmatcher=pattern.matcher("123456888918237");

        //Pattern pattern=Pattern.compile("^\\s*(?:\\+?(\\d{1,3}))?[-.(]*(\\d{3})[-. )]*(\\d{9})(?: *x(\\d+))?\\s*$");
        //Matcher lmatcher=pattern.matcher(" 987-111).901212345  ");
        System.out.println(lmatcher.matches());
    }
}
