ANOTAÇÕES:
Para entrada do tecado do usuário (se for digitar), tem que pedir importação do pacote útil do java.
(import java.util.Scanner;)
Isso é o básico, porém essencial o método Main, como ele mesmo diz o PRINCIPAL, onde nele será executado primeiro.
(public static void main(String[] args) {)
public: Esta palavra-chave indica que o método main é acessível de qualquer outra classe. Em Java, public é um modificador de acesso que significa que o método pode ser chamado de fora da classe onde está definido.

static: static é uma palavra-chave que indica que o método main pertence à classe em si, e não a instâncias específicas da classe. Isso significa que o método main pode ser chamado sem criar um objeto da classe que o contém.

void: Isso indica que o método main não retorna nenhum valor. Em Java, void é usado para indicar que um método não produz um resultado quando é chamado.

main: Este é o nome do método. Em Java, o método main é o ponto de entrada para um programa. Quando você inicia um programa Java, a máquina virtual Java (JVM) procura por um método main com a assinatura correta para iniciar a execução do programa.

(String[] args): Este é o parâmetro do método main. Ele recebe um array de strings chamado args. args é uma convenção em Java para argumentos passados para o programa a partir da linha de comando quando você o executa. O tipo String[] indica que o array args contém objetos do tipo String.

Portanto, a assinatura completa public static void main(String[] args) define um método main que é público (pode ser acessado de fora da classe), estático (pertence à classe em si), não retorna nenhum valor (void) e aceita um array de strings como argumento, que contém os argumentos passados para o programa quando é executado. Este método é o ponto de entrada para o programa Java.
Scanner scanner = new Scanner(System.in);: Aqui está sendo criada uma nova instância da classe Scanner, que é uma classe em Java usada para obter entrada do usuário. System.in é um objeto que representa a entrada padrão do sistema, normalmente associado ao teclado. Então, essa linha cria um novo objeto Scanner chamado scanner que estará pronto para ler entradas do teclado.

boolean continuar = true;: Aqui uma variável booleana chamada continuar está sendo declarada e inicializada com o valor true. Esta variável será usada para controlar um loop, permitindo que ele continue enquanto o valor de continuar for true.

while (continuar) {: Esta é uma estrutura de controle de repetição chamada while. Ela verifica a condição entre parênteses (continuar neste caso) e executa o bloco de código associado enquanto essa condição for verdadeira. Portanto, enquanto continuar for true, o código dentro do bloco do while será executado repetidamente.

Portanto, essas duas linhas juntas criam um loop que continuará a solicitar entrada do usuário enquanto a variável continuar permanecer como true. A entrada do usuário é lida usando o objeto Scanner criado anteriormente.
System.out.println("Digite o primeiro número:");: Esta linha imprime uma mensagem na saída padrão (normalmente a tela) pedindo ao usuário para digitar o primeiro número.

double numero1 = scanner.nextInt();: Aqui, o programa lê um número do usuário usando o objeto Scanner previamente criado e armazena-o na variável numero1. Como o método nextInt() lê um número inteiro, mas você está armazenando o resultado em uma variável double, o valor será convertido automaticamente para double.

System.out.println("Digite o segundo número:");: Este comando imprime uma mensagem solicitando ao usuário que digite o segundo número.

double numero2 = scanner.nextInt();: Similar ao passo 2, este comando lê um número do usuário e armazena-o na variável numero2.

double soma = numero1 + numero2;, double subtracao = numero1 - numero2;, double divisao = numero1 / numero2;, double multiplicacao = numero1 * numero2;: Aqui, o código realiza operações matemáticas básicas utilizando os números inseridos pelo usuário e armazenados nas variáveis numero1 e numero2.

System.out.println("As formas de resultados possiveis são:");: Esta linha imprime uma mensagem para indicar que os resultados das operações serão exibidos a seguir.

System.out.println("Soma: " + soma);, System.out.println("Subtração: " + subtracao);, System.out.println("Divisão: " + divisao);, System.out.println("Multiplicação: " + multiplicacao);: Aqui, o código imprime os resultados das operações de soma, subtração, divisão e multiplicação.

System.out.println("DESEJA CONTINUAR ME USANDO?(S/N)");: Esta linha solicita ao usuário uma resposta para continuar usando o programa ou não.

String resposta = scanner.next();: Aqui, o programa lê a resposta do usuário.

if (!resposta.equalsIgnoreCase("s")) {: Este trecho verifica se a resposta do usuário não é "s" (ignorando maiúsculas e minúsculas).

continuar = false;: Se a resposta não for "s", o programa define a variável continuar como false, o que fará o loop terminar na próxima iteração.

System.out.println("Programa Encerrado, Volte Sempre!");: Esta linha imprime uma mensagem indicando que o programa foi encerrado.

scanner.close();: Finalmente, o método close() é chamado para liberar os recursos associados ao objeto Scanner. Isso é uma boa prática para evitar vazamentos de recursos e liberar a memória quando o objeto Scanner não for mais necessário.
Esse projeto é apenas par estudo, onde aplica  a soma de números e o metodo reset, irei "brincar"  mais com as funções basicas do Java, estou adorando usa-lo e aprender-lo do que o Phython.
