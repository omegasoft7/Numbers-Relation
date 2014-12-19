import com.NRF.NRF;
import com.NRF.NRFObject;
import com.NRF.NRFValueType;
import com.NRF.NRFVariableType;



public class mainSample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		NRF nrf = NRF.getInstance();
		nrf.ADDNRFObject(new NRFObject("Field01", "Field01", 16, NRFVariableType.INTEGER, NRFValueType.FIXED));
		
		nrf.ConnectToDB("address.com", "username", "pass", "name");
		nrf.Start();
	
	}

}
