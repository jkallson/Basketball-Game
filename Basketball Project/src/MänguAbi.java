import java.util.ArrayList;
import java.util.Scanner;

public class MänguAbi {
    public static void main(String[] args) throws Exception {
        System.out.println("Tere tulemast projekti bb simulator. Tiimid valikus: Lakers,Bulls,Mavericks,Thunder.");

        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta esimese tiimi nimi: ");
        String tiim1 = scan.nextLine()+".txt";
        System.out.println("Sisesta teise tiimi nimi: ");
        String tiim2 = scan.nextLine()+".txt";

        failiSisseLugeja tiimid = new failiSisseLugeja(tiim1,tiim2);
        tiimid.tiimiListid(tiim1,tiim2);

        ArrayList<String> tiim1Mängijad = tiimid.getTiim1MängijateList();
        ArrayList<String> tiim2Mängijad = tiimid.getTiim2MängijateList();

        System.out.println("Esimese tiimi mängijad on: "+tiim1Mängijad);
        System.out.println("teise tiimi mängijad on: "+tiim2Mängijad);

        System.out.println("Sisesta esimese tiimi algviisik(index ja koma vahele nt: 0,2): ");
        String tiim1AlgViisik = scan.nextLine();
        System.out.println("Sisesta teise tiimi algviisik(index ja koma vahele nt: 0,2): ");
        String tiim2AlgViisik = scan.nextLine();

        algViisikuValimine algViisik = new algViisikuValimine(tiim1Mängijad,tiim2Mängijad,tiim1AlgViisik,tiim2AlgViisik);
        //antud meetodite abil määran algviisiku ja vahetusmängijad
        algViisik.tiim1Starters();
        algViisik.tiim2Starters();
        //loon listid, kus hoian tiim1 algviisikut ja vahetusmängijaid
        ArrayList<String> tiim1AlgViisikList = algViisik.getTiim1algViisik();
        ArrayList<String> tiim1VahetusMängijad = algViisik.getTiim1VahetusMängijad();
        //loon listid, kus hoian tiim2 algviisikut ja vahetusmängijaid
        ArrayList<String> tiim2AlgViisikList = algViisik.getTiim2algViisik();
        ArrayList<String> tiim2VahetusMängijad = algViisik.getTiim2VahetusMängijad();

        System.out.println("Esimese tiimi algviisik on "+tiim1AlgViisikList);
        System.out.println("Esimese tiimi vahetusmängijad on "+tiim1VahetusMängijad);

        System.out.println("Teise tiimi algviisik on "+tiim2AlgViisikList);
        System.out.println("Teise tiimi vahetusmängijad on "+tiim2VahetusMängijad);
        System.out.println("Head mängu!!!!!!!!!!!!");
    }
}
