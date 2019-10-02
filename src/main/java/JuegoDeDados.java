public class JuegoDeDados {

    Dado dado1;
    Dado dado2;
    Dado dado3;

    int pGanadas;
    int pPerdidas;
    int pJugadas;

    public JuegoDeDados() {
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
        pPerdidas=0;
        pJugadas=0;
        pGanadas=0;
    }

    public void jugar(){
        //tirar dados e imprimir dados
        dado1.tirar();
        System.out.println("Dado1: ");
        dado1.imprimir3D();
        dado2.tirar();
        System.out.println("Dado2: ");
        dado2.imprimir3D();
        dado3.tirar();
        System.out.println("Dado3: ");
        dado3.imprimir3D();

        //comprobar
        if (dado1.getValor()==dado2.getValor() && dado2.getValor()==dado3.getValor()){
            System.out.println("HAS GANADO");
            this.pGanadas++;
        }
        else{
            System.out.println("HAS PERDIDO");
            this.pPerdidas++;
        }

        pJugadas++;


    }
}
