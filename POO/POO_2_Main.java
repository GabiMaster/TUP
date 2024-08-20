package POO_2;

public class POO_2_Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Juan", "Perez", 12345678, true);
        System.out.println(cliente1);

        Empleado empleado1 = new Empleado("Carlos", "Meza", 12763559, 350000);
        System.out.println(empleado1);

        Productos[] producto1 = new Productos("Manzanas", 1.5, 10);
        Productos[] producto2 = new Productos("Leche", 0.99, 5);
        Productos[] producto3 = new Productos("Pan", 1.2, 2);
        };

        Caja caja1 = new Caja(empleado1);
        caja1.registrarCompra(cliente1, productos);
    }
}