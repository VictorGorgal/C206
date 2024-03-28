import java.util.Scanner;

public class Main {
    static Computador[] computadoresDaPromocao = new Computador[3];

    public static void main(String[] args) {
        criarPromocoes();
        Cliente cliente = new Cliente();
        Scanner scanner = new Scanner(System.in);
        int menu;
        int computadoresComprados = 0;

        while (true){
            System.out.println("Digite 1 para adicionar o computador da marca Positivo ao carrinho");
            System.out.println("Digite 2 para adicionar o computador da marca Acer ao carrinho");
            System.out.println("Digite 3 para adicionar o computador da marca Vaio ao carrinho");
            System.out.println("Digite 0 para encerrar a compra");
            menu = scanner.nextInt();

            if (menu == 0) {
                // Usuário terminou a compra
                break;
            }

            if (!opcaoEhValida(menu)) {
                System.out.println("Valor inválido, tente novamente");
                continue;
            }

            cliente.carrinhoCompras[computadoresComprados] = computadoresDaPromocao[menu-1];
            computadoresComprados++;
        }

        System.out.println("\n\n\n\n");
        System.out.println("----- Compra finalizada -----");
        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("CPF do cliente: " + cliente.cpf);
        System.out.println("----- Produtos -----");

        for (Computador computador : cliente.carrinhoCompras) {
            if (computador == null) {
                break;
            }

            computador.mostraPCConfigs();
            System.out.println("-----------------------");
        }

        System.out.println("----- Valor da compra ------");
        System.out.println("R$" + cliente.CalcularTotalCompra());
    }

    private static void criarPromocoes() {
        SistemaOperacional so = new SistemaOperacional("Linux Ubuntu", 32);
        HardwareBasico processador = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico memoriaRam = new HardwareBasico("Memória RAM", 8);
        HardwareBasico hd = new HardwareBasico("HD", 500);
        MemoriaUSB memoriaUSB = new MemoriaUSB("Pen-drive", 16);
        HardwareBasico[] configs = new HardwareBasico[]{processador, memoriaRam, hd};
        Computador computador = new Computador("Positivo", 3300, configs, so);
        computador.addMemoriaUSB(memoriaUSB);
        computadoresDaPromocao[0] = computador;

        so = new SistemaOperacional("Windows 8", 64);
        processador = new HardwareBasico("Pentium Core i5", 3370);
        memoriaRam = new HardwareBasico("Memória RAM", 16);
        hd = new HardwareBasico("HD", 1000);
        memoriaUSB = new MemoriaUSB("Pen-drive", 32);
        configs = new HardwareBasico[]{processador, memoriaRam, hd};
        computador = new Computador("Acer", 8800, configs, so);
        computador.addMemoriaUSB(memoriaUSB);
        computadoresDaPromocao[1] = computador;

        so = new SistemaOperacional("Windows 10", 64);
        processador = new HardwareBasico("Pentium Core i7", 4500);
        memoriaRam = new HardwareBasico("Memória RAM", 32);
        hd = new HardwareBasico("HD", 2000);
        memoriaUSB = new MemoriaUSB("HD Externo", 1000);
        configs = new HardwareBasico[]{processador, memoriaRam, hd};
        computador = new Computador("Vaio", 4800, configs, so);
        computador.addMemoriaUSB(memoriaUSB);
        computadoresDaPromocao[2] = computador;
    }

    private static boolean opcaoEhValida(int opcao) {
        if (opcao <= 0) {
            return false;
        }

        if (opcao > computadoresDaPromocao.length) {
            return false;
        }

        return true;
    }
}
