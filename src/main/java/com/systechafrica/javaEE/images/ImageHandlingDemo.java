package com.systechafrica.javaEE.images;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class ImageHandlingDemo{
    public static void main(String[] args) {
        try {
            // specify path to image file
            String imagePath = "/home/tonny/Pictures/Brian-diploma.png";

            // load the image
            BufferedImage image = ImageIO.read(new File(imagePath));

            // get image width and height
            int width = image.getWidth();
            int height = image.getHeight();

            // print image width and height
            System.out.println("Width: " + width);
            System.out.println("Height: " + height);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }

    
}
