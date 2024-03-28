public class Computador {
    public String marca;
    public float preco;

    public HardwareBasico[] configs;
    public SistemaOperacional so;
    private MemoriaUSB memoriaUSB;

    public Computador(String marca, float preco, HardwareBasico[] configs, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.configs = configs;
        this.so = so;
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        System.out.println("Processador: " + configs[0].nome + " (" + configs[0].capacidade + "Mhz)");
        System.out.println("Memória RAM: " + configs[1].capacidade + "Gb");
        System.out.println("HD: " + configs[2].capacidade + "Gb");
        System.out.println("Sistema operacional: " + so.nome + " (" + so.tipo + " bits)");
        System.out.println("Acompanha: " + memoriaUSB.nome + " de " + memoriaUSB.capacidade + " Gb");
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;
    }
}
