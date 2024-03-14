
package Model;

public class Caminhao extends Veiculo {
    int pesoMax;
    int aMax;
    int Comprimento;

    public Caminhao() {
    }

    public Caminhao(int pesoMax, int aMax, int Comprimento) {
        this.pesoMax = pesoMax;
        this.aMax = aMax;
        this.Comprimento = Comprimento;
    }

    public Caminhao(int pesoMax, int aMax, int Comprimento, int peso, int velocMax, double preco) {
        super(peso, velocMax, preco);
        this.pesoMax = pesoMax;
        this.aMax = aMax;
        this.Comprimento = Comprimento;
    }

    public int getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(int pesoMax) {
        this.pesoMax = pesoMax;
    }

    public int getaMax() {
        return aMax;
    }

    public void setaMax(int aMax) {
        this.aMax = aMax;
    }

    public int getComprimento() {
        return Comprimento;
    }

    public void setComprimento(int Comprimento) {
        this.Comprimento = Comprimento;
    }

    
    
    }
    
    

