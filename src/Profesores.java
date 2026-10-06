public class Profesores {
    private String nombre;
    private int edad;
    private String categoriaDocente;

    public Profesores(String nombre,int edad,String categoriaDocente){
        this.nombre=nombre;
        this.edad=edad;
        this.categoriaDocente=categoriaDocente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCategoriaDocente() {
        return categoriaDocente;
    }

    public void setCategoriaDocente(String categoriaDocente) {
        this.categoriaDocente = categoriaDocente;
    }

    @Override
    public String toString() {
        return "Profesores{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", categoriaDocente='" + categoriaDocente + '\'' +
                '}';
    }
}
