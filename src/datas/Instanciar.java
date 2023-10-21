package datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Instanciar {

	public static void main(String[] args) {

		//Data atual local
		LocalDate data01 = LocalDate.now();
		System.out.println(data01);
		//Output: 2023-10-21
		
		//Data-Hora atual local
		LocalDateTime data02 = LocalDateTime.now();
		System.out.println(data02);
		//Output: 2023-10-21T16:00:46.084959900
		
		//Data-Hora GMT (3 horas a mais/horário de Londres)
		Instant data03 = Instant.now();
		System.out.println(data03);
		//Output: 2023-10-21T19:01:28.432878200Z
		
		//Data-hora a partir de um texto, formato ISO 8601
		LocalDate data04 = LocalDate.parse("2023-10-21");
		System.out.println(data04);
		LocalDateTime data05 = LocalDateTime.parse("2023-10-21T16:04:25");
		System.out.println(data05);
		Instant data06 = Instant.parse("2023-10-21T16:04:25Z");
		System.out.println(data06);
		Instant data07 = Instant.parse("2023-10-21T16:04:25-03:00");
		System.out.println(data07);
		//Output: 2023-10-21
		//Output: 2023-10-21T16:04:25
		//Output: 2023-10-21T16:04:25Z - 
		//Output: 2023-10-21T19:04:25Z - horário GMT(Londres) acrescentou 3 horas
		
		//Data-hora a partir de um texto formatado
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime data08 = LocalDateTime.parse("20/07/2023 16:16:32", fmt1);
		//Opcional: LocalDateTime.parse("20/07/2023 16:16:32", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))
		System.out.println(data08);
		//Output: 2023-07-20T16:16:32
	}

}
