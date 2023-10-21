package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Converter {
	
	public static void main(String[] args) {
		
		LocalDate data04 = LocalDate.parse("2023-10-21");
		LocalDateTime data05 = LocalDateTime.parse("2023-10-21T16:04:25");
		Instant data06 = Instant.parse("2023-10-21T01:04:25Z");
		
		//Convertendo o horário GMT para horário local da máquina do usuário
		//Nesse caso GMT-3:00 / Horário São Paulo
		LocalDateTime r1 = LocalDateTime.ofInstant(data06, ZoneId.systemDefault());
		System.out.println(r1);
		
		//Convertendo horário GMT para horário de um local específico
		//Nesse caso GMT+1:00 / Horário de Portugal
		LocalDateTime r2 = LocalDateTime.ofInstant(data06, ZoneId.of("Portugal"));
		System.out.println(r2);
		
		//Pegando dados de uma data local
		System.out.println(data04.getDayOfMonth()); //Output: 21
		System.out.println(data04.getYear()); //Output: 2023
		
		//Pegando dados de uma hora
		System.out.println(data05.getHour()); //Output: 16
		System.out.println(data05.getMinute()); //Output: 4
	}

}
