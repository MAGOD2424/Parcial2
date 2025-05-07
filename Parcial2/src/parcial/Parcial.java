package parcial;

public class Parcial {

    public int potenciaEntera(int base, int exponente) throws Excepciones.ExponenteNegativoException,Excepciones.IndeterminacionException,Excepciones.OverflowException {
        if (exponente < 0) {
            throw new Excepciones.ExponenteNegativoException("El exponente no puede ser negativo.");
        }
        if (base == 0 && exponente == 0) {
            throw new Excepciones.IndeterminacionException("0^0 es una indeterminación.");
        }

        long resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
            if (resultado > Integer.MAX_VALUE) {
                throw new Excepciones.OverflowException("El resultado excede el valor máximo para int.");
            }
        }
        return (int) resultado;
    }
}

