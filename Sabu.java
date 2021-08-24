package vim.kalu;

public class Sabu  {
    public static void main(String[] args) throws Exception {
        String currentword="Arkajit";
        String revwords="";
        try {
            for (int a=(currentword.length()-1);a>=0;a--){

                revwords=revwords+currentword.charAt(a);

            }

            System.out.println("The old word is : "+currentword);
            System.out.println("The new word is : "+revwords);
        }
        catch (Exception e){

            System.out.println(e);
        }

        finally {
            System.out.println("Finished");
        }

    }
}
