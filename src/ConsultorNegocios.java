public class ConsultorNegocios extends Empleado {
    public ConsultorNegocios(String nombre, String rol, String ubicacion, Long salarioBase, Long bonificaciones, String nivelJerarquico, String[] idiomasHablados, String[] habilidadesTecnicas) {
        super(nombre, rol, ubicacion, salarioBase, bonificaciones, nivelJerarquico, idiomasHablados, habilidadesTecnicas);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }
}
