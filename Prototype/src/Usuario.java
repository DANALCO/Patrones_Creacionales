import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Usuario implements Cloneable{

    private String nombre;

    private String apellido;

    private int edad;

    private String estadoCivil;

    public Usuario(String nombre, String apellido, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    @Override
    protected Usuario clone() throws CloneNotSupportedException {
        return (Usuario) super.clone();
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", estadoCivil='" + estadoCivil + '\'' +
                '}';
    }
}
