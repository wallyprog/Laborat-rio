
package modelo;
public class ExibeMaiusculo  implements Exibidor{
     @Override
     public void exibidor(String palavra){
         System.out.println(palavra +" EXIBIDO");
     }
}
