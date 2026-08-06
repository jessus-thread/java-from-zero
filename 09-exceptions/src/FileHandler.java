import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {
    static void main() {
        readFile("src/example1.txt");
    }

    public static void readFile(String path) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(path));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException error) {
            System.out.println("El archivo no existe: " + path);
        } catch(IOException error) {
            System.out.println("Error en la lectura del archivo...");
        } finally {
            try {
                if (reader != null) {
                    reader.close();

                    System.out.println("Archivo cerrado.");
                }
            } catch (IOException error) {
                System.out.println("Error al intentar cerrar el archivo.");
            }
        }
    }
}
