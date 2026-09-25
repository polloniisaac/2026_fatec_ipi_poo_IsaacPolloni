import java.util.List;

public class Circulo extends Forma {
    @Override
    public void calculaArea() {
        // Para o círculo, a única medida da lista representa o raio.
        List<Float> medidas = validarArestas(1, "círculo");
        double raio = medidas.get(0);
        double area = Math.PI * raio * raio;

        System.out.printf("Área do círculo: %.2f%n", area);
    }
}