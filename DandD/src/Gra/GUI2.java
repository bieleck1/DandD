package Gra;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class GUI2 extends javax.swing.JFrame {

    public int aa = 0;
    Clip clip2 = music();
    int x, y;
    Point a = new Point();
    public int i, j;
    public int nowax, noway, nowax2, noway2;

    public GUI2() {
        initComponents();
        init();
    }

    public void init() {
        setSize(640, 480);
        setVisible(true);
        setLocationRelativeTo(null);
        Góra.setEnabled(false);
        Lewo.setEnabled(false);
        Atak.setEnabled(false);

        PG.setEnabled(false);
        LG.setEnabled(false);
        LD.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Music = new javax.swing.JButton();
        Gracz = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        Góra = new javax.swing.JButton();
        Lewo = new javax.swing.JButton();
        NaSiebie = new javax.swing.JButton();
        Prawo = new javax.swing.JButton();
        Dół = new javax.swing.JButton();
        Atak = new javax.swing.JButton();
        Bohater = new javax.swing.JLabel();
        Imie = new javax.swing.JLabel();
        PW = new javax.swing.JLabel();
        KP = new javax.swing.JLabel();
        BA = new javax.swing.JLabel();
        kObr = new javax.swing.JLabel();
        Szybkość = new javax.swing.JLabel();
        Ini = new javax.swing.JLabel();
        Życie = new javax.swing.JLabel();
        Mana = new javax.swing.JLabel();
        BAA = new javax.swing.JLabel();
        KOBR = new javax.swing.JLabel();
        SPEED = new javax.swing.JLabel();
        INIT = new javax.swing.JLabel();
        Wróg = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        skiptura = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PG = new javax.swing.JButton();
        LG = new javax.swing.JButton();
        LD = new javax.swing.JButton();
        PD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        Music.setText("Music On");
        Music.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MusicActionPerformed(evt);
            }
        });
        jPanel1.add(Music);
        Music.setBounds(500, 0, 100, 25);

        Gracz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/gracz.png"))); // NOI18N
        Gracz.setText("jLabel1");
        jPanel1.add(Gracz);
        Gracz.setBounds(0, 0, 50, 50);

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/Mapa.png"))); // NOI18N
        mapa.setText("jLabel1");
        jPanel1.add(mapa);
        mapa.setBounds(0, 0, 352, 200);

        Góra.setText("N");
        Góra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GóraActionPerformed(evt);
            }
        });
        jPanel1.add(Góra);
        Góra.setBounds(90, 220, 70, 25);

        Lewo.setText("W");
        Lewo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LewoActionPerformed(evt);
            }
        });
        jPanel1.add(Lewo);
        Lewo.setBounds(0, 250, 70, 25);

        NaSiebie.setText("NaSiebie");
        jPanel1.add(NaSiebie);
        NaSiebie.setBounds(80, 250, 90, 25);

        Prawo.setText("E");
        Prawo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrawoActionPerformed(evt);
            }
        });
        jPanel1.add(Prawo);
        Prawo.setBounds(180, 250, 70, 25);

        Dół.setText("S");
        Dół.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DółActionPerformed(evt);
            }
        });
        jPanel1.add(Dół);
        Dół.setBounds(90, 280, 70, 25);

        Atak.setText("ATAK");
        jPanel1.add(Atak);
        Atak.setBounds(280, 220, 80, 25);

        Bohater.setText("Bohater:");
        jPanel1.add(Bohater);
        Bohater.setBounds(370, 10, 50, 20);

        Imie.setText("jLabel2");
        jPanel1.add(Imie);
        Imie.setBounds(440, 10, 60, 20);

        PW.setText("PW:");
        jPanel1.add(PW);
        PW.setBounds(370, 30, 50, 16);

        KP.setText("KP:");
        jPanel1.add(KP);
        KP.setBounds(370, 50, 50, 16);

        BA.setText("BA:");
        jPanel1.add(BA);
        BA.setBounds(370, 70, 60, 16);

        kObr.setText("kObr:");
        jPanel1.add(kObr);
        kObr.setBounds(370, 90, 60, 16);

        Szybkość.setText("Szybkość:");
        jPanel1.add(Szybkość);
        Szybkość.setBounds(370, 110, 60, 16);

        Ini.setText("Ini:");
        jPanel1.add(Ini);
        Ini.setBounds(370, 130, 60, 16);

        Życie.setText("jLabel2");
        jPanel1.add(Życie);
        Życie.setBounds(440, 30, 50, 16);

        Mana.setText("jLabel3");
        jPanel1.add(Mana);
        Mana.setBounds(440, 50, 50, 16);

        BAA.setText("jLabel4");
        jPanel1.add(BAA);
        BAA.setBounds(440, 70, 50, 16);

        KOBR.setText("jLabel5");
        jPanel1.add(KOBR);
        KOBR.setBounds(440, 90, 50, 16);

        SPEED.setText("jLabel6");
        jPanel1.add(SPEED);
        SPEED.setBounds(440, 110, 60, 16);

        INIT.setText("jLabel7");
        jPanel1.add(INIT);
        INIT.setBounds(440, 130, 50, 16);

        Wróg.setText("Wróg:");
        jPanel1.add(Wróg);
        Wróg.setBounds(370, 160, 60, 16);

        jLabel1.setText("PW:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 180, 50, 16);

        jLabel2.setText("KP:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 200, 50, 16);

        jLabel3.setText("BA:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 220, 40, 16);

        jLabel4.setText("kObr:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 240, 50, 16);

        skiptura.setText("SKIP");
        skiptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipturaActionPerformed(evt);
            }
        });
        jPanel1.add(skiptura);
        skiptura.setBounds(270, 250, 90, 25);

        jLabel5.setText("Szybkość:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 260, 60, 16);

        jLabel6.setText("Ini:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 280, 40, 16);

        jLabel7.setText("Stan Gry:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 70, 16);

        PG.setText("NE");
        jPanel1.add(PG);
        PG.setBounds(173, 220, 80, 25);

        LG.setText("NW");
        jPanel1.add(LG);
        LG.setBounds(0, 220, 80, 25);

        LD.setText("SW");
        jPanel1.add(LD);
        LD.setBounds(0, 280, 80, 25);

        PD.setText("SE");
        jPanel1.add(PD);
        PD.setBounds(170, 280, 80, 25);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 405);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void PrawoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrawoActionPerformed
        poruszaj(1, 0);
    }//GEN-LAST:event_PrawoActionPerformed
    private void DółActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DółActionPerformed
        poruszaj(0, 1);
    }//GEN-LAST:event_DółActionPerformed

    private void GóraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GóraActionPerformed
        poruszaj(0, -1);

    }//GEN-LAST:event_GóraActionPerformed

    private void LewoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LewoActionPerformed
        poruszaj(-1, 0);
    }//GEN-LAST:event_LewoActionPerformed

    private void skipturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipturaActionPerformed
        ////////////////

        ////////////////////
    }//GEN-LAST:event_skipturaActionPerformed

    private void MusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MusicActionPerformed

        if (aa == 0) {

            Music.setText("Music Off");
            aa = 1;
            start(clip2);
        } else {
            Music.setText("Music On");
            aa = 0;
            stop(clip2);

        }
    }//GEN-LAST:event_MusicActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            GUI2 gui2 = new GUI2();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atak;
    private javax.swing.JLabel BA;
    private javax.swing.JLabel BAA;
    private javax.swing.JLabel Bohater;
    private javax.swing.JButton Dół;
    private javax.swing.JLabel Gracz;
    private javax.swing.JButton Góra;
    private javax.swing.JLabel INIT;
    private javax.swing.JLabel Imie;
    private javax.swing.JLabel Ini;
    private javax.swing.JLabel KOBR;
    private javax.swing.JLabel KP;
    private javax.swing.JButton LD;
    private javax.swing.JButton LG;
    private javax.swing.JButton Lewo;
    private javax.swing.JLabel Mana;
    private javax.swing.JButton Music;
    private javax.swing.JButton NaSiebie;
    private javax.swing.JButton PD;
    private javax.swing.JButton PG;
    private javax.swing.JLabel PW;
    private javax.swing.JButton Prawo;
    private javax.swing.JLabel SPEED;
    private javax.swing.JLabel Szybkość;
    private javax.swing.JLabel Wróg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kObr;
    private javax.swing.JLabel mapa;
    private javax.swing.JButton skiptura;
    private javax.swing.JLabel Życie;
    // End of variables declaration//GEN-END:variables
public Clip music() {

        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Grzechu\\Documents\\NetBeansProjects\\DandD\\DandD\\src\\Pliki\\musiic.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            return clip;

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error with playing sound.");
            return null;
        }

    }

    public void start(Clip clip) {
        clip.start();
    }

    public void stop(Clip clip) {
        clip.stop();
    }

    public void poruszaj(int i, int j) {
        a = Gracz.getLocation();
        nowax = a.x + i * Gracz.getWidth();
        noway = a.y + j * Gracz.getHeight();
        nowax2 = a.x + 2 * i * Gracz.getWidth();
        noway2 = a.y + 2 * j * Gracz.getHeight();
        Gracz.setLocation(nowax, noway);
    }
}
