public class Prelungitor extends DispozitivIluminat {

    public byte numarPrize;
    public boolean protectieSupratensiune;
    public byte lungimeCablu;
    public String tipStecher;
    public boolean indicatorPornit;

    // Constructor fara argumente
    public Prelungitor() {
        this.numarPrize = 0;
        this.protectieSupratensiune = false;
        this.lungimeCablu = 0;
        this.tipStecher = "necunoscut";
        this.indicatorPornit = false;
    }

    // Constructor cu toate argumentele
    public Prelungitor(byte numarPrize, boolean protectieSupratensiune, byte lungimeCablu, String tipStecher, boolean indicatorPornit) {
        this.numarPrize = numarPrize;
        this.protectieSupratensiune = protectieSupratensiune;
        this.lungimeCablu = lungimeCablu;
        this.tipStecher = tipStecher;
        this.indicatorPornit = indicatorPornit;
    }

    // Constructor de copiere
    public Prelungitor(Prelungitor prelungitor) {
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
    public String toString() {
        return "Prelungitorul are un numar de prize '" + numarPrize + "', protectie la supratensiune '" + protectieSupratensiune
                + "', o lungime a cablului de '" + lungimeCablu + "', tipul de stecher '" + tipStecher
                + "' si un indicator de pornire '" + indicatorPornit + "'.";
    }

    // Getter si setter
    public byte getNumarPrize() {return numarPrize; }
    public void setNumarPrize(byte numarPrize) {this.numarPrize = numarPrize;  }

    public boolean getProtectieSupratensiune() {return protectieSupratensiune; }
    public void setProtectieSupratensiune(boolean protectieSupratensiune) {this.protectieSupratensiune = protectieSupratensiune;}

    public byte getLungimeCablu() {return lungimeCablu;}
    public void setLungimeCablu(byte lungimeCablu) {this.lungimeCablu = lungimeCablu; }

    public String getTipStecher() {return tipStecher;}
    public void setTipStecher(String tipStecher) {this.tipStecher = tipStecher;}

    public boolean getIndicatorPornit() {return indicatorPornit;}
    public void setIndicatorPornit(boolean indicatorPornit) {this.indicatorPornit = indicatorPornit;}
}
