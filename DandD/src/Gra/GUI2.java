package Gra;

import Dane.Postac;
import static Tury.Akcja.tablicaKierunek;
import static Tury.Komenda.getPostac;
import static Tury.Komenda.getPostacW;
import static Tury.Komenda.podajKomende;
import java.awt.Point;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Timer;

public class GUI2 extends javax.swing.JFrame {

    static String komenda;
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
        //  dButton();
        Góra.setEnabled(false);
        Lewo.setEnabled(false);
        Atak.setEnabled(false);
        PG.setEnabled(false);
        LG.setEnabled(false);
        LD.setEnabled(false);
        NaSiebie.setEnabled(false);
        aktualizujBohatera(getPostac());
        aktualizujWroga(getPostacW());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Music = new javax.swing.JButton();
        Enemy = new javax.swing.JLabel();
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
        KlasaPancerza = new javax.swing.JLabel();
        BazowyAtak = new javax.swing.JLabel();
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
        ImieW = new javax.swing.JLabel();
        ŻycieW = new javax.swing.JLabel();
        KlasaPancerzaW = new javax.swing.JLabel();
        BazowyAtakW = new javax.swing.JLabel();
        KOBRW = new javax.swing.JLabel();
        SPEEDW = new javax.swing.JLabel();
        INITW = new javax.swing.JLabel();
        Stan = new javax.swing.JLabel();
        Help = new javax.swing.JButton();

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
        Music.setBounds(500, 0, 100, 23);

        Enemy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pliki/gracz.png"))); // NOI18N
        Enemy.setText("jLabel8");
        jPanel1.add(Enemy);
        Enemy.setBounds(300, 150, 50, 50);

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
        Góra.setBounds(90, 220, 70, 23);

