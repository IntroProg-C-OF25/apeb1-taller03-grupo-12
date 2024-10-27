public class Ejercicio7 {
public static void main(String[] args) {
        
        
    boolean a = ((Math.sqrt(81) + 9) / 3) == 9;
    boolean b = 10>1;
    boolean c = (100/25) >= Math.sqrt(100);
    
    boolean resultado = a || b && c;
        System.out.println(resultado);
    }
    
}