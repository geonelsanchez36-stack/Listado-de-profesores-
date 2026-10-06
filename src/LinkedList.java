public class LinkedList  implements ListInterface{
    private Nodo cabeza;
    private int size;

    public LinkedList(){
        cabeza=null;
        size=0;
    }

    @Override
    public void add(Profesores valor) {
        Nodo cursor=cabeza;
        Nodo nuevo=new Nodo(valor);

        if (isEmpty()){
            cabeza=nuevo;
        }else {
            while (cursor.getNext() != null){
                cursor=cursor.getNext();
            }
            cursor.setNext(nuevo);
        }
        size++;
    }

    @Override
    public boolean isEmpty() {
        return cabeza == null;
    }

    @Override
    public Profesores get(int index) {
        Nodo cursor=cabeza;
        if (index >= 0 && index < size){
            for (int i = 0; i < index ; i++) {
                cursor=cursor.getNext();
            }
            return cursor.getProfesor();
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }
    }

    @Override
    public Profesores remove(int index) {
        Nodo cursor=cabeza;
        if (index >=0 && index < size){
            Nodo aux;
            if (index==0){
                aux=cabeza;
                cabeza=cabeza.getNext();
            }else {
                for (int i = 0; i <index-1 ; i++) {
                    cursor=cursor.getNext();
                }
                aux=cursor.getNext();
                cursor.setNext(aux.getNext());
            }
            size--;
            return aux.getProfesor();
        }else {
            throw new UnsupportedOperationException("Indice fuera de rango");
        }

    }
    public String[] proxCambio(){
        Nodo cursor=cabeza;
        int cont=0;

        while (cursor != null){
            if (cursor.getProfesor().getCategoriaDocente().equals("Instructor") && cursor
                    .getProfesor().getEdad() >= 26){
                cont++;
            }
            cursor=cursor.getNext();
        }
        String[] aux=new String[cont];
        cursor=cabeza;
        int contador=0;

        while (cursor != null){
            if (cursor.getProfesor().getCategoriaDocente().equals("Instructor") && cursor
                    .getProfesor().getEdad() >= 26){
                aux[contador]=cursor.getProfesor().getNombre();
                contador++;
            }
            cursor=cursor.getNext();
        }
        return aux;
    }

    public void MostrarLIsta(){
        cabeza=mergeSort(cabeza);

        Nodo actual=cabeza;
        while (actual != null){
            System.out.println(actual.getProfesor());
            actual=actual.getNext();
        }
    }

    private Nodo mergeSort(Nodo cabeza){
        if(cabeza == null || cabeza.getNext() == null){
            return cabeza;
        }

        Nodo medio = obtenerMedio(cabeza);
        Nodo siguienteMedio = medio.getNext();
        medio.setNext(null);

        Nodo izquierda = mergeSort(cabeza);
        Nodo derecha = mergeSort(siguienteMedio);
        return merge(izquierda, derecha);

    }

    private Nodo obtenerMedio (Nodo cabeza){

        if(cabeza == null){
            return cabeza;
        }

        Nodo lento = cabeza;
        Nodo rapido = cabeza.getNext();

        while(rapido != null && rapido.getNext() != null){
            lento = lento.getNext();
            rapido = rapido.getNext().getNext();
        }

        return lento;
    }
    private Nodo merge(Nodo izq, Nodo der){

        if(izq == null)
            return der;

        if(der == null)
            return izq;

        Nodo resultado;

        if(izq.getProfesor().getEdad() >= der.getProfesor().getEdad()){

            resultado = izq;
            resultado.setNext(
                    merge(izq.getNext(), der)
            );

        }else{

            resultado = der;
            resultado.setNext(
                    merge(izq, der.getNext())
            );
        }

        return resultado;
    }



    public String CantProfesores(){
        int cantInstructor=0;
        int cantAsistente=0;
        int cantAuxiliar=0;
        int cantTitular=0;

        Nodo cursor=cabeza;
        while (cursor != null){
            if (cursor.getProfesor().getCategoriaDocente().equals("Instructor")){
                cantInstructor++;
            } else if (cursor.getProfesor().getCategoriaDocente().equals("Auxiliar")) {
                cantAuxiliar++;
            } else if (cursor.getProfesor().getCategoriaDocente().equals("Asistente")) {
                cantAsistente++;
            } else if (cursor.getProfesor().getCategoriaDocente().equals("Titular")) {
                cantTitular++;
            }

            cursor=cursor.getNext();
        }
        return "Profesores por categoria docente : \n"+"Instructor: "+cantInstructor+"\n"+"Asistente: "+
                cantAsistente+"\n"+"Auxiliar : "+cantAuxiliar+"\n"+"Titular: "+cantTitular;
    }

    public int getSize() {
        return size;
    }

    public Nodo getCabeza() {
        return cabeza;
    }
}
