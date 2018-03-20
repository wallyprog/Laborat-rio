
package modelo;
public class Exibe {
    public void exibeContando(Exibidor exibidor,String palavra){
        exibidor.exibidor(palavra);
    }
    public static void main(String[] args) {
        Exibidor exibido = new ExibeMaiusculo();
        Exibidor exibido2 = new ExibeMinusculo();
        
        Exibe exibe = new Exibe();
        exibe.exibeContando(exibido, " aaah ");
    }
}
