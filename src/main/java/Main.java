public class Main {

    public static void main(String[] args){

        Catalogo catalogo = new Catalogo();

        Iterator iterator = catalogo.createIterator();

        System.out.println("===== CATALOGO DE PELICULAS =====");

        while(iterator.hasNext()){

            Pelicula pelicula = iterator.next();

            System.out.println(pelicula);

        }}
}