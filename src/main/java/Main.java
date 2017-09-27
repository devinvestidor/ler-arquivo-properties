
public class Main {

	public static void main(String[] args) {
		LeitorProperties leitorProperties = new LeitorProperties("conexao.properties");
		System.out.println("URL: " + leitorProperties.getValor("url"));
		System.out.println("USER: " + leitorProperties.getValor("user"));
		System.out.println("PASSWORD: " + leitorProperties.getValor("password"));
		System.out.println("DRIVER: " + leitorProperties.getValor("driver"));
	}
}
