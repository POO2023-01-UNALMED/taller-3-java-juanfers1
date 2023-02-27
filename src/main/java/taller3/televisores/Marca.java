package taller3.televisores;

public class Marca {
    private String nombre; //Atributo privado
    public Marca(String nombre){ //Constructor
        this.nombre = nombre; //Asigna el nombre
    }

    public String getNombre() { //Metodo get
        return nombre;
    }

    public void setNombre(String nombre) { //Metodo set
        this.nombre = nombre;
    }

}