import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;



public class ImageParser {

public static final String IMG = "pix.jpg";

public static void main(String[] args) {

    BufferedImage img;
    try {
        img = ImageIO.read(new File(IMG));
        Color[][] pixels = new Color[img.getWidth()][img.getHeight()];
        int[] rgb;
        
        for(int x = 0; x < img.getWidth(); x++){
        	for(int y=0; y < img.getHeight(); y++){
        		rgb = getPixelData(img, x, y);
        		pixels[x][y] = new Color(rgb[0],rgb[1],rgb[2]);
        	}
        }


    } catch (IOException e) {
        e.printStackTrace();
    }

}

private static int[] getPixelData(BufferedImage img, int x, int y) {
int argb = img.getRGB(x, y);

int rgb[] = new int[] {
    (argb >> 16) & 0xff, //red
    (argb >>  8) & 0xff, //green
    (argb      ) & 0xff  //blue
};
return rgb;
}

}