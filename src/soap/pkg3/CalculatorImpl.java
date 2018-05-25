
package soap.pkg3;

import javax.jws.WebService;


@WebService(endpointInterface = "soap.pkg3.CalculatorI")
public class CalculatorImpl  implements CalculatorI{

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a -b;
        }

    @Override
    public int multiplay(int a, int b) {
        
        return a * b;
        }

    @Override
    public int divide(int a, int b) {
        return a / b;
        }

    @Override
    public String Mesajlar(String a, double c) {
        
        return "Sercan Beyoglu : "+a +" - "+c;
        }
    
}
