
package modelo;

public class ExibeMinusculo implements Exibidor{
    @Override
     public void exibidor(String palavra){
         System.out.println(palavra + " exibido");
     }
}
