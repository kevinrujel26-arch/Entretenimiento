public class Pelicula {
    private int id;
    private String titulo;
    private String genero;
    private double ranking;


    public Pelicula(int id, String titulo,
                    String genero, double ranking) {

        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.ranking = ranking;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getTitulo() {

        return titulo;
    }

    public void setTitulo(String titulo) {

        this.titulo = titulo;
    }



    public String getGenero() {

        return genero;
    }

    public void setGenero(String genero) {

        this.genero = genero;
    }



    public double getRanking() {

        return ranking;
    }

    public void setRanking(double ranking) {

        this.ranking = ranking;
    }


    @Override
    public String toString(){

        return "ID: " + id +
                " | Titulo: " + titulo +
                " | Genero: " + genero +
                " | Ranking: " + ranking;
    }
}
