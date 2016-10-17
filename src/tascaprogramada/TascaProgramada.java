
package tascaprogramada;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;



public class TascaProgramada {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ScheduledExecutorService executor = (ScheduledExecutorService) Executors.newScheduledThreadPool(2);
        
        imprimeixExecucioTasca iet = new imprimeixExecucioTasca();
        
        executor.scheduleWithFixedDelay(iet, 2, 3, TimeUnit.SECONDS);
        
        
    }
    
    
}
