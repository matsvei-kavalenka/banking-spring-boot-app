package lt.vilniustech.mkavalenka.banking.service;

import lt.vilniustech.mkavalenka.banking.model.Customer;
import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

@Service
public class XMLTransformationService {
    public void transformToXML (Customer customer) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file = new File("customers.xml");
            jaxbMarshaller.marshal(customer, file);

            // Optional: Print XML to console
            jaxbMarshaller.marshal(customer, System.out);

        } catch (JAXBException e) {
            System.out.println(e.getMessage());

        }

    }
}
