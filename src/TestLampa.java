public class TestLampa {
    public static void main(String[] args) {
      
        Lampa lampa1 = new Lampa("LED", 60, "alb", "LED", "Philips");
        Lampa lampa2 = new Lampa();

      
        System.out.println(lampa1.toString());
        System.out.println(lampa2.toString()); 
        
        Lampa lampa3 = new Lampa(lampa1);
        System.out.println(lampa3.toString());  // Ar trebui sa afiseze aceleasi detalii ca lampa 1

        // ==============================================================================================
        // Testele pentru LampaSmartExterior
        System.out.println("\n=== TESTE LAMPA SMART EXTERIOR ===");

        LampaSmartExterior lampaSmart1 = new LampaSmartExterior("Smart LED", 80, "alb rece", "LED", "Philips", true, "perete", true, "Miscare", 24);
        LampaSmartExterior lampaSmart2 = new LampaSmartExterior();
        LampaSmartExterior lampaSmart3 = new LampaSmartExterior(lampaSmart1);

        // Afisam obiectele
        System.out.println(lampaSmart1.toString());
        System.out.println(lampaSmart2.toString());
        System.out.println(lampaSmart3.toString());

        // Testam metodele de pornire si oprire
        lampaSmart1.porneste();
        lampaSmart2.opreste();
    }
}
