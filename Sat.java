package field;

public class Sat {

    String word;
    String amagramword;

    public  boolean isAnagram(String word, String amagramword){

        try {
            if (word.length()!=amagramword.length()){

                return false;
            }

            for (int a=0; a<word.length();a++){

                char c=word.charAt(a);
                int amindex=amagramword.indexOf(c);

                if (amindex!=-1){

                    amagramword=amagramword.substring(0,amindex)+amagramword.substring(amindex+1,amagramword.length());
                }
                else {
                    return false;
                }
            }
        }

        catch (Exception e){

            System.out.println(e);
            System.out.println("Please try again");
        }
        finally {
            System.out.println("Finished");
        }
        return amagramword.isEmpty();
    }
}
