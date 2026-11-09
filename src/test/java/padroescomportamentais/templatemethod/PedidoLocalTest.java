package padroescomportamentais.templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoLocalTest {

    @Test
    void deveRetornarTaxa() {
        PedidoLocal pedido = new PedidoLocal();
        pedido.setValorProdutos(100.0f);

        assertEquals(10.0f, pedido.calcularTaxa());
    }

    @Test
    void deveRetornarTotal() {
        PedidoLocal pedido = new PedidoLocal();
        pedido.setValorProdutos(100.0f);

        assertEquals(110.0f, pedido.calcularTotal());
    }

    @Test
    void deveRetornarInformacoes() {
        PedidoLocal pedido = new PedidoLocal();
        pedido.setNumero(1);
        pedido.setCliente("Ana");
        pedido.setValorProdutos(100.0f);

        assertEquals(
                "PedidoLocal{numero=1, cliente='Ana', subtotal=100.0, taxa=10.0, total=110.0}",
                pedido.getInfo()
        );
    }
}
