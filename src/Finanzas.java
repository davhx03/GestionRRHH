public class Finanzas extends Industria {

    public Finanzas(Desarrollador[] desarrolladores, AnalistaFinanciero[] analistas, IngenieroProduccion[] ingenieros, ConsultorNegocios[] consultores) {
        super(desarrolladores, analistas, ingenieros, consultores);
    }

    public Finanzas() {
    }

    @Override
    public void estructuraCompensacion() {
        System.out.println("Se define la siguiente estructura de compensación de acuerdo a la duración en la Industria y sobre el sueldo base: ");
        System.out.println("Más 1 año: 5% ");
        System.out.println("Más de 5 años: 7.5%");
        System.out.println("Más de 10 años: 10% ");
    }

    @Override
    public void beneficios() {
        String[] beneficios = new String[2];
        beneficios[0] = "Descuento del 20% en universidades locales";
        beneficios[1] = "Medicina prepagada";
        for(int i=0;i<beneficios.length;i++){
            System.out.println(beneficios[i]);
        }
    }

    @Override
    public void progamaDesarolloProfesional() {
        String[] programaDesarrolloProfesional = new String[2];
        programaDesarrolloProfesional[0] = "Formación en habilidades blandas";
        programaDesarrolloProfesional[1] = "Formación profesional en finanzas";
        for(int i=0;i<programaDesarrolloProfesional.length;i++){
            System.out.println(programaDesarrolloProfesional[i]);
        }
    }
}
