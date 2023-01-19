import com.sun.source.util.SourcePositions;

import java.net.SocketOption;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {
        PairNumbersBetween();

    }

    public void ejercicio1() {
        System.out.print("Ingresa el nombre de usuario: ");
        Scanner capt = new Scanner(System.in);
        String a = capt.next();

        System.out.print("Ingresa el nom d'un artista preferit: ");
        String b = capt.next();

        System.out.print("IUn hobby loquete: ");
        String c = capt.next();

        System.out.print("L'artista és: " + a);
        System.out.print("");
    }

    public static void ejercicio2() {
        //Fes un programa que llegeix un nombre n i escriu tots els nombres entre 0 i n.
        System.out.print("Ingresa el número: ");
        Scanner number = new Scanner(System.in);

        int n = number.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(i);
        }


    }
    public static void ejercicio2_B(){
        Scanner capt = new Scanner(System.in);
        System.out.print("Escribe el número donde se inicia la cuenta: ");
        int m = capt.nextInt();

        System.out.print("Escribe el número hasta que quieras contar: ");
        int n = capt.nextInt();

        if (m <= n){
            for (int i = m; i <= n; i++) {
                System.out.println(i);
            }
        }else{
            for (int i = m; i >= n; i--) {
                System.out.println(i);
            }
        }
    }


    public static void ejercicio3() {
        ArrayList<Integer> lloc = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            lloc.add(i);
        }

        for (Integer lloc2 : lloc) {
            if (lloc.indexOf(lloc2) == lloc.size() - 1) {
                System.out.println(lloc2);
            } else {
                System.out.print(lloc2 + ", ");
            }
        }
    }



    public static void ejercicio4() {
        while (true) {
            System.out.print("Escribe un numero ");
            Scanner capt = new Scanner(System.in);
            int n = capt.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(n);
                }
                System.out.println();
            }
        }

    }
    public static Boolean ejercicio5 (Integer n) {

        for (int i = 2; i <= n -1 ; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void ejercicio5_b (Integer k){

        for (int i = 1; i <= k; i++){

            if (ejercicio5(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean ejercicio6(List<Integer> marcel, List<Integer> marcel2) {
        /*Implementa una funció que digui si dues llistes són idèntiques element a element*/

        for (int i = 0;i< marcel.size(); i++){
            if (!marcel.get(i).equals(marcel2.get(i))){
                return false;
            }

        }
        return true;

    }

    public static void Maximnombre(){
        System.out.print("Primer número: ");
        Scanner readnumber = new Scanner(System.in);
        int numero1 = Integer.parseInt(readnumber.next());

        System.out.println("Segon número: ");
        int numero2 = Integer.parseInt(readnumber.next());

        System.out.println("Tercer número: ");
        int numero3 = Integer.parseInt(readnumber.next());
        int numeromesgran = 0;
        if (numero1 > numero2 && numero1 > numero3){
            numeromesgran = numero1;
        }else if (numero2 > numero1 && numero2 > numero3 ){
            numeromesgran = numero2;
        } else if (numero3 > numero2 && numero3 > numero1){
            numeromesgran = numero3;
        }
        System.out.println("El número més gran és: " + numeromesgran);
    }

    public static void mesa_de_multiplicatis (){

        //Fes un programa que llegeix un nombre n i escriu la taula de multiplicar de n.
        System.out.print("Tabla de multiplicar del número: ");
        Scanner readnumber = new Scanner(System.in);
        int numero1 = Integer.parseInt(readnumber.next());

        for (int i = 0; i > 10; i++){
            System.out.println(i + " x "+ numero1 +" = "+ i * numero1);
        }


    }
    public static void Calcula_Nota (){
        System.out.print("Digues la nota: ");
        Scanner readnumber = new Scanner(System.in);
        int numero1 = Integer.parseInt(readnumber.next());

        if (numero1 < 5){
            System.out.println("Has supès");
        }else if(numero1 > 5 && numero1 < 8){
            System.out.println("Has tret un Bé");
        }else if (numero1 > 8 ){
            System.out.println("Hoas tret un excel lent");
        }
    }
    public static void PairNumbersBetween (){
        System.out.print("Posa un número: ");
        Scanner readnumber = new Scanner(System.in);
        int nombre = Integer.parseInt(readnumber.next());

        for (int u = 0; u < nombre; u++){
            if (u % 2 == 0){
                System.out.println(u);
            }
        }
    }
}
