
package www.educacion.com.managestore.store;

import java.io.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GenerateCodes {
    private Random random = new Random();
    public String generateCode(String name, String category){
        
        File file2 = new File("GenerateCode");
        PrintWriter pw = null;
        String code = null;
        try {
            pw = new PrintWriter(new FileWriter(file2, true)); //true para anexar al archivo, en lugar de sobreescribirlo
            String baseCode = (category.substring(0, 3) + name.substring(0, 3)).toLowerCase();
            int randomNumber = random.nextInt(1000);
            code = baseCode + randomNumber;
            pw.println("El código generado es: "+code );
        } catch (IOException e1) {
            System.out.println("Error al generar el código "+e1.getMessage());
            return null; //No retorna nada debido a que no se pudo generar el codigo
        }finally{
            if(pw != null){
                pw.close();
            }
        }
        return code; // Retorna el código generado
        
    }

}
