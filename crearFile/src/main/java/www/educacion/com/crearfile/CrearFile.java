package www.educacion.com.crearfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CrearFile {

    public static void main(String[] args) throws IOException {
       //Crear el archivo

       File file = new File("./MiArchivo.txt");
       
       try{
           if(file.createNewFile()){
               System.out.println("Archivo creado exitosamente");
           }
       }catch(IOException e1){
           System.out.println("Error al crear el archivo "+e1.getMessage());
       }
       fileWriter(file);
       readerFile(file);
    }
    
    //metodo para escribir en el archivo
    public static void fileWriter(File file){
        FileWriter fileWriter = null;
        try {
            if(file.exists()){
                fileWriter = new FileWriter(file ,true);
                fileWriter.write("Hola , estoy escribiendo en el archivo \n ");
                System.out.println("Se ha introducido texto correctamente");
            }else{
                System.out.println("El archivo no existe");
            }
            
        } catch (IOException e2) {
            System.out.println("Error, al escribir en el archivo");
        }finally{
            if(fileWriter != null){
                try{
                    fileWriter.close();
                }catch(IOException e3){
                    System.out.println("Error al cerrar el archivo, asegurece de que no hayan archivos abiertos"+e3.getMessage());
                }
            }
        }
    }
    
    //metodo para leer el archivo
    public static void readerFile ( File file) throws IOException{
        BufferedReader bufferedReader = null;
        try {
            if(file.exists()){
                //se crea un fileReader para leer el archivo
                FileReader fileReader = new FileReader(file);
            
                //se crea el bufferedReader para leer el texto que contiene el archivo
                bufferedReader = new BufferedReader(fileReader);
            
                //debo leer linea por linea
                String line = "" ;
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            }else{
                System.out.println("El archivo no existe");
            }
        } catch (IOException e4) {
            System.out.println("Ocurrió un error al leer el archivo "+e4.getMessage());
        }finally{
            if(bufferedReader  != null){
                try{
                    bufferedReader.close();
                }catch(IOException e5){
                    System.out.println("Error al cerrar el archivo "+e5.getMessage());
                }
            }
        }
    }
}
