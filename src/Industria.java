public abstract class Industria {
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
}
