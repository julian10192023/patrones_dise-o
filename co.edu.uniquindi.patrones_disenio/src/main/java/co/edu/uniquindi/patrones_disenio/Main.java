package co.edu.uniquindi.patrones_disenio;

//gestion y almacenamiento de productos en en una tienda online:
//

import co.edu.uniquindi.patrones_disenio.prototype.PrototypeManager;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Iproducto camisaPedido1 = PrototypeManager.obtenerMuestra("camisaBase");
        camisaPedido1.setMaterial("ALGODON");
        camisaPedido1.setMarca("NIKE");
        camisaPedido1.setPrecio(55.000);
        camisaPedido1.setColor("ROJO");
        camisaPedido1.

        System.out.println();

        Iproducto camisaPedido2 = PrototypeManager.obtenerMuestra("camisaBase");
        camisaPedido1.setMaterial("POLIÉSTER");
        camisaPedido1.setMarca("ADIDAS");
        camisaPedido1.setPrecio(45.000);
        camisaPedido1.setColor("AZUL");
        camisaPedido2.toString();
        System.out.println();

        Iproducto sudaderaPedido1 = PrototypeManager.obtenerMuestra("sudaderaBase");
        sudaderaPedido1.setMaterial("POLIÉSTER");
        sudaderaPedido1.setMarca("PUMA");
        sudaderaPedido1.setPrecio(75.000);
        sudaderaPedido1.setColor("VERDE");
        sudaderaPedido1.toString();
        System.out.println();
    }
}