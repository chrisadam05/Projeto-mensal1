public class Carro {
    private int Id;
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Carro(int id, String marca, String modelo, int ano, double preco) {
        Id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public int getId(){return Id;}
    public String getMarca(){return marca;}
    public  String getModelo(){return modelo;}
    public int getAno(){return ano;}
    public double getPreco(){return preco;}

    public void setId(int id) {Id = id;}
    public void setMarca(String marca) {this.marca = marca;}
    public  void setModelo(String modelo){this.modelo = modelo;}
    public void setAno(int ano){this.ano = ano;}
    public void setPreco(double preco){this.preco = preco;}

    @Override
    public String toString(){
        return  "Id : " + Id +
                "\nMarca : " + marca +
                "\nModelo : " + modelo +
                "\nAno : " + ano +
                "\nPreco : " + preco;
    }
}
