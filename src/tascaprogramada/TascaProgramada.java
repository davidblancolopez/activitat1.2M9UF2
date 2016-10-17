
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
        //Creació del executor amb dos fils.
        ScheduledExecutorService executor = (ScheduledExecutorService) Executors.newScheduledThreadPool(2);
        
        
        imprimeixExecucioTasca iet = new imprimeixExecucioTasca();
        
       //Executem el run indicant-li els segons que transcurriran el primer cop que s'executara
       //i el temps que transcurrira entre cada cop (S'indica en segons). 
        executor.scheduleWithFixedDelay(iet, 2, 3, TimeUnit.SECONDS);
        
        //Això serveix per a que quan passin 30 segons pari.
        executor.awaitTermination(30, TimeUnit.SECONDS); 
        
        //L'executor s'acaba.
        executor.shutdown(); 
        
    }
    
    
}
