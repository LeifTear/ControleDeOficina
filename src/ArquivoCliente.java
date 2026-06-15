import java.io.*;
import java.util.ArrayList;

public class ArquivoCliente {

    private static final String ARQUIVO = "clientes.txt";

    public static void salvar(ArrayList<DadosCliente> dadosClientes) {

        try (BufferedWriter buffwriter =
                     new BufferedWriter(
                             new FileWriter(ARQUIVO))) {

            for (DadosCliente c : dadosClientes) {

                buffwriter.write( c.getId() + ";" +
                                c.getNome() + ";" +
                                c.getTelefone() + ";" +
                                c.getPlaca() + ";" +
                                c.getModelo() + ";" +
                                c.getAno() + ";" +
                                c.getObservacao() + ";" +
                                c.getDataCadastro() + ";" +
                                c.getStatus()
                );

                buffwriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar.");
        }
    }

    public static ArrayList<DadosCliente> carregar() {

        ArrayList<DadosCliente> dadosClientes =
                new ArrayList<>();

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return dadosClientes;
        }

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(ARQUIVO))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados =
                        linha.split(";");

                DadosCliente dadosCliente =
                        new DadosCliente(
                                Integer.parseInt(dados[0]),
                                dados[1],
                                dados[2],
                                dados[3],
                                dados[4],
                                dados[5],
                                dados[6],
                                dados[7],
                                dados[8]
                        );

                dadosClientes.add(dadosCliente);
            }

        } catch (IOException e) {

            System.out.println("Erro ao carregar.");
        }

        return dadosClientes;
    }
}