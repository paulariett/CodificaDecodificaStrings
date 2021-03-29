package Codificadores;

public class Codifica18201036 implements Codifica {

    @Override
    public String codifica(String str) {
        String codificada = str.replaceAll("A", "4").replaceAll("I", "1").replaceAll("O", "0").replaceAll("B", "8");
        return codificada;
    }

    @Override
    public String decodifica(String str) {
        String decodificada = str.replaceAll("4", "A").replaceAll("1", "I").replaceAll("0", "O").replaceAll("8", "B");
        return decodificada;
    }

    @Override
    public String getMatriculaAutor() {
        return "18201036";
    }

    @Override
    public String getNomeAutor() {
        return "Paula Riett";
    }

}