package wrong;

public class Tofas implements ICar {

	@Override
	public void brake() {
		
	}

	/**
	 * Tofas abs desteklemekte bu yazılım dizaynı yanlis olmaktadir.
	 */
	@Override
	public void abs() {	
		throw new UnsupportedOperationException("Tofas UnSupported");
	}
	
}
