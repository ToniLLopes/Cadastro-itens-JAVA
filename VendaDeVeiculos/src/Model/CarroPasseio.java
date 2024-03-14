/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author 10723114768
 */
public class CarroPasseio extends Veiculo {
    String Cor;
    String Modelo;

    public CarroPasseio() {
    }

    public CarroPasseio(String Cor, String Modelo) {
        this.Cor = Cor;
        this.Modelo = Modelo;
    }

    public CarroPasseio(String Cor, String Modelo, int peso, int velocMax, double preco) {
        super(peso, velocMax, preco);
        this.Cor = Cor;
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }


}
