package java17.ex07;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;

/**
 * Exercice 07 - Instant
 */
public class DateAndTime_07_Test {

	@Test
	public void test_date_to_localdate() throws Exception {

		// TODO Créer une date Java 1 (12/02/2017)
		@SuppressWarnings("deprecation")
		Date date = new Date(117, 01, 12);

		// TODO transformer la date en Instant
		Instant dateInstant = date.toInstant();

		// TODO transformer la date en LocalDate

		ZoneId currentZone = ZoneId.systemDefault();
		LocalDate result = LocalDate.ofInstant(dateInstant, currentZone);

		System.out.println(result);
		
		// TODO valoriser les différentes variables afin de rendre le test passant

		assertThat(result.getYear(), is(2017));
		assertThat(result.getMonth(), is(Month.FEBRUARY));
		assertThat(result.getDayOfMonth(), is(12));
		

	}
}
