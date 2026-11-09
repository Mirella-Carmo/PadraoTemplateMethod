package padroescomportamentais.templatemethod;

public abstract class PedidoRestaurante {

    private int numero;
    private String cliente;
    private float valorProdutos;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Número inválido");
        }
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.isBlank()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        this.cliente = cliente;
    }

    public float getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(float valorProdutos) {
        if (valorProdutos <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.valorProdutos = valorProdutos;
    }

    public float calcularSubtotal() {
        return this.valorProdutos;
    }

    public abstract float calcularTaxa();

    public float calcularTotal() {
        return this.calcularSubtotal() + this.calcularTaxa();
    }

    public String getTipo() {
        return "Pedido";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "numero=" + this.numero +
                ", cliente='" + this.cliente + '\'' +
                ", subtotal=" + this.calcularSubtotal() +
                ", taxa=" + this.calcularTaxa() +
                ", total=" + this.calcularTotal() +
                '}';
    }
}