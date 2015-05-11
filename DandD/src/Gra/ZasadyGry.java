
package Gra;

public class ZasadyGry extends javax.swing.JFrame {

    public String zasady = "Gra opiera się na zasadach i mechanice systemu Dungeons & Dragons 3.5.\nJest ona symulatorem siatki bitewnej wykorzystywanej w owym systemie.\nGracz ma do dyspozycji jednego bohatera i staje naprzeciw jednego komputerowego oponenta.\nO kolejności ruchu decyduje inicjatywa (rzut kością k20 + bonus do Inicjatywy).\nGracz w swojej turze może:\n- Poruszać się, o ile pozwalają mu na to jego punkty szybkości (ruch po prostej kosztuje 1 pkt, po skosie oraz po trudnym terenie 2 pkt).\n- Atakować wroga, jeżeli ten jest w zasięgu.\nAtak polega na wykonaniu rzutu kością k20 oraz dodaniu do niego swojej wartości bazowego ataku.\nJeżeli wynik będzie wyższy od klasy pancerza przeciwnika to otrzyma on obrażenia równe rzutowi kością obrażeń powiększonej o wartość bonusu do siły bohatera.\nW przypadku wylosowania 20 podczas testu trafienia pojawia się szansa na trafienie " +
"krytyczne.\nProcedura rzutów jest wtedy powtarzana - w przypadku trafienia (czyli przebicia KP oponenta) obrażenia zostają potrojone, zaś pudło oznacza zwykłe trafienie.\nAtakować można raz na turę.\\nZakończyć turę, co skutkuje oddaniem inicjatywy przeciwnikowi oraz odnowieniem liczby ataków oraz szybkości.\nGra kończy się wraz ze śmiercią jednej z postaci.";
    public ZasadyGry() {
        initComponents();
        init();
    }

    public void init(){
        setVisible(true);
        setSize(639, 458);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Zasady.setText(zasady);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Zasady = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(603, 356));
        jPanel1.setMinimumSize(new java.awt.Dimension(603, 356));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zasady Gry:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 70, 110, 32);

        Zasady.setBackground(new java.awt.Color(0, 51, 255));
        Zasady.setColumns(20);
        Zasady.setForeground(new java.awt.Color(255, 0, 0));
        Zasady.setRows(5);
        Zasady.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        Zasady.setEnabled(false);
        jScrollPane1.setViewportView(Zasady);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 120, 583, 250);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/dungeons_dragons-2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 660, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZasadyGry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Zasady;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
