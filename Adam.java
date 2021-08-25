package field;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

public class Adam {

    public boolean isAmagram(String words, String anotherword){

        String sortedword=sortChar(words);
        String sortedanother=sortChar(anotherword);

        return sortedword.equals(sortedanother);


    }

    public static String sortChar(String words){

        char c[]=words.toLowerCase().toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }

}
