package padroescomportamentais.templatemethod;

public class PedidoDelivery extends PedidoRestaurante {

    private static final float TAXA_ENTREGA = 8.00f;

    @Override
    public float calcularTaxa() {
        return TAXA_ENTREGA;
    }

    @Override
    public String getTipo() {
        return "PedidoDelivery";
    }
}