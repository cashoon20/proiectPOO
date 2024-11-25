import java.util.Vector;

public class TestLampa2 {
    public static void main(String[] args) {
        
        // Crearea unor instante de Lampa folosind constructori
        Lampa lampa1 = new Lampa();  // Constructor fara argumente
        Lampa lampa2 = new Lampa("Birou", (byte) 15, "Alb", "LED", "Philips"); // Constructor cu argumente
        Lampa lampa3 = new Lampa(lampa2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta Lampa
        System.out.println("Instanta 1 - Lampa: " + lampa1);
        System.out.println("Instanta 2 - Lampa: " + lampa2);
        System.out.println("Instanta 3 - Lampa (copiere): " + lampa3);

        System.out.println("\n-------------------------\n");

        // Crearea unor instante de Prelungitor folosind constructori
        Prelungitor prelungitor1 = new Prelungitor(); // Constructor fara argumente
        Prelungitor prelungitor2 = new Prelungitor(4, true, 5, "Birou", (byte) 15, "Alb", "LED", "Philips", "Tip 1", true); // Constructor cu argumente
        Prelungitor prelungitor3 = new Prelungitor(prelungitor2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta Prelungitor
        System.out.println("Instanta 1 - Prelungitor: " + prelungitor1);
        System.out.println("Instanta 2 - Prelungitor: " + prelungitor2);
        System.out.println("Instanta 3 - Prelungitor (copiere): " + prelungitor3);

        System.out.println("\n-------------------------\n");

        // Crearea unor instante de LampaSmartInterior folosind constructori
        LampaSmartInterior lampaSmartInterior1 = new LampaSmartInterior(); // Constructor fara argumente
        LampaSmartInterior lampaSmartInterior2 = new LampaSmartInterior("Birou", (byte) 15, "Alb", "LED", "Philips", true, true, "Pe perete", (byte) 12, "Xiaomi"); // Constructor cu argumente
        LampaSmartInterior lampaSmartInterior3 = new LampaSmartInterior(lampaSmartInterior2); // Constructor de copiere

        // Afisarea datelor pentru fiecare instanta LampaSmartInterior
        System.out.println("Instanta 1 - LampaSmartInterior: " + lampaSmartInterior1);
        System.out.println("Instanta 2 - LampaSmartInterior: " + lampaSmartInterior2);
        System.out.println("Instanta 3 - LampaSmartInterior (copiere): " + lampaSmartInterior3);

        System.out.println("\n-------------------------\n");

        // Vector pentru Lampi
        Vector<Lampa> lampi = new Vector<>();
        lampi.add(new Lampa("Lampa tip 1", (byte) 10, "Culoare 1", "LED", "Marca 1"));
        lampi.add(new Lampa("Lampa tip 2", (byte) 11, "Culoare 2", "LED", "Marca 2"));
        lampi.add(new Lampa("Lampa tip 3", (byte) 12, "Culoare 3", "LED", "Marca 3"));
        lampi.add(new Lampa("Lampa tip 4", (byte) 13, "Culoare 4", "LED", "Marca 4"));
        lampi.add(new Lampa("Lampa tip 5", (byte) 14, "Culoare 5", "LED", "Marca 5"));
        lampi.add(new Lampa("Lampa tip 6", (byte) 15, "Culoare 6", "LED", "Marca 6"));
        lampi.add(new Lampa("Lampa tip 7", (byte) 16, "Culoare 7", "LED", "Marca 7"));
        lampi.add(new Lampa("Lampa tip 8", (byte) 17, "Culoare 8", "LED", "Marca 8"));
        lampi.add(new Lampa("Lampa tip 9", (byte) 18, "Culoare 9", "LED", "Marca 9"));
        lampi.add(new Lampa("Lampa tip 10", (byte) 19, "Culoare 10", "LED", "Marca 10"));

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

        // Afisarea Lampilor
        System.out.println("Instante Lampa:");
        for (Lampa lampa : lampi) {
            System.out.println(lampa);
        }

        // Afisarea Prelungitoarelor Extra
        System.out.println("\nInstante Prelungitor Extra:");
        for (Prelungitor prelungitor : prelungitoareExtra) {
            System.out.println(prelungitor);
        }

        // Afisarea Lampilor Smart Extra
        System.out.println("\nInstante Lampa Smart Extra:");
        for (LampaSmartInterior lampaSmart : lampiSmartExtra) {
            System.out.println(lampaSmart);
        }
    }
}
