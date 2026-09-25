import java.util.List;

public class Quadrado extends Forma {
    @Override
    public void calculaArea() {
        List<Float> medidas = validarArestas(1, "quadrado");
        double lado = medidas.get(0);
        double area = lado * lado;

        System.out.printf("Área do quadrado: %.2f%n", area);
    }
}