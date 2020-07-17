import java.util.Arrays;
import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		
		String PROVEEDORES[]= new String[5]; 
		String CIUDAD[]= new String[5];
	    int NUMEROARTICULOS[]= new int[5];

	    Scanner teclado= new Scanner(System.in);
	    
	    while (true){
	    	
	    System.out.println("Opciones (1,2,3,4,5): \n"+"1.Nombre Proveedor: \n"+"2.Actualizar Ciudad: \n"+"3.Actualizar Articulos: \n"+"4.Nuevo Proveedor: \n"+"5.Eliminar Proveedor: \n");
	   
	    int x=teclado.nextInt();
	    
	     
	    switch (x) {
	    case 1:
	    	
	    	System.out.println("Nombre Proveedor: ");
	    	String nombre=teclado.next();
	    	
	    	for (int i = 0; i < PROVEEDORES.length; i++) {
	    		if(Arrays.asList(PROVEEDORES[i]).contains(nombre)) {
	    		    System.out.println("Ciudad en que reside: " + CIUDAD[i] + "\n" + "Numero Articulos: " + NUMEROARTICULOS[i]);
	    		    break;
	    		}
				
			}
	    	
	    case 2:
	    	
	    	System.out.println("Nombre Proveedor: ");
	    	String nombre1=teclado.next();
	    	System.out.println("Nuevo Domicilio:  ");
	    	String ciudad=teclado.next();
	    	
	    	for (int i = 0; i < PROVEEDORES.length; i++) {
	    		if(Arrays.asList(PROVEEDORES[i]).contains(nombre1)) {
	    		    CIUDAD[i]=ciudad;
	    		    break;
	    		}	
	    	}
	    	
	    case 3:
	    	
	    	System.out.println("Nombre Proveedor: ");
	    	String nombre2=teclado.next();
	    	System.out.println("Aumenta (1) o Disminuye (2): ");
	    	int y=teclado.nextInt();
	    	System.out.println("Cantidad de Articulos: ");
	    	int valorCambio=teclado.nextInt();
	    	
	    	for (int i = 0; i < PROVEEDORES.length; i++) {
	    		if(Arrays.asList(PROVEEDORES[i]).contains(nombre2)) {
	    			if(y==1) {
	    				 NUMEROARTICULOS[i]=NUMEROARTICULOS[i]+valorCambio;
	    				 break;
	    			}else {
	    				NUMEROARTICULOS[i]=NUMEROARTICULOS[i]-valorCambio;
	    				break;
	    			}
	    		}	
	    	}
	    	
	    	
	    case 4:
	    	System.out.println("Nombre Proveedor: ");
	    	String nombre3=teclado.next();
	    	System.out.println("Nombre Ciudad: ");
	    	String ciudad1=teclado.next();
	    	System.out.println("Cantidad de Articulos: ");
	    	int art=teclado.nextInt();
	    	
	    	
	    	for (int i = 0; i < PROVEEDORES.length; i++) {
				if(Arrays.asList(PROVEEDORES[i]).contains(null)) {
					PROVEEDORES[i]=nombre3;
					System.out.println(Arrays.asList(PROVEEDORES));
					break;
				}
			}
	    	
	    	for (int i = 0; i < CIUDAD.length; i++) {
				if(Arrays.asList(CIUDAD[i]).contains(null)) {
					CIUDAD[i]=ciudad1;
					System.out.println(Arrays.asList(CIUDAD));
					break;
				}
			}
	    	
	    	for (int i = 0; i <  NUMEROARTICULOS.length; i++) {
				if(Arrays.asList( NUMEROARTICULOS[i]).contains(null)) {
					 NUMEROARTICULOS[i]=art;
					System.out.println(Arrays.asList( NUMEROARTICULOS));
					break;
				}
			}
	    	
	    case 5:
	    	System.out.println("Nombre Proveedor: ");
	    	String nombre4=teclado.next();
	    	
	    	for (int i = 0; i < PROVEEDORES.length; i++) {
	    		if(Arrays.asList(PROVEEDORES[i]).contains(nombre4)) {
	    			 for (int j = i; j < PROVEEDORES.length - 1; j++) {
	                     PROVEEDORES[j] = PROVEEDORES[j+1];
	                 }
	                 PROVEEDORES[PROVEEDORES.length - 1] = "";
	                 System.out.println(Arrays.asList(PROVEEDORES));
	                 break;
	    		}
	    			
	    	}
	    	
	    }
	    
	    }
	}
	

}
