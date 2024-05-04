public class Tecnologia extends Industria{


    public Tecnologia(Desarrollador[] desarrolladores, AnalistaFinanciero[] analistas, IngenieroProduccion[] ingenieros, ConsultorNegocios[] consultores) {
        super(desarrolladores, analistas, ingenieros, consultores);
    }

    public Tecnologia() {
    }

    @Override
    public void estructuraCompensacion() {
        System.out.println("Compensacion segun ubicacion ");
        System.out.println("Compensacion (Antioquia):15% + conexion internet");
        System.out.println("Compensacion (Valle del Cauca):15% + conexion internet");
        System.out.println("Compensacion (Atlántico):15% + conexion internet");
        System.out.println("Compensacion (Bolívar):10% + conexion internet");
        System.out.println("Compensacion (N. de Santander):10% + conexion internet");
        System.out.println("Compensacion (Tolima):10% + conexion internet");
    }


    @Override
    public void beneficios() {

        String[] beneficios = new String[3];
        beneficios[0]="30% Descuento en SmarFit";
        beneficios[1]="20% Descuento en H&M";
        beneficios[2]="Seguro SURA";

                for(int i=0;i<beneficios.length;i++){
                    System.out.println(beneficios[i]);
                }
    }

    @Override
    public void progamaDesarolloProfesional() {

            String[] progamaDesarolloProfesional = new String[3];
            progamaDesarolloProfesional[0]="Desarrollo Web Completo: HTML, CSS, JavaScript, Node.js y MongoDB";
            progamaDesarolloProfesional[1]="Seguridad Informática y Hacking Ético";
            progamaDesarolloProfesional[2]="Desarrollo Ágil de Software con Scrum y Agile";

            for(int i=0;i<progamaDesarolloProfesional.length;i++){
                System.out.println(progamaDesarolloProfesional[i]);
            }

    }

}
