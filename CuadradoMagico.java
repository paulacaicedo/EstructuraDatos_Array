import java.util.Scanner;

public class CuadradoMagico {

	public static void main(String[] args) {
		
		Scanner x=new Scanner(System.in);
		
		int dimension=x.nextInt();
		int array[][]= new int[dimension][dimension];
		
		int mitad=dimension/2; //Columna de la mitad
		
		int columna=mitad;
		int fila=0;
	 
		array[fila][columna]=1; //Ubicarnos en el 1
		
		int FilaActual=fila;
		int ColumnaActual=columna;
		
		for(int i=2; i<=(dimension*dimension);i++) {
			
			fila--;
			columna++;
			
			if(fila<0) {
				fila=array.length-1;
			}
			if(columna==array.length) {
				columna=0;
			}
			
			
			
			if(array[fila][columna]==0) {
				array[fila][columna]=i;
			}else{
				fila=FilaActual+1;
				columna=ColumnaActual;
				
				array[fila][columna]=i;
			}
			
			FilaActual=fila;
			ColumnaActual=columna;
			 
		}
		
		for(int i =0; i<array.length;i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

}
