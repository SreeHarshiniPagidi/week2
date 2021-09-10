package soap.designpattern;

public class Application {

	public static void main(String[] args) {
SourceSoapFactory soap=FactoryCreator.getSourceSoapFactory();
System.out.println(soap.getSoapType("Normal").getType());	
System.out.println(soap.getSoapType("Hand").getType());	
System.out.println(soap.getSoapType("Shower").getType());	

	}

}
