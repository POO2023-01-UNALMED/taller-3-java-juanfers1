package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    private static int numTV;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (estado){
            if (volumen >= 1 && volumen <= 7) {
                this.volumen = volumen;
            }
        }
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (estado){
            if (canal >= 1 && canal <= 120) {
                this.canal = canal;
            }
        }   
    }
    
    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public static int getNumTV() { // Lleva la cuenta de los televisores creados
        return numTV;
    }

    public void  turnOn() {
        this.estado = true;
    }

    public void turnOff() {
        this.estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp() {
        if (estado) {
            if (canal < 120 && canal >= 1) {
                canal++;
            }
 
        }
    }

    public void canalDown() {
        if (estado) {
            if (canal <= 120 && canal > 1) {
                canal--;
            }
        }
    }

    public void volumenUp() {
        if (estado) {
            if (volumen < 7 && volumen >= 0) {
                volumen++;
            }
        }
    }

    public void volumenDown() {
        if (estado){
            if (volumen <= 7 && volumen > 0) {
                volumen--;
            }
        }
    }


}
