package parcial;

public class Excepciones {

    // Excepción nos damos cuenta aqui si el exponente es negativo
    public static class ExponenteNegativoException extends Exception {
        public ExponenteNegativoException(String mensaje) {
            super(mensaje);
        }
    }

    // Excepción si se intenta 0**0 me acorde que 0**0 es una indeterminacion en las matematicas ya que si cualquier numero elevado a 0 da 1 0 no puede dar 1 si se eleva por el mismo
    
    public static class IndeterminacionException extends Exception {
        public IndeterminacionException(String mensaje) {
            super(mensaje);
        }
    }

    // Excepción si hay desbordamiento, me les voy casi que no puedo con esta se me habia olvidado
    public static class OverflowException extends Exception {
        public OverflowException(String mensaje) {
            super(mensaje);
        }
    }
}
