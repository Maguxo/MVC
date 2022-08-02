package reto5;
import vista.vista;
import controlador.Facade;
public class main {


public static void main(String Args[]){

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista vis= new vista();
                Facade f= new Facade(vis);
                vis.setVisible(true);
                vis.setResizable(false);
                //new vista().setVisible(true);
            }
        });
    }


  
}
