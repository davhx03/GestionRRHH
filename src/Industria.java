public abstract class Industria implements Complejidades{
    private Desarrollador[] desarrolladores;
    private AnalistaFinanciero[] analistas;
    private IngenieroProduccion[] ingenieros;
    private ConsultorNegocios[] consultores;

    public Industria(Desarrollador[] desarrolladores, AnalistaFinanciero[] analistas, IngenieroProduccion[] ingenieros, ConsultorNegocios[] consultores) {
        this.desarrolladores = desarrolladores;
        this.analistas = analistas;
        this.ingenieros = ingenieros;
        this.consultores = consultores;
    }
    public void generarInformeEmpleados() {
        System.out.println("\nDesarrolladores: ");
        for (int i = 0; i < desarrolladores.length; i++) {
            desarrolladores[i].mostrarEmpleado();
        }
        System.out.println("\n________________________");
        System.out.println("\nAnalistas Financieros: ");
        for (int i = 0; i < analistas.length; i++) {
            analistas[i].mostrarEmpleado();
        }
        System.out.println("\n________________________");
        System.out.println("\nIngenieros de producción: ");
        for (int i = 0; i < ingenieros.length; i++) {
            ingenieros[i].mostrarEmpleado();
        }
        System.out.println("\n________________________");
        System.out.println("\nConsultores de Negocios: ");
        for (int i = 0; i < consultores.length; i++) {
            consultores[i].mostrarEmpleado();
        }
        System.out.println("\n________________________");
    }

}
