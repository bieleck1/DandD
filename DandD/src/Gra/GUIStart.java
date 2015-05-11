package Gra;

public class GUIStart extends javax.swing.JFrame {

    public GUIStart() {
        initComponents();
        init();

    }

    public void init() {
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Start = new javax.swing.JButton();
        Wyjscie = new javax.swing.JButton();
        Zasady = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(604, 421));
        jPanel1.setMinimumSize(new java.awt.Dimension(604, 421));
        jPanel1.setPreferredSize(new java.awt.Dimension(604, 421));
        jPanel1.setLayout(null);

        Start.setText("Start");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });
        jPanel1.add(Start);
        Start.setBounds(110, 130, 100, 50);

        Wyjscie.setText("Wyjscie");
        Wyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WyjscieActionPerformed(evt);
            }
        });
        jPanel1.add(Wyjscie);
        Wyjscie.setBounds(110, 290, 100, 50);

        Zasady.setText("Zasady");
        Zasady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZasadyActionPerformed(evt);
            }
        });
        jPanel1.add(Zasady);
        Zasady.setBounds(110, 210, 100, 50);

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Wykonali:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(530, 280, 70, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Chyła Piotr");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(500, 330, 70, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bielecki Karol");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 310, 90, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gabiec Damian");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(500, 350, 100, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hornowski Rafał");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(500, 370, 110, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Kuźniarki Grzegorz");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(500, 390, 120, 16);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/dungeons_dragons.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 470);

        jLabel8.setText("jLabel8");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 390, 41, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WyjscieActionPerformed
        System.exit(0);
    }//GEN-LAST:event_WyjscieActionPerformed

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        dispose();
        GUI2 gui = new GUI2();
    }//GEN-LAST:event_StartActionPerformed

    private void ZasadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZasadyActionPerformed
        ZasadyGry zasady = new ZasadyGry();
    }//GEN-LAST:event_ZasadyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Start;
    private javax.swing.JButton Wyjscie;
    private javax.swing.JButton Zasady;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
