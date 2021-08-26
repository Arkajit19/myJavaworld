package lit.votom;
import java.util.*;
public class England {

    public void  city(){

        Scanner input=new Scanner(System.in);
        List<String>list_name=new ArrayList<>();
        list_name.add("Rabi");
        list_name.add("Chetan");
        list_name.add("Abir");
        list_name.add("Debu");
        list_name.add("Anil");
        System.out.println("Please Enter the number : ");
        int index_num=input.nextInt();
        String c=list_name.get(index_num);
        System.out.println("The Element is : "+c);

    }
}
