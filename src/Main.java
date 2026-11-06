//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        public static void main (String[]args){
            System.out.println("---PERRO");
            Perro objPerro = new Perro();
            objPerro.comer();
            objPerro.emitirSonido();
            objPerro.setPatas(4);
            System.out.println("cuantas patas tiene? " + objPerro.getPatas());

            System.out.println("----GATO");
            Gato objGato = new Gato("Blacky");
            objGato.comerCarne();
            System.out.println("El nombre del gato es" + objGato.nombre);
        }
    }
}