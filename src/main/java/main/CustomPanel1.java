
package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
/**
 *
 * @author Shruti Patel
 */
public class CustomPanel1 extends javax.swing.JPanel {
    float progress=0;
      public void UpdateProgress(float progress_value){
      progress=progress_value;
      }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        
        Graphics2D g2=(Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.translate(this.getWidth()/2, this.getHeight()/2);
        g2.rotate(Math.toRadians(270));
        Arc2D.Float arc=new Arc2D.Float(Arc2D.PIE);
        Ellipse2D circle=new Ellipse2D.Float(0,0,100,100);
        arc.setFrameFromCenter(new Point(0,0),new Point(100,100));
        circle.setFrameFromCenter(new Point(0,0),new Point(85,85));
        arc.setAngleStart(1);
        arc.setAngleExtent(-progress*3.6);
        g2.setColor(Color.getHSBColor(210, 79,291));
        g2.draw(arc);
        g2.fill(arc);
        g2.setColor(Color.white);
        g2.draw(circle);
        g2.fill(circle);
        g2.setColor(Color.BLACK);
        g2.rotate(Math.toRadians(90));
        g2.setFont(new Font("Verdana",Font.PLAIN,25));
        FontMetrics fm=g2.getFontMetrics();
        Rectangle2D r=fm.getStringBounds(progress+"%",g);
        int x=(0-(int)r.getWidth())/2;
        int y=(0-(int)r.getHeight())/2+fm.getAscent();
        g2.drawString(progress+"%",x,y);
        
}
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
