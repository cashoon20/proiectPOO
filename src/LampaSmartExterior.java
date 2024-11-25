public class LampaSmartExterior extends Lampa 
{
    private boolean rezistentaApa;
    private String tipMontaj;
    private boolean conectivitateWiFi;
    private String senzorLumina;
    private byte durataBaterie; // in cazul in care este fara fir (specificat in ore)

    // Constructor fara argumente

    public LampaSmartExterior()
    {
        // Apelam constructorul fara argumente din Lampa
        super();
        
        this.rezistentaApa = false;
        this.tipMontaj = "necunoscut";
        this.conectivitateWiFi = false;
        this.senzorLumina = "necunoscut";
        this.durataBaterie = 0;
    }

    // Constructor cu toate argumentele
    public LampaSmartExterior(String tip, byte putere, String culoare, String tipBec, String marca, boolean rezistentaApa, String tipMontaj, boolean conectivitateWiFi, 
                              String senzorLumina, byte durataBaterie)
    {
        // Se apeleaza constructorul din Lampa
        super(tip, putere, culoare, tipBec, marca);

        this.rezistentaApa = rezistentaApa;
        this.tipMontaj = tipMontaj;
        this.conectivitateWiFi = conectivitateWiFi;
        this.senzorLumina = senzorLumina;
        this.durataBaterie = durataBaterie;
    }

    public LampaSmartExterior(LampaSmartExterior lampa)
    {
        // Apelam constructorul de copiere din Lampa
        super(lampa);

        this.rezistentaApa = lampa.rezistentaApa;
        this.tipMontaj = lampa.tipMontaj;
        this.conectivitateWiFi = lampa.conectivitateWiFi;
        this.senzorLumina = lampa.senzorLumina;
        this.durataBaterie = lampa.durataBaterie;
    }
    
    @Override
    // Utilizam metode abstracte de pornire si oprire suprascrise
    public void porneste() 
    {
        if(!isPornit())
        {
            setPornit(true);
            System.out.println("[+] LAMPA SMART EXTERIOR a fost pornita. [+] \n Detalii:\n " + this);
        }
        else
        {
        System.out.println("[!!!] LAMPA SMART EXTERIOR este deja pornita [!!!]");
        }
    }

    @Override
    public void opreste() 
    {
        if(isPornit())
        {
            setPornit(false);
            System.out.println("[-] LAMPA SMART EXTERIOR a fost oprita. [-]");
        }
        else
        {
            System.out.println("[!!!] LAMPA SMART EXTERIOR este deja oprita [!!!]");
        }
    }

    // Cream settere si gettere pentru noile campuri si functii bool

    // REZISTENTA APA
    // ---------------------------------

    public boolean esteRezistentLaApa() 
    {
        return rezistentaApa;
    }

    public void setRezistentaApa(boolean rezistentaApa)
    {
        this.rezistentaApa = rezistentaApa;
    }

    // ---------------------------------
    
    // TIPUL DE MONTAJ
    // ---------------------------------

    public String getTipMontaj()
    {
        return tipMontaj;
    }

    public void setTipMontaj(String tipMontaj)
    {
        this.tipMontaj = tipMontaj;
    }

    // ---------------------------------

    // CONECTIVITATE WIFI
    // ---------------------------------

    public boolean areConectivitateWiFi()
    {
        return conectivitateWiFi;
    }

    public void setConectivitateWiFi(boolean conectivitateWiFi)
    {
        this.conectivitateWiFi = conectivitateWiFi;
    }

    // ---------------------------------

    // SENZOR LUMINA
    // ---------------------------------

    public String getSenzoriLumina()
    {
        return senzorLumina;
    }

    public void setSenzorLumina(String senzorLumina)
    {
        this.senzorLumina = senzorLumina;
    }

    // DURATA BATERIEI
    // ---------------------------------

    public byte getDurataBateriei()
    {
        return durataBaterie;
    }

    public void setDurataBaterie(byte durataBaterie)
    {
        this.durataBaterie = durataBaterie;
    }

    // Suprascrierea metodei toString
    @Override
    
    public String toString()
    {
        return super.toString() + "\n- Este rezistent la apa: " + rezistentaApa + "\n- montaj: " + tipMontaj + "\n- conectivitate WiFi: " + conectivitateWiFi + 
                                  "\n- senzor: " + senzorLumina + "\n- durata bateriei: " + durataBaterie + " ore.\n";

    }

}
