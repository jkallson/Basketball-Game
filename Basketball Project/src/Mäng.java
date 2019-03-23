import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Mäng {
    private ArrayList<String> tiim1Mängijad;
    private ArrayList<String> tiim1algViisik;
    private ArrayList<String> tiim1VahetusMängijad;
    private ArrayList<List> tiim1MängijadViskeProtsendiga;

    private ArrayList<String> tiim2Mängijad;
    private ArrayList<String> tiim2algViisik;
    private ArrayList<String> tiim2VahetusMängijad;
    private ArrayList<List> tiim2MängijadViskeProtsendiga;

    private String tiim1;
    private String tiim2;

    public Mäng(ArrayList<String> tiim1Mängijad, ArrayList<String> tiim1algViisik, ArrayList<String> tiim1VahetusMängijad, ArrayList<List> tiim1MängijadViskeProtsendiga, ArrayList<String> tiim2Mängijad, ArrayList<String> tiim2algViisik, ArrayList<String> tiim2VahetusMängijad, ArrayList<List> tiim2MängijadViskeProtsendiga, String tiim1, String tiim2) {
        this.tiim1Mängijad = tiim1Mängijad;
        this.tiim1algViisik = tiim1algViisik;
        this.tiim1VahetusMängijad = tiim1VahetusMängijad;
        this.tiim1MängijadViskeProtsendiga = tiim1MängijadViskeProtsendiga;
        this.tiim2Mängijad = tiim2Mängijad;
        this.tiim2algViisik = tiim2algViisik;
        this.tiim2VahetusMängijad = tiim2VahetusMängijad;
        this.tiim2MängijadViskeProtsendiga = tiim2MängijadViskeProtsendiga;
        this.tiim1 = tiim1;
        this.tiim2 = tiim2;
    }

    //antud meetod jooksutab mängu
    public void liveMäng() throws InterruptedException {
        int tiim1Skoor = 0;
        int tiim2Skoor = 0;
        Random tiimideIndex = new Random();
        //for tsükkel visete sooritamiseks
        for (int i = 0; i < 92; i++) {
            //int viskaja valimiseks
            int viskaja1 = tiimideIndex.nextInt(5);
            //eelnevalt saadud intiga moodustan viskaja stringi
            String valitudViskaja1 = tiim1algViisik.get(viskaja1);
            //int viskaja tabavuse leidmiseks
            int viskaja1Tabavus = tiimideIndex.nextInt(100);
            //int, mille abil leian, kas viskaja viskab kahest või kolmest
            int viskaja1ViskeKaugus = tiimideIndex.nextInt(2) + 1;

            //analoogne nagu eelpool
            int viskaja2 = tiimideIndex.nextInt(5);
            String valitudViskaja2 = tiim2algViisik.get(viskaja2);
            int viskaja2Tabavus = tiimideIndex.nextInt(100);
            int viskaja2ViskeKaugus = tiimideIndex.nextInt(2) + 1;

            //veerandajad
            int veerandAjad = 1;
            if(i == 23 || i == 46 || i == 69){
                System.out.println(veerandAjad+". veerandaeg. Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                TimeUnit.SECONDS.sleep(5);
                veerandAjad++;

            }


            //for tsükkel esimese tiimi viske sooritamiseks

            for (int j = 0; j < tiim1MängijadViskeProtsendiga.size(); j++) {
                //ketran for-i senikaua, kuniks leiab sobiva mängija
                if (tiim1MängijadViskeProtsendiga.get(j).contains(valitudViskaja1)) {
                    List<String> mängija = tiim1MängijadViskeProtsendiga.get(j);
                    if (viskaja1ViskeKaugus == 1) {
                        if (viskaja1Tabavus < Integer.parseInt(mängija.get(viskaja1ViskeKaugus))) {
                            tiim1Skoor += 3;
                            System.out.println(valitudViskaja1 + " viskas kolmest. Vise tabab! Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        } else {
                            System.out.println(valitudViskaja1 + " viskas kolmest. Vise ei taba... Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        }
                    } else if (viskaja1ViskeKaugus == 2) {
                        if (viskaja1Tabavus < Integer.parseInt(mängija.get(viskaja1ViskeKaugus))) {
                            tiim1Skoor += 2;
                            System.out.println(valitudViskaja1 + " viskas kahest. Vise tabab! Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        } else {
                            System.out.println(valitudViskaja1 + " viskas kahest. Vise ei taba... Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        }
                    }
                    break;
                }
            }
            TimeUnit.SECONDS.sleep(2);

            //for tsükkel teise tiimi viske sooritamiseks
            for (int k = 0; k < tiim2MängijadViskeProtsendiga.size(); k++) {
                //ketran for-i senikaua, kuniks leiab sobiva mängija
                if (tiim2MängijadViskeProtsendiga.get(k).contains(valitudViskaja2)) {
                    List<String> mängija = tiim2MängijadViskeProtsendiga.get(k);
                    if (viskaja2ViskeKaugus == 1) {
                        if (viskaja2Tabavus < Integer.parseInt(mängija.get(viskaja2ViskeKaugus))) {
                            tiim2Skoor += 3;
                            System.out.println(valitudViskaja2 + " viskas kolmest. Vise tabab! Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        } else {
                            System.out.println(valitudViskaja2 + " viskas kolmest. Vise ei taba... Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        }
                    } else if (viskaja2ViskeKaugus == 2) {
                        if (viskaja2Tabavus < Integer.parseInt(mängija.get(viskaja2ViskeKaugus))) {
                            tiim2Skoor += 2;
                            System.out.println(valitudViskaja2 + " viskas kahest. Vise tabab! Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        } else {
                            System.out.println(valitudViskaja2 + " viskas kahest. Vise ei taba... Skoor: " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
                        }
                    }
                    break;
                }
            }
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("Mäng läbi! Lõppseis:  " + tiim1 + " " + tiim1Skoor + ":" + tiim2Skoor + " " + tiim2);
    }
}

