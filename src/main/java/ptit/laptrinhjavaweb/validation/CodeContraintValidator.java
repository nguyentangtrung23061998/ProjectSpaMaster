package ptit.laptrinhjavaweb.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CodeContraintValidator implements ConstraintValidator<ValidatorCode,String> {
	
	private String codePrefix;

	@Override
	public void initialize(ValidatorCode theValidatorCode) {
		codePrefix= theValidatorCode.value();
	}
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext context) {
		boolean result;
		if(theCode != null) {
			result = theCode.startsWith(codePrefix);
		}else{
			result=true;
		}
		return result;
	}

}
