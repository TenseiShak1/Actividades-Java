public class Actividad_5 {
    public static void main(String[]args){
        double operador_exponencial=1,sumatoria = 0;
        for(int i = 1; i <=365; i++){
            operador_exponencial = operador_exponencial*3;
            sumatoria = sumatoria + operador_exponencial;
            System.out.println("Dia: "+i+" ahorro: $"+operador_exponencial);
        }
        System.out.println("ahorro total: $"+sumatoria);
    }
}
