import java.util.Scanner;

public class ProcesoDeConversion {

    //el "static" ayuda a que clase (convertir), sea llamada en otras clases for ex, la clase principal.
    public static void convertir(String monedaLocal, String monedaObjetivo, ConsultarValorAPI consulta, Scanner lectura){
        double cantidad;
        double cantidadAConvertir;

        InfoMonedas monedas = consulta.buscarMoneda(monedaLocal, monedaObjetivo);
        System.out.println("La tasa de conversion para hoy\n1 "+monedaLocal+" "+monedas.conversion_rate()+" "+
                monedaObjetivo);
        System.out.println("Ingrese la cantidad de "+monedaLocal);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadAConvertir = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaLocal+" = "+cantidadAConvertir+" "+monedas.target_code());
    }
    //vamos a hacer otra sección aca para que el conversor se adapte a las necesidades del usuario
    public static void convertirAOtrasMonedas(ConsultarValorAPI consultar, Scanner lectura){
        System.out.println("Ingrse la nomenclatura de la moneda actual y/o base: ");
        String monedaLocal = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la nomenclatura de la moneda que desea hacer la conversion: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaLocal, monedaObjetivo, consultar, lectura);
    }
}
