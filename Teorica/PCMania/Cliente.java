public class Cliente {
    public String nome = "Nome Do Cliente Placeholder";
    public long cpf = 11111111111L;
    public Computador[] carrinhoCompras = new Computador[20];

    public float CalcularTotalCompra() {
        float valorTotal = 0;

        for (Computador computador : carrinhoCompras) {
            if (computador == null) {
                break;
            }

            valorTotal += computador.preco;
        }

        return valorTotal;
    }
}
