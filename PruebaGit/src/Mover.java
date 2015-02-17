
public class Mover {
	private static String tablero[][]={{"","",""},{"","",""},{"","",""}};
	static int turno=0;
	public static void main(String[] args) {
	}
	public static void Mover(int a,int b){
		int c,d;
		if(turno==2){
		if(tablero[a][b]=="X"){
			System.out.println("Selecciona donde mover la ficha");
			
		}else{
			System.out.println("Esa no es tu ficha");
		}
}else if(turno==1){
	if(tablero[a][b]=="0"){
		System.out.println("Selecciona donde mover la ficha");
		
	}else{
		System.out.println("Esa no es tu ficha");
	}
}
}
}