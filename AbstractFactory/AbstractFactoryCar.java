/*La interfaz fábrica abstracta declara un grupo de métodos que devuelven distintos productos abstractos. 
Estos productos se denominan familia y están relacionados por un tema o concepto de alto nivel. 
Normalmente, los productos de una familia pueden colaborar entre sí. Una familia de productos puede tener 
muchas variantes, pero los productos de una variante son incompatibles con los productos de otra.*/
// Interfaz para los autos
interface Auto {
    void conducir();
}

// Interfaz para las motocicletas
interface Motocicleta {
    void conducir();
}

/*Las fábricas concretas producen una familia de productos que pertenecen a una única variante. 
La fábrica garantiza que los productos resultantes sean compatibles. Las firmas de los métodos de 
las fábricas concretas devuelven un producto abstracto mientras que dentro del método se instancia 
un producto concreto. Cada fábrica concreta tiene una variante de producto en concreto*/
// Clases concretas para los autos
class AutoDeportivo implements Auto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un auto deportivo");
    }
}

class AutoFamiliar implements Auto {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un auto familiar");
    }
}

// Clases concretas para las motocicletas
class MotocicletaDeportiva implements Motocicleta {
    @Override
    public void conducir() {
        System.out.println("Conduciendo una motocicleta deportiva");
    }
}

class MotocicletaEstandar implements Motocicleta {
    @Override
    public void conducir() {
        System.out.println("Conduciendo una motocicleta estándar");
    }
}
/*Cada producto individual de una familia de productos debe tener una interfaz base. Todas las 
variantes del producto deben implementar esta interfaz. Los productos concretos son creados por 
las fábricas correspondientes*/
// Interfaz Abstract Factory
interface VehiculoFactory {
    Auto crearAuto();
    Motocicleta crearMotocicleta();
}
// Fábrica concreta para crear vehículos deportivos
class DeportivoFactory implements VehiculoFactory {
/*indica que un método está sobrescribiendo un método en una superclase o implementando un método definido en una interfaz.*/
    @Override
    public Auto crearAuto() {
        return new AutoDeportivo();
    }

    @Override
    public Motocicleta crearMotocicleta() {
        return new MotocicletaDeportiva();
    }
}

// Fábrica concreta para crear vehículos familiares
class FamiliarFactory implements VehiculoFactory {
    @Override
    public Auto crearAuto() {
        return new AutoFamiliar();
    }

    @Override
    public Motocicleta crearMotocicleta() {
        return new MotocicletaEstandar();
    }
}

public class AbstractFactoryCar {
    public static void main(String[] args) {
        // Creamos una fábrica para crear vehículos deportivos
        VehiculoFactory deportivoFactory = new DeportivoFactory();
        Auto auto = deportivoFactory.crearAuto();
        Motocicleta moto = deportivoFactory.crearMotocicleta();
        
        // Conducimos los vehículos
        auto.conducir();
        moto.conducir();
        
        // Creamos una fábrica para crear vehículos familiares
        VehiculoFactory familiarFactory = new FamiliarFactory();
        auto = familiarFactory.crearAuto();
        moto = familiarFactory.crearMotocicleta();
        
        // Conducimos los vehículos
        auto.conducir();
        moto.conducir();
    }
}
