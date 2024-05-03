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

    public Industria() {

    }

    public Desarrollador[] getDesarrolladores() {
        return desarrolladores;
    }

    public void setDesarrolladores(Desarrollador[] desarrolladores) {
        this.desarrolladores = desarrolladores;
    }

    public AnalistaFinanciero[] getAnalistas() {
        return analistas;
    }

    public void setAnalistas(AnalistaFinanciero[] analistas) {
        this.analistas = analistas;
    }

    public IngenieroProduccion[] getIngenieros() {
        return ingenieros;
    }

    public void setIngenieros(IngenieroProduccion[] ingenieros) {
        this.ingenieros = ingenieros;
    }

    public ConsultorNegocios[] getConsultores() {
        return consultores;
    }

    public void setConsultores(ConsultorNegocios[] consultores) {
        this.consultores = consultores;
    }

    public void generarInformeEmpleados() {

       if (desarrolladores != null){
           System.out.println("\nDesarrolladores: ");
           for (int i = 0; i < desarrolladores.length; i++) {
               desarrolladores[i].mostrarEmpleado();
           }
           System.out.println("\n________________________");
       }
       if (analistas != null){
        System.out.println("\nAnalistas Financieros: ");
        for (int i = 0; i < analistas.length; i++) {
            analistas[i].mostrarEmpleado();
        }
           System.out.println("\n________________________");
       }
   if (ingenieros != null){
        System.out.println("\nIngenieros de producción: ");
        for (int i = 0; i < ingenieros.length; i++) {
            ingenieros[i].mostrarEmpleado();
        }
       System.out.println("\n________________________");
   }
     if (consultores != null){
        System.out.println("\nConsultores de Negocios: ");
        for (int i = 0; i < consultores.length; i++) {
            consultores[i].mostrarEmpleado();
        }
         System.out.println("\n________________________");
     }
    }
}
