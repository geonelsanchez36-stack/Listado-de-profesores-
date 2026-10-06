public class Main {
    static void main() {
        LinkedList listadoProfesores=new LinkedList();
        Profesores profesor1=new Profesores("Geonel",20,"Instructor");
        Profesores profesor2=new Profesores("Edgar",24,"Auxiliar");
        Profesores profesor3=new Profesores("Leonardo",26,"Titular");
        Profesores profesor4=new Profesores("Adrian",27,"Instructor");
        Profesores profesor5=new Profesores("Lazaro",28,"Asistente");
        Profesores profesor6=new Profesores("Jorge",29,"Instructor");

        listadoProfesores.add(profesor1);
        listadoProfesores.add(profesor2);
        listadoProfesores.add(profesor3);
        listadoProfesores.add(profesor4);
        listadoProfesores.add(profesor5);
        listadoProfesores.add(profesor6);

        String[] proxCambio= listadoProfesores.proxCambio();

        for (int i = 0; i < proxCambio.length ; i++) {
            System.out.println(proxCambio[i]);
        }

        listadoProfesores.MostrarLIsta();

        System.out.println(listadoProfesores.CantProfesores());
    }
}