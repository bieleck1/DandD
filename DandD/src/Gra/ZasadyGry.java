
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
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Zasady.setText(zasady);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Zasady = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Zasady Gry:");

        Zasady.setBackground(new java.awt.Color(255, 0, 0));
        Zasady.setColumns(20);
        Zasady.setForeground(new java.awt.Color(255, 0, 0));
        Zasady.setRows(5);
        Zasady.setEnabled(false);
        jScrollPane1.setViewportView(Zasady);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
