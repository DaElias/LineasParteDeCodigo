package lineas;

import java.awt.Graphics;
import java.awt.Color;

public class Lineas {

    Puntos pInicio;
    Puntos PFinal;
    Puntos W, We;

    public Lineas(int x, int y, int x1, int y1) {
        pInicio = new Puntos(x, y);
        PFinal = new Puntos(x1, y1);

        W = new Puntos(pInicio.getX() + PFinal.getX() - pInicio.getX(), y);
        We = new Puntos((pInicio.getX()) / 2 + (W.getX()) / 2, W.getY());
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(pInicio.getX(), pInicio.getY(), 10, 10); //Punto Inicial
        g.fillOval(PFinal.getX(), PFinal.getY(), 10, 10);  //Punto Final

        //g.fillOval(PFinal.getX(), pInicio.getY(), 10, 10);
        g.setColor(Color.BLUE);
        g.fillOval(W.getX(), W.getY(), 10, 10); //W
        g.setColor(Color.GREEN);
        g.fillOval(We.getX(), We.getY(), 10, 10); //W/2
        g.setColor(Color.orange);
        g.fillOval(We.getX(), PFinal.getY(), 10, 10);

        //Lineas
        g.setColor(Color.BLACK);
        g.drawLine(pInicio.getX(), pInicio.getY(), We.getX(), We.getY());
        g.drawLine(We.getX(), We.getY(), We.getX(), PFinal.getY());
        g.drawLine(We.getX(), PFinal.getY(), PFinal.getX(), PFinal.getY());

    }
}
