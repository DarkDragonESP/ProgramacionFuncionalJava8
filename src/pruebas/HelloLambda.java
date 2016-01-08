package pruebas;

public class HelloLambda {
	interface HelloService {
		String hello(String firstname, String lastname);
	}

	public static void main(String[] args) {

		HelloService helloService=(String firstname, String lastname) -> 
		{ String hello="Hello " + firstname + " " + lastname; return hello; };
		System.out.println(helloService.hello(args[0], args[1]));

		HelloService helloService2=(String firstname, String lastname) -> 
		{ String hello="Hello " + firstname + " " + lastname; return hello; };
		System.out.println(helloService2.hello(args[0], args[1]));
	}
}
