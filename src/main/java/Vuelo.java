package Package4;
import java.util.List;

public class Vuelo extends Pasajero {

    private Ciudad origen;
    private Ciudad destino;
    private Date fecha;

    public Ciudad getOrigen() {
        return this.origen;
    }

    /**
     *
     * @param origen
     */
    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Ciudad getDestino() {
        return this.destino;
    }

    /**
     *
     * @param destino
     */
    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return this.fecha;
    }

    /**
     *
     * @param fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
