public abstract class Empleado implements CalcularSalario {
    private String nombre;
    private String rol;
    private String ubicacion;
    private Long salarioBase;
    private Long bonificaciones;
    private Long salarioTotal;
    private String nivelJerarquico;
    private String[] idiomasHablados;
    private String[] habilidadesTecnicas;

    public Empleado(String nombre, String rol, String ubicacion, Long salarioBase, Long bonificaciones, String nivelJerarquico, String[] idiomasHablados, String[] habilidadesTecnicas) {
        this.nombre = nombre;
        this.rol = rol;
        this.ubicacion = ubicacion;
        this.salarioBase = salarioBase;
        this.bonificaciones = bonificaciones;
        this.nivelJerarquico = nivelJerarquico;
        this.idiomasHablados = idiomasHablados;
        this.habilidadesTecnicas = habilidadesTecnicas;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getRol() {

        return rol;
    }

    public void setRol(String rol) {

        this.rol = rol;
    }

    public String getUbicacion() {

        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {

        this.ubicacion = ubicacion;
    }

    public Long getSalarioBase() {

        return salarioBase;
    }

    public void setSalarioBase(Long salarioBase) {

        this.salarioBase = salarioBase;
    }

    public Long getBonificaciones() {

        return bonificaciones;
    }

    public void setBonificaciones(Long bonificaciones) {

        this.bonificaciones = bonificaciones;
    }

    public String getNivelJerarquico() {

        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {

        this.nivelJerarquico = nivelJerarquico;
    }

    public String[] getIdiomasHablados() {

        return idiomasHablados;
    }

    public void setIdiomasHablados(String[] idiomasHablados) {

        this.idiomasHablados = idiomasHablados;
    }

    public String[] getHabilidadesTecnicas() {

        return habilidadesTecnicas;
    }

    public void setHabilidadesTecnicas(String[] habilidadesTecnicas) {

        this.habilidadesTecnicas = habilidadesTecnicas;
    }

    public Long getSalarioTotal() {
        return salarioTotal;
    }

    @Override
    public long calcularSalario() {
        salarioTotal = getSalarioBase()+getBonificaciones();
        return salarioTotal;
    }

    @Override
    public void mostrarEmpleado() {
        System.out.println("\nNombre: " + nombre + "\nRol: " + rol +"\nSalario Total:"+ calcularSalario()+ "\nNivel Jerarquico: " + nivelJerarquico + "\n Idiomas Hablados: ");

        for (int i = 0; i < idiomasHablados.length; i++) {
            System.out.print(idiomasHablados[i] + ", ");
        }
        System.out.println("\nHabilidades técnicas: ");
        for (int i = 0; i < habilidadesTecnicas.length; i++) {
            System.out.print(habilidadesTecnicas[i] + ", ");
        }
    }
}
