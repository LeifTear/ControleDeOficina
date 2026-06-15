import java.util.Scanner;

public class Oficina {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        OficinaService oficina = new OficinaService();

        int opcao;

        do {

            System.out.println("Controle da Oficina");
            System.out.println("Selecione o procedimento");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Editar");
            System.out.println("5 - Excluir");
            System.out.println("0 - Sair");
            System.out.println("6 - Atualizar Status");

            opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {

                case 1:
                    oficina.cadastrar(scan);
                    break;

                case 2:
                    oficina.listar(scan);
                    break;

                case 3:
                    System.out.println("Selecione a opção de busca");
                    oficina.buscar(scan);
                    break;

                case 4:
                    oficina.editar(scan);
                    break;

                case 5:
                    oficina.excluir(scan);
                    break;
                case 6:
                    oficina.atualizarStatus(scan);
                    break;
                case 0:
                    System.out.println("Finalizando Programa");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        scan.close();
    }
}