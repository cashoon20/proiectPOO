public class Prelungitor extends Lampa {

    private int numarPrize;
    private boolean protectieSupratensiune;
    private int lungimeCablu;
    private String tipStecher;
    private boolean indicatorPornit;

    // Constructor fara argumente
    public Prelungitor() {
        super(); // Constructorul fara parametri al clasei Lampa
        this.numarPrize = 0;
        this.protectieSupratensiune = false;
        this.lungimeCablu = 0;
        this.tipStecher = "necunoscut";
        this.indicatorPornit = false;
    }

    // Constructor cu toate argumentele
     public Prelungitor(int numarPrize, boolean protectieSupratensiune, int lungimeCablu, String tip, byte putere, String culoare, String tipBec, String marca, String tipStecher, boolean indicatorPornit) {
        super(tip, putere, culoare, tipBec, marca); // constructorul cu parametri al clasei Lampa
        this.numarPrize = numarPrize;
        this.protectieSupratensiune = protectieSupratensiune;
        this.lungimeCablu = lungimeCablu;
        this.tipStecher = tipStecher;
        this.indicatorPornit = indicatorPornit;
    }

    // Constructor de copiere
    public Prelungitor(Prelungitor prelungitor) {
        super(prelungitor.getTip(), prelungitor.getPutere(), prelungitor.getCuloare(), 
              prelungitor.getTipBec(), prelungitor.getMarca()); // Constructorul de copiere al clasei Lampa
        this.numarPrize = prelungitor.numarPrize;
        this.protectieSupratensiune = prelungitor.protectieSupratensiune;
        this.lungimeCablu = prelungitor.lungimeCablu;
        this.tipStecher = prelungitor.tipStecher;
        this.indicatorPornit = prelungitor.indicatorPornit;
    }

    // Metoda porneste
    public void porneste() {
        System.out.println("[+] PRELUNGITORUL a fost pornit. [+]");
    }

    // Metoda opreste
    public void opreste() {
        System.out.println("[-] PRELUNGITORUL a fost oprit. [-]");
    }

    // Metoda toString
    @Override
    public String toString() {
        String indicator = indicatorPornit ? "activat" : "nu are indicatorPornit";
        return "Prelungitorul are un numar de prize '" + numarPrize + "', protectie la supratensiune '" + protectieSupratensiune
                + "', o lungime a cablului de '" + lungimeCablu + "', tipul de stecher '" + tipStecher
                + "' si un indicator de pornire: " + indicator + ".";
    }

    // Getter și Setter
    public int getNumarPrize() { return numarPrize; }
    public void setNumarPrize(int numarPrize) { this.numarPrize = numarPrize; }

    public boolean isProtectieSupratensiune() { return protectieSupratensiune; }
    public void setProtectieSupratensiune(boolean protectieSupratensiune) { this.protectieSupratensiune = protectieSupratensiune; }

    public int getLungimeCablu() { return lungimeCablu; }
    public void setLungimeCablu(int lungimeCablu) { this.lungimeCablu = lungimeCablu; }

    public String getTipStecher() { return tipStecher; }
    public void setTipStecher(String tipStecher) { this.tipStecher = tipStecher; }

    public boolean isIndicatorPornit() { return indicatorPornit; }
    public void setIndicatorPornit(boolean indicatorPornit) { this.indicatorPornit = indicatorPornit; }
}
