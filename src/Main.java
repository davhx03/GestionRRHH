
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Se definen cada uno de los empleados de la industria tecnología
        Desarrollador[] devTecnologia = new Desarrollador[2];
        String[] bilingue = new String[2];
        bilingue[0] = "Español";
        bilingue[1] = "Inglés";
        String[] habDesarrollador = new String[4];
        habDesarrollador[0] = "Java";
        habDesarrollador[1] = "Excel";
        habDesarrollador[2] = "Scrum";
        habDesarrollador[3] = "SQL";
        devTecnologia[0] = new Desarrollador("Mario", "Back End", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[0]});
        devTecnologia[1] = new Desarrollador("Juan", "Java Developer", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[0]});

        AnalistaFinanciero[] analistaTec = new AnalistaFinanciero[1];
        analistaTec[0] = new AnalistaFinanciero("Camilo", "Analista Financiero", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});

        IngenieroProduccion[] produccionTec = new IngenieroProduccion[1];
        produccionTec[0] = new IngenieroProduccion("Juan", "Ingeniero Producción", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});

        ConsultorNegocios[] consultorTec = new ConsultorNegocios[1];
        consultorTec[0] = new ConsultorNegocios("Jose Maria", "Back End", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});

        Tecnologia industriaTec = new Tecnologia(devTecnologia, analistaTec, produccionTec, consultorTec);

        //Definir informe manufactura

        IngenieroProduccion[] produccionManu = new IngenieroProduccion[1];
        produccionManu[0] = new IngenieroProduccion("felipe", "Ingeniero Producción", "COL", 3000000L, 600000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});

        ConsultorNegocios[] consultorManu = new ConsultorNegocios[1];
        consultorManu[0] = new ConsultorNegocios("Maria", "Consultora", "COL", 3000000L, 600000L, "Empleada", bilingue, new String[]{habDesarrollador[1]});

        Manufactura indrustriaManu = new Manufactura();
        indrustriaManu.setIngenieros(produccionManu);
        indrustriaManu.setConsultores(consultorManu);
        //SE DEFINE LA INDUSTRIA SERVICIOS

        AnalistaFinanciero[] analistaSer = new AnalistaFinanciero[1];
        analistaSer[0] = new AnalistaFinanciero("Jorge", "Analista Financiero", "COL", 5500000L, 400000L, "Empleado", bilingue, new String[]{habDesarrollador[3]});

        ConsultorNegocios[] consultorSer = new ConsultorNegocios[2];
        consultorSer[0] = new ConsultorNegocios("Daniel", "Consultor de negocios", "COL", 4500000L, 250000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});
        consultorSer[1] = new ConsultorNegocios("Martin", "Consultor de negocios", "COL", 4500000L, 250000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});

        Servicios industriaServi = new Servicios();
        industriaServi.setAnalistas(analistaSer);
        industriaServi.setConsultores(consultorSer);

        //SE DEFINE LA INDUSTRIA FINANZAS

        AnalistaFinanciero[] analistaFinan = new AnalistaFinanciero[3];
        analistaFinan[0] = new AnalistaFinanciero("Manuel", "Analista Financiero", "COL", 4000000L, 300000L, "Empleado", bilingue, new String[]{habDesarrollador[1]});
        analistaFinan[1] = new AnalistaFinanciero("Maria", "Analista Financiero", "COL", 4000000L, 300000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});
        analistaFinan[2] = new AnalistaFinanciero("Estefania", "Analista Financiero", "Col", 4000000L, 300000L, "Empleado", bilingue, new String[]{habDesarrollador[2]});

        Finanzas industriaFinan = new Finanzas();
        industriaFinan.setAnalistas(analistaFinan);

        //INGRESO AL MENÚ PRINCIPAL
        System.out.println("Bienvenido al programa de gestión de RRHH");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Informe de empleados por Industria");
            System.out.println("2. Informe de nómina por Industria");
            System.out.println("2. Informe de nómina por Industria");
            System.out.println("3. Conocer estructura compensación por Tipo de Industria");
            System.out.println("4. Conocer beneficios por Tipo de Industria");
            System.out.println("5. Conocer programa de desarrollo profesional por Tipo de Industria");
            int menuPrincipal = scanner.nextInt();
            switch (menuPrincipal) {
                case 1:

                    while (true) {

                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Informe de empleados de Industria Tecnología");
                        System.out.println("2. Informe de empleados de Industria Manufactura");
                        System.out.println("3. Informe de empleados de Industria Servicios");
                        System.out.println("4. Informe de empleados de Industria Finanzas");
                        System.out.println("9. Volver al menú principal");
                        System.out.println("0. Salir");

                        int opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA TECNOLOGIA ***");
                                industriaTec.generarInformeEmpleados();
                                break;
                            case 2:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA MANUFACTURA ***");
                                indrustriaManu.generarInformeEmpleados();
                                break;
                            case 3:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA SERVICIOS ***");
                                industriaServi.generarInformeEmpleados();
                                break;
                            case 4:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA FINANCIERA ***");
                                industriaFinan.generarInformeEmpleados();
                                break;
                            case 9:
                                System.out.println("Volviendo al menú Principal");
                                break;
                            case 0:
                                System.out.println("Saliendo del programa.");
                                return;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                        if (opcion == 9) {
                            break;
                        }


                    }break;
                    //Finaliza la impresión del menú 1
                case 2:
                    while (true) {

                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Informe de nómina de Industria Tecnología");
                        System.out.println("2. Informe de nómina de Industria Manufactura");
                        System.out.println("3. Informe de nómina de Industria Servicios");
                        System.out.println("4. Informe de nómina de Industria Finanzas");
                        System.out.println("5. Volver al menú principal");
                        System.out.println("0. Salir");

                        int opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA TECNOLOGIA ***");
                                industriaTec.generarInformeNomina();
                                break;
                            case 2:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA MANUFACTURA ***");
                                indrustriaManu.generarInformeNomina();
                                break;
                            case 3:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA SERVICIOS ***");
                                industriaServi.generarInformeNomina();
                                break;
                            case 4:
                                System.out.println("*** INFORME EMPLEADOS INDUSTRIA FINANZAS ***");
                                industriaFinan.generarInformeNomina();
                                break;
                            case 9:
                                System.out.println("Volviendo al menú Principal");
                                break;
                            case 0:
                                System.out.println("Saliendo del programa.");
                                return;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                        if (opcion == 9) {
                            break;
                        }
                        break;
                    }//Finaliza la impresión del menú 2
                case 3:
                    while (true) {

                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Estructura de compensación Industria Tecnología");
                        System.out.println("2. Estructura de compensación Industria Manufactura");
                        System.out.println("3. Estructura de compensación Industria Servicios");
                        System.out.println("4. Estructura de compensación Industria Finanzas");
                        System.out.println("5. Volver al menú principal");
                        System.out.println("0. Salir");

                        int opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("*** ESTRUCTURA DE COMPENSACIÓN INDUSTRIA TECNOLOGIA ***");
                                industriaTec.estructuraCompensacion();
                                break;
                            case 2:
                                System.out.println("*** ESTRUCTURA DE COMPENSACIÓN INDUSTRIA MANUFACTURA ***");
                                indrustriaManu.estructuraCompensacion();
                                break;
                            case 3:
                                System.out.println("*** ESTRUCTURA DE COMPENSACIÓN INDUSTRIA SERVICIOS ***");
                                industriaServi.estructuraCompensacion();
                                break;
                            case 4:
                                System.out.println("*** ESTRUCTURA DE COMPENSACIÓN INDUSTRIA FINANZAS ***");
                                industriaFinan.estructuraCompensacion();
                                break;
                            case 9:
                                System.out.println("Volviendo al menú Principal");
                                break;
                            case 0:
                                System.out.println("Saliendo del programa.");
                                return;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                        if (opcion == 9) {
                            break;
                        }
                        break;
                    }//Finaliza la impresión del submenú 3
                case 4:
                    while (true) {

                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Beneficios Industria Tecnología");
                        System.out.println("2. Beneficios Industria Manufactura");
                        System.out.println("3. Beneficios Industria Servicios");
                        System.out.println("4. Beneficios Industria Finanzas");
                        System.out.println("5. Volver al menú principal");
                        System.out.println("0. Salir");

                        int opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("*** BENEFICIOS INDUSTRIA TECNOLOGIA ***");
                                industriaTec.beneficios();
                                break;
                            case 2:
                                System.out.println("*** BENEFICIOS INDUSTRIA MANUFACTURA ***");
                                indrustriaManu.beneficios();
                                break;
                            case 3:
                                System.out.println("*** BENEFICIOS INDUSTRIA SERVICIOS ***");
                                industriaServi.beneficios();
                                break;
                            case 4:
                                System.out.println("*** BENEFICIOS INDUSTRIA FINANZAS ***");
                                industriaFinan.beneficios();
                                break;
                            case 9:
                                System.out.println("Volviendo al menú Principal");
                                break;
                            case 0:
                                System.out.println("Saliendo del programa.");
                                return;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                        if (opcion == 9) {
                            break;
                        }
                        break;
                    }//Finaliza la impresión del submenú 4
                case 5:
                    while (true) {

                        System.out.println("Seleccione una opción:");
                        System.out.println("1. Programa de desarrollo profesional Industria Tecnología");
                        System.out.println("2. Programa de desarrollo profesional Industria Manufactura");
                        System.out.println("3. Programa de desarrollo profesional Industria Servicios");
                        System.out.println("4. Programa de desarrollo profesional Industria Finanzas");
                        System.out.println("5. Volver al menú principal");
                        System.out.println("0. Salir");

                        int opcion = scanner.nextInt();

                        switch (opcion) {
                            case 1:
                                System.out.println("*** PROGRAMA DE DESARROLLO PROFESIONAL INDUSTRIA TECNOLOGIA ***");
                                industriaTec.progamaDesarolloProfesional();
                                break;
                            case 2:
                                System.out.println("*** PROGRAMA DE DESARROLLO PROFESIONAL INDUSTRIA MANUFACTURA ***");
                                indrustriaManu.progamaDesarolloProfesional();
                                break;
                            case 3:
                                System.out.println("*** PROGRAMA DE DESARROLLO PROFESIONAL INDUSTRIA SERVICIOS ***");
                                industriaServi.progamaDesarolloProfesional();
                                break;
                            case 4:
                                System.out.println("*** PROGRAMA DE DESARROLLO PROFESIONAL INDUSTRIA FINANZAS ***");
                                industriaFinan.progamaDesarolloProfesional();
                                break;
                            case 9:
                                System.out.println("Volviendo al menú Principal");
                                break;
                            case 0:
                                System.out.println("Saliendo del programa.");
                                return;
                            default:
                                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                        }
                        if (opcion == 9) {
                            break;
                        }
                        break;
                    }//Finaliza la impresión del submenú 3
            }//Finaliza la impresión del menú principal
        }
    }
        public static void informeInduTec(){

        }



        public static void informeInduManu() {


        }

        public static void informeInduServi() {

        }


        public static void informeInduFina() {

        }

    }