import java.awt.*; // clasele pentru interfata grafica
import java.awt.event.ActionEvent; // clasa pentru gestionarea evenimentelor de actiune
import java.awt.event.ActionListener; // interfata ptr ascultatorii de evenimente
import java.util.Vector; // clasa pentru vector
import javax.swing.*; // Pentru componentele interfatei grafice

public class GUI 
{
    public static void main(String[] args) 
    {
        // Vectori de date pentru simulare
        // =================================
        Vector<Lampa> lampi = new Vector<>();

        lampi.add(new Lampa("LED standard", (byte) 50, "alb rece", "LED", "Philips"));
        lampi.add(new Lampa("Halogen mic", (byte) 10, "alb cald", "Halogen", "Osram"));
        lampi.add(new Lampa("Bec Edison", (byte) 60, "galben cald", "Incandescent", "Vintage"));
        lampi.add(new Lampa("Tub fluorescent", (byte) 35, "alb rece", "Fluorescent", "GE"));
        lampi.add(new Lampa("Spot LED", (byte) 20, "alb natural", "LED", "Samsung"));
        lampi.add(new Lampa("Lustra clasica", (byte) 30, "galben cald", "Incandescent", "Ikea"));
        lampi.add(new Lampa("Proiector LED", (byte) 100, "alb rece", "LED", "Bosch"));
        lampi.add(new Lampa("Lampadar modern", (byte) 45, "alb natural", "Halogen", "Panasonic"));
        lampi.add(new Lampa("Aplica perete", (byte) 25, "galben cald", "LED", "Sony"));
        lampi.add(new Lampa("Lampa de birou", (byte) 15, "alb rece", "LED", "Xiaomi"));

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
        // =================================

        // Se creeaza fereastra princiapal cu titlul dat
        JFrame frame = new JFrame("Aplicație pentru lampi"); // titlul
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // specifica inchiderea aplicatiei la inchiderea ferestrei
        frame.setSize(600, 600); // dimensiunea ferestrei
        frame.setLayout(new BorderLayout()); // layout-ul principal

        // Se creeaza un panou pentru introducerea datelor
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(6, 2, 10, 10)); // Layout tip grila (6 randuri, 2 coloane)

        // Se creeaza o eticheta si un camp de text ptr introducerea valorilor specificate
        // =================================
        JLabel putereLabel = new JLabel("Putere (W):");
        JTextField putereField = new JTextField();

        JLabel tipBecLabel = new JLabel("Tip Bec:");
        JTextField tipBecField = new JTextField();

        JLabel tipSursaLabel = new JLabel("Tip Sursa:");
        JTextField tipSursaField = new JTextField();

        JLabel durataViataLabel = new JLabel("Durata de viata (ore):");
        JTextField durataViataField = new JTextField();

        JLabel fluxLuminosLabel = new JLabel("Flux luminos (lumeni):");
        JTextField fluxLuminosField = new JTextField();
        // =================================

        // Cream un buton pentru aplicarea filtrarii
        JButton filterButton = new JButton("Filtrează");

        // Adaugam componentele in panoul de introducere
        inputPanel.add(putereLabel);
        inputPanel.add(putereField);
        inputPanel.add(tipBecLabel);
        inputPanel.add(tipBecField);
        inputPanel.add(tipSursaLabel);
        inputPanel.add(tipSursaField);
        inputPanel.add(durataViataLabel);
        inputPanel.add(durataViataField);
        inputPanel.add(fluxLuminosLabel);
        inputPanel.add(fluxLuminosField);
        inputPanel.add(new JLabel()); // Se adauga un spatiu gol
        inputPanel.add(filterButton);

