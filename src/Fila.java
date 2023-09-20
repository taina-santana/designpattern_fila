import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    private static Fila instanciaUnica;
    private Queue<String> documentos;

    private Fila() {
        documentos = new LinkedList<>();
    }

    public static Fila getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new Fila();
        }
        return instanciaUnica;
    }

    public void imprimeDocumento(String documento) {
        documentos.offer(documento);
    }

    public String removeDocumento() {
        if (!documentos.isEmpty()) {
            return documentos.poll();
        } else {
            return "Fila vazia";
        }
    }

    public void removeTodosDocumentos() {
        documentos.clear();
    }

    public void exibeFila() {
        System.out.println("Documentos na fila: " + documentos);
    }

    }
}
