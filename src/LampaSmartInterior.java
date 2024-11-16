
public class LampaSmartInterior extends DispozitivIluminat {

    public boolean controlVocal;
    public boolean wifi;
    public String tipMontaj;
    public int durataBaterie;
    public String producator;

    // Constructor fara argumente
    public LampaSmartInterior() {
        this.controlVocal = false;
        this.wifi = false;
        this.tipMontaj = "necunoscut";
        this.durataBaterie = 0;
        this.producator = "necunoscut";
    }

    // Constructor cu toate argumentele
    public LampaSmartInterior(boolean controlVocal, boolean wifi, String tipMontaj, int durataBaterie, String producator) {
        this.controlVocal = controlVocal;
        this.wifi = wifi;
        this.tipMontaj = tipMontaj;
        this.durataBaterie = durataBaterie;
        this.producator = producator;
    }

    // Constructor de copiere
    public LampaSmartInterior(LampaSmartInterior lampaSmart) {
        this.controlVocal = lampaSmart.controlVocal;
        this.wifi = lampaSmart.wifi;
        this.tipMontaj = lampaSmart.tipMontaj;
        this.durataBaterie = lampaSmart.durataBaterie;
        this.producator = lampaSmart.producator;
    }

    // Metoda porneste
    public void porneste() {
        System.out.println("Lampa smart de interior a fost pornita.");
    }

    // Metoda opreste
    public void opreste() {
        System.out.println("Lampa smart de interior a fost oprita.");
    }

    // Metoda toString
    public String toString() {
        return "LampaSmartInterior are control vocal '" + controlVocal + "', WiFi '" + wifi
                + "', tip de montaj '" + tipMontaj + "', durata bateriei de '" + durataBaterie
                + "' si este fabricata de producatorul '" + producator + "'.";
    }

    // Gettes si Setter
    public boolean getControlVocal() {
        return controlVocal;
    }

    public void setControlVocal(boolean controlVocal) {
        this.controlVocal = controlVocal;
    }

    public boolean getWifi() {
        return wifi;
    }

    public void setConectivitateWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getTipMontaj() {
        return tipMontaj;
    }

    public void setTipMontaj(String tipMontaj) {
        this.tipMontaj = tipMontaj;
    }

    public int getDurataBaterie() {
        return durataBaterie;
    }

    public void setDurataBaterie(int durataBaterie) {
        this.durataBaterie = durataBaterie;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }
}
