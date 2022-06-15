import java.io.*;
import java.util.List;

public class SerializarEstudantes <Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(nomeArquivo);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(estudantes);
        } catch (Exception e) {
            System.out.println("Nao foi possivel serializar");
        } finally {
            try {
                if (objectOutputStream != null) {
                    objectOutputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Nao foi possivel serializar");
            }
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> estudantes = null;
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(nomeArquivo);
            objectInputStream = new ObjectInputStream(fileInputStream);
            estudantes = (List<Estudante>) objectInputStream.readObject();
        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        } finally {
            try {
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Nao foi possivel serializar");
            }
        }
        return estudantes;
    }
}
