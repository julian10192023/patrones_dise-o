package co.edu.uniquindi.patrones_disenio.model;

import co.edu.uniquindi.patrones_disenio.Iproducto;

public class Prenda implements Iproducto {
    private String talla;
    private String color;
    private String material;
    private String marca;
    private double precio;

    public Prenda(String talla, String color, String material, String marca, double precio) {
        this.talla = talla;
        this.color = color;
        this.material = material;
        this.marca = marca;
        this.precio = precio;
    }
    @Override
    public Iproducto clonar() {
        Prenda replicaBlusa = null;
        try{
            replicaBlusa = (Prenda) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return replicaBlusa;
    }

    @Override
    public void setTalla(String talla) {

    }

    @Override
    public void setColor(String color) {

    }

    @Override
    public void setMaterial(String material) {

    }

    @Override
    public void setMarca(String marca) {

    }

    @Override
    public void setPrecio(double precio) {

    }


    public String getTalla() {
        return talla;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Blusa{" +
                "talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
