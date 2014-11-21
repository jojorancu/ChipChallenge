/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chipchallenge.engine.item;

import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *
 * @author Jonathan Surya Laksa
 */
public class FireShoes extends Item{

    public FireShoes(int locationX, int locationY) {
        super(locationX, locationY);
        URL imgChipURL = getClass().getClassLoader().getResource("images/fireShoes.png");
        if (imgChipURL == null) {
            System.err.println("Couldn't find file: " + "images/chipDown.png");
        } else {
            try {
                img = ImageIO.read(imgChipURL);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        this.setVisible(true);
    }

    @Override
    public boolean canBeObtained() {
        return true;
    }
    
}
