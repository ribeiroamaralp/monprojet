/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumarmottehunter;

import java.awt.Insets;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author PARIS_JIMMY-ESIG
 */
public class Case extends JButton{
    private int positionX;
    private int positionY;
    private boolean vide;
    
    /**
     *
     * @param positionX
     * @param positionY
     */
    public Case(int positionX, int positionY) {
        super(new ImageIcon("img\\TextureHerbePetite.jpg"));
        this.positionX = positionX;
        this.positionY = positionY;
        this.vide = true;
        this.setMargin(new Insets(0, 0, 0, 0));
        this.setBorder(null);
    }

    /**
     *
     * @param positionY
     */
    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    /**
     *
     * @return
     */
    public int getPositionY() {
        return positionY;
    }
    
    /**
     *
     * @param positionX
     */
    public void setPositionX(int positionX){
     this.positionX = positionX;   
    }
    
    /**
     * 
     * @return
     */
    public int getPositionX(){
        return positionX;
    }
    
    /**
     *
     * @return
     */
    public boolean isVide(){
        return vide;
    }
    
    /**
     *
     * @param vide
     */
    public void setVide(boolean vide){
        if (vide)
        {
            this.setIcon(new ImageIcon("img\\TextureHerbePetite.jpg"));
        }
        this.vide = vide;
    }

    @Override
    public String toString()
    {
        return "positionX:" + positionX + " positionY: " + positionY + " vide:" + vide;
    }
}
