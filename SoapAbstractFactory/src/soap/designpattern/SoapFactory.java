package soap.designpattern;

public class SoapFactory extends SourceSoapFactory{

	@Override
	public Soap getSoapType(String type) {
		if(type.equals("Normal"))
			return new Bath();
		else if(type.equals("Hand"))
			return new HandBath();
		else if(type.contentEquals("Shower"))
			return new ShowerBath();
		else
		    return null;
	}
   
}
