import java.util.Vector;

public class TestLampa2 {
    public static void main(String[] args) {
        
        // Crearea unor instante de Lampa folosind toti constructorii
        Lampa lampa1 = new Lampa();  // Constructor fara argumente
        Lampa lampa2 = new Lampa("Birou", (byte) 15, "Alb", "LED", "Philips"); // Constructor cu argumente
        Lampa lampa3 = new Lampa(lampa2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta Lampa
        System.out.println("Instanta 1 - Lampa: " + lampa1);
        System.out.println("Instanta 2 - Lampa: " + lampa2);
        System.out.println("Instanta 3 - Lampa (copiere): " + lampa3);

        System.out.println("\n-------------------------\n");

        // Crearea unor instante de Prelungitor folosind toti constructorii
        Prelungitor prelungitor1 = new Prelungitor(); // Constructor fara argumente
        Prelungitor prelungitor2 = new Prelungitor(4, true, 5, "Birou", (byte) 15, "Alb", "LED", "Philips", "Tip 1", true); // Constructor cu argumente
        Prelungitor prelungitor3 = new Prelungitor(prelungitor2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta Prelungitor
        System.out.println("Instanta 1 - Prelungitor: " + prelungitor1);
        System.out.println("Instanta 2 - Prelungitor: " + prelungitor2);
        System.out.println("Instanta 3 - Prelungitor (copiere): " + prelungitor3);

        System.out.println("\n-------------------------\n");

        // Crearea unor instante de LampaSmartInterior folosind toti constructorii
        LampaSmartInterior lampaSmart1 = new LampaSmartInterior(); // Constructor fara argumente
        LampaSmartInterior lampaSmart2 = new LampaSmartInterior("Birou", (byte) 15, "Alb", "LED", "Philips", true, true, "Pe perete", (byte) 12, "Xiaomi"); // Constructor cu argumente
        LampaSmartInterior lampaSmart3 = new LampaSmartInterior(lampaSmart2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta LampaSmartInterior
        System.out.println("Instanta 1 - LampaSmartInterior: " + lampaSmart1);
        System.out.println("Instanta 2 - LampaSmartInterior: " + lampaSmart2);
        System.out.println("Instanta 3 - LampaSmartInterior (copiere): " + lampaSmart3);

        
        
        
        // Crearea unui vector pentru fiecare tip de obiect
        Vector<Lampa> lampi = new Vector<>();
        Vector<LampaSmartInterior> lampiSmart = new Vector<>();
        Vector<Prelungitor> prelungitoare = new Vector<>();  // Un singur vector pentru Prelungitor
            
        
        // Crearea a 10 instante de Lampa
        for (int i = 0; i < 10; i++) {
            Lampa lampa = new Lampa(
                "Lampa tip " + (i + 1),           // tip
                (byte)(10 + i),                   // putere
                "Culoare " + (i + 1),             // culoare
                "LED",                            // tipBec
                "Marca " + (i + 1)                // marca
            );
            lampi.add(lampa);
        }
        
        // Crearea a 10 instante de Prelungitor
        for (int i = 0; i < 10; i++) {
            Prelungitor prelungitor = new Prelungitor(
                2 + i,                               // numarPrize
                (i % 3 == 0),                        // protectieSupratensiune
                7 + i,                               // lungimeCablu
                "Prelungitor tip " + (i + 1),        // tip
                (byte)(15 + i),                      // putere
                "Culoare " + (i + 2),                // culoare
                "Halogen",                           // tipBec
                "Marca " + (i + 3),                  // marca
                "Tip Stecher " + (i + 2),            // tipStecher
                (i % 2 != 0)                         // indicatorPornit
            );
            prelungitoare.add(prelungitor);  // Adaugam instanta la vectorul corect
        }


        // Crearea a 10 instante de LampaSmartInterior
        for (int i = 0; i < 10; i++) {
            LampaSmartInterior lampaSmart = new LampaSmartInterior(
                "LampaSmart " + (i + 1),           // tip
                (byte)(10 + i),                    // putere
                "Culoare " + (i + 1),              // culoare
                "LED",                             // tipBec
                "Marca " + (i + 1),                // marca
                (i % 2 == 0),                      // controlVocal
                (i % 3 == 0),                      // wifi
                "Montaj Tip " + (i + 1),           // tipMontaj
                (byte)(5 + i),                     // durataBaterie
                "Producator " + (i + 1)            // producator
            );
            lampiSmart.add(lampaSmart);  // Adaugam instanta la vectorul corect
        }

        // Afisarea instantelor pentru fiecare clasa =======================

        // Afisarea instantelor pentru Lampa
        System.out.println("Instante Lampa:");
        for (Lampa lampa : lampi) {
            System.out.println(lampa);
        }
        
        // Afisarea Prelungitoarelor
        System.out.println("\nInstante Prelungitor:");
        for (Prelungitor prelungitor : prelungitoare) {
            System.out.println(prelungitor.toString());
        }

        // Afisarea Lampilor Smart Interior
        System.out.println("\nInstante Lampa Smart Interior:");
        for (LampaSmartInterior lampaSmart : lampiSmart) {
            System.out.println(lampaSmart.toString());
        }
    }
}
