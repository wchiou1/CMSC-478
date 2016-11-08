public class Picture{
	public int x,y;
	public Color[][] pixels;
	public Picture(Color[][] pixels){
		x=pixels.length;
		y=pixels[0].length;
		this.pixels=pixels;
	}
}