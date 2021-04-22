package tacos;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	
	private Long id;
	private Date createdAt;
	
	@NotNull
	@Size(min=5, message = "El nombre debe tener al menos 5 caracteres")
	private String name;
	
	@NotNull
	@Size(min=1, message = "Debes elegir al menos 1 ingrediente")
	private List<Ingredient> ingredients;

}
