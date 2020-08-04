
public class SupTecn extends Empleado{
    
    public SupTecn(String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
    }

    public double salarioSupervisor(int anios){
        double adicional;
        if(anios  == 0){
            return salario;
        }
        else{
            adicional = salario * 0.05;
            salario +=adicional;
            return salario;
        }
    }
    //sueldo = basico mas 5% por c/anio en el trabajo

    public SupTecn(double salario) {
        super(salario);
    }
}