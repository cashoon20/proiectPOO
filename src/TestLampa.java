public class TestLampa {
    public static void main(String[] args) {
      
        Lampa lampa1 = new Lampa("LED", 60, "alb", "LED", "Philips");
        Lampa lampa2 = new Lampa();

      
        System.out.println(lampa1.toString());
        System.out.println(lampa2.toString()); 

        
        lampa1.porneste(); 
        lampa1.opreste(); 

        
        Lampa lampa3 = new Lampa(lampa1);
        System.out.println(lampa3.toString());  // Ar trebui sa afiseze aceleasi detalii ca lampa 1
    }
}
