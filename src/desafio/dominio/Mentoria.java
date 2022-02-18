package desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

   private LocalDate data;

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public Mentoria setData(LocalDate data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
