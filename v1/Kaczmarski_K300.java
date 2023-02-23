public class Kaczmarski_K300 {
	public static void main(String[] args) {
		Pieniadze wyplata = new Pieniadze();
		wyplata.rozliczenie();
    }
}

class Pieniadze{
	int n=1026;														//n to kwota, kt�r� podajemy i chcemy wyp�aci�
	void rozliczenie(){
		int nominaly[] = {500, 300, 100, 50, 30, 10, 5, 3, 1};		//tablica z mo�liwymi do wyp�acenia nomina�ami
		System.out.println("Kwota do wyp�acenia: " +n+"z�");

		for(int i=0; i<nominaly.length; i++){						//Przejscie przez tablice nominaly[]
			int k=0;												//licznik ile banknotow
			while(n >= nominaly[i]){								//Dopoki n jest wieksze lub rowne danej wartosci w tablicy nominaly
				n=n-nominaly[i];									//odjecie od naszej aktualnej kwoty, wartosci pewnego nominalu[ w zaleznosci od i]
				k=k+1;												//za kazdym razem gdy n jest wieksze lub rowne nominaly[i] dodaje sie +1 do zmiennej k
																	//zmienna k zlicza ile razy dany nominal miesci sie w naszej kwocie az do momentu gdy n bedzie mniejsze niz nominaly
			}
			System.out.println("Nomina� " + nominaly[i]+ "z� zosta� wyp�acony " + k+ " razy.");		//drukowanie
		}
	}
}