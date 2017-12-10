package leetCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatch {

    public static void main(String[] args) {

        String a = "aaab!ff,fe:fre8?ffe!hh";

        String[] s = a.split("[!,:?]");

        System.out.println(s.length);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        Pattern pattern = Pattern.compile("[!,:?]");
        Matcher matcher = pattern.matcher(a);

        int count = 0;
        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }

        System.out.println("count:"+count);

    }
}
