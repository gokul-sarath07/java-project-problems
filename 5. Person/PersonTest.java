import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {

	public static void main(String[] args) {
		PersonTest pt = new PersonTest();
		List<Person> array = getListOfPersons();
		System.out.println("Old Array: " + array.toString());
		List<Person> newArray = pt.getDistictPerson(array);
		System.out.println();
		System.out.println("New Array: " + newArray.toString());
	}


	public static List<Person> getListOfPersons() {
		return Arrays.asList(new Person("james", "michale", "123"),
							 new Person("james", "alex", "445"),
							 new Person("aby", "json", "563"),
							 new Person("james", "maxon", "234"),
							 new Person("aby", "may", "75445"));
	}

	public List<Person> getDistictPerson(List<Person> array) {
		return array.stream().filter(this::getPersonWithName).collect(Collectors.toCollection(() -> new ArrayList<Person>()));
	}

	public boolean getPersonWithName(Person person) {
		return person.getFirstName().equals("james");
	}

//	5. Print distinct Person:
//	Create a class Person with fields firstname, lastname and address. Create a list of object for the same with duplicate firstnames.
//	write a program to print the distict list of persons based on firstname.
}
