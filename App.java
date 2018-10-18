package imcs.xml.jaxbapp;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import trng.imcs.jaxb.Customer;

public class App {

	public static void main(String[] args) {
marshall();
unmarshall();

	}

	private static void marshall() {
	try {
		
		
		Customer customer =new Customer();
		File file = new File("C:\\Users\\pooja\\Desktop/Customer.xml");
		JAXBContext jaxb = JAXBContext.newInstance(Customer.class);
			Marshaller marshal= jaxb.createMarshaller();
				marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshal.marshal(customer, file);
				marshal.marshal(customer, System.out);
	} catch (JAXBException e) {
		e.printStackTrace();
	}
	}

	private static Customer unmarshall() {
		try {

			File file1 = new File("C:\\Users\\pooja\\Desktop\\imcs assg\\eclipse workspace\\xmlProject\\src\\main\\resource\\xml\\Customer.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file1);
			return customer;
		} catch (JAXBException e) {
			e.printStackTrace();
			return null;
		}
		
		
	
	}

}
