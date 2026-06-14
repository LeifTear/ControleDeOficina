import java.util.ArrayList;
import java.util.Scanner;

public class OficinaService {

    private ArrayList<DadosCliente> dadosClientes;
    private BuscaCliente busca;

    public OficinaService() {

        dadosClientes =
                ArquivoCliente.carregar();

        busca = new BuscaCliente();
    }
    private int gerarNovoId() {

        int maiorId = 0;

        for (DadosCliente cliente : dadosClientes) {

            if (cliente.getId() > maiorId) {

                maiorId = cliente.getId();
            }
        }

        return maiorId + 1;
    }
    public void cadastrar(Scanner scan) {

        int id = gerarNovoId();

        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Telefone:");
        String telefone = scan.nextLine();

        System.out.println("Placa:");
        String placa = scan.nextLine();

        System.out.println("Modelo:");
        String modelo = scan.nextLine();

        System.out.println("Ano:");
        String cor = scan.nextLine();

        System.out.println("Observação/Ordem de serviço:");
        String obs = scan.nextLine();

        DadosCliente dadosCliente =
                new DadosCliente(
                        id,
                        nome,
                        telefone,
                        placa,
                        modelo,
                        cor,
                        obs
                );

        dadosClientes.add(dadosCliente);

        ArquivoCliente.salvar(dadosClientes);

        System.out.println("Cliente cadastrado.");
    }

    public void listar() {

        for (DadosCliente c : dadosClientes) {

            System.out.println(c);
        }
    }

    public void buscar(Scanner scan) {

        System.out.println("1 - Buscar por ID");
        System.out.println("2 - Buscar por Nome");
        System.out.println("3 - Buscar por Placa");

        int op = scan.nextInt();
        scan.nextLine();

        DadosCliente dadosCliente = null;

        switch (op) {

            case 1:

                System.out.println("ID:");
                int id = scan.nextInt();
                scan.nextLine();

                dadosCliente =
                        busca.buscarPorId(
                                dadosClientes,
                                id);

                break;

            case 2:

                System.out.println("Nome:");

                dadosCliente =
                        busca.buscarPorNome(
                                dadosClientes,
                                scan.nextLine());

                break;

            case 3:

                System.out.println("Placa:");

                dadosCliente =
                        busca.buscarPorPlaca(
                                dadosClientes,
                                scan.nextLine());

                break;
        }

        if (dadosCliente != null) {

            System.out.println(dadosCliente);

        } else {

            System.out.println(
                    "Cliente não encontrado.");
        }
    }

    public void editar(Scanner scan) {

        System.out.println("ID:");

        int id = scan.nextInt();
        scan.nextLine();

        DadosCliente dadosCliente =
                busca.buscarPorId(
                        dadosClientes,
                        id);

        if (dadosCliente == null) {

            System.out.println(
                    "Cliente não encontrado.");

            return;
        }
        System.out.println("Oque você quer editar?");
        System.out.println("Nome - 1");
        System.out.println("Telefone - 2");
        System.out.println("Observação - 3");
        System.out.println("Placa - 4");
        System.out.println("Modelo - 5");
        System.out.println("Ano - 6");
        System.out.println("Status - 7");
        int edicao = scan.nextInt();
        scan.nextLine();
        switch (edicao) {
            case 1:
                System.out.println("Novo nome:");
                dadosCliente.setNome(scan.nextLine());

                break;
            case 2:
                System.out.println("Novo telefone:");
                dadosCliente.setTelefone(scan.nextLine());
                break;
            case 3:
                System.out.println("Nova observação:");
                dadosCliente.setObservacao(scan.nextLine());
                break;
            case 4:
                System.out.println("Nova Placa:");
                dadosCliente.setPlaca(scan.nextLine());
                break;
            case 5:
                System.out.println("Novo Modelo:");
                dadosCliente.setModelo(scan.nextLine());
                break;

            case 6:
                System.out.println("Novo Ano");
                dadosCliente.setAno(scan.nextLine());
                break;
            case 7:
                System.out.println("Status");
                dadosCliente.setStatus(scan.nextLine());
        }






        ArquivoCliente.salvar(dadosClientes);

        System.out.println("Atualizado");
    }

    public void excluir(Scanner scan) {

        System.out.println("ID:");

        int id = scan.nextInt();
        scan.nextLine();

        DadosCliente dadosCliente =
                busca.buscarPorId(
                        dadosClientes,
                        id);

        if (dadosCliente == null) {

            System.out.println(
                    "Cliente não encontrado.");

            return;
        }

        dadosClientes.remove(dadosCliente);

        ArquivoCliente.salvar(dadosClientes);

        System.out.println("Excluído.");
    }
}