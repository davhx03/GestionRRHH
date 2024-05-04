public class Manufactura extends Industria {

    public Manufactura(Desarrollador[] desarrolladores, AnalistaFinanciero[] analistas, IngenieroProduccion[] ingenieros, ConsultorNegocios[] consultores) {
        super(desarrolladores, analistas, ingenieros, consultores);
    }

    public Manufactura() {
    }

    @Override
    public void estructuraCompensacion() {
        System.out.println("Se define la siguiente estructura de compensación de acuerdo a la duración en la Empresa y sobre el sueldo base: ");
        System.out.println("Más 1 año: 3% ");
        System.out.println("Más de 5 años: 5%");
        System.out.println("Más de 10 años: 10% ");
        System.out.println("Más de 20 años: 15%");
    }

    @Override
    public void beneficios() {
    String[] beneficios = new String[2];
    beneficios[0] = "20% Dcto en SmartFit";
    beneficios[1] = "Medicina prepagada";
    for(int i=0;i<beneficios.length;i++){
        System.out.println(beneficios[i]);
    }

    }

    @Override
    public void progamaDesarolloProfesional() {
        String[] programaDesarrollo = new String[2];
        programaDesarrollo[0] = "Desarrollo de habilidades blandas";
        programaDesarrollo[1] = "Plataforma de capacitación en línea";
        for(int i=0;i<programaDesarrollo.length;i++){
            System.out.println(programaDesarrollo[i]);
        }
    }
}
