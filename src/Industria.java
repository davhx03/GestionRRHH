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

    @Override
    public void generarInformeNomina() {
        Long nominaDev= 0L;
        Long nominaAnalistas=0L;
        Long nominaIng=0L;
        Long nominaConsultores=0L;
        Long nominaIndustria=0L;
        System.out.println("El informe de nómina de la Industria seleccionada es el siguiente: ");
        if (desarrolladores != null){
            System.out.println("\nÁrea de Desarrolladores: ");
            for (int i = 0; i < desarrolladores.length; i++) {
                desarrolladores[i].calcularSalario();
                System.out.println(desarrolladores[i].getNombre()+": "+ desarrolladores[i].getSalarioTotal());
                nominaDev += desarrolladores[i].getSalarioTotal();
            }
            nominaIndustria += nominaDev;
            System.out.println("La nómina del área de desarrolladores es:"+nominaDev+"\n");
        }
        if (analistas != null){
            System.out.println("\nÁrea de Analistas Financieros: ");
            for (int i = 0; i < analistas.length; i++) {
                analistas[i].calcularSalario();
                System.out.println(analistas[i].getNombre()+": "+ analistas[i].getSalarioTotal());
                nominaAnalistas += analistas[i].getSalarioTotal();
            }
            nominaIndustria += nominaAnalistas;
            System.out.println("La nómina del área de analistas financieros es:"+nominaAnalistas+"\n");
        }
        if (ingenieros != null){
            System.out.println("\nIngenieros de producción: ");
            for (int i = 0; i < ingenieros.length; i++) {
                ingenieros[i].calcularSalario();
                System.out.println(ingenieros[i].getNombre()+": "+ ingenieros[i].getSalarioTotal());
                nominaIng= ingenieros[i].getSalarioTotal();
            }
            nominaIndustria += nominaIng;
            System.out.println("La nómina total del área de ingenieros de producción es: "+nominaIng+"\n");
        }
        if (consultores != null){
            System.out.println("\nConsultores de Negocios: ");
            for (int i = 0; i < consultores.length; i++) {
                consultores[i].calcularSalario();
                System.out.println(consultores[i].getNombre()+": "+ consultores[i].getSalarioTotal());
                nominaConsultores= consultores[i].getSalarioTotal();
            }
            nominaIndustria += nominaConsultores;
            System.out.println("La nómina del área de analistas financieros es:"+nominaConsultores+"\n");
        }
        System.out.println("\n \nLa nomina total de la industria es: "+ nominaIndustria);
    }
}
