import java.util.Scanner;
public class Actividad_1 {
    /*Funcion de horas totales*/
    public static int horas_totales(int horas_trabajadas, int bonificador){
        int horas;horas =horas_trabajadas*bonificador;
        return horas;
    }
    /*--------------*/
    public static void main (String[] args){
        Scanner data = new Scanner (System.in);
        /*Zona de variables*/
        int horas_trabajadas, valor_por_hora = 50;
        int sueldo_empleado;
        /*--------------*/
        /*toma de datos*/
        System.out.println("Ingrese las horas trabajadas: " ); horas_trabajadas = data.nextInt();
        /*--------------*/
        /*Zona de control de datos*/
        if (horas_trabajadas >= 45 && horas_trabajadas <=50){             /*Pimera condición*/
            System.out.println("Teniendo en cuenta el valor de $"+valor_por_hora+" se determindo su sueldo,");
            sueldo_empleado = (horas_totales(horas_trabajadas,2))*valor_por_hora;
            System.out.println("\nSu sueldo es de $"+sueldo_empleado);
        } else if (horas_trabajadas >50 && horas_trabajadas<=60) {        /*Segunda condición*/
            System.out.println("Teniendo en cuenta el valor de $"+valor_por_hora+" se determindo su sueldo,");
            sueldo_empleado = (horas_totales(horas_trabajadas,3))*valor_por_hora;
            System.out.println("\nSu sueldo es de $"+sueldo_empleado);
        } else if (horas_trabajadas >60 ) {                               /*Tercera condición*/
            System.out.println("Horas laborales sobrepasadas se le consedera un permiso de 2 dias para descansar");
        }else{ /*En caso que ninguna condición se cumpla*/
            System.out.println("Teniendo en cuenta el valor de $"+valor_por_hora+" se determindo su sueldo,");
            sueldo_empleado = (horas_totales(horas_trabajadas,1))*valor_por_hora;
            System.out.println("\nSu sueldo es de $"+sueldo_empleado);
        }
        /*--------------*/
    }
}