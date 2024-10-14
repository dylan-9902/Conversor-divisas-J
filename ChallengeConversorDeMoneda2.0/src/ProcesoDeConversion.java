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

}
