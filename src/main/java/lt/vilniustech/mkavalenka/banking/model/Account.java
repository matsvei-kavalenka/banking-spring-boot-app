package lt.vilniustech.mkavalenka.banking.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "account")
@XmlRootElement
public class Account {
    @Id
    @GeneratedValue(strategy =   GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "account_number")
    private BigInteger accountNumber;

    @Column(name = "balance")
    private float balance;
}
