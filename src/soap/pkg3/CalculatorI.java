
package soap.pkg3;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculatorI {
    
    @WebMethod
    int add(int a,int b);
    
    @WebMethod
    int subtract(int a, int b);
    
    @WebMethod
    int multiplay(int a ,int b);
    
    @WebMethod
    int divide(int a, int b);
    
    @WebMethod
    String Mesajlar(String a,double c);
}