        // Cream o zona de text pentru afisarea rezultatelor 
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false); // Setam zona de text doar pentru citire
        JScrollPane scrollPane = new JScrollPane(resultArea); // Se adauga o bara de derulare

        // Adaugam panoul de introducere la partea de sus si zona de rezultate in fereastra
        frame.add(inputPanel, BorderLayout.NORTH); // Panoul de introducere in partea de sus
        frame.add(scrollPane, BorderLayout.CENTER); // Zona de afisare in centru

        // Se adauga un ascultator de eveniimente pentru butonul de filtrare
        filterButton.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    // Preia valorile din campurile de text
                    String tipBec = tipBecField.getText().trim();
                    String putereText = putereField.getText().trim();
                    String tipSursa = tipSursaField.getText().trim();
                    String durataViataText = durataViataField.getText().trim();
                    String fluxLuminosText = fluxLuminosField.getText().trim();

                    // Converteste textul in numere sau foloseste valori implicite
                    byte putere = putereText.isEmpty() ? -1 : Byte.parseByte(putereText);
                    int durataViata = durataViataText.isEmpty() ? -1 : Integer.parseInt(durataViataText);
                    int fluxLuminos = fluxLuminosText.isEmpty() ? -1 : Integer.parseInt(fluxLuminosText);

                    // Stergem zona de text si afisam rezultatele filtrate
                    resultArea.setText("");

                    resultArea.append("=== Lampi ===\n");
                    for (Lampa lampa : lampi) 
                    {
                        /*
                         * Verificam daca puterea nu a fost introdusa de utilizator sau daca puterea este egala cu cea introdusa
                         * De asemenea, verificam daca tipul de bec nu a fost specificat sau daca corespunde cu cel introdus
                         */
                        if ((putere == -1 || lampa.getPutere() == putere) && (tipBec.isEmpty() || lampa.getTipBec().equalsIgnoreCase(tipBec))) 
                        {
                            // In caz afirmatiiv, adaugam lampa curenta in zona de afisare a rezultatelor
                            resultArea.append(lampa.toString() + "\n");
                        }
                    }

                    resultArea.append("\n=== Lampi Smart Exterior ===\n");
                    for (LampaSmartExterior lampaSmart : lampiSmartExterior) 
                    {
                        /*
                         * Verificam daca puterea nu a fost introdusa de utilizator sau daca puterea este egala cu cea introdusa
                         * De asemenea, verificam daca tipul de bec nu a fost specificat sau daca corespunde cu cel introdus
                         */
                        if ((putere == -1 || lampaSmart.getPutere() == putere) && (tipBec.isEmpty() || lampaSmart.getTipBec().equalsIgnoreCase(tipBec))) 
                        {
                            // In caz afirmativ, adaugam lampa smart curenta in zona de afisare a rezultatelor
                            resultArea.append(lampaSmart.toString() + "\n");
                        }
                    }

                    resultArea.append("\n=== Surse de Iluminat ===\n");
                    for (SursaIluminat sursa : surseIluminat) 
                    {
                        /*
                         * Verificam daca tipul de sursa nu a fost introdus sau corespunde cu cel al sursei curente
                         * Verificam daca durata de viata nu a fost introdusa sau daca este mai mare sau egala cu valoarea specificata
                         * Verificam daca fluxul luminos introdus nu a fost introdus sau daca fluxul sursei estei mai mare sau egal cu valoarea specificata
                         */
                        if ((tipSursa.isEmpty() || sursa.getTipSursa().equalsIgnoreCase(tipSursa)) && (durataViata == -1 || sursa.getDurataViata() >= durataViata) && (fluxLuminos == -1 || sursa.getFluxLuminos() >= fluxLuminos)) 
                        {
                            // Daca indeplineste toate conditiile, se adauga sursa curenta in zona de afisare
                            resultArea.append(sursa.toString() + "\n");
                        }
                    }
                } catch (Exception ex) 
                {
                    // Gestionarea erorilor
                    JOptionPane.showMessageDialog(frame, "[!] Eroare la procesarea datelor: " + ex.getMessage(), "Eroare", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Setam fereastra principala sa fie vizibila
        frame.setVisible(true);
    }
}