

public class MainCreditCard {
    public static void main(String[] args) throws CloneNotSupportedException {

        Creditcard prototypeCard = new Creditcard("Manuel Rodriguez","2010-2043-5415-1928","12/24",289);
        Creditcard card1 = prototypeCard.clone();
        card1.setTitularNombre("Juan Venada");

        Creditcard card2 = prototypeCard.clone();
        card2.setTitularNombre("Isabela Aponte");

        System.out.println("CardPrototype: " + prototypeCard.toString());
        System.out.println("Card1: " + card1.toString());
        System.out.println("Card2: " + card2.toString());
    }
}
