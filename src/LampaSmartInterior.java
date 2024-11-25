public class LampaSmartInterior extends Lampa {

    private boolean controlVocal;
    private boolean wifi;
    private String tipMontaj;
    private byte durataBaterie;
    private String producator;

    // Constructor fara argumente
    public LampaSmartInterior() {
        super(); // constructorul fara argumente din clasa Lampa
        this.controlVocal = false;
        this.wifi = false;
        this.tipMontaj = "necunoscut";
        this.durataBaterie = 0;
        this.producator = "necunoscut";
    }

    // Constructor cu toate argumentele
    public LampaSmartInterior(String tip, byte putere, String culoare, String tipBec, String marca, 
                              boolean controlVocal, boolean wifi, String tipMontaj, 
                              byte durataBaterie, String producator) {
       
        super(tip, putere, culoare, tipBec, marca); // constructorul din clasa Lampa
        this.controlVocal = controlVocal;
        this.wifi = wifi;
        this.tipMontaj = tipMontaj;
        this.durataBaterie = durataBaterie;
        this.producator = producator;
    }

    // Constructor de copiere
    public LampaSmartInterior(LampaSmartInterior lampaSmart) {
        super(lampaSmart.getTip(), lampaSmart.getPutere(), lampaSmart.getCuloare(), lampaSmart.getTipBec(), lampaSmart.getMarca()); // constructorul de copiere din clasa Lampa
        this.controlVocal = lampaSmart.controlVocal;
        this.wifi = lampaSmart.wifi;
        this.tipMontaj = lampaSmart.tipMontaj;
        this.durataBaterie = lampaSmart.durataBaterie;
        this.producator = lampaSmart.producator;
    }

    // Metoda porneste
    public void porneste() {
        System.out.println("[+] LAMPA SMART INTERIOR a fost pornita. [+]");
    }

    // Metoda opreste
    public void opreste() {
        System.out.println("[-] LAMPA SMART INTERIOR a fost oprita. [-]");
    }

    // Metoda toString
    public String toString() {
        return "LampaSmartInterior are control vocal '" + controlVocal + "', WiFi '" + wifi
                + "', tip de montaj '" + tipMontaj + "', durata bateriei de '" + durataBaterie
                + "' si este fabricata de producatorul '" + producator + "'.";
    }

    // Gettes si Setter
    public boolean getControlVocal() {return controlVocal;}
    public void setControlVocal(boolean controlVocal) {this.controlVocal = controlVocal;}

    public boolean getWifi() { return wifi;}
    public void setWifi(boolean wifi) {this.wifi = wifi;}

    public String getTipMontaj() {return tipMontaj;}
    public void setTipMontaj(String tipMontaj) {this.tipMontaj = tipMontaj; }

    public byte getDurataBaterie() { return durataBaterie;}
    public void setDurataBaterie(byte durataBaterie) {this.durataBaterie = durataBaterie;}
    
    public String getProducator() { return producator;}
    public void setProducator(String producator) { this.producator = producator;}
}
