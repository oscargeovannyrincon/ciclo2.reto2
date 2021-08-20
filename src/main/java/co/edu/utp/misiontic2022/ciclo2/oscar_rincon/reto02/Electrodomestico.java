package co.edu.utp.misiontic2022.ciclo2.oscar_rincon.reto02;

public class Electrodomestico {

    // CONSTANTES
    private final Double PRECIO_BASE = 100.0;
    private final Character CONSUMO_W_BASE = 'F';
    private final Integer PESO_BASE = 5;

    // ATRIBUTOS
    private Double precioBase;
    private Integer peso;
    private Character consumoW;

    // CONSTRUCTORES
    public Electrodomestico() {
        this.peso = PESO_BASE;
        this.consumoW = CONSUMO_W_BASE;
        this.precioBase = PRECIO_BASE;
    }

    public Electrodomestico(Double precioBase, Integer peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoW = CONSUMO_W_BASE;
    }

    public Electrodomestico(Double precioBase, Integer peso, Character consumoW) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoW(consumoW);
    }

    public void comprobarConsumoW(Character consumoW) {
        if (consumoW >= 'A' && consumoW <= 'F') {
            this.consumoW = consumoW;

        } else {
            this.consumoW = CONSUMO_W_BASE;
        }

    }

    public Double calcularPrecio() {
        Double adicion = 0d;

        switch (this.consumoW) {
            case 'A':
                adicion += 100;
                break;
            case 'B':
                adicion += 80;
                break;
            case 'C':
                adicion += 60;
                break;
            case 'D':
                adicion += 50;
                break;
            case 'E':
                adicion += 30;
                break;
            case 'F':
                adicion += 10;
                break;
            default:
                break;
        }

        if (this.peso >= 0 && this.peso < 19) {
            adicion += 10;
        }
        if (this.peso >= 19 && this.peso < 49) {
            adicion += 50;
        }
        if (this.peso >= 49 && this.peso < 80) {
            adicion += 80;
        } else
            adicion += 100;


        return this.precioBase + adicion;
    }

}
