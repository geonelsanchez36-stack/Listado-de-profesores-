public class Nodo {
    private Profesores profesor;
    private Nodo next;

    public Nodo(Profesores profesor){
        this.profesor=profesor;
        this.next=null;
    }

    public Profesores getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesores profesor) {
        this.profesor = profesor;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
