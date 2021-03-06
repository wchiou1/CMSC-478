package Parser;

public class TestDriver {
	public static void main(String[] args){
		Color[][] color= new Color[10][10];
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				color[i][j]=new Color(i*10+j,0,0);
			}
		}
		
		Picture pic=new Picture(color);
		
		System.out.println("original:");
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				System.out.print(pic.pixels[i][j].r+" ");
			}
			System.out.println();
		}
		
		Picture subpic=pic.GetSubPixels(5,5,5);
		
		System.out.println("sub:");
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.print(subpic.pixels[i][j].r+" ");
			}
			System.out.println();
		}
	}
}
