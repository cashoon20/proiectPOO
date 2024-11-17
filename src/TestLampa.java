public class TestLampa {
    public static void main(String[] args) {
      
//        Lampa lampa1 = new Lampa("LED", 60, "alb", "LED", "Philips");
//        Lampa lampa2 = new Lampa();
//
//      
//        System.out.println(lampa1.toString());
//        System.out.println(lampa2.toString()); 
//
//        
//        lampa1.porneste(); 
//        lampa1.opreste(); 
//
//        
//        Lampa lampa3 = new Lampa(lampa1);
//        System.out.println(lampa3.toString());  // Ar trebui sa afiseze aceleasi detalii ca lampa 1
   
        Lampa lampa1 = new Lampa();
        Lampa lampa2 = new Lampa("LED", 10, "alb", "LED", "Philips");
        System.out.println(lampa1);
        System.out.println(lampa2);

        System.out.println(lampa1.toString());
        System.out.println(lampa2.toString()); 
        
        Lampa lampa3 = new Lampa(lampa1);
        System.out.println(lampa3.toString());  // Ar trebui sa afiseze aceleasi detalii ca lampa 1

        // ==============================================================================================
        // Testele pentru Lampa Smart Interior

        System.out.println("\n=== TESTE LAMPA SMART INTERIOR ===");

        LampaSmartInterior lampaSmartInt1 = new LampaSmartInterior();
        LampaSmartInterior lampaSmartInt2 = new LampaSmartInterior(true, true, "pe perete", 10, "Xiaomi");
        LampaSmartInterior lampaSmartInt3 = new LampaSmartInterior(lampaSmartInt2);
        System.out.println(lampaSmartInt1);
        System.out.println(lampaSmartInt2);
        System.out.println(lampaSmartInt3);
        System.out.println();

        // ==============================================================================================
        // Testele pentru prelungitor
        System.out.println("\n=== TESTE PRELUNGITOR ===");

        Prelungitor prelungitor1 = new Prelungitor();
        Prelungitor prelungitor2 = new Prelungitor(4, true, 3, "EU", true);
        Prelungitor prelungitor3 = new Prelungitor(prelungitor2);
        System.out.println(prelungitor1);
        System.out.println(prelungitor2);
        System.out.println(prelungitor3);
        System.out.println();

        // ==============================================================================================
        // Testele pentru Lampa Smart Exterior
        System.out.println("\n=== TESTE LAMPA SMART EXTERIOR ===");

        LampaSmartExterior lampaSmart1 = new LampaSmartExterior("Smart LED", 80, "alb rece", "LED", "Philips", true, "perete", true, "Miscare", 24);
        LampaSmartExterior lampaSmart2 = new LampaSmartExterior();
        LampaSmartExterior lampaSmart3 = new LampaSmartExterior(lampaSmart1);

        // Afisam obiectele
        System.out.println(lampaSmart1.toString());
        System.out.println(lampaSmart2.toString());
        System.out.println(lampaSmart3.toString());
        System.out.println();

        // ==============================================================================================
        // Testele pentru Sursa Iluminat

        SursaIluminat sursa1 = new SursaIluminat("bec", 5000, 800);
        SursaIluminat sursa2 = new SursaIluminat();
        SursaIluminat sursa3 = new SursaIluminat(sursa1);

        // Afisam obiectele

        System.out.println(sursa1.toString());
        System.out.println(sursa2.toString());
        System.out.println(sursa3.toString());
        System.out.println();

        // Testam metodele de pornire si oprire

        lampa1.porneste();
        lampa2.opreste();

        lampaSmart1.porneste();
        lampaSmart2.opreste();

        lampaSmartInt1.porneste();
        lampaSmartInt2.opreste();

        prelungitor1.porneste();
        prelungitor2.opreste();

        sursa1.porneste();
        sursa2.opreste();
        
    }
}
       