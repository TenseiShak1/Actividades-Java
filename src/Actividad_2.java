import java.util.Scanner;
public class Actividad_2 {
    public static int menu_princial(){
        Scanner data = new Scanner(System.in);
        int opcion;
        System.out.println( """
                        */*/*//*/*//*//*/*
                            Sucursales   \s
                         1- Santa Marta  \s
                         2- Bogota       \s
                         3- Cali         \s
                         4- Villavicencio\s
                         5- Salir       \s
                        """
        );opcion = data.nextInt(); return opcion;
    }
    public static void calculos (double ingresos_de_la_sucursal, double porcentaje_costos_de_produccion, double porcentaje_mano_de_obra, double porcentaje_procesos_logisticos, double porcentaje_gastos_administrativos, double porcentaje_utilidades){
        double costos_de_produccion=ingresos_de_la_sucursal*porcentaje_costos_de_produccion;
        System.out.println("Costos de producción: "+costos_de_produccion);
        double mano_de_obra=ingresos_de_la_sucursal*porcentaje_mano_de_obra;
        System.out.println("Mano de obra: "+mano_de_obra);
        double procesos_logisticos=ingresos_de_la_sucursal*porcentaje_procesos_logisticos;
        System.out.println("Procesos logistivos: "+procesos_logisticos);
        double gastos_administrativos=ingresos_de_la_sucursal*porcentaje_gastos_administrativos;
        System.out.println("Gastos administrativos: "+gastos_administrativos);
        double utilidades=ingresos_de_la_sucursal*porcentaje_utilidades;
        System.out.println("Utilidades: "+utilidades);

    }
    public static void informacion(){
        Scanner data = new Scanner(System.in);
        double ingresos_de_la_sucursal;
        System.out.println("Digite los ingresos de la sucursal: ");
        ingresos_de_la_sucursal=data.nextDouble();
        if (ingresos_de_la_sucursal >= 0 &&  ingresos_de_la_sucursal < 85){ /*Primera Condicion*/
            calculos(ingresos_de_la_sucursal,0.37,0.20,0.15,0.10,0.18);
        }else if(ingresos_de_la_sucursal >= 85 && ingresos_de_la_sucursal < 150){
            calculos(ingresos_de_la_sucursal,0.30,0.20,0.15,0.10,0.25);
        }else if (ingresos_de_la_sucursal > 150){
            calculos(ingresos_de_la_sucursal,0.25,0.20,0.15,0.10,0.30);
        }
    }
    public static void main (String[] args){
        int opcion_del_menu;
        do {
            opcion_del_menu= menu_princial();
            switch (opcion_del_menu){
                case 1:
                    System.out.println("""
                            La sucursal de Santa Marta fue escogida:\s
                            /**************************************/\s
                                       Ingresos de datos            \s
                            """);
                    informacion();
                    System.out.println("Evaluacion termidada\n\n");
                    break;
                case 2:
                    System.out.println("""
                            La sucursal de Bogota fue escogida:\s
                            /**************************************/\s
                                       Ingresos de datos            \s
                            """);
                    informacion();
                    System.out.println("Evaluacion termidada\n\n");
                    break;
                case 3:
                    System.out.println("""
                            La sucursal de Cali fue escogida:\s
                            /**************************************/\s
                                       Ingresos de datos            \s
                            """);
                    informacion();
                    System.out.println("Evaluacion termidada\n\n");
                    break;
                case 4:
                    System.out.println("""
                            La sucursal de Villavicencio fue escogida:\s
                            /**************************************/\s
                                       Ingresos de datos            \s
                            """);
                    informacion();
                    System.out.println("Evaluacion termidada\n\n");

                    break;
                default:
                    if (opcion_del_menu == 5){
                        System.out.println("Se decidio no continuar.");
                    }else {
                        System.out.println("""
                                Presione cualquier tecla del 1 al 4 para continuar.\s
                                
                                Para salir presione la tecla 5.\s
                                """);
                    }
                    break;
            }
        }while(opcion_del_menu !=5);
    }

}
