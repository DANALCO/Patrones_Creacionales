import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Usuario implements Cloneable{

    private String nombre;

    private String apellido;

    private int edad;

    private String estadoCivil;

    public Usuario() {

    }
    @Override
    protected Usuario clone() {
        Usuario cloneUsuario = new Usuario();
        cloneUsuario.setNombre(this.nombre);
        cloneUsuario.setEstadoCivil(this.estadoCivil);
        cloneUsuario.setEdad(this.edad);
        cloneUsuario.setApellido(this.apellido);
        return cloneUsuario;
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
