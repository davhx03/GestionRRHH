public abstract class Empleado implements CalcularSalario {
    private String nombre;
    private String rol;
    private String ubicacion;
    private Long salarioBase;
    private Long bonificaciones;
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

    @Override
    public double calcularSalario() {
        return salarioBase + bonificaciones;
    }
}
