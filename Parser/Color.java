package Parser;
public class Color{
	public int r,g,b;
	public Color(int r, int g, int b){
		this.r=r;
		this.g=g;
		this.b=b;
	}
	public String toString(){
		return "("+r+","+g+","+b+")";
	}
}