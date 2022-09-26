import com.apple.eawt.AppEvent;

public class Auto {
    //vlastnosti
    public int pocetKol;
    public String barva;
    private float poziceX;
    private boolean jeNastartovane;

    //funkce
    public void setBarva(String barvaAuta){
        barva = barvaAuta;
    }
    public int pridatKolo(int kolik){
        int mistniKola = pocetKol + kolik;
        return mistniKola;

    }
    public void setPocetKol(int kola){
        if (kola > 10) {
            System.out.println("Auto s takovym poctem kol neexistuje");
        }
        else {
            pocetKol = kola;
        }

    }

    public void jet(){
        poziceX += 0.1f;
        System.out.println(poziceX);
    }

    //konstruktory
    public Auto(){

    }
    public Auto(int kola){
        pocetKol = kola;
    }

    public Auto(int kola, String barvaAuta, float pozice, boolean nastartovane){
        pocetKol = kola;
        barva = barvaAuta;
        poziceX = pozice;
        jeNastartovane = nastartovane;
    }

}
