import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Carro> carros = new ArrayList<>();

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public void listarCarro() {
        for (Carro c : carros) {
            System.out.println(c);
        }
    }

    public boolean atualizarCarro(int id, String marca, String modelo, int ano, double preco) {
        for (Carro c : carros) {
            if (c.getId() == id) {
                c.setMarca(marca);
                c.setModelo(modelo);
                c.setAno(ano);
                c.setPreco(preco);
                return true;
            }
        }
        return false;
    }

    public boolean removerCarro(int id) {
        return carros.removeIf(c -> c.getId() == id);
    }

    public void buscarPorId(int id) {
        for (Carro c : carros) {
            if (c.getId() == id) {
                System.out.println(c);
            }
        }
    }
    public void buscarPorMarca(String marca) {
        for (Carro c : carros) {
            if (c.getMarca().equalsIgnoreCase(marca)) {
                System.out.println(c);
            }
        }
    }
    public void buscarPorModelo(String modelo) {
        for (Carro c : carros) {
            if (c.getMarca().equalsIgnoreCase(modelo)) {
                System.out.println(c);
            }
        }
    }
    public void buscarPorAno(int ano) {
        for (Carro c : carros) {
            if (c.getAno() == ano) {
                System.out.println(c);
            }
        }
    }
    public void buscarPorPreco(double preco) {
        for (Carro c : carros) {
            if (c.getPreco() == preco) {
                System.out.println(c);
            }
        }
    }
}
