
//Subclasse do Quadraro

public class Quadrado extends Figura {

    //Construtor do Quadrado | O Encapsulamento em teoria já vem da sua Superclasse (Figura)
    public Quadrado(double lado) {
        super(2, lado); // tipo 2 = quadrado
    }

    //construtor Padrão
    public Quadrado(){
        super();

        //confirmação
        setTipo(2);//Deixa ele no padrão de como deve iniciar
        setLado1(0);//Deixa ele no padrão de como deve iniciar
    }
}
