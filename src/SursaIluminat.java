public class SursaIluminat extends DispozitivIluminat
{
    private String tipSursa;
    private int durataViata; // ore
    private int fluxLuminos; // in lumeni

    // Constructor fara argumente
    public SursaIluminat()
    {
        this.tipSursa = "necunoscut";
        this.durataViata = 0;
        this.fluxLuminos = 0;
    }

    // Constructor cu toate argumentele
    public SursaIluminat(String tipSursa, int durataViata, int fluxLuminos)
    {
        this.tipSursa = tipSursa;
        this.durataViata = durataViata;
        this.fluxLuminos = fluxLuminos;
    }

    // Constructor de copiere

    public SursaIluminat(SursaIluminat sursailuminat)
    {
        this.tipSursa = sursailuminat.tipSursa;
        this.durataViata = sursailuminat.durataViata;
        this.fluxLuminos = sursailuminat.fluxLuminos;
    }

    public void porneste()
    {
        System.out.println("[+] SURSA DE ILUMINAT a fost pornita. [+]");
    }

    public void opreste()
    {
        System.out.println("[-] SURSA DE ILUMINAT a fost oprita. [-]");
    }

    // Cream settere si gettere pentru noile campuri 

    // TIPUL SURSEI
    // ---------------------------------

    public String getTipSursa()
    {
        return tipSursa;
    }

    public void setTipSursa(String tipSursa)
    {
        this.tipSursa = tipSursa;
    }

    // ---------------------------------

    // DURATA DE VIATA
    // ---------------------------------   
    
    public int getDurataViata() 
    {
        return durataViata;
    }

    public void setDurataViata(int durataViata)
    {
        this.durataViata = durataViata;
    }

    // ---------------------------------

    // FLUX LUMINOS
    // ---------------------------------

    public int getFluxLuminos()
    {
        return fluxLuminos;
    }

    public void setFluxLuminos(int fluxLuminos)
    {
        this.fluxLuminos = fluxLuminos;
    }

    // ---------------------------------

    public String toString()
    {
        return "[!] Sursa de iluminat este de tip: " + tipSursa + ", are durata de viata de: " + durataViata + " ore" + ", fluxul luminos de: " + fluxLuminos + " LUMENI.";
    }
}
