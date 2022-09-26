import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Auto mercedes = new Auto();
        Auto toyota = new Auto(4);
        Auto skoda = new Auto(7,"Modra", 5.13f, true);

        //mercedes.barva = "Zelena";

        //mercedes.setPocetKol(8);
        //System.out.println(mercedes.pocetKol);

        //for (int i=0; i<10; i++) {
          //  mercedes.jet();
        //}

       // Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //System.out.println("Enter username");

        //String name = myObj.nextLine();
        //if (name == "Zuzana"){
        //    System.out.println("vitej");
        //}
        //else{
        //    System.out.println("nejsi verfikovany uzivatel");
        // }
        String temp = "nic tady neni";
        System.out.println(temp);
        temp = pozdrav("Zuzana");
        System.out.println(temp);
        }



    public static String pozdrav(String jmeno)
    {
        return "Ahoj " + jmeno;
    }

}