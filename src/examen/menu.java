package examen;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class menu {
		
		ArrayList<String> listaProductos;
		ArrayList<ArrayList<String>> ProcuctodCantidad;
		
		
		public menu() {
			
			listaProductos=new ArrayList<>();
			listaProductos.add("Papa");
			listaProductos.add("tomate");
			listaProductos.add("cebolla");
		
			ProcuctodCantidad =new ArrayList<>();
		}
		
		

			public void iniciar () {
				nuevoProducto();
				ProcuctodCantidad();
				eliminacionDeProducto();
				actualizacionProductos();
				
				
				
			}
			private void nuevoProducto() {
			    System.out.print("Registro de profesores ");
			    int cantidad =Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que va a ingresar"));
			    

			    for (int i = 0; i < cantidad; i++) {
			     
			        String nombreProfesor=JOptionPane.showInputDialog("Nombre del Profesor" + (i+1));
			        listaProductos.add(nombreProfesor);
			       
			    }
			    System.out.println("Regristro de producto exitoso");
			}
}

