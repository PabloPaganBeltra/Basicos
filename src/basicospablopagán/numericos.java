package basicospablopagán;
public class numericos {
   public static void numericos() {
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        entero = 10;
        doble = 5.6;

        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
        
        if (entero < doble){
            System.out.print("El valor de "+entero+" es mayor que el valor de doble "+doble+".");
        }else{
            System.out.print("El valor es menor");
        }
    }
}
