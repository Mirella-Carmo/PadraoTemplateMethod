package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoDeliveryTest {

    @Test
    void deveRetornarTaxa() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setValorProdutos(100.0f);

        assertEquals(8.0f, pedido.calcularTaxa());
    }

    @Test
    void deveRetornarTotal() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setValorProdutos(100.0f);

        assertEquals(108.0f, pedido.calcularTotal());
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoDelivery pedido = new PedidoDelivery();
        pedido.setNumero(2);
        pedido.setCliente("Carlos");
        pedido.setValorProdutos(100.0f);

        assertEquals(
                "PedidoDelivery{numero=2, cliente='Carlos', subtotal=100.0, taxa=8.0, total=108.0}",
                pedido.getInfo()
        );
    }
}