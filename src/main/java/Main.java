import java.util.Scanner;
//EJERCICIO 2 DAVID CALERO GALVÁN
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("BIENVENIDO\n¿DESEA JUGAR A LOS DADOS? 0 SI | 1 NO");
        if(in.nextInt()==0){
            boolean seguir=true;
            JuegoDeDados miJuego = new JuegoDeDados();

            while (seguir){
                miJuego.jugar();
                System.out.println("¿DESEA SEGUIR JUGANDO? 0 SI | 1 NO");
                if(in.nextInt()==1)seguir=false;
            }
            System.out.println("NUMERO DE PARTIDAS JUGADAS: "+miJuego.pJugadas);
            System.out.println("NUMERO DE PARTIDAS GANADAS: "+miJuego.pGanadas);
            System.out.println("NUMERO DE PARTIDAS PERDIDAS: "+miJuego.pPerdidas);
            System.out.println("GRACIAS POR JUGAR.");
        }
        else{
            System.out.println("YA JUGARÁS OTRA VEZ.");
        }

    }


}
