import java.util.Vector;

public class TestLampa {
    public static void main(String[] args) {
      
        // ==========================================
        // TEST 3 INSTANTE DIN FIECARE CLASA
        // ==========================================

        // === Test pentru clasa LAMPA ===

        System.out.println("=== Test pentru clasa LAMPA ===");

        // Constructor fara parametri
        Lampa lampa1 = new Lampa();

        // Constructor cu parametri
        Lampa lampa2 = new Lampa("LED", (byte) 40, "alb rece", "LED", "Philips");

        // Constructor de copiere
        Lampa lampa3 = new Lampa(lampa2);

        // Afisam datele fiecarei instante
        System.out.println(lampa1);
        System.out.println(lampa2);
        System.out.println(lampa3);
        System.out.println();

        // === Test pentru clasa LAMPA SMART EXTERIOR ===

        System.out.println("=== Test pentru clasa LAMPA SMART EXTERIOR ===");

        // Constructor fara parametri
        LampaSmartExterior lampaSmart1 = new LampaSmartExterior();

        // Constructor cu parametri
        LampaSmartExterior lampaSmart2 = new LampaSmartExterior("Smart LED", (byte) 60, "alb cald", "LED", "Xiaomi", true, "perete", true, "Miscare", (byte) 12);

        // Constructor de copiere
        LampaSmartExterior lampaSmart3 = new LampaSmartExterior(lampaSmart2);

        // Afisam datele fiecarei instante
        System.out.println(lampaSmart1);
        System.out.println(lampaSmart2);
        System.out.println(lampaSmart3);
        System.out.println();       

        // === Test pentru clasa SursaIluminat ===

        System.out.println("=== Test pentru clasa SursaIluminat ===");

        // Constructor fara parametri
        SursaIluminat sursa1 = new SursaIluminat();

        // Constructor cu parametri
        SursaIluminat sursa2 = new SursaIluminat("Bec", 10000, 800);

        // Constructor de copiere
        SursaIluminat sursa3 = new SursaIluminat(sursa2);

        // Afisam datele fiecarei instante
        System.out.println(sursa1);
        System.out.println(sursa2);
        System.out.println(sursa3);
        System.out.println();
      
        /* ===================================================================

        // === Test pentru clasa LAMPA SMART INTERIOR ===

        System.out.println("=== Test pentru clasa LAMPA SMART INTERIOR ===");

        // Constructor fara parametri
        LampaSmartInterior lampaSmartInt1 = new LampaSmartInterior();

        // Constructor cu parametri
        LampaSmartInterior lampaSmartInt2 = new LampaSmartInterior("", (byte) , "", "", "", true, "", true, "", (byte) );

        // Constructor de copiere
        LampaSmartInterior lampaSmartInt3 = new LampaSmartInterior(lampaSmartInt2);

        // Afisam datele fiecarei instante
        System.out.println(lampaSmartInt1);
        System.out.println(lampaSmartInt2);
        System.out.println(lampaSmartInt3);
        System.out.println();
        
        // === Test pentru clasa Prelungitor ===

        System.out.println("=== Test pentru clasa Prelungitor ===");

        // Constructor fara parametri
        Prelungitor prelungitor1 = new Prelungitor();

        // Constructor cu parametri
        Prelungitor prelungitor2 = new Prelungitor("");

        // Constructor de copiere
        Prelungitor prelungitor3 = new Prelungitor(prelungitor2);

        // Afisam datele fiecarei instante
        System.out.println(prelungitor1);
        System.out.println(prelungitor2);
        System.out.println(prelungitor3);
        System.out.println();        

        ===================================================================
        */

        // ==========================================
        // Crearea si afisarea vectorului
        // ==========================================

                            // CLASA PARINTE
        // ====================================================

        // Vector pentru 10 instante de Lampa
        Vector<Lampa> lampi = new Vector<>();

        lampi.add(new Lampa("LED standard", (byte) 40, "alb rece", "LED", "Philips"));
        lampi.add(new Lampa("Halogen mic", (byte) 50, "alb cald", "Halogen", "Osram"));
        lampi.add(new Lampa("Bec Edison", (byte) 60, "galben cald", "Incandescent", "Vintage"));
        lampi.add(new Lampa("Tub fluorescent", (byte) 35, "alb rece", "Fluorescent", "GE"));
        lampi.add(new Lampa("Spot LED", (byte) 20, "alb natural", "LED", "Samsung"));
        lampi.add(new Lampa("Lustra clasica", (byte) 30, "galben cald", "Incandescent", "Ikea"));
        lampi.add(new Lampa("Proiector LED", (byte) 100, "alb rece", "LED", "Bosch"));
        lampi.add(new Lampa("Lampadar modern", (byte) 45, "alb natural", "Halogen", "Panasonic"));
        lampi.add(new Lampa("Aplica perete", (byte) 25, "galben cald", "LED", "Sony"));
        lampi.add(new Lampa("Lampa de birou", (byte) 15, "alb rece", "LED", "Xiaomi"));


        System.out.println("\n === Vector de 10 instante Lampa ===");
        for(Lampa lampa : lampi)
        {
            lampa.porneste();
            //System.out.println(lampa);
            System.out.println();
            lampa.opreste();
        }

        // ==================================================== 

                            // ALEX
        // ====================================================

        // Vector pentru 10 instante de Lampa Smart Exterior
        Vector<LampaSmartExterior> lampiSmartExterior = new Vector<>();
        
        lampiSmartExterior.add(new LampaSmartExterior("Smart LED Exterior", (byte) 50, "alb cald", "LED", "Philips Hue", true, "perete", true, "Miscare", (byte) 12));
        lampiSmartExterior.add(new LampaSmartExterior("Lampa gradina solara", (byte) 30, "alb natural", "Solar", "GardenPro", true, "sol", true, "Intensitate variabila", (byte) 8));
        lampiSmartExterior.add(new LampaSmartExterior("Lampa perete smart", (byte) 60, "alb rece", "LED", "Xiaomi Smart", true, "perete", true, "Miscare", (byte) 10));
        lampiSmartExterior.add(new LampaSmartExterior("Proiector smart", (byte) 100, "alb rece", "LED", "Bosch Smart", true, "perete", true, "Timp programabil", (byte) 15));
        lampiSmartExterior.add(new LampaSmartExterior("Lampa piscina", (byte) 40, "albastru", "LED", "AquaLight", true, "submersibil", false, "Programator", (byte) 7));
        lampiSmartExterior.add(new LampaSmartExterior("Lampa solara alee", (byte) 35, "alb cald", "Solar", "SolarPath", true, "sol", true, "Intensitate variabila", (byte) 5));
        lampiSmartExterior.add(new LampaSmartExterior("Aplica terasa", (byte) 45, "alb natural", "LED", "TerraceLight", false, "perete", true, "Intensitate variabila", (byte) 10));
        lampiSmartExterior.add(new LampaSmartExterior("Spot gradina smart", (byte) 25, "verde", "LED", "GardenSmart", true, "sol", false, "Miscare", (byte) 6));
        lampiSmartExterior.add(new LampaSmartExterior("Lampa iluminat statuie", (byte) 70, "alb cald", "LED", "SculptureLight", false, "sol", false, "Intensitate variabila", (byte) 12));
        lampiSmartExterior.add(new LampaSmartExterior("Lustra exterior", (byte) 60, "alb rece", "Halogen", "OutdoorLust", true, "tavan", true, "Programator", (byte) 11));
        

        System.out.println("\n === Vector de 10 instante LampaSmartExterior ===");
        for(LampaSmartExterior lampaSmart : lampiSmartExterior)
        {
            lampaSmart.porneste();
            //System.out.println(lampaSmart);
            lampaSmart.opreste();
            System.out.println();
        }

        // Vector pentru 10 instante de SursaIluminat
        Vector<SursaIluminat> surseIluminat = new Vector<>();

        surseIluminat.add(new SursaIluminat("Bec LED", 15000, 800));
        surseIluminat.add(new SursaIluminat("Bec halogen", 2000, 900));
        surseIluminat.add(new SursaIluminat("Tub fluorescent", 8000, 700));
        surseIluminat.add(new SursaIluminat("Proiector LED", 25000, 1200));
        surseIluminat.add(new SursaIluminat("Bec incandescent", 1000, 600));
        surseIluminat.add(new SursaIluminat("Spot LED", 20000, 500));
        surseIluminat.add(new SursaIluminat("Lustra clasica", 12000, 400));
        surseIluminat.add(new SursaIluminat("Lampadar LED", 18000, 750));
        surseIluminat.add(new SursaIluminat("Sursa solara", 20000, 850));
        surseIluminat.add(new SursaIluminat("Lumina decorativa", 5000, 300));

        System.out.println("\n=== Vector de 10 instante SursaIluminat ===");
        for(SursaIluminat sursa : surseIluminat)
        {
            sursa.porneste();
            //System.out.println(sursa);
            sursa.opreste();
            System.out.println();
        }

        // ====================================================

                            // COSMIN
        // ====================================================

        // Vector pentru 10 instante de Lampa Smart Interior

        // Vector pentru 10 instante de Prelungitor

        // ====================================================
        
        
    }
}
       