public class Servicios extends Industria{

    public Servicios(Desarrollador[] desarrolladores, AnalistaFinanciero[] analistas, IngenieroProduccion[] ingenieros, ConsultorNegocios[] consultores) {
        super(desarrolladores, analistas, ingenieros, consultores);
    }

    public Servicios() {
    }

    @Override
    public void estructuraCompensacion() {
        System.out.println("Compensacion segun ubicacion ");
        System.out.println("Compensacion (Antioquia):15% + en bonificaciones");
        System.out.println("Compensacion (Valle del Cauca):25% + en bonificaciones");
        System.out.println("Compensacion (Atlántico):20% + en bonificaciones");
        System.out.println("Compensacion (Bolívar):25% + en bonificaciones");
        System.out.println("Compensacion (N. de Santander):15% + en bonificaciones");
        System.out.println("Compensacion (Tolima):20% + en bonificaciones");
    }

    @Override
    public void beneficios() {

        String[] beneficios = new String[3];
        beneficios[0]="30% Descuento en H&M";
        beneficios[1]="20% EXITO";
        beneficios[2]="COMFAMA";

        for(int i=0;i<beneficios.length;i++){
            System.out.println(beneficios[i]);
        }
    }

    @Override
    public void progamaDesarolloProfesional() {

        String[] progamaDesarolloProfesional = new String[5];
        progamaDesarolloProfesional[0]="Servicio al Cliente y Experiencia del Cliente";
        progamaDesarolloProfesional[1]="Gestión de Proyectos para Prestadores de Servicios";
        progamaDesarolloProfesional[2]="Marketing y Promoción de Servicios";
        progamaDesarolloProfesional[3]="Desarrollo de Habilidades Empresariales para Prestadores de Servicios";
        progamaDesarolloProfesional[4]="Análisis de Datos y Métricas de Desempeño en Servicios";
        for(int i=0;i<progamaDesarolloProfesional.length;i++){
            System.out.println(progamaDesarolloProfesional[i]);
        }

    }
}
