import java.util.ArrayList;
import java.util.Scanner;

public class OficinaService {

    private ArrayList<Cliente> clientes;
    private BuscaCliente busca;

    public OficinaService() {

        clientes =
                ArquivoCliente.carregar();

        busca = new BuscaCliente();
    }

    public void cadastrar(Scanner scan) {

        int id = clientes.size() + 1;

        System.out.println("Nome:");
        String nome = scan.nextLine();

        System.out.println("Telefone:");
        String telefone = scan.nextLine();

        System.out.println("Placa:");
        String placa = scan.nextLine();

        System.out.println("Modelo:");
        String modelo = scan.nextLine();

        System.out.println("Cor:");
        String cor = scan.nextLine();

        System.out.println("Observação:");
        String obs = scan.nextLine();

        Cliente cliente =
                new Cliente(
                        id,
                        nome,
                        telefone,
                        placa,
                        modelo,
                        cor,
                        obs
                );

        clientes.add(cliente);

        ArquivoCliente.salvar(clientes);

        System.out.println("Cliente cadastrado.");
    }

    public void listar() {

        for (Cliente c : clientes) {

            System.out.println(c);
            System.out.println("----------------");
        }
    }

    public void buscar(Scanner scan) {

        System.out.println("1 - Buscar por ID");
        System.out.println("2 - Buscar por Nome");
        System.out.println("3 - Buscar por Placa");

        int op = scan.nextInt();
        scan.nextLine();

        Cliente cliente = null;

        switch (op) {

            case 1:

                System.out.println("ID:");
                int id = scan.nextInt();
                scan.nextLine();

                cliente =
                        busca.buscarPorId(
                                clientes,
                                id);

                break;

            case 2:

                System.out.println("Nome:");

                cliente =
                        busca.buscarPorNome(
                                clientes,
                                scan.nextLine());

                break;

            case 3:

                System.out.println("Placa:");

                cliente =
                        busca.buscarPorPlaca(
                                clientes,
                                scan.nextLine());

                break;
        }

        if (cliente != null) {

            System.out.println(cliente);

        } else {

            System.out.println(
                    "Cliente não encontrado.");
        }
    }

    public void editar(Scanner scan) {

        System.out.println("ID:");

        int id = scan.nextInt();
        scan.nextLine();

        Cliente cliente =
                busca.buscarPorId(
                        clientes,
                        id);

        if (cliente == null) {

            System.out.println(
                    "Cliente não encontrado.");

            return;
        }

        System.out.println("Novo nome:");
        cliente.setNome(scan.nextLine());

        System.out.println("Novo telefone:");
        cliente.setTelefone(scan.nextLine());

        System.out.println("Nova observação:");
        cliente.setObservacao(
                scan.nextLine());

        ArquivoCliente.salvar(clientes);

        System.out.println("Atualizado.");
    }

    public void excluir(Scanner scan) {

        System.out.println("ID:");

        int id = scan.nextInt();
        scan.nextLine();

        Cliente cliente =
                busca.buscarPorId(
                        clientes,
                        id);

        if (cliente == null) {

            System.out.println(
                    "Cliente não encontrado.");

            return;
        }

        clientes.remove(cliente);

        ArquivoCliente.salvar(clientes);

        System.out.println("Excluído.");
    }
}