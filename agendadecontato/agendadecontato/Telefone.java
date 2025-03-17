package agendadecontato;
import java.util.ArrayList;

public class Telefone {
   private String telefone;
   private String rotulo;

   public Telefone (String telefone, String rotulo){
      this.telefone = telefone; 
      this.rotulo = rotulo;
   }

   public String getRotulo() {
       return rotulo;
   }

   public void setRotulo(String rotulo) {
       this.rotulo = rotulo;
   }

   public String getTelefone() {
       return telefone;
   }

   public void setTelefone(String telefone) {
       this.telefone = telefone;
   }

   @Override
   public String toString() {
       return this.telefone + " " + this.rotulo;
   }
}
