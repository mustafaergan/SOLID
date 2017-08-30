package correct;

public class Transportation{
	
	private ITransportation iTransportation;
	
	public void transportationType(ITransportation iTransportation) {
		this.iTransportation = iTransportation;
	}
	
	public void valid(){
		this.iTransportation.ticket();
	}

}
