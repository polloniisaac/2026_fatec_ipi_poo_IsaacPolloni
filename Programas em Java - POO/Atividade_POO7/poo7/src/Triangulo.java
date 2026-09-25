import java.util.List;

public class Triangulo extends Forma {
    @Override
    public void calculaArea() {
        List<Float> lados = validarArestas(3, "triângulo");
        double a = lados.get(0);
        double b = lados.get(1);
        double c = lados.get(2);

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalStateException("As medidas informadas não formam um triângulo.");
        }

        // Fórmula de Heron
        double semiperimetro = (a + b + c) / 2.0;
        double area = Math.sqrt(
            semiperimetro
                * (semiperimetro - a)
                * (semiperimetro - b)
                * (semiperimetro - c)
        );

        System.out.printf("Área do triângulo: %.2f%n", area);
    }
}