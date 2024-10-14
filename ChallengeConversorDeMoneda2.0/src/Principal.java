import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarValorAPI consulta = new ConsultarValorAPI();

        int opcion = 0;
        while (opcion != 5){
            System.out.println("""
                    *******************************************\n
                    1. Dollar americano a Peso Colombiano
                    2. Peso Colombiano a Dollar Americano
                    3. Dollar Americano a Real Brasileño
                    4. Real Brasileño a Dollar Americano
                    5. Salir
                    \n******************************************
                    """);
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ProcesoDeConversion.convertir ("USD", "COP", consulta, lectura);
                    break;
                case 2:
                    ProcesoDeConversion.convertir("COP","USD", consulta, lectura);
                    break;
                case 3:
                    ProcesoDeConversion.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    ProcesoDeConversion.convertir("BRL","USD", consulta, lectura);
                    break;
                case 5:
                    System.out.println("OK, GUMP, Sliendo......");

                default:
                    System.out.println("esa  mierda no existe en este programa");
                    break;

            }
        }

    }
}
