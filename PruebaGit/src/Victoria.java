
public class Victoria {
	private static String tablero[][]={{"","",""},{"","",""},{"","",""}};
	public static void main(String[] args) {
	}
	public static void ComprobarVictoria(){
		//VICTORIA DE LOS 0!
	if(tablero[0][0]=="0"&&tablero[0][1]=="0"&&tablero[0][2]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[2][0]=="0"&&tablero[2][1]=="0"&&tablero[2][2]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[0][0]=="0"&&tablero[1][0]=="0"&&tablero[2][0]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[0][2]=="0"&&tablero[1][2]=="0"&&tablero[2][2]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[1][0]=="0"&&tablero[1][1]=="0"&&tablero[1][2]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[0][1]=="0"&&tablero[1][1]=="0"&&tablero[2][1]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[0][0]=="0"&&tablero[1][1]=="0"&&tablero[2][2]=="0"){
		System.out.println("Victoria de los 0!");
	}
	if(tablero[2][0]=="0"&&tablero[1][1]=="0"&&tablero[0][2]=="0"){
		System.out.println("Victoria de los 0!");
	}
	//VICTORIA DE LAS X!
	if(tablero[0][0]=="X"&&tablero[0][1]=="X"&&tablero[0][2]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[2][0]=="X"&&tablero[2][1]=="X"&&tablero[2][2]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[0][0]=="X"&&tablero[1][0]=="X"&&tablero[2][0]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[0][2]=="X"&&tablero[1][2]=="X"&&tablero[2][2]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[1][0]=="X"&&tablero[1][1]=="X"&&tablero[1][2]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[0][1]=="X"&&tablero[1][1]=="X"&&tablero[2][1]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[0][0]=="X"&&tablero[1][1]=="X"&&tablero[2][2]=="X"){
		System.out.println("Victoria de las X!");
	}
	if(tablero[2][0]=="X"&&tablero[1][1]=="X"&&tablero[0][2]=="X"){
		System.out.println("Victoria de las X!");
	}
}}
