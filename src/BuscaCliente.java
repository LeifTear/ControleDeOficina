import java.util.ArrayList;

public class BuscaCliente {

    public DadosCliente buscarPorId(
            ArrayList<DadosCliente> dadosClientes,
            int id) {

        for (DadosCliente c : dadosClientes) {

            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public DadosCliente buscarPorNome(
            ArrayList<DadosCliente> dadosClientes,
            String nome) {

        for (DadosCliente c : dadosClientes) {

            if (c.getNome()
                    .equalsIgnoreCase(nome)) {

                return c;
            }
        }

        return null;
    }

    public DadosCliente buscarPorPlaca(
            ArrayList<DadosCliente> dadosClientes,
            String placa) {

        for (DadosCliente c : dadosClientes) {

            if (c.getPlaca()
                    .equalsIgnoreCase(placa)) {

                return c;
            }
        }

        return null;
    }
}