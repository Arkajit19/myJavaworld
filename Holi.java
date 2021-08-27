package lit.votom;
public class Holi {

    public void Gelam(double a,double b,double c){

        if ((a>b || a==b) && (b>c || b==c) ){

            System.out.println(a+" is the greatest. ");
        }
        else if ((b>a || b==a) && (a>c || a==c)){

            System.out.println(b+" is the greatest. ");
        }
        else if ((c>a || c==a) && (a>b || a==b)){

            System.out.println(c+" is the greatest");
        }
    }
}
