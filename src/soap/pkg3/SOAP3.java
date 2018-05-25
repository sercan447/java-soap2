
package soap.pkg3;

import javax.xml.ws.Endpoint;

public class SOAP3 {

   
    public static void main(String[] args) {
       
            Endpoint ep = Endpoint.create(new CalculatorImpl());
                     ep.publish("http://localhost:8080/SOAP-2/Hesapmakinesi");
        
    }
    
}
