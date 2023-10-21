package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Formatar {

	public static void main(String[] args) {
		
		//https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		
		LocalDate data04 = LocalDate.parse("2023-10-21");
		LocalDateTime data05 = LocalDateTime.parse("2023-10-21T16:04:25");
		Instant data06 = Instant.parse("2023-10-21T16:04:25Z");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Pegando o fuso horário do computador do usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println(data04.format(fmt1)); //Opcional: (fmt1.format(data04)
		//Output: 21/10/2023
		
		System.out.println(data05.format(fmt2));
		//Output: 21/10/2023 16:04
		
		System.out.println(fmt3.format(data06)); //Instant não tem o método .format
		//Ouput: 21/10/2023 13:04 - Horário de "Londres" seria 16:04 / GMT-3 (SP)

		
		
	}
}
