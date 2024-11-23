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

        for(int i = 0 ; i < 10; i++)
        {
            lampi.add(new Lampa("Tip " + i, (byte) (30 + i), "alb", "LED", "Marca" + i));
        }

        System.out.println("\n === Vector de 10 instante Lampa ===");
        for(Lampa lampa : lampi)
        {
            lampa.porneste();
            //System.out.println(lampa);
            lampa.opreste();
            System.out.println();
        }

        // ==================================================== 

                            // ALEX
        // ====================================================

        // Vector pentru 10 instante de Lampa Smart Exterior
        Vector<LampaSmartExterior> lampiSmartExterior = new Vector<>();
        for(int i = 0; i <  10; i++)
        {
            // i%2==0 verifica rezistenta la apa
            lampiSmartExterior.add(new LampaSmartExterior("Smart Tip " + i, (byte) (50 + i), "culoare " + i, "LED", "SmartMarca" + i, i % 2 == 0, "montaj " + i, true, "Miscare", (byte) (10 + i)));
        }

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

        for(int i = 0; i < 10; i++)
        {
            surseIluminat.add(new SursaIluminat("Sursa Tip " + i, 8000 + i * 500, 700 + i * 50));
        }

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
       