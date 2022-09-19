import java.io.*;
import java.util.Scanner;

public class CopyBytesTexto {

    Scanner scan;
    FileOutputStream newTextPrint;

    FileInputStream inpute;

    String estring ="";
    byte[] contenido;

    int num;

    public void copyText(File text1){

        File newText=new File(System.getProperty("user.dir")+"/src/main/java/texto2.txt");

        try {
            scan= new Scanner(text1);
            inpute=new FileInputStream(text1);
            newTextPrint = new FileOutputStream(newText);
            //newTextPrint = new FileOutputStream(newText,true);

            while (scan.hasNextLine()){
                estring=estring+scan.nextLine()+"\n";
            }

            num=inpute.read();

            contenido=estring.getBytes();


            newTextPrint.write(contenido);
            newTextPrint.flush();
            newTextPrint.close();

        }catch (FileNotFoundException fail){
            System.out.println("error 1 "+ fail.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            scan.close();
        }
    }



}
