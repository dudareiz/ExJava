public class acumulador {
    public static void main(String[]args){
        int contador= 0;
        int acumulador= 0;
     while (contador<= 100) {

        acumulador = acumulador + contador; 
        contador++;
        System.out.println(contador -1 + "");

      }
     System.out.println("A soma é " + acumulador);
    }
}