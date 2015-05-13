package Gra;

import Dane.Postac;
import static Tury.Komenda.getPostac;
import static Tury.Komenda.koniecg;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Koniec extends javax.swing.JFrame {

    public Koniec() {
        initComponents();
        init();
    }

    public  void init() {
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        if (koniecg() == 1) {
            muza = "Win.wav";        
        }
        else
            muza = "Porazka.wav";
        
        Postac B = getPostac();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        if (koniecg() == 1) {
            stan.setText("Wygrana");
            Koniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Czaszka.gif")));
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Zwyciestwo.jpg")));
            music();
        clip.start();
        } else {
            stan.setText("Przegrana");
            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Porażka.png")));
             Koniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Czaszkaa.jpg")));
             music();
        clip.start();
        }

    }
public Clip clip;
public String muza;
    public Clip music() {

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(
                    Koniec.class.getResourceAsStream(muza));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error with playing sound.");
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stan = new javax.swing.JLabel();
        Koniec = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        stan.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        stan.setForeground(new java.awt.Color(255, 0, 0));
        stan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(stan);
        stan.setBounds(160, 4, 259, 70);

        Koniec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Czaszka.gif"))); // NOI18N
        Koniec.setText("Koniec");
        Koniec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoniecActionPerformed(evt);
            }
        });
        jPanel1.add(Koniec);
        Koniec.setBounds(210, 380, 140, 48);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Porażka.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KoniecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoniecActionPerformed
        System.exit(0);
    }//GEN-LAST:event_KoniecActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Koniec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel stan;
    // End of variables declaration//GEN-END:variables
}
