package cdm.local;
import javax.swing.text.DefaultCaret;
import java.util.*;
public class Takeon {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0;
        System.out.println("Please enter the sentence : ");
        String stns=input.nextLine();
        for (int i=0; i<stns.length();i++){
            char ch=stns.charAt(i);
            if (ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                count++;
            }
        }
        System.out.println("The number of vowels is : "+count);
    }

}
