package SalarioDescuentos.DAL;

import java.util.ArrayList;

import SalarioDescuentos.EL.EmpleadoEL;

public class EmpleadoTCDAL extends EmpleadoDAL {

	@Override
	public ArrayList<EmpleadoEL> AddEmployee(ArrayList<EmpleadoEL> pEmpleados, EmpleadoEL pEmpleado) {
		// TODO Auto-generated method stub
		return super.AddEmployee(pEmpleados, pEmpleado);
	}

	@Override
	public boolean existEmployee(ArrayList<EmpleadoEL> empleados, int id) {
		// TODO Auto-generated method stub
		return super.existEmployee(empleados, id);
	}

	@Override
	public boolean removeEmployee(ArrayList<EmpleadoEL> pEmpleados, int pId) {
		// TODO Auto-generated method stub
		return super.removeEmployee(pEmpleados, pId);
	}
	
}
