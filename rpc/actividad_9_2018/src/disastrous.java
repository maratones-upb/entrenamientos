import java.math.BigInteger;
import java.util.Scanner;

public class disastrous {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int nExperimentos;
		long biResta;
		nExperimentos = scan.nextInt();
		BigInteger resultado = new BigInteger("1");
		boolean error = false;
		
		for(int i = 0; i < nExperimentos; i++) {
			
			resultado = resultado.multiply(new BigInteger("2"));
			biResta = scan.nextLong();
			resultado = resultado.subtract(new BigInteger(String.valueOf(biResta)));
			
			if(resultado.compareTo(new BigInteger("0")) < 0) {
				error = true;
				break;
			}
		}
		if(error) {
			System.out.println("error");
		}else {
			System.out.println(resultado.mod(new BigInteger("1000000007")));
		}
		scan.close();
	}
}
