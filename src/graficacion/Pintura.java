/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficacion;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author Hector
 */
public class Pintura extends javax.swing.JFrame {

    Graphics g;
    Random r = new Random();

    public Pintura() {
        initComponents();
        setTitle("Pintura Abstracta");
        this.getContentPane().setBackground(Color.ORANGE);
        g = getGraphics();
        paint(g);
    }

    public void paint(Graphics g) {
        super.paint(g);
        fondoColores();
        patronFiguras();
        dibujarCirculosYCuadrados();
        dibujarLineas();
        dibujarRectangulos();
        dibujarCirculos();
        dibujarTriangulos();

    }

    public void fondoColores() {
        g.setColor(Color.yellow);
        g.fillRect(970, 0, 350, 200);
        
        g.setColor(Color.cyan);
        g.fillRect(970, 450, 350, 200);
        
        g.setColor(Color.GREEN);
        g.fillRect(970, 650, 350, 100);
        
        g.setColor(Color.magenta);
        g.fillRect(970, 150, 350, 200);
        g.setColor(Color.pink);
        g.fillRect(800, 450, 350, 200);
        g.setColor(Color.red);
        g.fillRect(0, 400, 350, 200);
        g.setColor(Color.CYAN);
        g.fillRect(600, 0, 350, 200);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 350, 200);
        g.setColor(Color.CYAN);
        g.fillRect(450, 460, 350, 500);
        g.setColor(Color.blue);
        g.fillRect(350, 350, 350, 200);
        g.setColor(Color.pink);
        g.fillRect(350, 150, 350, 250);
        g.setColor(Color.YELLOW);
        g.fillRect(350, 0, 350, 345);
        g.setColor(Color.lightGray);
        g.fillRect(550, 230, 300, 100);
    }

    public void dibujarCirculosYCuadrados() {

        g.setColor(Color.red);
        g.drawArc(450, 150, 200, 200, 225, 360);
        g.setColor(Color.lightGray);
        g.drawArc(750, 250, 200, 200, 125, 360);
        g.setColor(Color.YELLOW);
        g.drawArc(0, 350, 200, 200, 125, 360);
        g.setColor(Color.red);
        g.drawArc(350, 50, 100, 100, 125, 360);

        g.setColor(Color.magenta);
        g.drawRect(678, 48, 102, 102);
        g.setColor(Color.blue);
        g.drawRect(650, 50, 100, 100);
        g.setColor(Color.magenta);
        g.drawRect(950, 750, 200, 100);
        g.setColor(Color.blue);
        g.drawRect(650, 550, 160, 230);
        g.setColor(Color.red);
        g.drawArc(250, 50, 100, 100, 125, 360);
        g.setColor(Color.red);
        g.drawArc(950, 50, 100, 100, 125, 360);

        g.setColor(Color.magenta);
        g.drawRect(678, 48, 102, 102);
        g.setColor(Color.blue);
        g.drawRect(650, 50, 100, 100);
        g.setColor(Color.red);
        g.drawArc(250, 50, 100, 100, 125, 360);
        Graphics2D g2 = (Graphics2D) g;
        BasicStroke stroke = new BasicStroke(12.0f);
        g2.setStroke(stroke);
        g2.drawRect(12, 248, 400, 200);
    }

    public void dibujarLineas() {
        g.setColor(Color.green);
        g.drawLine(970, 450, 900, 900);
        g.setColor(Color.pink);
        g.drawLine(0, 950, 300, 250);
        g.setColor(Color.pink);
        g.drawLine(970, 120, 300, 250);
        g.setColor(Color.blue);
        g.drawLine(970, 970, 300, 250);
        g.setColor(Color.pink);
        g.drawLine(560, 450, 100, 250);
        g.setColor(Color.red);
        g.drawArc(450, 150, 200, 200, 225, 360);
    }

    public void dibujarCirculos() {

        g.setColor(Color.magenta);
        g.drawArc(450, 0, 200, 200, 225, 360);
        g.setColor(Color.magenta);
        g.drawArc(350, 0, 200, 200, 225, 360);
        g.setColor(Color.magenta);
        g.drawArc(170, 640, 200, 200, 225, 360);
        g.setColor(Color.blue);
        g.drawArc(970, 640, 200, 200, 225, 360);
        g.setColor(Color.red);
        g.drawArc(970, 140, 200, 200, 225, 360);
        Graphics2D g2 = (Graphics2D) g;
        BasicStroke stroke = new BasicStroke(14.0f);
        g2.setStroke(stroke);
        g2.drawRect(12, 248, 400, 200);
    }

    public void dibujarRectangulos() {
        g.setColor(Color.green);
        g.drawRect(0, 550, 100, 200);
        g.setColor(Color.yellow);
        g.drawRect(100, 450, 500, 400);
        g.setColor(Color.blue);
        g.drawRect(80, 480, 100, 200);
        g.setColor(Color.blue);
        g.drawRect(880, 480, 100, 200);
        g.setColor(Color.magenta);
        g.drawRect(980, 280, 100, 250);
        g.setColor(Color.green);
        g.drawRect(450, 150, 200, 200);
        g.setColor(Color.green);
        g.drawRect(970, 150, 200, 200);
        g.setColor(Color.green);
        g.drawRect(970, 450, 900, 800);
        g.setColor(Color.blue);
        g.drawRect(1150, 550, 200, 200);
        g.setColor(Color.blue);
        g.drawRect(1150, 80, 200, 200);
        g.setColor(Color.blue);
        g.drawRect(148, 48, 102, 102);
        g.setColor(Color.green);
        g.drawRect(350, 50, 100, 100);
        g.setColor(Color.blue);
        g.drawRect(449, 149, 202, 202);
        g.setColor(Color.green);
        g.drawRect(450, 150, 200, 200);
        g.setColor(Color.red);
        g.drawRect(150, 300, 300, 100);
        g.setColor(Color.PINK);
        g.drawRect(130, 48, 400, 200);
        g.setColor(Color.blue);
        g.drawRect(13, 248, 400, 200);
        Graphics2D g2 = (Graphics2D) g;
        BasicStroke stroke = new BasicStroke(17.0f);
        g2.setStroke(stroke);
        g2.drawRect(12, 248, 400, 200);

    }

    public void dibujarTriangulos() {
        g.setColor(Color.magenta);
        g.drawLine(200, 450, 200 + (100 / 2), 450 + 100);
        g.drawLine(200 + (100 / 2), 450 + 100, 200 - (100 / 2), 450 + 100);
        g.drawLine(200, 450, 200 - (100 / 2), 450 + 100);
        g.setColor(Color.red);
        g.drawLine(900, 450, 900 + (100 / 2), 450 + 100);
        g.drawLine(900 + (100 / 2), 450 + 100, 900 - (100 / 2), 450 + 100);
        g.drawLine(900, 450, 900 - (100 / 2), 450 + 100);
        Graphics2D g2 = (Graphics2D) g;
        BasicStroke stroke = new BasicStroke(17.0f);
        g2.setStroke(stroke);
        g2.drawRect(12, 248, 400, 200);
    }

    public void patronFiguras() {
        int x, y;
        int contador = 0;
        for (int c = 10; c < 45; c++) {
            x = (int) (contador);
            y = (int) (contador);

            Color miColor = new Color(255);

            g.setColor(miColor);
            g.drawOval(x, y, 50, 50);
            contador = contador + 50;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pintura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
