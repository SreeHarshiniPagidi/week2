package soap.designpattern;

public class FactoryCreator {
	
  public static SourceSoapFactory getSourceSoapFactory() {
	  return new SoapFactory();
  }
  
}
