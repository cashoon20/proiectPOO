import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author no
 */
public class GUI2 extends javax.swing.JFrame {

    /**
     * Creates new form GUI2
     */
    Vector<Lampa> lampi = new Vector<>();
    Vector<Prelungitor> prelungitoareExtra = new Vector<>();
    Vector<LampaSmartInterior> lampiSmartExtra = new Vector<>();
    
    Vector<LampaSmartExterior> lampiSmartExterior = new Vector<>();
    Vector<SursaIluminat> surseIluminat = new Vector<>();
    
    
    public GUI2() {
        initComponents();
        initializeData();
    }
    
    
    private void initializeData() {
        lampi.add(new Lampa("Lampa tip A", (byte) 10, "Alb", "LED", "Philips"));
        lampi.add(new Lampa("Lampa tip B", (byte) 11, "Roz", "LED", "Samsung"));
        lampi.add(new Lampa("Lampa tip C", (byte) 12, "Verde", "LED", "Ikea"));
        lampi.add(new Lampa("Lampa tip D", (byte) 13, "Alb", "LED", "Philips"));
        lampi.add(new Lampa("Lampa tip E", (byte) 14, "Roz", "Incandescenta", "Samsung"));
        lampi.add(new Lampa("Lampa tip F", (byte) 15, "Verde", "Halogen", "Ikea"));
        lampi.add(new Lampa("Lampa tip G", (byte) 16, "Alb", "LED", "Philips"));
        lampi.add(new Lampa("Lampa tip H", (byte) 17, "Roz", "Neon", "Samsung"));
        lampi.add(new Lampa("Lampa tip I", (byte) 18, "Verde", "LED", "Ikea"));
        lampi.add(new Lampa("Lampa tip J", (byte) 19, "Alb", "Halogen", "Philips"));


        prelungitoareExtra.add(new Prelungitor(3, true, 10, "Prelungitor 1", (byte) 20, "Negru", "LED", "Marca 1", "Tip Stecher 1", true));
        prelungitoareExtra.add(new Prelungitor(4, false, 12, "Prelungitor 2", (byte) 22, "Alb", "Halogen", "Marca 2", "Tip Stecher 2", false));
        prelungitoareExtra.add(new Prelungitor(5, true, 15, "Prelungitor 3", (byte) 25, "Rosu", "Incandescent", "Marca 3", "Tip Stecher 3", true));
        prelungitoareExtra.add(new Prelungitor(6, false, 17, "Prelungitor 4", (byte) 27, "Verde", "LED", "Marca 4", "Tip Stecher 1", false));
        prelungitoareExtra.add(new Prelungitor(7, true, 20, "Prelungitor 5", (byte) 30, "Albastru", "LED", "Marca 5", "Tip Stecher 2", true));
        prelungitoareExtra.add(new Prelungitor(3, true, 18, "Prelungitor 6", (byte) 32, "Portocaliu", "LED", "Marca 6", "Tip Stecher 3", true));
        prelungitoareExtra.add(new Prelungitor(4, false, 14, "Prelungitor 7", (byte) 28, "Mov", "Halogen", "Marca 7", "Tip Stecher 1", false));
        prelungitoareExtra.add(new Prelungitor(5, true, 16, "Prelungitor 8", (byte) 35, "Roz", "LED", "Marca 8", "Tip Stecher 2", true));
        prelungitoareExtra.add(new Prelungitor(6, true, 11, "Prelungitor 9", (byte) 24, "Gri", "Halogen", "Marca 9", "Tip Stecher 3", true));
        prelungitoareExtra.add(new Prelungitor(7, false, 13, "Prelungitor 10", (byte) 29, "Maro", "LED", "Marca 10", "Tip Stecher 1", false));


        lampiSmartExtra.add(new LampaSmartInterior("Smart 1", (byte) 18, "Rosu", "LED", "Microsoft", true, false, "Perete", (byte) 8, "Microsoft"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 2", (byte) 20, "Albastru", "Halogen", "Apple", false, true, "Tavan", (byte) 10, "Apple"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 3", (byte) 22, "Galben", "LED", "Samsung", true, true, "Masa", (byte) 12, "Samsung"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 4", (byte) 24, "Verde", "Halogen", "Microsoft", false, false, "Tavan", (byte) 14, "Microsoft"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 5", (byte) 26, "Mov", "LED", "Apple", true, true, "Perete", (byte) 16, "Apple"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 6", (byte) 28, "Alb", "LED", "Samsung", true, false, "Masa", (byte) 18, "Samsung"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 7", (byte) 30, "Negru", "Halogen", "Microsoft", false, true, "Tavan", (byte) 20, "Microsoft"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 8", (byte) 32, "Gri", "LED", "Apple", true, true, "Perete", (byte) 22, "Apple"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 9", (byte) 34, "Portocaliu", "LED", "Samsung", true, false, "Masa", (byte) 24, "Samsung"));
        lampiSmartExtra.add(new LampaSmartInterior("Smart 10", (byte) 36, "Roz", "Halogen", "Microsoft", false, true, "Tavan", (byte) 26, "Microsoft"));
        
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
        
        surseIluminat.add(new SursaIluminat("Bec", 15000, 800));
        surseIluminat.add(new SursaIluminat("Bec", 2000, 900));
        surseIluminat.add(new SursaIluminat("Tub", 8000, 700));
        surseIluminat.add(new SursaIluminat("Tub", 25000, 1200));
        surseIluminat.add(new SursaIluminat("Bec", 1000, 600));
        surseIluminat.add(new SursaIluminat("Spot", 20000, 500));
        surseIluminat.add(new SursaIluminat("Lustra", 12000, 400));
        surseIluminat.add(new SursaIluminat("Lampadar", 18000, 750));
        surseIluminat.add(new SursaIluminat("Sursa", 20000, 850));
        surseIluminat.add(new SursaIluminat("Lumina", 5000, 300));
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TextFieldCuloare = new javax.swing.JTextField();
        TextFieldMarca = new javax.swing.JTextField();
        TextFieldPutereMin = new javax.swing.JTextField();
        ButtonFiltrare = new javax.swing.JButton();
        TextFieldPutereMax = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldProducator = new javax.swing.JTextField();
        jComboBoxControlVocal = new javax.swing.JComboBox<>();
        jComboBoxWifi = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldNumarPrize = new javax.swing.JTextField();
        jTextFieldLungimeCablu = new javax.swing.JTextField();
        jTextFieldTipStecher = new javax.swing.JTextField();
        CitireBtn = new javax.swing.JButton();
        AdaugaBtn = new javax.swing.JButton();
        SalvareBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ButtonFiltrare1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        TextFieldPutereMin1 = new javax.swing.JTextField();
        TextFieldMarca1 = new javax.swing.JTextField();
        jTextFieldFluxLuminos = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextFieldDurataViata = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jComboBoxRezistentaApa = new javax.swing.JComboBox<>();
        jComboBoxConectivitateWifi = new javax.swing.JComboBox<>();
        jTextFieldSenzorLumina = new javax.swing.JTextField();
        TextFieldCuloare1 = new javax.swing.JTextField();
        TextFieldPutereMax1 = new javax.swing.JTextField();
        jTextFieldtipSursa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lampa", "Lampa Smart Interior", "Prelungitor" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Lampa");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("OPTIUNI FILTRARE");

