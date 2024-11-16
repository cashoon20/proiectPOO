public class Lampa extends DispozitivIluminat {

    private String tip;
    private int putere;          // puterea in W
    private String culoare;      // 
    private String tipBec;       // (LED, incandescent)
    private String marca;        // 

    // Constructor fara argumente
    public Lampa() {
        this.tip = "necunoscut";
        this.putere = 0;
        this.culoare = "necunoscut";
        this.tipBec = "necunoscut";
        this.marca = "necunoscut";
    }

    // Constructor cu toate argumentele
    public Lampa(String tip, int putere, String culoare, String tipBec, String marca) {
        this.tip = tip;
        this.putere = putere;
        this.culoare = culoare;
        this.tipBec = tipBec;
        this.marca = marca;
    }

    // Constructor de copiere
    public Lampa(Lampa lampa) {
        this.tip = lampa.tip;
        this.putere = lampa.putere;
        this.culoare = lampa.culoare;
        this.tipBec = lampa.tipBec;
        this.marca = lampa.marca;
    }

    // Implementare metoda abstracta (pornire)
    public void porneste() {
        System.out.println("Lampa a fost pornita");
    }

    // Implementare metoda abstracta (oprire)
    public void opreste() {
        System.out.println("Lampa a fost oprita");
    }

    // Metoda toString
    public String toString() {
    return " [!] Lampa are tipul '" + tip + "', puterea de " + putere + "W, culoarea '" + culoare + 
           "', tipul de bec '" + tipBec + "' si este fabricata de marca '" + marca + "'.\n";
}


    // Getter și setter pentru fiecare camp
    public String getTip() { return tip; }
    public void setTip(String tip) { this.tip = tip; }

    public int getPutere() { return putere; }
    public void setPutere(int putere) { this.putere = putere; }

    public String getCuloare() { return culoare; }
    public void setCuloare(String culoare) { this.culoare = culoare; }

    public String getTipBec() { return tipBec; }
    public void setTipBec(String tipBec) { this.tipBec = tipBec; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
}
