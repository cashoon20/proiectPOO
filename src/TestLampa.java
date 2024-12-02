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
      
        // ===================================================================

        // === Test pentru clasa LAMPA SMART INTERIOR ===

        System.out.println("=== Test pentru clasa LAMPA SMART INTERIOR ===");

        // Crearea unor instante de LampaSmartInterior folosind constructori
        LampaSmartInterior lampaSmartInterior1 = new LampaSmartInterior(); // Constructor fara argumente
        LampaSmartInterior lampaSmartInterior2 = new LampaSmartInterior("Birou", (byte) 15, "Alb", "LED", "Philips", true, true, "Pe perete", (byte) 12, "Xiaomi"); // Constructor cu argumente
        LampaSmartInterior lampaSmartInterior3 = new LampaSmartInterior(lampaSmartInterior2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta LampaSmartInterior
        System.out.println("Instanta 1 - LampaSmartInterior: " + lampaSmartInterior1);
        System.out.println("Instanta 2 - LampaSmartInterior: " + lampaSmartInterior2);
        System.out.println("Instanta 3 - LampaSmartInterior (copiere): " + lampaSmartInterior3);

        System.out.println("\n-------------------------\n");
        
        // === Test pentru clasa Prelungitor ===

        System.out.println("=== Test pentru clasa Prelungitor ===");

         // Crearea unor instante de Prelungitor folosind constructori
        Prelungitor prelungitor1 = new Prelungitor(); // Constructor fara argumente
        Prelungitor prelungitor2 = new Prelungitor(4, true, 5, "Birou", (byte) 15, "Alb", "LED", "Philips", "Tip 1", true); // Constructor cu argumente
        Prelungitor prelungitor3 = new Prelungitor(prelungitor2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta Prelungitor
        System.out.println("Instanta 1 - Prelungitor: " + prelungitor1);
        System.out.println("Instanta 2 - Prelungitor: " + prelungitor2);
        System.out.println("Instanta 3 - Prelungitor (copiere): " + prelungitor3);

        System.out.println("\n-------------------------\n");

       //===================================================================
        

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

        // Vector pentru Prelungitoare
        Vector<Prelungitor> prelungitoareExtra = new Vector<>();
        
        prelungitoareExtra.add(new Prelungitor(3, true, 10, "Prelungitor 1", (byte) 20, "Negru", "LED", "Marca 1", "Tip Stecher 1", true));
        prelungitoareExtra.add(new Prelungitor(4, false, 12, "Prelungitor 2", (byte) 22, "Alb", "Halogen", "Marca 2", "Tip Stecher 2", false));
        prelungitoareExtra.add(new Prelungitor(5, true, 15, "Prelungitor 3", (byte) 25, "Rosu", "Incandescent", "Marca 3", "Tip Stecher 3", true));
        prelungitoareExtra.add(new Prelungitor(6, false, 17, "Prelungitor 4", (byte) 27, "Verde", "LED", "Marca 4", "Tip Stecher 4", false));
        prelungitoareExtra.add(new Prelungitor(7, true, 20, "Prelungitor 5", (byte) 30, "Albastru", "LED", "Marca 5", "Tip Stecher 5", true));
        prelungitoareExtra.add(new Prelungitor(5, true, 18, "Prelungitor 6", (byte) 32, "Portocaliu", "LED", "Marca 6", "Tip Stecher 6", true));
        prelungitoareExtra.add(new Prelungitor(6, false, 14, "Prelungitor 7", (byte) 28, "Mov", "Halogen", "Marca 7", "Tip Stecher 7", false));
        prelungitoareExtra.add(new Prelungitor(7, true, 16, "Prelungitor 8", (byte) 35, "Roz", "LED", "Marca 8", "Tip Stecher 8", true));
        prelungitoareExtra.add(new Prelungitor(4, true, 11, "Prelungitor 9", (byte) 24, "Gri", "Halogen", "Marca 9", "Tip Stecher 9", true));
        prelungitoareExtra.add(new Prelungitor(8, false, 13, "Prelungitor 10", (byte) 29, "Maro", "LED", "Marca 10", "Tip Stecher 10", false));

        // Vector pentru LampiSmartInterior
        Vector<LampaSmartInterior> lampiSmartExtra = new Vector<>();
        
        lampiSmartExtra.add(new LampaSmartInterior("Smart 1", (byte) 18, "Roșu", "LED", "Marca 1", true, false, "Perete", (byte) 8, "Xiaomi"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 2", (byte) 20, "Albastru", "Halogen", "Marca 2", false, true, "Tavan", (byte) 10, "Sony"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 3", (byte) 22, "Galben", "LED", "Marca 3", true, true, "Masă", (byte) 12, "Samsung"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 4", (byte) 24, "Verde", "Halogen", "Marca 4", false, false, "Tavan", (byte) 14, "LG"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 5", (byte) 26, "Mov", "LED", "Marca 5", true, true, "Perete", (byte) 16, "Panasonic"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 6", (byte) 28, "Alb", "LED", "Marca 6", true, false, "Masă", (byte) 18, "Apple"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 7", (byte) 30, "Negru", "Halogen", "Marca 7", false, true, "Tavan", (byte) 20, "Google"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 8", (byte) 32, "Gri", "LED", "Marca 8", true, true, "Perete", (byte) 22, "Huawei"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 9", (byte) 34, "Portocaliu", "LED", "Marca 9", true, false, "Masă", (byte) 24, "OnePlus"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 10", (byte) 36, "Roz", "Halogen", "Marca 10", false, true, "Tavan", (byte) 26, "Microsoft"));

        // ====================================================
        
        // Afisarea Prelungitoarelor Extra
        System.out.println("\nInstante Prelungitor Extra:");
        for (Prelungitor prelungitor : prelungitoareExtra) {
            prelungitor.porneste();
            //System.out.println(sursa)
            System.out.println(prelungitor);
            prelungitor.opreste();
        }

        // Afisarea Lampilor Smart Extra
        System.out.println("\nInstante Lampa Smart Extra:");
        for (LampaSmartInterior lampaSmart : lampiSmartExtra) {
            System.out.println(lampaSmart);
        }
        // ====================================================

                            // CLASA PARINTE
        // ====================================================
        //---------------------
        System.out.println("\n=== Instantele prin cele doua conditii combinate === \n");
        System.out.println("\t LAMPA \n");
        //---------------------

        for(Lampa lampa : lampi)
        {
            // Cele doua conditii combinate
            if(lampa.getPutere() > 20 && lampa.getTipBec().equals("LED"))
            {
                System.out.println(lampa);
            }
            
        }
        System.out.println();

        // ====================================================

                            // ALEX
        // ====================================================

        //---------------------
        System.out.println("==========================================\n");
        System.out.println("\t LAMPA SMART EXTERIOR \n");
        //---------------------

        for(LampaSmartExterior lampaSmart : lampiSmartExterior)
        {
            // Cele doua conditii combinate
            if(lampaSmart.esteRezistentLaApa() && lampaSmart.areConectivitateWiFi())
            {
                System.out.println(lampaSmart);
            }
        }
        System.out.println();

        //---------------------
        System.out.println("==========================================\n");
        System.out.println("\t SURSA ILUMINAT \n");
        //---------------------

        for(SursaIluminat sursa : surseIluminat)
        {
            if(sursa.getDurataViata() > 5000 && sursa.getFluxLuminos() > 400)
            {
                System.out.println(sursa);
            }
        }    
        System.out.println();
        
        // ====================================================

                            // COSMIN
        // ====================================================

        System.out.println("=== Instantele prin cele doua conditii combinate s-au finalizat ===\n");
    }
}
       