package dev.Wayne.Dame;

public class Dame {
	
	static String[][] Brett = new String[8][8];
	
	public static void main(String args[]){
		
		System.out.println("hallo");
		neu();
		
		System.out.println();
		System.out.println();
		PrintBrett();

	


	}
	
	
	public static void neu(){
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				Brett[i][j]=" ";
			}
		}
		
		
		for(int i = 0; i<8; i++){
			Brett[1][i]="#";
			Brett[2][i]="#";
			Brett[5][i]="O";
			Brett[6][i]="O";			
		}
	}
	
	
	public static void PrintBrett(){
		
		for(int i = 0; i < 8; i++){
			for(int j = 0; j < 8; j++){
				System.out.print(" ");
				if(j == 7){
					System.out.print(Brett[i][j]);
				}
				else{
					System.out.print(Brett[i][j] + " |");
				}
			}
			System.out.println();
			if(i!=7){
				System.out.println("-------------------------------");
			}
		}	
	}
	
	
}
