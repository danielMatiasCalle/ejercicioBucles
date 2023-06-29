public class Main {
    public static void main(String[] args) {
        /*Usando un if, crear una condición que compare
        si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.*/

        int numeroIf= -6;
        if (numeroIf>0){
            System.out.println("es positivo");
        } else if (numeroIf==0) {
            System.out.println("es 0");
        }else{
            System.out.println("es negativo");
        }
        System.out.println("fin de ejercicio if");

       /* Crea un bucle While, este bucle tendrá que tener como condición
        que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
        Incrementar el valor de la variable en uno cada vez que se ejecute.
        Mostrarlo por pantalla cada vez que se ejecute.*/

        int numeroWhile=0;
       while (numeroWhile<3){
            System.out.println("el numeroWile = "+numeroWhile);
            numeroWhile++;
        }
       System.out.println("fin del ejercicio while");

        /*Para el bucle Do While,
         deberás crear la misma estructura que en el While,
        pero solo se debe ejecutar una vez.*/

        numeroWhile=2;//cambio de valor de variable para cumplir con la condicion de ejecutar 1 sola vez
        do {
            System.out.println("el numeroDoWhile = "+numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);
        System.out.println("fin de ejercicio do while");

        /*Para el bucle For, crea una variable numeroFor,
         esta variable tendrá como valor 0
        y su condición será que la variable sea igual o menor que 3,
         se irá incrementando en 1 su valor cada vez que se ejecute
        y deberá mostrarse por pantalla.*/

        int numeroFor=0;
        for (numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println("el numeroFor = "+numeroFor);
        }
        System.out.println("fin de ejercicio for");

        /*Por último, para el Switch,
        deberás crear la variable estacion,
        y distintos case para las cuatro estaciones del año.
        Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola
        informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.*/

        String estacion="Primavera";

        switch (estacion){
            case "Verano":
            case "Primavera":
            case "Otono":
            case "Invierno":
            System.out.println("la estacion es = "+estacion);
            break;
            default:
                System.out.println("la variable no es una estacion");
        }
        System.out.println("fin de ejercicio swhitch");
    }
}