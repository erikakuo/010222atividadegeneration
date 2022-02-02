package br.com.generation.atividades010222;

public class TestaCarCavPre {

	public static void main(String[] args) {
					
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Tufão");
		cachorro.setIdade(11);
		cachorro.setSom(" latindo: auau");
		cachorro.setCorrer(" correndo...");
		
		cavalo.setNome("Pelé");
		cavalo.setIdade(9);
		cavalo.setSom("relinchando... iiiihhhhh");
		cavalo.setCorrer(" galopando...");
		
		preguica.setNome("Xuxa");
		preguica.setIdade(5);
		preguica.setSom("A preguiça não está emitindo som, porque esta com preguiça... ");
		preguica.setSubir("cansada pra subir...");
		
		
		System.out.println("O nome do cachorro é " + cachorro.getNome());
		System.out.println("A  idade do cachorro é " + cachorro.getIdade());
		System.out.println("O cachorro está " + cachorro.getSom());
		System.out.println("O cachorro está" + cachorro.getCorrer());
		System.out.println();
		
		System.out.println("O nome do cavalo é " + cavalo.getNome());
		System.out.println("A idade é de " + cavalo.getIdade());
		System.out.println("O cavalo está " + cavalo.getSom());
		System.out.println("O cavalo está " + cavalo.getCorrer());
		System.out.println();
		
		System.out.println("O nome da preguiça é "+ preguica.getNome());
		System.out.println("A idade é "+ preguica.getIdade());
		System.out.println(""+ preguica.getSom());
		System.out.println("A preguiça está "+ preguica.getSubir());

	}
}
