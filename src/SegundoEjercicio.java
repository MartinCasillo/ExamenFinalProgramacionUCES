public class SegundoEjercicio{
    public static void main(String[] args){
        int[] enteros = {1,2,3,4,5,6,7,8};

        int contador = 0;

        for(int i = 0;i < enteros.length;i++){
                contador += enteros[i];
        }


        System.out.println("La suma total de los enteros es : " + contador);
    }
}