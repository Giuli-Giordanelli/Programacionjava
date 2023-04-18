package Ud6;

public class Articulo {
    private String nombre;
    private double precio;
    private int iva;
    private int cuantosQuedan;

    public Articulo(String nombre, double precio, int iva, int cuantosQuedan){
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cuantosQuedan = cuantosQuedan;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio <= 0)
            System.out.println("ERROR: El precio no puede ser negativo");
        else 
            this.precio = precio;
    }

    public int getIva() {
        return iva;
    }

    public void setIva(int iva) {
        this.iva = iva;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public String toString() {
        return ("Nombre :" + nombre + "Precio :" + precio + "Quedan :" + cuantosQuedan);
    }
    public void vender(int cuantos){
        if(cuantos <= cuantosQuedan){
            cuantosQuedan -= cuantos;
            System.out.println("Se han vendido. Salen de almacen");
        }
        else 
            System.out.println("ERROR: No se pueden vender. No quedan tantos!!");
        
    }
}
