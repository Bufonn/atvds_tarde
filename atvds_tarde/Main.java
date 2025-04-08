import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int OP;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Triangulo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Sair");
            System.out.print("______________________");
            OP = scan.nextInt();

            switch (OP) {
                case 1:
                    //Quero implementar depois um sistema que identifique que tipo de triangulo é
                    System.out.print("Insira a base (Parte de baixo) do Triangulo: "); //Medidas contra USB'S
                    double base = scan.nextDouble();
                    System.out.print("Insira o lado esquerdo do Triangulo: "); //Medidas contra USB'S
                    double lado1 = scan.nextDouble();
                    System.out.print("Informe o lado direito do Triangulo: "); //Medidas contra USB'S
                    double lado2 = scan.nextDouble();

                    Triangulo triangulo = new Triangulo(base, lado1, lado2);
                    System.out.println("Base (Parte de baixo do Triangulo): " + triangulo.getBase());//chama a subclase "Triangulo" e usa o metodo GetBase (Um getter)
                    System.out.println("Lado Esquerdo do Triangulo: " + triangulo.getLado1());//chama a subclase "Triangulo" e usa o metodo GetLado1 (Um getter)
                    System.out.println("Lado Direito do Triangulo: " + triangulo.getLado2());//chama a subclase "Triangulo" e usa o metodo GetLado2 (Um getter)
                    System.out.println("Area do Tringulo: " + triangulo.calcularArea());//chama a subclasse "Triangulo" e usa a função calcularArea()
                    break;

                case 2:
                    System.out.print("insira o lado do quadrado: ");//peço apenas um lado do quadrado pois todos os lados de um quadrado são iguais
                    double lado = scan.nextDouble();

                    Quadrado quadrado = new Quadrado(lado);
                    System.out.println("Lado do quadrado: " + quadrado.getLado1());//chama a subclasse "Quadrado" e usa o metodo getLado1 (Um getter)
                    System.out.println("Área do quadrado: " + quadrado.calcularArea());//chama a subclasse "Quadrado" e usa a função calcularArea()
                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção invalida. Tente novamente.");
            }

            System.out.println();

        } while (OP != 3);

    }
}
