import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.setArestas(Arrays.asList(3.0f)); // raio

        Triangulo triangulo = new Triangulo();
        triangulo.setArestas(Arrays.asList(3.0f, 4.0f, 5.0f)); // lados

        Quadrado quadrado = new Quadrado();
        quadrado.setArestas(Arrays.asList(4.0f)); // lado

        // Criando uma lista de formas
        List<Forma> formas = Arrays.asList(circulo, triangulo, quadrado);
        for (Forma forma : formas) {
            forma.calculaArea();
        }
    }
}