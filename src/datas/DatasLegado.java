package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DatasLegado {
	public static void main(String[] args) throws ParseException {
		
		//Formatador
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//Recebendo data de um String
		Date date1 = sdf1.parse("25/06/2018");
		Date date2 = sdf2.parse("25/06/2018 15:42:07");
		
		System.out.println(date1); //Output: Mon Jun 25 00:00:00 BRT 2018
		System.out.println(date2); //Output: Mon Jun 25 15:42:07 BRT 2018
		System.out.println(sdf1.format(date1)); //Output: 25/06/2018
		System.out.println(sdf2.format(date2)); //Output: 25/06/2018 15:42:07
		
		//Criando data com horário atual
		Date now = new Date();
		System.out.println(now); //Output: Sat Oct 21 18:48:52 BRT 2023  
		
		
		//Manipulando data com Calendar
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));	
		Date d2 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));		
		System.out.println(sdf2.format(d)); //Output: 25/06/2018 12:42:07  (GMT-3:00 / SP)
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d); // 2018-06-25T15:42:07Z
		cal.add(Calendar.HOUR_OF_DAY, 4); //Adicionando 4 horas
		d = cal.getTime();
		System.out.println(sdf2.format(d)); //Output: 25/06/2018 16:42:07
		
		
		//Obtendo uma unidade de tempo
		cal.setTime(d2); // 2018-06-25T15:42:07Z
		int minutes = cal.get(Calendar.MINUTE);
		int month =  1 + cal.get(Calendar.MONTH); // (Calendar começa no índice 0, precisa adicionar + 1)
		System.out.println(minutes); //Output: 42
		System.out.println(month); //Output: 6 
		
		
		
		

		
	}

}
