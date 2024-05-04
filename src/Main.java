public class Main {
    public static void main(String[] args) {
        Desarrollador[] devTecnologia = new Desarrollador[2];

        String bilingue[] =new String[2];
        bilingue[0]="Epañol";
        bilingue[1]="Inglés";
        String habDesarrollador[]= new String[2];
        habDesarrollador[0]= "Back";
        habDesarrollador[1]="GitHub";
        
        devTecnologia[0]= new Desarrollador("Mario","Back End","COL",3000000L,600000L,"Empleado",bilingue,habDesarrollador);
        devTecnologia[1]= new Desarrollador("Juan","Java Developer","COL",3000000L,600000L,"Empleado",bilingue,habDesarrollador);

        AnalistaFinanciero[] analistaTec =new AnalistaFinanciero[1];
        analistaTec[0]= new AnalistaFinanciero("Camilo","Analista Financiero","COL",3000000L,600000L,"Empleado",bilingue,habDesarrollador);

        IngenieroProduccion produccionTec[] = new IngenieroProduccion[1];
        produccionTec[0] = new IngenieroProduccion("Juan","Ingeniero Producción","COL",3000000L,600000L,"Empleado",bilingue,habDesarrollador);

        ConsultorNegocios consultorTec[] = new ConsultorNegocios[1];
        consultorTec[0] = new ConsultorNegocios("Jose Maria","Back End","COL",3000000L,600000L,"Empleado",bilingue,habDesarrollador);

        Tecnologia industriaTec = new Tecnologia(devTecnologia,analistaTec,produccionTec,consultorTec);
        industriaTec.generarInformeEmpleados();
    }
}