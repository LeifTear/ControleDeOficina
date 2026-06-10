import java.util.ArrayList;

public class BuscaCliente {

    public Cliente buscarPorId(
            ArrayList<Cliente> clientes,
            int id) {

        for (Cliente c : clientes) {

            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }

    public Cliente buscarPorNome(
            ArrayList<Cliente> clientes,
            String nome) {

        for (Cliente c : clientes) {

            if (c.getNome()
                    .equalsIgnoreCase(nome)) {

                return c;
            }
        }

        return null;
    }

    public Cliente buscarPorPlaca(
            ArrayList<Cliente> clientes,
            String placa) {

        for (Cliente c : clientes) {

            if (c.getPlaca()
                    .equalsIgnoreCase(placa)) {

                return c;
            }
        }

        return null;
    }
}