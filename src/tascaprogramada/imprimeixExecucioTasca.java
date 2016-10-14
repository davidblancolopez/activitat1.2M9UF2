package tascaprogramada;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;


public class imprimeixExecucioTasca {

    Calendar calendario = new GregorianCalendar();
    
    private final ScheduledExecutorService executor;
    
    public imprimeixExecucioTasca() {
        executor = (ScheduledExecutorService) Executors.newScheduledThreadPool(2);
    }
    
    
    public void run() {
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        System.out.println(Thread.currentThread().getName() + "      "+ " Hora: " + formatoHora.format(new Date()));
    }
    
    
    public void terminaServidor() {
        executor.shutdown();
    }
     
    
}


//http://howtodoinjava.com/core-java/multi-threading/task-scheduling-with-executors-scheduledthreadpoolexecutor-example/