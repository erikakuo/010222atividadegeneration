package br.com.generation.atividades010222;

public class TestaCarCavPre {

	public static void main(String[] args) {
					
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Tuf�o");
		cachorro.setIdade(11);
		cachorro.setSom(" latindo: auau");
		cachorro.setCorrer(" correndo...");
		
		cavalo.setNome("Pel�");
		cavalo.setIdade(9);
		cavalo.setSom("relinchando... iiiihhhhh");
		cavalo.setCorrer(" galopando...");
		
		preguica.setNome("Xuxa");
		preguica.setIdade(5);
		preguica.setSom("A pregui�a n�o est� emitindo som, porque esta com pregui�a... ");
		preguica.setSubir("cansada pra subir...");
		
		
		System.out.println("O nome do cachorro � " + cachorro.getNome());
		System.out.println("A  idade do cachorro � " + cachorro.getIdade());
		System.out.println("O cachorro est� " + cachorro.getSom());
		System.out.println("O cachorro est�" + cachorro.getCorrer());
		System.out.println();
		
		System.out.println("O nome do cavalo � " + cavalo.getNome());
		System.out.println("A idade � de " + cavalo.getIdade());
		System.out.println("O cavalo est� " + cavalo.getSom());
		System.out.println("O cavalo est� " + cavalo.getCorrer());
		System.out.println();
		
		System.out.println("O nome da pregui�a � "+ preguica.getNome());
		System.out.println("A idade � "+ preguica.getIdade());
		System.out.println(""+ preguica.getSom());
		System.out.println("A pregui�a est� "+ preguica.getSubir());

	}
}
