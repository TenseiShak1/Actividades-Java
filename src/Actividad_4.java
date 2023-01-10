import java.util.Scanner;
import java.util.Random;
public class Actividad_4 {
    public static void main(String[]args){
        Scanner data = new Scanner(System.in);
        Random random = new Random();

        int filas , columnas; double sumatoria_1=0, sumatoria_2=0;
        System.out.println("Digite el numero de filas y columnas deseado:");
        filas = data.nextInt();columnas = data.nextInt();

        int[][] matrix = new int [filas][columnas];
        for (int i = 1 ; i < filas; i++){
            for (int j =1; j< columnas; j++){
                matrix [i][j]= random.nextInt(-100,100);
                sumatoria_1 = sumatoria_1 + matrix[i][j];
                if (matrix[i][j]<0){
                    System.out.println("El elemento ["+i+"],["+j+"] = "+matrix[i][j]);
                    matrix[i][j] = 0;
                    System.out.println("El elemento es negativo sera igual a "+matrix[i][j]);
                }else {
                    System.out.println("El elemento ["+i+"],["+j+"] = "+matrix[i][j]);
                    matrix[i][j] = 5;
                    sumatoria_2 = sumatoria_2 + matrix[i][j];
                    System.out.println("El elemento es positivo sera igual a "+matrix[i][j]);
                }
            }
        }
        System.out.println("Sumatoria de elementos no cambiados: "+ sumatoria_1);
        System.out.println("Sumatoria de elementos cambiados: "+ sumatoria_2);
    }
}
