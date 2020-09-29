/* (b)
Implemente uma classe `Truco` que contém como atributos dois 
`Jogador`es, um `Baralho`, uma `cartaVirada` do tipo `Carta`. 
Sua classe deve ter um construtor padrão que inicializa cada um 
desses atributos (basicamente faz `new` neles). 
Deve ter um método privado `embaralharCartas()` que chama o método 
`embaralha()` do `Baralho`, um método privado `distribuirMaos()`, 
que deve distribuir três cartas do baralho para cada jogador 
(lembre-se do método `receberCarta` de `Jogador`). 
Você também deve implementar um método `inicializaManilha()`, 
que põe uma carta na meso (distribui uma carta do baralho e atribui a 
`cartaVirada`). Esses métodos que você implementar, 
vão complementar a classe truco. 
Para sua referência, segue o método `jogar()`, 
que implementa a lógica básica do início do jogo:
*/
public class Truco {
    private Jogador jogador1;
	private Jogador jogador2;
    private Carta cartaVirada;
    private Baralho baralho;
    
    public Truco() {
        this.jogador1 = new Jogador();
    	this.jogador2 = new Jogador();
        this.cartaVirada = new Carta();
        this.baralho = new Baralho();
    }

    public void jogar() {
        embaralhaCartas();
        distribuiMaos();
        inicializaManilha();
        imprimeMesa();
    }

    private void imprimeMesa() {
        System.out.println("Apenas um placeholder para a impressão de mesa.");
        System.out.println("Você não precisa implementar esse método.");
    }

    private void embaralhaCartas() {
        this.baralho.embaralhar();
	}

    private void distribuiMaos() {
        int i = 0;
        while(i < 3) {
            this.jogador1.recebeCarta(new Carta());
            this.jogador2.recebeCarta(new Carta());
        }
    }

	private void inicializaManilha() {
		this.cartaVirada = new Carta();
	}


}
