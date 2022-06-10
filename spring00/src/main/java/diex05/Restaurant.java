package diex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	//@Autowired
	@Setter(onMethod_ = @Autowired)
	Chef chef;

}
