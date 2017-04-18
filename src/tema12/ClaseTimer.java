import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Timer;
import java.util.TimerTask;


public class ClaseTimer {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Timer timer;
        timer= new Timer();
        
        TimerTask task= new TimerTask(){
            int tic=0;
            public void run(){
                if(tic %2==0){
                    System.out.println("TIC");
                }
                else{
                    System.out.println("TAC");
                }
                tic++;
            }
        };
        //schedule(TimerTask task, long delay, long period)
        timer.schedule(task,10,1000);
    }
    
}

