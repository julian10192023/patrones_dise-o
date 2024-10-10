package co.edu.uniquindi.patrones_disenio;

public interface Iproducto extends Cloneable {
    Iproducto clonar();
    void setTalla(String talla);
    void setColor(String color);
    void setMaterial(String material);
    void setMarca(String marca);
    void setPrecio(double precio);

}
