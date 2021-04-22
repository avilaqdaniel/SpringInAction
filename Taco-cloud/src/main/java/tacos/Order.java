package tacos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.Data;

@Data
public class Order {
	
	private Long id;
	private Date placedAt;
	
	@NotBlank(message = "El nombre es requerido")
	private String name;
	
	@NotBlank(message = "El nombre de la calle es requerido")
	private String street;
	
	@NotBlank(message = "La ciudad es requerida")
	private String city;
	
	@NotBlank(message = "El estado es requerido")
	private String state;
	
	@NotBlank(message = "El zip code es requerido")
	private String zip;
	
	@CreditCardNumber(message = "No es un número de tarjeta válido")
	private String ccNumber;
	
	@Pattern(regexp="^(0[1-9]|1[0-2])([\\/])([1-9][0-9])$",
			message = "Debe ser de formato MM/YY")
	private String ccExpiration;
	
	@Digits(integer = 3, fraction = 0, message = "CVV inválido")
	private String ccCVV;
	
	private List<Taco> tacos = new ArrayList<>();
	
	public void addDesign(Taco design) {
		this.tacos.add(design);
	}
}
