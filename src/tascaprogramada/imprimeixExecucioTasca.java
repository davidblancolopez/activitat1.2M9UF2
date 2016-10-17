package tascaprogramada;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class imprimeixExecucioTasca implements Runnable {

    

    
    public imprimeixExecucioTasca() {
        
    }
    
    
    public void run() {
        //Declaració del calendar.
        Calendar calendario = new GregorianCalendar();
        
        //Creem un format per a mostrar la hora.
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        
        //Mostrem la hora amb el format anterior.
        System.out.println(" Hora: " + formatoHora.format(new Date()));
    }
    
     
    
}
