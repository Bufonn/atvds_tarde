//Subclasse do Triangulo

public class Triangulo extends Figura {

    //Construtor do Triangulo | O Encapsulamento em teoria já vem da sua Superclasse (Figura)
    public Triangulo(double base, double lado1, double lado2) {
        super(1, base, lado1, lado2); // tipo 1 = triângulo
    }

        //construtor Padrão
        public Triangulo(){
            super();

            //Confirmação
            setTipo(1);//Deixa ele no padrão de como deve iniciar
            setBase(0);//Deixa ele no padrão de como deve iniciar
            setLado1(0);//Deixa ele no padrão de como deve iniciar
            setLado2(0);//Deixa ele no padrão de como deve iniciar
        }
}
