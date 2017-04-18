package tema12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class GrabarenDisco {

    
   
     public static void main(String[] args) {
        // TODO code application logic here
        Properties prop1=new Properties();
        prop1.setProperty("Lenguaje","ES");
        prop1.setProperty("Autor","Silvia");
        String mResult=prop1.getProperty("Autor");
        //prop1.save(System.out,"parámetros de programa");
        try{
        //Para guardar el archivo en una carpeta fisica se usa la clase file en
        //la que le indicamos la ruta donde lo queremos guardar.
        File f=new File("d:/propiedades.out");
        FileOutputStream fos=new FileOutputStream(f);
        prop1.save(fos,"parámetros de programa");
        }
        catch(FileNotFoundException fnf){
        System.out.println("No se encontró el archivo");
        }
    }  
    }
   
    

 



