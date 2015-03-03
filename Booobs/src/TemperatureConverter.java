
public class TemperatureConverter {


	public String convertTemp (int temperature, char convertTo)
	{
		String value = null;
		float convertTemp = 0;
		switch (convertTo) {
		case 'F':
			convertTemp = (temperature-32)*5/9;
			break;
		case 'C':
			convertTemp = temperature;
			break;
			default:
				System.out.println("Нет такого типа темпиратуры!");
				break;
		}
	
		value = String.valueOf(convertTemp);
		
	return value;
		
		
		
		
		
	}}

