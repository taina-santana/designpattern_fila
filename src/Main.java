public class Main {
    public static void main(String[] args) {
        Fila fila = Fila.getInstance();

        fila.imprimeDocumento("Documento 1");
        fila.imprimeDocumento("Documento 2");
        fila.imprimeDocumento("Documento 3");

        fila.exibeFila();

        String documentoRemovido = fila.removeDocumento();
        System.out.println("Documento removido: " + documentoRemovido);

        fila.exibeFila();

        fila.removeTodosDocumentos();
        System.out.println("Fila após remover todos os documentos:");
        fila.exibeFila();
        }
    }
}