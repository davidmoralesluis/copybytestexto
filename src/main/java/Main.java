import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File text1=new File(System.getProperty("user.dir")+"/src/main/java/texto1.txt");
        File newtext=new File(System.getProperty("user.dir")+"/src/main/java/texto2.txt");

        FileInputStream leer=new FileInputStream(text1);
        FileOutputStream escribir=new FileOutputStream(newtext,false);

        int byteToByte;

        while ((byteToByte=leer.read())!=-1){
            escribir.write(byteToByte);
        }

        escribir.close();
        leer.close();

    }
}
