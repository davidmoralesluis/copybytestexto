import java.io.File;

public class Main {
    public static void main(String[] args) {

        CopyBytesTexto x=new CopyBytesTexto();
        File fichero=new File(System.getProperty("user.dir")+"/src/main/java/texto1.txt");

        x.copyText(fichero);
    }
}
