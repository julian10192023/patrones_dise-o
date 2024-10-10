package co.edu.uniquindi.patrones_disenio.prototype;

import co.edu.uniquindi.patrones_disenio.Iproducto;
import co.edu.uniquindi.patrones_disenio.model.Prenda;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    private static Map<String, Iproducto> prototipos = new HashMap<>();

    static{
        prototipos.put("camisaBase", new Prenda("M","NEGRO", "ALGODON",
                "BIGJHON",80000));

        prototipos.put("sudaderaBase", new Prenda("S","BLANCO","TELA FRIA",
                "ADIDAS",90000));
    }
    public static Iproducto obtenerMuestra(String tipo){
        return prototipos.get(tipo).clonar();

    }
}
