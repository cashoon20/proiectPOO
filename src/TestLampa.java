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
        Lampa lampa3 = new Lampa(lampa2);
        System.out.println(lampa1);
        System.out.println(lampa2);
        System.out.println(lampa3);
        System.out.println();

        LampaSmartInterior lampaSmart1 = new LampaSmartInterior();
        LampaSmartInterior lampaSmart2 = new LampaSmartInterior(true, true, "pe perete", 10, "Xiaomi");
        LampaSmartInterior lampaSmart3 = new LampaSmartInterior(lampaSmart2);
        System.out.println(lampaSmart1);
        System.out.println(lampaSmart2);
        System.out.println(lampaSmart3);
        System.out.println();

        Prelungitor prelungitor1 = new Prelungitor();
        Prelungitor prelungitor2 = new Prelungitor(4, true, 3, "EU", true);
        Prelungitor prelungitor3 = new Prelungitor(prelungitor2);
        System.out.println(prelungitor1);
        System.out.println(prelungitor2);
        System.out.println(prelungitor3);
        System.out.println();
    }
}
       