public class Dado {
        int resultado;

        public void tirar(){
            resultado=(int) (Math.random() * 6) + 1;

        }

        public void imprimir(){
            System.out.println(resultado+" ");
        }

        public void imprimir3D(){
            System.out.println("._ _.");

            System.out.println("| "+this.resultado+" |");

            System.out.println(".---.");
        }

        public int getValor(){
            return resultado;
        }
    }

