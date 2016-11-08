package cmsc478project;

public class Picture {
	public int x;
	public int y;
	public Color[][] pixels;
	
	public Picture(int x, int y, Color[][] pixels){
		this.x=x;
		this.y=y;
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
		return new Picture(9,9,pdxd);
	}

}
