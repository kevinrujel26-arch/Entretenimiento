public class PeliculaIterator implements Iterator {

    private NodoPelicula actual;

    public PeliculaIterator(NodoPelicula inicio){

        actual = inicio;

    }

    @Override
    public boolean hasNext(){


        return actual != null;

    }

    @Override
    public Pelicula next(){

        Pelicula pelicula =
                actual.getPelicula();

        actual =
                actual.getSiguiente();

        return pelicula;

    }
}