package padroescomportamentais.templatemethod;

public class PedidoLocal extends PedidoRestaurante {

    @Override
    public float calcularTaxa() {
        return this.calcularSubtotal() * 0.10f;
    }

    @Override
    public String getTipo() {
        return "PedidoLocal";
    }
}