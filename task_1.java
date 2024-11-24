@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	boolean expected = true;  // ожидаемое значение
    boolean actual = false;  // фактическое значение
    assertEquals("Мя", expected, isAdult); // Напиши код здесь
}
