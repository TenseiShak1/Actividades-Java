import java.sql.SQLOutput;
import java.util.Scanner;

public class Actividad_3 {
    public static void control(double ingresos, double porcenteaje_productor_1, double porcenteaje_productor_2){
        double utilidades = 0, costos_de_produccion=0;
        if(porcenteaje_productor_1>porcenteaje_productor_2){
            System.out.println("Productor 1");
            costos_de_produccion = ingresos*(0.8-porcenteaje_productor_1);
            utilidades = ingresos*(0.2+porcenteaje_productor_1);
        }else if (porcenteaje_productor_2>porcenteaje_productor_1) {
            System.out.println("Productor 2");
            costos_de_produccion = ingresos*(0.8-porcenteaje_productor_2);
            utilidades = ingresos*(0.2+porcenteaje_productor_2);
        }else{
            System.out.println("Los porcentajes son iguales reinicie el programa. ");
        }
        System.out.println("Costos de produccion total: "+costos_de_produccion);
        System.out.println("Gananica total: "+utilidades);

    }
    public static void main (String[] args){
        Scanner data = new Scanner (System.in);
        double ingresos, porcenteaje_productor1, porcenteaje_productor2;
        System.out.println("Digite los ingresos de ventas: ");
        ingresos = data.nextDouble();
        System.out.println("Digite el porcentaje de descuento del productor 1");
        porcenteaje_productor1 = data.nextDouble();
        System.out.println("Digite el porcentaje de descuento del productor 2");
        porcenteaje_productor2 = data.nextDouble();
        control(ingresos, porcenteaje_productor1,porcenteaje_productor2);
    }
}
