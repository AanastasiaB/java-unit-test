import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*; // Напиши аннотацию для параметризованных тестов

@RunWith(Parameterized.class)
public class CheckIsAdultTest {
	
  private final int age;
  private final boolean result;

  public CheckIsAdultTest(int age, boolean result) {
	this.age = age; // Инициализируй поля класса в конструкторе
  this.result = result;
  }

  @Parameterized.Parameters  // Пометь метод аннотацией для параметров
  public static Object[][] getTextData() {
	return new Object[][] {
		{ 15, false},
        { 18, true},
        { 21, true}, 
        { 19, true},// Заполни массив тестовыми данными и ожидаемым результатом
    };
  }

  @Test
  public void checkIsAdultWhenAgeThenResult() {
	Program program = new Program();
	 int actual = age; // Передай сюда возраст пользователя
    boolean isAdult = program.checkIsAdult(age);
	// Сравни полученный и ожидаемый результаты, не забудь про сообщение об ошибке
    assertEquals("Мя", result, isAdult);
	}
}
