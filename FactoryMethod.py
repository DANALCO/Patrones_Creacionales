class CreadorPizza:
    def crear_pizza(self, tipo):
        if tipo == "vegetariana":
            return PizzaVegetariana()
        elif tipo == "pepperoni":
            return PizzaPepperoni()
        else:
            raise ValueError("Tipo de pizza no válida")

class Pizza:
    def __init__(self):
        pass

class PizzaVegetariana(Pizza):
    def __init__(self):
        super().__init__()
        print("Preparando pizza vegetariana...")

class PizzaPepperoni(Pizza):
    def __init__(self):
        super().__init__()
        print("Preparando pizza pepperoni...")

creador = CreadorPizza()

pizza_vegetariana = creador.crear_pizza("vegetariana")
pizza_pepperoni = creador.crear_pizza("pepperoni")

# Salida:
# Preparando pizza vegetariana...
# Preparando pizza pepperoni...
