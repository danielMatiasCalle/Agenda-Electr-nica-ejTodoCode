/*
Momentaneamente solo creare la logica dentro del pakete de IGU y tambien su ejecutor.
para este ejerciciio.
Ejecucion en el modulo de Main principal.
 */
package AgendaElectronicaIgu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    String dnis[]=new String[10];
    String nombres[]=new String[10];
    String apellidos[]=new String[10];
    String direcciones[]=new String[10];
    String telefonos[]=new String[10];
    String fechaNac[]=new String[10];

    private JPanel SubPanel;
    private JTextField textDni;
    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textTelefono;
    private JTextField textFNac;
    private JButton btnAtras;
    private JButton btnGrabar;
    private JButton btnAdelante;
    private JTextField textIndice;
    private JTextField textDireccion;
    private JPanel MainPanel;

    public Principal() {
        btnAdelante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int indi=0;
                String indice=textIndice.getText();

                int indi=Integer.parseInt(indice);
                if (indi<9){

                    indi=indi+1;
                    indice=String.valueOf(indi);
                    textIndice.setText(indice);
                    //seteo en el boton de los arrays
                    textDni.setText(dnis[indi]);
                    textNombre.setText(nombres[indi]);
                    textApellido.setText(apellidos[indi]);
                    textDireccion.setText(direcciones[indi]);
                    textTelefono.setText(telefonos[indi]);
                    textFNac.setText(fechaNac[indi]);

                };
            };
        });
        btnAtras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //int indi=0;
                String indice=textIndice.getText();

                int indi=Integer.parseInt(indice);
                if (indi>0){//si el indice es mayor a 0 que ejecute la condicion de decrecer
                    //solo llega a 0 por que si es menor a 0 no ejecuta la condicion de decrecimiento
                    //y solo hasta 9 por que si no, no ejectuta la condicion de crecimiento

                    indi=indi-1;//decrecimiento
                    indice=String.valueOf(indi);
                    textIndice.setText(indice);
                    //seteo en el boton de los arrays
                    textDni.setText(dnis[indi]);
                    textNombre.setText(nombres[indi]);
                    textApellido.setText(apellidos[indi]);
                    textDireccion.setText(direcciones[indi]);
                    textTelefono.setText(telefonos[indi]);
                    textFNac.setText(fechaNac[indi]);

                };
            }
        });
        btnGrabar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String indice=textIndice.getText();
                int indi=Integer.parseInt(indice);
                dnis[indi]=textDni.getText();
                nombres[indi]=textNombre.getText();
                apellidos[indi]=textApellido.getText();
                direcciones[indi]=textDireccion.getText();
                telefonos[indi]=textTelefono.getText();
                fechaNac[indi]=textFNac.getText();

            }
        });
    }

    public static void main() {//se crea con el generator (click derecho)
        //pero tener en cuenta nombrar el Jpanel general como MainPanel para que sea el pto de entrada.
        JFrame frame = new JFrame("Principal");//archivo de ejecucuin.
        frame.setContentPane(new Principal().MainPanel);//punto de entrada a la ejecucion.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);//posicion visible en pantalla, en el medio
        frame.setResizable(false);//que no pueda modificarse el tamaño de la ventana manualmente
        frame.setVisible(true);
    }

}

