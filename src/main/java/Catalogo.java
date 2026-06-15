public class Catalogo implements Agregado {

    private NodoPelicula inicio;

    public Catalogo(){

        agregarPelicula(
                new Pelicula(1,"Joker",
                        "Drama",9.5));


        agregarPelicula(
                new Pelicula(2,"Avengers",
                        "Accion",9.0));


        agregarPelicula(
                new Pelicula(3,"Matrix",
                        "Ciencia Ficcion",8.8));


        agregarPelicula(
                new Pelicula(4,"It",
                        "Terror",8.5));

    }

    public void agregarPelicula(Pelicula pelicula){

        NodoPelicula nuevo =
                new NodoPelicula(pelicula);

        if(inicio == null){

            inicio = nuevo;

        }else{

            NodoPelicula actual = inicio;

            while(actual.getSiguiente()!=null){


                actual = actual.getSiguiente();

            }

            actual.setSiguiente(nuevo);

        }

    }

    public NodoPelicula getInicio(){

        return inicio;

    }

    public void setInicio(NodoPelicula inicio){

        this.inicio = inicio;

    }

    @Override
    public Iterator createIterator(){

        return new PeliculaIterator(inicio);

    }
}
