package examen;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu {
    ArrayList<String> listaProductos;
    ArrayList<Integer> CantidadProductos;

    public Menu() {
        listaProductos = new ArrayList<>();
        listaProductos.add("Papa");
        listaProductos.add("Tomate");
        listaProductos.add("Cebolla");

        CantidadProductos = new ArrayList<>();
        CantidadProductos.add(10); // Correspondiente a Papa
        CantidadProductos.add(12); // Correspondiente a Tomate
        CantidadProductos.add(13); // Correspondiente a Cebolla
    }

    public void iniciar() {
        boolean exit = false;
        while (!exit) {
            String opcion = JOptionPane.showInputDialog("Menú de opciones:\n" +
                    "1. Nuevo Producto\n" +
                    "2. Eliminación del Producto\n" +
                    "3. Actualización del Producto\n" +
                    "4. Productos con su cantidad\n" +
                    "5. Salir");

            switch (opcion) {
                case "1":
                    nuevoProducto();
                    break;
                case "2":
                    eliminacionDeProducto();
                    break;
                case "3":
                    actualizacionProductos();
                    break;
                case "4":
                    productosCantidad();
                    break;
                case "5":
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }

    private void nuevoProducto() {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos que va a ingresar"));

        for (int i = 0; i < cantidad; i++) {
            String nombreProducto = JOptionPane.showInputDialog("Nombre del producto " + (i + 1));
            int cantidadProducto = Integer.parseInt(JOptionPane.showInputDialog("Cantidad del producto " + (i + 1)));
            listaProductos.add(nombreProducto);
            CantidadProductos.add(cantidadProducto);
        }
        System.out.println("Registro de producto exitoso");
    }

    private void eliminacionDeProducto() {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto a eliminar");
        int index = listaProductos.indexOf(nombreProducto);

        if (index >= 0) {
            listaProductos.remove(index);
            CantidadProductos.remove(index);
            System.out.println("Producto eliminado exitosamente");
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    private void actualizacionProductos() {
        String nombreProducto = JOptionPane.showInputDialog("Ingrese el nombre del producto a actualizar");
        int index = listaProductos.indexOf(nombreProducto);

        if (index >= 0) {
            String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto");
            int nuevaCantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva cantidad del producto"));

            listaProductos.set(index, nuevoNombre);
            CantidadProductos.set(index, nuevaCantidad);
            System.out.println("Producto actualizado exitosamente");
        } else {
            System.out.println("Producto no encontrado");
        }
    }

    private void productosCantidad() {
        StringBuilder productos = new StringBuilder("Productos y sus cantidades:\n");

        for (int i = 0; i < listaProductos.size(); i++) {
            productos.append(listaProductos.get(i)).append(": ").append(CantidadProductos.get(i)).append("\n");
        }

        JOptionPane.showMessageDialog(null, productos.toString());
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.iniciar();
    }
}
