import java.util.ArrayList;
import java.util.List;

public abstract class Forma {
    private List<Float> arestas = new ArrayList<>();

    public List<Float> getArestas() {
        return this.arestas;
    }

    public void setArestas(List<Float> a) {
        if (a == null) {
            throw new IllegalArgumentException("A lista de medidas não pode ser nula.");
        }
        this.arestas = new ArrayList<>(a);
    }

    public void calculaArea() {
        // Sobrescrito pelas formas concretas.
    }

    protected List<Float> validarArestas(int quantidadeEsperada, String nomeForma) {
        if (arestas.size() != quantidadeEsperada) {
            throw new IllegalStateException(
                "A forma " + nomeForma + " deve ter " + quantidadeEsperada + " medida(s)."
            );
        }

        for (Float medida : arestas) {
            if (medida == null || !Float.isFinite(medida) || medida <= 0.0f) {
                throw new IllegalStateException(
                    "As medidas de " + nomeForma + " devem ser números positivos e finitos."
                );
            }
        }

        return arestas;
    }
}