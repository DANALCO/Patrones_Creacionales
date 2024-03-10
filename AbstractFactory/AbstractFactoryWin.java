// Interfaz para la fábrica abstracta
/*La interfaz fábrica abstracta declara un grupo de métodos que devuelven distintos productos abstractos. 
Estos productos se denominan familia y están relacionados por un tema o concepto de alto nivel. 
Normalmente, los productos de una familia pueden colaborar entre sí. Una familia de productos puede tener 
muchas variantes, pero los productos de una variante son incompatibles con los productos de otra.*/
interface GUIFactory {
    Button createButton(); // Método para crear un botón
}

/*Las fábricas concretas producen una familia de productos que pertenecen a una única variante. 
La fábrica garantiza que los productos resultantes sean compatibles. Las firmas de los métodos de 
las fábricas concretas devuelven un producto abstracto mientras que dentro del método se instancia 
un producto concreto. Cada fábrica concreta tiene una variante de producto en concreto*/
// Implementación de la fábrica concreta para Windows
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton(); // Crea un botón específico para Windows
    }
}

// Implementación de la fábrica concreta para macOS
class MacOSFactory implements GUIFactory {
    public Button createButton() {
        return new MacOSButton(); // Crea un botón específico para macOS
    }
}

/*Cada producto individual de una familia de productos debe tener una interfaz base. Todas las 
variantes del producto deben implementar esta interfaz. Los productos concretos son creados por 
las fábricas correspondientes*/
// Interfaz para el producto abstracto
interface Button {
    void paint(); // Método para renderizar el botón
}

// Implementación del producto concreto para Windows
class WindowsButton implements Button {
    public void paint() {
        System.out.println("Renderizando un botón de Windows"); // Renderiza un botón de Windows
    }
}

// Implementación del producto concreto para macOS
class MacOSButton implements Button {
    public void paint() {
        System.out.println("Renderizando un botón de macOS"); // Renderiza un botón de macOS
    }
}

// Clase cliente que utiliza la fábrica abstracta
public class AbstractFactoryWin {
    public static void main(String[] args) {
        // Comprobar el tipo de sistema operativo y obtiene el nombre en minuscuas
        String os = System.getProperty("os.name").toLowerCase();
        GUIFactory factory;

        // Determinar qué fábrica utilizar según el sistema operativo
        if (os.contains("windows")) {
            factory = new WindowsFactory(); // Utiliza la fábrica de Windows
        } else if (os.contains("mac")) {
            factory = new MacOSFactory(); // Utiliza la fábrica de macOS
        } else {
            throw new RuntimeException("Sistema operativo no soportado");
        }

        // Utilizar la fábrica para crear un botón
        Button button = factory.createButton();
        button.paint(); // Renderiza el botón creado
    }
}
