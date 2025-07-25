package ifsul.trabalho.too;

public class AvaliacaoFisica {
    private double peso;
    private double altura;

    public AvaliacaoFisica() {}

    public AvaliacaoFisica(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String exibirDados() {
        return "Peso: " + peso + " kg\nAltura: " + altura + " m";
    }
}
