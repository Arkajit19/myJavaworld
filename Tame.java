package fim.otam;

public class Tame {

    public String Zase(String sp){

        if (sp.length()==1){

            return sp;
        }
        else{

            return (sp.charAt(sp.length()-1)+Zase(sp.substring(0,sp.length()-1)));

        }
    }
}
