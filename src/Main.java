import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Informe de empleados de Industria Tecnología");
            System.out.println("2. Informe de empleados de Industria Manufactura");
            System.out.println("3. Informe de empleados de Industria Servicios");
            System.out.println("4. Informe de empleados de Industria Finanzas");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    informeInduTec();
                    break;
                case 2:
                    informeInduManu();
                    break;
                case 3:
                    informeInduServi();
                    break;
                case 4:
                    informeInduFina();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }



        public static void informeInduTec(){
            Desarrollador[] devTecnologia = new Desarrollador[2];
            String[] bilingue = new String[2];
            bilingue[0] = "Español";
            bilingue[1] = "Inglés";
            String[] habDesarrollador = new String[4];
            habDesarrollador[0] = "Java";
            habDesarrollador[1] = "Excel";
            habDesarrollador[2] = "Scrum";
            habDesarrollador[3] = "SQL";
            devTecnologia[0] = new Desarrollador("Mario", "Back End", "COL", 3000000L, 600000L, "Empleado",bilingue, new String[]{habDesarrollador[0]});
            devTecnologia[1] = new Desarrollador("Juan", "Java Developer", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[0]});

            AnalistaFinanciero[] analistaTec = new AnalistaFinanciero[1];
            analistaTec[0] = new AnalistaFinanciero("Camilo", "Analista Financiero", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});

            IngenieroProduccion[] produccionTec = new IngenieroProduccion[1];
            produccionTec[0] = new IngenieroProduccion("Juan", "Ingeniero Producción", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});

            ConsultorNegocios[] consultorTec = new ConsultorNegocios[1];
            consultorTec[0] = new ConsultorNegocios("Jose Maria", "Back End", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});

            Tecnologia industriaTec = new Tecnologia(devTecnologia, analistaTec, produccionTec, consultorTec);
            System.out.println("*** INFORME EMPLEADOS INDUSTRIA TECNOLOGIA ***");
            industriaTec.generarInformeEmpleados();
        }



        public static void informeInduManu() {

        String[] bilingue = new String[2];
            bilingue[0] = "Español";
            bilingue[1] = "Inglés";

            String[] habDesarrollador = new String[4];
            habDesarrollador[0] = "Java";
            habDesarrollador[1] = "Excel";
            habDesarrollador[2] = "Scrum";
            habDesarrollador[3] = "SQL";

            IngenieroProduccion[] produccionManu = new IngenieroProduccion[1];
            produccionManu[0] = new IngenieroProduccion("felipe", "Ingeniero Producción", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});

            ConsultorNegocios[] consultorManu = new ConsultorNegocios[1];
            consultorManu[0] = new ConsultorNegocios("Maria", "Consultora", "COL", 3000000L, 600000L, "Empleada", bilingue, new String[]{habDesarrollador[1]});

            Manufactura indrustriaManu = new Manufactura();
            indrustriaManu.setIngenieros(produccionManu);
            indrustriaManu.setConsultores(consultorManu);
            System.out.println("*** INFORME EMPLEADOS INDUSTRIA MANUFACTURA ***");
            indrustriaManu.generarInformeEmpleados();
        }

        public static void informeInduServi() {
            String[] bilingue = new String[2];
            bilingue[0] = "Español";
            bilingue[1] = "Inglés";

            String[] habDesarrollador = new String[4];
            habDesarrollador[0] = "Java";
            habDesarrollador[1] = "Excel";
            habDesarrollador[2] = "Scrum";
            habDesarrollador[3] = "SQL";

        AnalistaFinanciero[] analistaSer = new AnalistaFinanciero[1];
            analistaSer[0] = new AnalistaFinanciero("Jorge", "Analista Financiero", "COL", 5500000L, 400000L, "Empleado", bilingue, new String[]{habDesarrollador[3]});

            ConsultorNegocios[] consultorSer = new ConsultorNegocios[2];
            consultorSer[0] = new ConsultorNegocios("Daniel", "Consultor de negocios", "COL", 4500000L, 250000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});
            consultorSer[1] = new ConsultorNegocios("Martin", "Consultor de negocios", "COL", 4500000L, 250000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});

            Servicios industriaServi = new Servicios();
            industriaServi.setAnalistas(analistaSer);
            industriaServi.setConsultores(consultorSer);
            System.out.println("*** INFORME EMPLEADOS INDUSTRIA SERVICIOS ***");
            industriaServi.generarInformeEmpleados();
        }


        public static void informeInduFina() {
            String[] bilingue = new String[2];
            bilingue[0] = "Español";
            bilingue[1] = "Inglés";
            String[] habDesarrollador = new String[4];
            habDesarrollador[0] = "Java";
            habDesarrollador[1] = "Excel";
            habDesarrollador[2] = "Scrum";
            habDesarrollador[3] = "SQL";

        AnalistaFinanciero[] analistaFinan = new AnalistaFinanciero[3];
            analistaFinan[0] = new AnalistaFinanciero("Manuel", "Analista Financiero", "COL", 4000000L, 300000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});
            analistaFinan[1] = new AnalistaFinanciero("Maria", "Analista Financiero", "COL", 4000000L, 300000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});
            analistaFinan[2] = new AnalistaFinanciero("Estefania", "Analista Financiero", "Col", 4000000L, 300000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});

            Finanzas industriaFinan = new Finanzas();
            industriaFinan.setAnalistas(analistaFinan);
            System.out.println("*** INFORME EMPLEADOS INDUSTRIA FINANCIERA ***");
            industriaFinan.generarInformeEmpleados();
        }

    }