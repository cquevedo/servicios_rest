package servicio.demo.output;


public class Error {

    String codigoError;
    String descripcionError;

    public Error() {
    	super();
    }

    public Error(final String codigoError, final String descripcionError) {
        super();
        this.codigoError = codigoError;
        this.descripcionError = descripcionError;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(final String codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setDescripcionError(final String descripcionError) {
        this.descripcionError = descripcionError;
    }

}