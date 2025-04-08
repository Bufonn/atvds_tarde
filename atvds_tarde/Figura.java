public class Figura {
    private int tipo; // 1 para Triangulo, 2 para quadrado|usei para identificar qual calculo de area q será usado
    private double base;
    private double lado1;
    private double lado2;

    public Figura() {}

    //Construtor para o Triangulo
    public Figura(int tipo, double base, double lado1, double lado2) {
        this.tipo = tipo;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //Construtor para o Quadrado
    public Figura(int tipo, double lado1) {
        this.tipo = tipo;
        this.lado1 = lado1;
    }

    public double calcularArea() {
        switch (tipo) {
            case 1:
                return (base * lado1) / 2;
            case 2:
                return lado1 * lado1;
            default:
                return 0;
        }
    }



    //Getters

    public int getTipo() {
        return tipo;
    }

    public double getBase() {
        return base;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }



    //Setters

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
}