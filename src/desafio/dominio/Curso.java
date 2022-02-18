package desafio.dominio;

public class Curso extends Conteudo{

   private int cargaHoraria;

   @Override
   public double calcularXP() {
      return XP_PADRAO * cargaHoraria;
   }

   public Curso() {
   }

   public int getCargaHoraria() {
      return cargaHoraria;
   }

   public Curso setCargaHoraria(int cargaHoraria) {
      this.cargaHoraria = cargaHoraria;
      return this;
   }

   @Override
   public String toString() {
      return "Curso{" +
              "titulo='" + getTitulo() + '\'' +
              ", descricao='" + getDescricao() + '\'' +
              ", cargaHoraria=" + cargaHoraria +
              '}';
   }


}