        Lewo.setText("W");
        Lewo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LewoActionPerformed(evt);
            }
        });
        jPanel1.add(Lewo);
        Lewo.setBounds(0, 250, 70, 23);

        NaSiebie.setText("NaSiebie");
        jPanel1.add(NaSiebie);
        NaSiebie.setBounds(80, 250, 90, 23);

        Prawo.setText("E");
        Prawo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrawoActionPerformed(evt);
            }
        });
        jPanel1.add(Prawo);
        Prawo.setBounds(180, 250, 70, 23);

        Dół.setText("S");
        Dół.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DółActionPerformed(evt);
            }
        });
        jPanel1.add(Dół);
        Dół.setBounds(90, 280, 70, 23);

        Atak.setText("ATAK");
        jPanel1.add(Atak);
        Atak.setBounds(280, 220, 80, 23);

        Bohater.setText("Bohater:");
        jPanel1.add(Bohater);
        Bohater.setBounds(370, 10, 50, 20);

        Imie.setText("jLabel2");
        jPanel1.add(Imie);
        Imie.setBounds(440, 10, 60, 20);

        PW.setText("PW:");
        jPanel1.add(PW);
        PW.setBounds(370, 30, 50, 14);

        KP.setText("KP:");
        jPanel1.add(KP);
        KP.setBounds(370, 50, 50, 14);

        BA.setText("BA:");
        jPanel1.add(BA);
        BA.setBounds(370, 70, 60, 14);

        kObr.setText("kObr:");
        jPanel1.add(kObr);
        kObr.setBounds(370, 90, 60, 14);

        Szybkość.setText("Szybkość:");
        jPanel1.add(Szybkość);
        Szybkość.setBounds(370, 110, 60, 14);

        Ini.setText("Ini:");
        jPanel1.add(Ini);
        Ini.setBounds(370, 130, 60, 14);

        Życie.setText("jLabel2");
        jPanel1.add(Życie);
        Życie.setBounds(440, 30, 50, 14);

        KlasaPancerza.setText("jLabel3");
        jPanel1.add(KlasaPancerza);
        KlasaPancerza.setBounds(440, 50, 50, 14);

        BazowyAtak.setText("jLabel4");
        jPanel1.add(BazowyAtak);
        BazowyAtak.setBounds(440, 70, 50, 14);

        KOBR.setText("jLabel5");
        jPanel1.add(KOBR);
        KOBR.setBounds(440, 90, 50, 14);

        SPEED.setText("jLabel6");
        jPanel1.add(SPEED);
        SPEED.setBounds(440, 110, 60, 14);

        INIT.setText("jLabel7");
        jPanel1.add(INIT);
        INIT.setBounds(440, 130, 50, 14);

        Wróg.setText("Wróg:");
        jPanel1.add(Wróg);
        Wróg.setBounds(370, 160, 60, 14);

        jLabel1.setText("PW:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(370, 180, 50, 14);

        jLabel2.setText("KP:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 200, 50, 14);

        jLabel3.setText("BA:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(370, 220, 40, 14);

        jLabel4.setText("kObr:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 240, 50, 14);

        skiptura.setText("SKIP");
        skiptura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skipturaActionPerformed(evt);
            }
        });
        jPanel1.add(skiptura);
        skiptura.setBounds(270, 250, 90, 23);

        jLabel5.setText("Szybkość:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 260, 60, 14);

        jLabel6.setText("Ini:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(370, 280, 40, 14);

        jLabel7.setText("Stan Gry:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 310, 70, 14);

        PG.setText("NE");
        PG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PGActionPerformed(evt);
            }
        });
        jPanel1.add(PG);
        PG.setBounds(173, 220, 80, 23);

        LG.setText("NW");
        LG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LGActionPerformed(evt);
            }
        });
        jPanel1.add(LG);
        LG.setBounds(0, 220, 80, 23);

        LD.setText("SW");
        LD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LDActionPerformed(evt);
            }
        });
        jPanel1.add(LD);
        LD.setBounds(0, 280, 80, 23);

        PD.setText("SE");
        PD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDActionPerformed(evt);
            }
        });
        jPanel1.add(PD);
        PD.setBounds(170, 280, 80, 23);
        jPanel1.add(ImieW);
        ImieW.setBounds(440, 160, 90, 20);
        jPanel1.add(ŻycieW);
        ŻycieW.setBounds(440, 180, 90, 20);
        jPanel1.add(KlasaPancerzaW);
        KlasaPancerzaW.setBounds(440, 200, 100, 20);
        jPanel1.add(BazowyAtakW);
        BazowyAtakW.setBounds(440, 240, 100, 20);
        jPanel1.add(KOBRW);
        KOBRW.setBounds(440, 220, 90, 20);
        jPanel1.add(SPEEDW);
        SPEEDW.setBounds(440, 260, 80, 20);
        jPanel1.add(INITW);
        INITW.setBounds(440, 280, 110, 20);

        Stan.setText("jLabel8");
        jPanel1.add(Stan);
        Stan.setBounds(20, 330, 560, 50);

        Help.setText("Help");
        Help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpActionPerformed(evt);
            }
        });
        jPanel1.add(Help);
        Help.setBounds(520, 30, 70, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 405);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void PrawoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrawoActionPerformed
        komenda = "R6";
        podajKomende(komenda);
        poruszaj(1, 0);

    }//GEN-LAST:event_PrawoActionPerformed
    private void DółActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DółActionPerformed
        komenda = "R2";
        podajKomende(komenda);
        poruszaj(0, 1);

    }//GEN-LAST:event_DółActionPerformed

    private void GóraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GóraActionPerformed
        komenda = "R8";
        podajKomende(komenda);
        poruszaj(0, -1);
    }//GEN-LAST:event_GóraActionPerformed

    private void LewoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LewoActionPerformed
        komenda = "R4";
        podajKomende(komenda);
        poruszaj(-1, 0);
    }//GEN-LAST:event_LewoActionPerformed

    private void skipturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skipturaActionPerformed
        komenda = "S";
        podajKomende(komenda);
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

    private void LGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LGActionPerformed
        komenda = "R7";
        podajKomende(komenda);
        poruszaj(-1, -1);
    }//GEN-LAST:event_LGActionPerformed

    private void PGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PGActionPerformed
        komenda = "R9";
        podajKomende(komenda);
        poruszaj(1, -1);
    }//GEN-LAST:event_PGActionPerformed

    private void PDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDActionPerformed
        komenda = "R3";
        podajKomende(komenda);
        poruszaj(1, 1);
    }//GEN-LAST:event_PDActionPerformed

    private void LDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LDActionPerformed
        komenda = "R1";
        podajKomende(komenda);
        poruszaj(-1, 1);
    }//GEN-LAST:event_LDActionPerformed

    private void HelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpActionPerformed
        Help help = new Help();
    }//GEN-LAST:event_HelpActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            GUI2 gui2 = new GUI2();
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atak;
    private javax.swing.JLabel BA;
    private javax.swing.JLabel BazowyAtak;
    private javax.swing.JLabel BazowyAtakW;
    private javax.swing.JLabel Bohater;
    private javax.swing.JButton Dół;
    private javax.swing.JLabel Enemy;
    private javax.swing.JLabel Gracz;
    private javax.swing.JButton Góra;
    private javax.swing.JButton Help;
    private javax.swing.JLabel INIT;
    private javax.swing.JLabel INITW;
    private javax.swing.JLabel Imie;
    private javax.swing.JLabel ImieW;
    private javax.swing.JLabel Ini;
    private javax.swing.JLabel KOBR;
    private javax.swing.JLabel KOBRW;
    private javax.swing.JLabel KP;
    private javax.swing.JLabel KlasaPancerza;
    private javax.swing.JLabel KlasaPancerzaW;
    private javax.swing.JButton LD;
    private javax.swing.JButton LG;
    private javax.swing.JButton Lewo;
    private javax.swing.JButton Music;
    private javax.swing.JButton NaSiebie;
    private javax.swing.JButton PD;
    private javax.swing.JButton PG;
    private javax.swing.JLabel PW;
    private javax.swing.JButton Prawo;
    private javax.swing.JLabel SPEED;
    private javax.swing.JLabel SPEEDW;
    private javax.swing.JLabel Stan;
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
    private javax.swing.JLabel ŻycieW;
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
        dButton();
        a = Gracz.getLocation();
        nowax = a.x + i * Gracz.getWidth();
        noway = a.y + j * Gracz.getHeight();
        Gracz.setLocation(nowax, noway);

        //aktualizujBohatera();
    }
    private Timer timer;
    int[] tab;

    public void dButton() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        tab = tablicaKierunek();

        for (int k = 9; k >= 0; k = k - 3) {
            System.out.print(tab[k - 2]);
            System.out.print(tab[k - 1]);
            System.out.print(tab[k]);
            System.out.println();

            if (k == 3) {
                System.out.print(tab[0]);
                k--;
                System.out.println();
            }
        }
        for (int ii = 0; ii < 10; ii++) {
            if (tab[ii] == 0 && ii == 0) {
                Atak.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 0) {
                Atak.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 1) {
                LD.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 1) {
                LD.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 2) {
                Dół.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 2) {
                Dół.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 3) {
                PD.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 3) {
                PD.setEnabled(true);
            }
            if (tab[ii] == 0 && ii == 4) {
                Lewo.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 4) {
                Lewo.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 5) {
                NaSiebie.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 5) {
                NaSiebie.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 6) {
                Prawo.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 6) {
                Prawo.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 7) {
                LG.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 7) {
                LG.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 8) {
                Góra.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 8) {
                Góra.setEnabled(true);
            }

            if (tab[ii] == 0 && ii == 9) {
                PG.setEnabled(false);
            }
            if (tab[ii] == 1 && ii == 9) {
                PG.setEnabled(true);
            }

        }

        
    }

    public void aktualizujBohatera(Postac B) {
        Imie.setText(B.nazwaPostaci());
        Życie.setText(Integer.toString(B.ilePW()));
        KlasaPancerza.setText(Integer.toString(B.ileKP()));
        BazowyAtak.setText(Integer.toString(B.ileAtak()));
        KOBR.setText(Integer.toString(B.ileKObrazen()));
        SPEED.setText(Integer.toString(B.ileRuchu()));
        INIT.setText(Integer.toString(B.ileInicjatywy()));

    }

    public void aktualizujWroga(Postac B) {
        ImieW.setText(B.nazwaPostaci().substring(3));
        ŻycieW.setText(Integer.toString(B.ilePW()));
        KlasaPancerzaW.setText(Integer.toString(B.ileKP()));
        BazowyAtakW.setText(Integer.toString(B.ileAtak()));
        KOBRW.setText(Integer.toString(B.ileKObrazen()));
        SPEEDW.setText(Integer.toString(B.ileRuchu()));
        INITW.setText(Integer.toString(B.ileInicjatywy()));

    }

}