        jLabel3.setText("Culoare");

        jLabel4.setText("Marca");

        jLabel5.setText("Putere");

        TextFieldCuloare.setText("culoare");
        TextFieldCuloare.setPreferredSize(new java.awt.Dimension(100, 22));
        TextFieldCuloare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldCuloareActionPerformed(evt);
            }
        });

        TextFieldMarca.setText("marca");
        TextFieldMarca.setPreferredSize(new java.awt.Dimension(100, 22));
        TextFieldMarca.setRequestFocusEnabled(false);

        TextFieldPutereMin.setText("0");
        TextFieldPutereMin.setPreferredSize(new java.awt.Dimension(100, 22));
        TextFieldPutereMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPutereMinActionPerformed(evt);
            }
        });

        ButtonFiltrare.setText("Filtrare");
        ButtonFiltrare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiltrareActionPerformed(evt);
            }
        });

        TextFieldPutereMax.setText("0");
        TextFieldPutereMax.setPreferredSize(new java.awt.Dimension(100, 22));
        TextFieldPutereMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPutereMaxActionPerformed(evt);
            }
        });

        jLabel6.setText("Min");

        jLabel7.setText("Max");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("LampaSmartInterior");

        jLabel9.setText("Control Vocal");

        jLabel10.setText("WiFi");

        jLabel11.setText("Producator");

        jTextFieldProducator.setText("producator");
        jTextFieldProducator.setPreferredSize(new java.awt.Dimension(100, 22));

        jComboBoxControlVocal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jComboBoxControlVocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxControlVocalActionPerformed(evt);
            }
        });

        jComboBoxWifi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jComboBoxWifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWifiActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Prelungitor");

        jLabel13.setText("Numar Prize");

        jLabel14.setText("Lungime Cablu");

        jLabel16.setText("Tip Stecher");

        jTextFieldNumarPrize.setText("NrPrize");
        jTextFieldNumarPrize.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldNumarPrize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumarPrizeActionPerformed(evt);
            }
        });

        jTextFieldLungimeCablu.setText("LungimeCablu");
        jTextFieldLungimeCablu.setPreferredSize(new java.awt.Dimension(100, 22));

        jTextFieldTipStecher.setText("TipStecher");
        jTextFieldTipStecher.setPreferredSize(new java.awt.Dimension(100, 22));

        CitireBtn.setText("Citeste din fisier");
        CitireBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitireBtnActionPerformed(evt);
            }
        });

        AdaugaBtn.setText("Adauga in vector (din fisier)");
        AdaugaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugaBtnActionPerformed(evt);
            }
        });

        SalvareBtn.setText("Salvare continut TextArea");
        SalvareBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvareBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalvareBtn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TextFieldPutereMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(TextFieldPutereMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(TextFieldCuloare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TextFieldMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addComponent(ButtonFiltrare))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(CitireBtn)
                                    .addGap(142, 142, 142)))
                            .addComponent(AdaugaBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxControlVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldProducator, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBoxWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTipStecher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldLungimeCablu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldNumarPrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TextFieldCuloare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jComboBoxControlVocal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldPutereMin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel11)
                                .addComponent(jTextFieldProducator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldPutereMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonFiltrare)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextFieldNumarPrize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextFieldLungimeCablu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jTextFieldTipStecher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addComponent(jLabel15))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CitireBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AdaugaBtn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalvareBtn)
                .addGap(74, 74, 74))
        );

        jTabbedPane1.addTab("Cosmin", jPanel1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Lampa");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("OPTIUNI FILTRARE");

        ButtonFiltrare1.setText("Filtrare");
        ButtonFiltrare1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonFiltrare1ActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Lampa Smart Exterior");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Sursa de Iluminat");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lampa", "Lampa Smart Exterior", "Sursa de Iluminat" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel19.setText("Culoare");

        jLabel20.setText("Max");

        jLabel21.setText("Min");

        jLabel22.setText("Marca");

        jLabel23.setText("Putere");

        TextFieldPutereMin1.setPreferredSize(new java.awt.Dimension(80, 22));
        TextFieldPutereMin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPutereMin1ActionPerformed(evt);
            }
        });

        TextFieldMarca1.setPreferredSize(new java.awt.Dimension(105, 22));

        jTextFieldFluxLuminos.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabel25.setText("Tip Sursa");

        jLabel26.setText("durata Viata");

        jLabel27.setText("flux Luminos");

        jTextFieldDurataViata.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabel29.setText("rezistenta apa");

        jLabel30.setText("conectivitateWifi");

        jLabel32.setText("senzor lumina");

        jComboBoxRezistentaApa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jComboBoxRezistentaApa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxRezistentaApaActionPerformed(evt);
            }
        });

        jComboBoxConectivitateWifi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "true", "false" }));
        jComboBoxConectivitateWifi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxConectivitateWifiActionPerformed(evt);
            }
        });

        jTextFieldSenzorLumina.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldSenzorLumina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSenzorLuminaActionPerformed(evt);
            }
        });

        TextFieldCuloare1.setPreferredSize(new java.awt.Dimension(105, 22));

        TextFieldPutereMax1.setToolTipText("");
        TextFieldPutereMax1.setPreferredSize(new java.awt.Dimension(80, 22));
        TextFieldPutereMax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPutereMax1ActionPerformed(evt);
            }
        });

        jTextFieldtipSursa.setPreferredSize(new java.awt.Dimension(100, 22));
        jTextFieldtipSursa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldtipSursaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel18))
                    .addComponent(ButtonFiltrare1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(TextFieldPutereMin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21))
                            .addComponent(TextFieldMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCuloare1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(TextFieldPutereMax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel24)
                    .addComponent(jLabel31)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDurataViata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFluxLuminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldtipSursa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxConectivitateWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxRezistentaApa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldSenzorLumina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel18)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel29)
                            .addComponent(jComboBoxRezistentaApa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldCuloare1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(TextFieldMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30)
                            .addComponent(jComboBoxConectivitateWifi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldPutereMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel21)
                                .addComponent(jLabel32)
                                .addComponent(jTextFieldSenzorLumina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(TextFieldPutereMax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonFiltrare1)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextFieldtipSursa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jTextFieldDurataViata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextFieldFluxLuminos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel31)))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Alex", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void ButtonFiltrare1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiltrare1ActionPerformed
        // TODO add your handling code here:
                // Preluam valorile de filtrare
        String culoare = TextFieldCuloare1.getText().trim();
        String marca = TextFieldMarca1.getText().trim();
        String putereMinText = TextFieldPutereMin1.getText().trim();
        String putereMaxText = TextFieldPutereMax1.getText().trim();

        // Conversia in byte a puterii lampii
        Byte putereMin = putereMinText.isEmpty() ? null : Byte.parseByte(putereMinText);
        Byte putereMax = putereMaxText.isEmpty() ? null : Byte.parseByte(putereMaxText);

        // Combo Boxul ul care zice ce va fi filtrat
        String selectedCategory = (String) jComboBox3.getSelectedItem();
        
        // String functions
        String RezistentaApaText = (String) jComboBoxRezistentaApa.getSelectedItem();
        String conectivitateWifiText = (String) jComboBoxConectivitateWifi.getSelectedItem();
        String tipSursa = jTextFieldtipSursa.getText().trim();
        String durataViataText = jTextFieldDurataViata.getText().trim();
        String senzorLumina = jTextFieldSenzorLumina.getText().trim();
        String fluxLuminosText = jTextFieldFluxLuminos.getText().trim();
        
        // Boolean functions
        Boolean rezistentaApa = RezistentaApaText == null ? null : Boolean.parseBoolean(RezistentaApaText);
        Boolean conectivitateWifi = conectivitateWifiText == null ? null : Boolean.parseBoolean(conectivitateWifiText);
        //Boolean senzorLumina = senzorLuminaText == null ? null : Boolean.parseBoolean(senzorLuminaText);
        //Boolean tipSursa = tipSursaText == null ? null : Boolean.parseBoolean(tipSursaText);
        //Boolean durataViata = DurataViataText == null ? null : Boolean.parseBolean(DurataViataText);

        // Empty the text area
        jTextArea2.setText("");

        boolean foundMatch = false;  // Variabila pentru daca un rezultat e bun

        switch (selectedCategory) {
            case "Lampa":
            for (Lampa lampa : lampi) {
                boolean matchesCuloare = true;
                boolean matchesMarca = true;
                boolean matchesPutere = true;

                if (!culoare.isEmpty() && !lampa.getCuloare().equalsIgnoreCase(culoare)) {
                    matchesCuloare = false;
                }

                if (!marca.isEmpty() && !lampa.getMarca().equalsIgnoreCase(marca)) {
                    matchesMarca = false;
                }

                if (putereMin != null && lampa.getPutere() < putereMin) {
                    matchesPutere = false;
                }

                if (putereMax != null && lampa.getPutere() > putereMax) {
                    matchesPutere = false;
                }

                // daca totul e bine, afisare in text area
                if (matchesCuloare && matchesMarca && matchesPutere) {
                    jTextArea2.append(lampa.toString() + "\n");
                    foundMatch = true;
                }
            }
            break;
        
            case "Lampa Smart Exterior":
            for (LampaSmartExterior lampaExterior : lampiSmartExterior) {
                boolean matchesRezistentaApa = true;
                boolean matchesConectivitateWiFi = true;
                boolean matchesSenzorLumina = true;

                if (rezistentaApa != null && lampaExterior.esteRezistentLaApa() != rezistentaApa) {
                    matchesRezistentaApa = false;
                }

                if (conectivitateWifi != null && lampaExterior.areConectivitateWiFi() != conectivitateWifi) {
                    matchesConectivitateWiFi = false;
                }

                if (!senzorLumina.isEmpty() && !lampaExterior.getSenzoriLumina().equalsIgnoreCase(senzorLumina)) {
                    matchesSenzorLumina = false;
                }

                if (matchesRezistentaApa && matchesConectivitateWiFi && matchesSenzorLumina) {
                    jTextArea2.append(lampaExterior.toString() + "\n");
                    foundMatch = true;
                }
            }
            break;
            
            case "Sursa de Iluminat":
            for (SursaIluminat sursa : surseIluminat) {
                boolean matchesTipSursa = true;
                boolean matchesDurataViata = true;
                boolean matchesFluxLuminos = true;

                if (!tipSursa.isEmpty() && !sursa.getTipSursa().equalsIgnoreCase(tipSursa)) {
                    matchesTipSursa = false;
                }
                
                
                if (!durataViataText.isEmpty()) {
                   int durataViata = Integer.parseInt(durataViataText);
                   if(sursa.getDurataViata() != durataViata)
                   {
                       matchesDurataViata = false;
                   }
                }

                if(!fluxLuminosText.isEmpty())
                {
                    int fluxLuminos = Integer.parseInt(fluxLuminosText);
                    if(sursa.getFluxLuminos()!= fluxLuminos)
                    {
                        matchesFluxLuminos = false;
                    }
                }

                if (matchesTipSursa && matchesDurataViata && matchesFluxLuminos) {
                    jTextArea2.append(sursa.toString() + "\n");
                    foundMatch = true;
                }
            }
            break;
    }
        

        // Daca nu avem rezultat bun, afisam mesajul in text area
        if (!foundMatch) {
            jTextArea2.append("Nu au fost gasite produse care sa corespunda filtrelor.\n");
        }
    }//GEN-LAST:event_ButtonFiltrare1ActionPerformed

    private void jTextFieldNumarPrizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumarPrizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNumarPrizeActionPerformed

    private void jComboBoxWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxWifiActionPerformed

    private void jComboBoxControlVocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxControlVocalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxControlVocalActionPerformed

    private void TextFieldPutereMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPutereMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPutereMaxActionPerformed

    private void ButtonFiltrareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonFiltrareActionPerformed
        // TODO add your handling code here:

        // Preluam valorile de filtrare
        String culoare = TextFieldCuloare.getText().trim();
        String marca = TextFieldMarca.getText().trim();
        String putereMinText = TextFieldPutereMin.getText().trim();
        String putereMaxText = TextFieldPutereMax.getText().trim();

        String controlVocalText = (String) jComboBoxControlVocal.getSelectedItem();
        String wifiText = (String) jComboBoxWifi.getSelectedItem();
        String producator = jTextFieldProducator.getText().trim();

        String numarPrizeText = jTextFieldNumarPrize.getText().trim();
        String lungimeCabluText = jTextFieldLungimeCablu.getText().trim();
        String tipStecher = jTextFieldTipStecher.getText().trim();

        // Convertim valorile din ComboBox in Boolean
        Boolean controlVocal = controlVocalText == null ? null : Boolean.parseBoolean(controlVocalText);
        Boolean wifi = wifiText == null ? null : Boolean.parseBoolean(wifiText);

        // Nu mai stiu daca sunt importante
        Byte putereMin = putereMinText.isEmpty() ? null : Byte.parseByte(putereMinText);
        Byte putereMax = putereMaxText.isEmpty() ? null : Byte.parseByte(putereMaxText);

        // Combo Boxul ul care zice ce va fi filtrat
        String selectedCategory = (String) jComboBox1.getSelectedItem();
        
        // String functions
        String RezistentaApaText = (String) jComboBoxRezistentaApa.getSelectedItem();
        String conectivitateWifiText = (String) jComboBoxConectivitateWifi.getSelectedItem();
        
        String senzorLumina = jTextFieldSenzorLumina.getText().trim();
        
        // Empty the text area
        jTextArea1.setText("");

        boolean foundMatch = false;  // Variabila pentru daca un rezultat e bun

        switch (selectedCategory) {
            case "Lampa":
            for (Lampa lampa : lampi) {
                boolean matchesCuloare = true;
                boolean matchesMarca = true;
                boolean matchesPutere = true;

                if (!culoare.isEmpty() && !lampa.getCuloare().equalsIgnoreCase(culoare)) {
                    matchesCuloare = false;
                }

                if (!marca.isEmpty() && !lampa.getMarca().equalsIgnoreCase(marca)) {
                    matchesMarca = false;
                }

                if (putereMin != null && lampa.getPutere() < putereMin) {
                    matchesPutere = false;
                }

                if (putereMax != null && lampa.getPutere() > putereMax) {
                    matchesPutere = false;
                }

                // daca totul e bine, afisare in text area
                if (matchesCuloare && matchesMarca && matchesPutere) {
                    jTextArea1.append(lampa.toString() + "\n");
                    foundMatch = true;
                }
            }
            break;

            case "Lampa Smart Interior":
            for (LampaSmartInterior smartLampa : lampiSmartExtra) {
                boolean matchesControlVocal = true;
                boolean matchesWifi = true;
                boolean matchesProducator = true;

                if (controlVocal != null && smartLampa.getControlVocal() != controlVocal) {
                    matchesControlVocal = false;
                }

                if (wifi != null && smartLampa.getWifi() != wifi) {
                    matchesWifi = false;
                }

                if (!producator.isEmpty() && !smartLampa.getProducator().equalsIgnoreCase(producator)) {
                    matchesProducator = false;
                }

                if (matchesControlVocal && matchesWifi && matchesProducator) {
                    jTextArea1.append(smartLampa.toString() + "\n");
                    foundMatch = true;
                }
            }
            break;

            case "Prelungitor":
            for (Prelungitor prelungitor : prelungitoareExtra) {
                boolean matchesNumarPrize = true;
                boolean matchesLungimeCablu = true;
                boolean matchesTipStecher = true;

                if (!numarPrizeText.isEmpty()) {
                    int numarPrize = Integer.parseInt(numarPrizeText);
                    if (prelungitor.getNumarPrize() != numarPrize) {
                        matchesNumarPrize = false;
                    }
                }

                if (!lungimeCabluText.isEmpty()) {
                    int lungimeCablu = Integer.parseInt(lungimeCabluText);
                    if (prelungitor.getLungimeCablu() < lungimeCablu) {
                        matchesLungimeCablu = false;
                    }
                }

                if (!tipStecher.isEmpty() && !prelungitor.getTipStecher().equalsIgnoreCase(tipStecher)) {
                    matchesTipStecher = false;
                }

                if (matchesNumarPrize && matchesLungimeCablu && matchesTipStecher) {
                    jTextArea1.append(prelungitor.toString() + "\n");
                    foundMatch = true;
                }
            }
            break;
            
            default:
            jTextArea1.append("Nu exista produse de aceasta categorie!\n");
}

        // Daca nu avem rezultat bun, afisam mesajul in text area
        if (!foundMatch) {
            jTextArea1.append("Nu au fost gasite produse care sa corespunda filtrelor.\n");
        }
    }//GEN-LAST:event_ButtonFiltrareActionPerformed

    private void TextFieldPutereMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPutereMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPutereMinActionPerformed

    private void TextFieldCuloareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldCuloareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldCuloareActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String selectedItem = (String) jComboBox1.getSelectedItem();
        jTextArea1.setText(""); // Goleste text area

        switch (selectedItem) {
            case "Lampa":
            for (Lampa lampa : lampi) {
                jTextArea1.append(lampa.toString() + "\n");
            }
            break;
            case "Lampa Smart Interior":
            for (LampaSmartInterior smartLampa : lampiSmartExtra) {
                jTextArea1.append(smartLampa.toString() + "\n");
            }
            break;
            case "Prelungitor":
            for (Prelungitor prelungitor : prelungitoareExtra) {
                jTextArea1.append(prelungitor.toString() + "\n");
            }
            break;

            case "Sursa Iluminat":
            for (SursaIluminat sursa : surseIluminat) {
                jTextArea1.append(sursa.toString() + "\n");
            }
            break;

            case "Lampa Smart Exterior":
            for (LampaSmartExterior lampaExterior : lampiSmartExterior) {
                jTextArea1.append(lampaExterior.toString() + "\n");
            }
            break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void TextFieldPutereMin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPutereMin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPutereMin1ActionPerformed

    private void jComboBoxRezistentaApaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxRezistentaApaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxRezistentaApaActionPerformed

    private void jComboBoxConectivitateWifiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxConectivitateWifiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxConectivitateWifiActionPerformed

    private void jTextFieldSenzorLuminaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSenzorLuminaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSenzorLuminaActionPerformed

    private void TextFieldPutereMax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPutereMax1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPutereMax1ActionPerformed

    private void jTextFieldtipSursaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldtipSursaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldtipSursaActionPerformed

    private void CitireBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitireBtnActionPerformed
        // TODO add your handling code here:
        try (BufferedReader br = new BufferedReader(new FileReader("instante.txt"))) {
        String line;
        StringBuilder sb = new StringBuilder();

        // Citim fisierul linie cu linie pana la null
        while ((line = br.readLine()) != null) {
            sb.append(line).append("\n"); // adaugam fiecare linie la StringBuilder
        }

        // JTextArea1 afiseaza StringBuilder
        jTextArea1.setText(sb.toString());
    } catch (IOException e) {
        // mesaj eroare
        JOptionPane.showMessageDialog(this, "Eroare la citirea din fisier: " + e.getMessage(),
                "Eroare", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_CitireBtnActionPerformed

    private void AdaugaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugaBtnActionPerformed
        // TODO add your handling code here:
        try (BufferedReader br = new BufferedReader(new FileReader("instante.txt"))) {
        String line;

        while ((line = br.readLine()) != null) {
            // delimitatorul ","
            String[] fields = line.split(",");

            // Primul camp determina clasa
            switch (fields[0]) {
                case "Lampa":
                    lampi.add(new Lampa(
                            fields[1],                          // Nume lampa
                            Byte.parseByte(fields[2]),          // Putere
                            fields[3],                          // Culoare
                            fields[4],                          // Tip bec
                            fields[5]                           // Marca
                    ));
                    break;

                case "LampaSmartInterior":
                    lampiSmartExtra.add(new LampaSmartInterior(
                            fields[1],                          // Nume lampa
                            Byte.parseByte(fields[2]),          // Putere
                            fields[3],                          // Culoare
                            fields[4],                          // Tip bec
                            fields[5],                          // Marca
                            Boolean.parseBoolean(fields[6]),    // Control vocal
                            Boolean.parseBoolean(fields[7]),    // Wifi
                            fields[8],                          // Tip montaj
                            Byte.parseByte(fields[9]),          // Durata baterie
                            fields[10]                          // Producator
                    ));
                    break;

                case "Prelungitor":
                    prelungitoareExtra.add(new Prelungitor(
                            Integer.parseInt(fields[1]),        // Numar prize
                            Boolean.parseBoolean(fields[2]),    // Protectie supratensiune
                            Integer.parseInt(fields[3]),        // Lungime cablu
                            fields[4],                          // Nume prelungitor
                            Byte.parseByte(fields[5]),          // Putere
                            fields[6],                          // Culoare
                            fields[7],                          // Tip bec
                            fields[8],                          // Marca
                            fields[9],                          // Tip stecher
                            Boolean.parseBoolean(fields[10])    // Indicator pornit
                    ));
                    break;
            }
        }

        JOptionPane.showMessageDialog(this, 
            "Datele au fost adaugate cu succes!", 
            "Succes", JOptionPane.INFORMATION_MESSAGE);

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, 
            "Eroare la citirea din fisier: " + e.getMessage(), 
            "Eroare", JOptionPane.ERROR_MESSAGE);
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Eroare de format: " + e.getMessage(), 
            "Eroare", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_AdaugaBtnActionPerformed

    private void SalvareBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvareBtnActionPerformed
        // TODO add your handling code here:
        // content din jTextArea1
    String content = jTextArea1.getText();

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("iesire.txt"))) {
        // Scriem content in fisierul iesire.txt
        bw.write(content);
        bw.newLine();

        // mesaj succes
        JOptionPane.showMessageDialog(this, 
            "Coninutul a fost salvat cu succes in iesire.txt!", 
            "SUCCES", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        // mesaj eroare
        JOptionPane.showMessageDialog(this, 
            "Eroare la salvarea fisierului: " + e.getMessage(), 
            "EROARE", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_SalvareBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdaugaBtn;
    private javax.swing.JButton ButtonFiltrare;
    private javax.swing.JButton ButtonFiltrare1;
    private javax.swing.JButton CitireBtn;
    private javax.swing.JButton SalvareBtn;
    private javax.swing.JTextField TextFieldCuloare;
    private javax.swing.JTextField TextFieldCuloare1;
    private javax.swing.JTextField TextFieldMarca;
    private javax.swing.JTextField TextFieldMarca1;
    private javax.swing.JTextField TextFieldPutereMax;
    private javax.swing.JTextField TextFieldPutereMax1;
    private javax.swing.JTextField TextFieldPutereMin;
    private javax.swing.JTextField TextFieldPutereMin1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBoxConectivitateWifi;
    private javax.swing.JComboBox<String> jComboBoxControlVocal;
    private javax.swing.JComboBox<String> jComboBoxRezistentaApa;
    private javax.swing.JComboBox<String> jComboBoxWifi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextFieldDurataViata;
    private javax.swing.JTextField jTextFieldFluxLuminos;
    private javax.swing.JTextField jTextFieldLungimeCablu;
    private javax.swing.JTextField jTextFieldNumarPrize;
    private javax.swing.JTextField jTextFieldProducator;
    private javax.swing.JTextField jTextFieldSenzorLumina;
    private javax.swing.JTextField jTextFieldTipStecher;
    private javax.swing.JTextField jTextFieldtipSursa;
    // End of variables declaration//GEN-END:variables
}
