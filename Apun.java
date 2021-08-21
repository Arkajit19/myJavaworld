package cdm.local;

public class Apun {
    public static void main(String[] args) {
        String stns="Arkajit";

        boolean flag=true;
        stns=stns.toLowerCase();

        for (int i=0; i<stns.length()/2; i++){
            if(stns.charAt(i) != stns.charAt(stns.length()-i-1)){

                flag=false;
                break;
            }

        }
        if (flag){
            System.out.println("Given string is palindrome");
        }
        else {

            System.out.println("Given string is not palindrome");
        }
    }
}
