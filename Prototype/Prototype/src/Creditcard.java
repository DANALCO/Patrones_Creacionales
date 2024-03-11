import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Creditcard implements Cloneable{

    private String titularNombre;

    private String cardId;

    private String fechaVencimiento;

    private int codigoSeguridad;

    public Creditcard(String titularNombre, String cardId, String fechaVencimiento, int codigoSeguridad) {
        this.titularNombre = titularNombre;
        this.cardId = cardId;
        this.fechaVencimiento = fechaVencimiento;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    protected Creditcard clone() throws CloneNotSupportedException {
        return (Creditcard) super.clone();
    }

    @Override
    public String toString() {
        return "Creditcard{" +
                "titularNombre='" + titularNombre + '\'' +
                ", cardId='" + cardId + '\'' +
                ", fechaVencimiento='" + fechaVencimiento + '\'' +
                ", codigoSeguridad=" + codigoSeguridad +
                '}';
    }
}
