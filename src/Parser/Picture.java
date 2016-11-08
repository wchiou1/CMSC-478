package Parser;

public class Picture{
	public int x,y;
	public Color[][] pixels;
	public Picture(Color[][] pixels){
		x=pixels.length;
		y=pixels[0].length;
		this.pixels=pixels;
	}
	//@param d odd
	public Picture GetSubPixels(int x, int y, int d){
		Color [][] pdxd = new Color[d][d];
		int h=d/2;
		for(int r=0; r<d; r++){
			for(int c=0; c<d; c++){
				if(x+c-h<0||x+c-h>this.x||y+r-h<0||y+r-h>this.y){
					pdxd[c][r]=null;
				}
				else{
					pdxd[c][r]=this.pixels[x+c-h][y+r-h];
				}
			}
		}
		return new Picture(pdxd);
	}
}