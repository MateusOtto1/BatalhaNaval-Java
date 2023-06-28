package exemplo;
public class BatalhaNaval {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        char tabuleiro[][] = new char[10][10];
        char tabuleiro_1[][] = new char[10][10];
        char tabuleiro_2[][] = new char[10][10];
        char tabuleiroBatalha_1[][] = new char[10][10];
        char tabuleiroBatalha_2[][] = new char[10][10];
        int tamL = 0;
        int tamC = 0;
        System.out.println("O jogo vai começar!");
        System.out.println("-----------------------------------");
        //Está chamando o método escolha
        metodos.escolha();
        //Jogador vs máquina
        if (metodos.escolha == 1) {
            metodos.encheTabuleiros(tabuleiro, tabuleiro_1, tabuleiro_2, tabuleiroBatalha_1, tabuleiroBatalha_2);
            System.out.println("Este é o tabuleiro que será utilizado no decorrer do jogo!");
            metodos.tabuleiro(tabuleiro);
            if (metodos.tipoPosicionamento() == 1) {
                System.out.println("\nPosicione seus barcos jogador 1!");
                metodos.posicionamentoManual(tabuleiro);
                for (tamL = 0; tamL < 10; tamL++) {
                    for (tamC = 0; tamC < 10; tamC++) {
                        tabuleiro_1[tamL][tamC] = tabuleiro[tamL][tamC];
                    }
                }
            } else {
                metodos.posicionamentoAutomatico(tabuleiro);
                for (tamL = 0; tamL < 10; tamL++) {
                    for (tamC = 0; tamC < 10; tamC++) {
                        tabuleiro_1[tamL][tamC] = tabuleiro[tamL][tamC];
                    }
                }
            }
            System.out.println("");
            metodos.tabuleiro_1(tabuleiro_1);
            System.out.println("\nTodos seus barcos foram posicionados!");
            System.out.println("\nVez da máquina:");
            System.out.println("Aguarde a máquina posicionar os barcos...");
            for (tamL = 0; tamL < 10; tamL++) {
                for (tamC = 0; tamC < 10; tamC++) {
                    tabuleiro[tamL][tamC] = 'O';
                }
            }
            metodos.posicionamentoAutomatico(tabuleiro);
            for (tamL = 0; tamL < 10; tamL++) {
                for (tamC = 0; tamC < 10; tamC++) {
                    tabuleiro_2[tamL][tamC] = tabuleiro[tamL][tamC];
                }
            }
            System.out.println("\nVamos começar a batalha!");
            System.out.println("--------------------------------");
            System.out.println("\nSe você acertar um barco o local será marcado com X, mas se errar será marcado com A!");
            metodos.batalha(tabuleiroBatalha_1, tabuleiro_2, tabuleiroBatalha_2, tabuleiro_1);
        }
        //Jogador vs Jogador
        if (metodos.escolha == 2) {
            System.out.println("Jogador 1!");
            metodos.encheTabuleiros(tabuleiro, tabuleiro_1, tabuleiro_2, tabuleiroBatalha_1, tabuleiroBatalha_2);
            System.out.println("Este é o tabuleiro que será utilizado no decorrer do jogo!");
            metodos.tabuleiro(tabuleiro);
            if (metodos.tipoPosicionamento() == 1) {
                System.out.println("\nPosicione seus barcos jogador 1!");
                metodos.posicionamentoManual(tabuleiro);
                for (tamL = 0; tamL < 10; tamL++) {
                    for (tamC = 0; tamC < 10; tamC++) {
                        tabuleiro_1[tamL][tamC] = tabuleiro[tamL][tamC];
                    }
                }
            } else {
                metodos.posicionamentoAutomatico(tabuleiro);
                for (tamL = 0; tamL < 10; tamL++) {
                    for (tamC = 0; tamC < 10; tamC++) {
                        tabuleiro_1[tamL][tamC] = tabuleiro[tamL][tamC];
                    }
                }
            }
            System.out.println("");
            metodos.tabuleiro_1(tabuleiro_1);
            System.out.println("\nTodos seus barcos foram posicionados jogador 1!");
            System.out.println("\nVez do jogador: 2");
            System.out.println("Aguarde o jogador 2 posicionar os barcos...");
            System.out.println("Jogador 2!");
            for (tamL = 0; tamL < 10; tamL++) {
                for (tamC = 0; tamC < 10; tamC++) {
                    tabuleiro[tamL][tamC] = 'O';
                }
            }
            if (metodos.tipoPosicionamento() == 1) {
                System.out.println("\nPosicione seus barcos jogador 2!");
                metodos.posicionamentoManual(tabuleiro);
                for (tamL = 0; tamL < 10; tamL++) {
                    for (tamC = 0; tamC < 10; tamC++) {
                        tabuleiro_2[tamL][tamC] = tabuleiro[tamL][tamC];
                    }
                }
            } else {
                metodos.posicionamentoAutomatico(tabuleiro);
                for (tamL = 0; tamL < 10; tamL++) {
                    for (tamC = 0; tamC < 10; tamC++) {
                        tabuleiro_2[tamL][tamC] = tabuleiro[tamL][tamC];
                    }
                }
            }
            System.out.println("");
            metodos.tabuleiro_2(tabuleiro_2);
            System.out.println("\nTodos seus barcos foram posicionados jogador 2!");
            System.out.println("\nVamos começar a batalha!");
            System.out.println("--------------------------------");
            System.out.println("\nSe você acertar um barco o local será marcado com X, mas se errar será marcado com A!");
            metodos.batalha2(tabuleiroBatalha_1, tabuleiro_2, tabuleiroBatalha_2, tabuleiro_1);
        }
    }
}
