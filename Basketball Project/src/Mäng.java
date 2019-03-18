import java.util.Scanner;

public class Mäng {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta esimese tiimi nimi: ");
        String tiim1 = scan.nextLine();
        System.out.println("Sisesta teise tiimi nimi: ");
        String tiim2 = scan.nextLine();

        failiSisseLugeja tiimid = new failiSisseLugeja(tiim1,tiim2);
        tiimid.tiimiListid(tiim1,tiim2);
        System.out.println(tiimid.getTiim1List());
        System.out.println(tiimid.getTiim2List());
    }



}
