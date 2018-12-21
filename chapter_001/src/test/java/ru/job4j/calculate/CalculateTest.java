package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Test.
*
* @author Sergo Zurabishvili (Kekelidze78@gmail.com)
* @version $Id$
* @since 0.1
*/
public class CalculateTest {
/**
* Test echo.
*/
@Test
public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Sergo Zurabishvili";
    String expect = "Echo, echo, echo : Sergo Zurabishvili"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
}
 
}