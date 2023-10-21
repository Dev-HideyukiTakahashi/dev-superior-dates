package datas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Calculos {

	public static void main(String[] args) {

		LocalDate data04 = LocalDate.parse("2023-10-21");
		LocalDateTime data05 = LocalDateTime.parse("2023-10-21T16:04:25");
		Instant data06 = Instant.parse("2023-10-21T16:04:25Z");

		// Subtraindo 1 semana
		LocalDate pastWeekLocalDate = data04.minusWeeks(1);
		System.out.println(pastWeekLocalDate); // Output: 2023-10-14

		// Adicionando 7 dias
		LocalDate nextWeekLocalDate = data04.plusDays(7);
		System.out.println(nextWeekLocalDate); // Output: 2023-10-28

		// Adicionando 2 anos
		LocalDate nextYearsLocalDate = data04.plusYears(2);
		System.out.println(nextYearsLocalDate); // Output: 2025-10-21

		// Adicionando 4 horas
		LocalDateTime nextHoursLocalDateTime = data05.plusHours(5);
		System.out.println(nextHoursLocalDateTime); // Output: 2023-10-21T21:04:25

		// Subtraindo 7 dias com Instant
		Instant pastWeekInstant = data06.minus(7, ChronoUnit.DAYS);
		System.out.println(pastWeekInstant); // Output: 2023-10-14T16:04:25Z

		// Adicionando 5 horas com Instant
		Instant nextWeekInstant = data06.plus(5, ChronoUnit.HOURS);
		System.out.println(nextWeekInstant); // Output: 2023-10-21T21:04:25Z

		// Calcular duração
		Duration t1 = Duration.between(nextHoursLocalDateTime, data05);
		System.out.println(t1.toSeconds()); //Output: -18000
		
		Duration t2 = Duration.between(data05, data05.plusDays(10));
		System.out.println(t2.toHours()); //Output: 240
		
		//Com LocalDate não é possível calcular a duração pois não tem informação de hora/segundo
		//Convertendo LocalDate para LocalDateTime com a função .atTime(hora,minuto)
		//Outra opção para conveter .atStartOfDay // automaticamente vai setar 00h00
		Duration t3 = Duration.between(data04.atTime(0,0), pastWeekLocalDate.atStartOfDay());
		System.out.println(t3.toDays()); //Ouput: -7

	}

}
