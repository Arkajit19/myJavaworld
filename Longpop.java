package pi.ola;

import java.util.StringTokenizer;

public class Longpop {
    public static void main(String[] args) {

        String lineone="My name is Arkajit";
        StringTokenizer strtok=new StringTokenizer(lineone," ");
        while (strtok.hasMoreElements()){

            System.out.println(strtok.nextToken());
        }
    }
}
