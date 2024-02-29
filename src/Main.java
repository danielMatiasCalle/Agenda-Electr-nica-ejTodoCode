
import AgendaElectronicaIgu.Principal;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Principal princ=new Principal();//crear-trae la clase Principal donde se encuentra el IGU
        princ();//ejecucion del IGU

    }
    private static void princ() {
       Principal.main();//crear el punto de acceso a ejecutar el IGU
    }
}