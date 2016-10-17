package tascaprogramada;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class imprimeixExecucioTasca {

    

    
    public imprimeixExecucioTasca() {
        
    }
    
    
    public void run() {
        Calendar calendario = new GregorianCalendar();
        
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        System.out.println(Thread.currentThread().getName() + "      "+ " Hora: " + formatoHora.format(new Date()));
    }
    
     
    
}
