public class PrimerEjercicio {
    public static void main(String[] args) {
        int numero = 1;

        while (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }else{
                System.out.println(numero + " no es primo");
            }
            numero++;
        }
    }
}
