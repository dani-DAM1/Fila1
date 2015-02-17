
public class ComprobarOcupada {
	private static String tablero[][]={{"","",""},{"","",""},{"","",""}};
	public static void main(String[] args) {
	}
	public static void ComprobarOcupada(int a,int b){
		if(tablero[a][b]=="X"||tablero[a][b]=="0"){
			System.out.println("Casilla ya ocupada");
		}
}
}