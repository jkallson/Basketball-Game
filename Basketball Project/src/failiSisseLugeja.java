import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class failiSisseLugeja {
    private String tiim1;
    private String tiim2;
    private ArrayList<String> tiim1List = new ArrayList<>();

    public ArrayList<String> getTiim1List() {
        return tiim1List;
    }

    public ArrayList<String> getTiim2List() {
        return tiim2List;
    }

    private ArrayList<String> tiim2List = new ArrayList<>();

    public failiSisseLugeja(String tiim1, String tiim2) {
        this.tiim1 = tiim1;
        this.tiim2 = tiim2;
    }

    public void tiimiListid(String tiim1, String tiim2) throws Exception {
        File fail = new File(tiim1);
        File fail2 = new File(tiim2);
        //loon scanneri, mille abil loen esimese tiimi mängijad järjendisse
        try (Scanner sc = new Scanner(fail, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                for (int i = 0; i < tükid.length; i++) {
                    tiim1List.add(tükid[i]);
                }
            }
        }
        try (Scanner sc = new Scanner(fail2, "UTF-8")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                for (int i = 0; i < tükid.length; i++) {
                    tiim2List.add(tükid[i]);
                }
            }
        }
    }
}