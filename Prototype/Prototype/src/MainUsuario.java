public class MainUsuario {
    public static void main(String[] args) throws CloneNotSupportedException {
        //Creamos un Usuario y le damos valores
        Usuario usuarioPrototype = new Usuario();
        usuarioPrototype.setApellido("Rodriguez");
        usuarioPrototype.setEdad(30);
        usuarioPrototype.setNombre("Juan");
        usuarioPrototype.setEstadoCivil("Viudo");


        /*
        Queremos tener otro tipo de objeto
        Usuario usuario2 = usuario1;
        usuario2.setEdad(10);
        Aquí estamos es apuntando en la dirección de memoria donde tenemos guardado usuario1,
        es importante que cualquier cambio que hagamos en usuario2 se hará en usuario1
        */

        /*
        Otra forma de resolver este problema es así

        Creamos el usuario2
        Usuario usuario2 = new Usuario();

        Y obtenemos los valores de Usuario1 pero aún así tendriamos un problema por si en algún momento nos equivocamos
        al obtener un dato incorrecto.
        usuario2.setEdad(usuario1.getEdad());
        usuario2.setNombre(usuario1.getNombre());
         */

        Usuario usuario1 = usuarioPrototype.clone();
        usuario1.setEstadoCivil("Casado");

        Usuario usuario2 = usuarioPrototype.clone();
        usuario2.setNombre("Fernando");

        System.out.println("UsuarioPrototype: " + usuarioPrototype.toString());
        System.out.println("Usuario 1: " + usuario1.toString());
        System.out.println("Usuario 2: " + usuario2.toString());


    }
}