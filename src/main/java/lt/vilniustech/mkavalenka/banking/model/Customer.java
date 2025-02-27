package lt.vilniustech.mkavalenka.banking.model;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
@Table(name = "customer")
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "suffix")
    private String suffix;

    @XmlElementWrapper(name = "accounts")
    @XmlElement(name = "account")
    @OneToMany
    @JoinTable(
            name = "Customer_Account",
            joinColumns = @JoinColumn(name = "customer_id"),
            inverseJoinColumns = @JoinColumn(name = "account_id")
    )
    private List<Account> accounts;
}




