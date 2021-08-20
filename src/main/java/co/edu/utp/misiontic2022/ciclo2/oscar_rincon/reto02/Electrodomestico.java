package co.edu.utp.misiontic2022.ciclo2.oscar_rincon.reto02;

public class Electrodomestico {

    //CONSTANTES
    private final Double PRECIO_BASE=100.0;
    private final Character CONSUMO_W_BASE='F';
    private final Integer PESO_BASE=5;

    //ATRIBUTOS
    private Double precioBase;
    private Integer peso;
    private Character consumoW;


    //CONSTRUCTORES
    public Electrodomestico() {
        this.peso=PESO_BASE;
        this.consumoW=CONSUMO_W_BASE;
        this.precioBase=PRECIO_BASE;
    }

    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        comprobarPeso(peso);
    }

    

    

    public Electrodomestico(Double precioBase, Integer peso, Character consumoW) {
        this.precioBase = precioBase;
        comprobarPeso(peso);
        comprobarConsumoW(consumoW);
    }

    private void comprobarConsumoW(Character consumoW) {
    }

    private void comprobarPeso(Integer peso) {

    }

    

    
    
    
}
