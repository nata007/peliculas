package mx.edu.itcolima.peliculas;

/**
 * Created by macbookprolate2011 on 10/03/16.
 */
public class PeliculasModel {

    public int imagen;
    public String nombre;
    public String vistos;

    public PeliculasModel(int imagen, String nombre, String vistos) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.vistos = vistos;
    }

    @Override
    public String toString() {
        return "PeliculasModel{" +
                "imagen=" + imagen +
                ", nombre='" + nombre + '\'' +
                ", vistos='" + vistos + '\'' +
                '}';
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVistos() {
        return vistos;
    }

    public void setVistos(String vistos) {
        this.vistos = vistos;
    }
}
