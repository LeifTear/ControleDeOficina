import java.io.*;
import java.util.ArrayList;

public class ArquivoCliente {

    private static final String ARQUIVO = "clientes.txt";

    public static void salvar(ArrayList<Cliente> clientes) {

        try (BufferedWriter bw =
                     new BufferedWriter(
                             new FileWriter(ARQUIVO))) {

            for (Cliente c : clientes) {

                bw.write(
                        c.getId() + ";" +
                                c.getNome() + ";" +
                                c.getTelefone() + ";" +
                                c.getPlaca() + ";" +
                                c.getModelo() + ";" +
                                c.getCor() + ";" +
                                c.getObservacao()
                );

                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Erro ao salvar.");
        }
    }

    public static ArrayList<Cliente> carregar() {

        ArrayList<Cliente> clientes =
                new ArrayList<>();

        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists()) {
            return clientes;
        }

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(ARQUIVO))) {

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados =
                        linha.split(";");

                Cliente cliente =
                        new Cliente(
                                Integer.parseInt(dados[0]),
                                dados[1],
                                dados[2],
                                dados[3],
                                dados[4],
                                dados[5],
                                dados[6]
                        );

                clientes.add(cliente);
            }

        } catch (IOException e) {

            System.out.println("Erro ao carregar.");
        }
        return clientes;
    }

}