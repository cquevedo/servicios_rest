package servicio.demo.impl;

public class ClienteImplException extends Exception {

    private static final long serialVersionUID = 1L;
    private final String codigoError;

    public ClienteImplException() {
        super();
        codigoError = "NA";
    }

    public ClienteImplException(final String codigoError, final String mensajeError) {
        super(mensajeError);
        this.codigoError = codigoError;
    }

    public ClienteImplException(final Throwable cause) {
        super(cause);
        codigoError = "NA";
    }

    public ClienteImplException(final String message, final Throwable cause) {
        super(message, cause);
        codigoError = "NA";
    }

    public ClienteImplException(final String message, final Throwable cause, final boolean enableSuppression, final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        codigoError = "NA";
    }

    public String getCodigoError() {
        return codigoError;
    }

}
