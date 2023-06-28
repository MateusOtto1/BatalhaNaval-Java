package exemplo;
import java.util.Scanner;
import java.util.Random;
public class Metodos {
    public Scanner ler = new Scanner(System.in);
    public Random gerar = new Random();
    public int tamL = 0;
    public int tamC = 0;
    public int escolha = 0;
    public int posicao = 0;
    public int posicaoM = 0;
    public int linha = 0;
    public int coluna;
    public String colunaLetra = new String();
    public int tipoPosicionamento =0;
    public int afundaBarco = 20;
    //Irá perguntar e pegar o valor da escolha do usuário
    public int escolha(){
        do{
            System.out.println("Escolha o modo de jogo:");
            System.out.println("(1) Jogador vs Máquina");
            System.out.println("(2) Jogador vs Jogador");
            escolha = ler.nextInt();
            if(escolha!=1&&escolha!=2){
                System.out.println("Valor inválido!\n");
            }
        }while(escolha!=1&&escolha!=2);
        return escolha;
    }
    //Irá mostrar o tabuleiro com seus respectivos valores
    public void tabuleiro(char[][] tabuleiro){
        System.out.println("     | A | B | C | D | E | F | G | H | I | J |");
        System.out.printf("     ----------------------------------------");
        for (tamL = 0; tamL < 10; tamL++) {
            System.out.printf("\n   %d ", tamL);
            for (tamC = 0; tamC < 10; tamC++) {
                System.out.printf("| %c ", tabuleiro[tamL][tamC]);
            }
            System.out.printf("\n     |---|---|---|---|---|---|---|---|---|---|");
        }
    }
    //Irá mostrar o tabuleiro do jogador_1 com seus respectivos valores
    public void tabuleiro_1(char[][] tabuleiro_1){
        System.out.println("     | A | B | C | D | E | F | G | H | I | J |");
        System.out.printf("     ----------------------------------------");
        for (tamL = 0; tamL < 10; tamL++) {
            System.out.printf("\n   %d ", tamL);
            for (tamC = 0; tamC < 10; tamC++) {
                System.out.printf("| %c ", tabuleiro_1[tamL][tamC]);
            }
            System.out.printf("\n     |---|---|---|---|---|---|---|---|---|---|");
        }
    }
    //Irá pegar a linha
    public int linha(){
        do{
            System.out.println("Digite a linha:");
            linha = ler.nextInt();
            if (linha > 9 || linha < 0) {
                System.out.println("Tamanho inválido!");
            }
        }while(linha > 9 || linha < 0);
        return linha;
    }
    //Irá pegar a coluna
    public int coluna() {
        boolean erro = false;
        do {
            System.out.println("Digite a coluna:");
            colunaLetra = ler.next();
            switch (colunaLetra.toUpperCase()) {
                case "A":
                    erro = false;
                    coluna = 0;
                    break;
                case "B":
                    erro = false;
                    coluna = 1;
                    break;
                case "C":
                    erro = false;
                    coluna = 2;
                    break;
                case "D":
                    erro = false;
                    coluna = 3;
                    break;
                case "E":
                    erro = false;
                    coluna = 4;
                    break;
                case "F":
                    erro = false;
                    coluna = 5;
                    break;
                case "G":
                    erro = false;
                    coluna = 6;
                    break;
                case "H":
                    erro = false;
                    coluna = 7;
                    break;
                case "I":
                    erro = false;
                    coluna = 8;
                    break;
                case "J":
                    erro = false;
                    coluna = 9;
                    break;
                default:
                    erro = true;
                    System.out.println("Valor inválido");
                    break;
            }
        }while (erro==true);
        return coluna;
    }
    //Irá receber a resposta do usuário, se ele quer posicionar seus barcos de forma automática ou manual
    public int tipoPosicionamento(){
        do{
            System.out.println("\nVocê deseja posicionar os barcos de forma manual ou automática?");
            System.out.println("Digite(1) mara manual.\nDigite (2) para automática.");
            tipoPosicionamento = ler.nextInt();
        }while(tipoPosicionamento!=1&&tipoPosicionamento!=2);
        return tipoPosicionamento;
    }
    //Irá verificar se o usuário deseja alocar seus barcos na forma horizontal ou vertical
    public int posicao(){
        do {
            System.out.println("Você deseja colocar na horizontal ou na vertical?");
            System.out.println("Digite (1) para horizontal.\nDigite (2) para vertical.\n");
            posicao = ler.nextInt();
            if (posicao != 1 && posicao != 2) {
                System.out.println("Valor inválido!");
            }
        } while (posicao != 1 && posicao != 2);
        return posicao;
    }
    //Escolha automática para alocar o barco na horizontal ou vertical
    public int posicaoM(){
        posicaoM = gerar.nextInt(1,2);
        return posicaoM;
    }
    //Irá mostrar o tabuleiro do jogador_2 ou da máquina, com seus respectivos valores, dependendo do modo de jogo 
    public void tabuleiro_2(char[][] tabuleiro_2){
        System.out.println("     | A | B | C | D | E | F | G | H | I | J |");
        System.out.printf("     ----------------------------------------");
        for (tamL = 0; tamL < 10; tamL++) {
            System.out.printf("\n   %d ", tamL);
            for (tamC = 0; tamC < 10; tamC++) {
                System.out.printf("| %c ", tabuleiro_2[tamL][tamC]);
            }
            System.out.printf("\n     |---|---|---|---|---|---|---|---|---|---|");
        }
    }
    //Irá mostrar o tabuleiro no qual o jogador_1 está atirando
    public void tabuleiroBatalha_1(char[][] tabuleiroBatalha_1){
        System.out.println("     | A | B | C | D | E | F | G | H | I | J |");
        System.out.printf("     ----------------------------------------");
        for (tamL = 0; tamL < 10; tamL++) {
            System.out.printf("\n   %d ", tamL);
            for (tamC = 0; tamC < 10; tamC++) {
                System.out.printf("| %c ", tabuleiroBatalha_1[tamL][tamC]);
            }
            System.out.printf("\n     |---|---|---|---|---|---|---|---|---|---|");
        }
    }
    //Irá mostrar o tabuleiro no qual o jogador_2 está atirando
    public void tabuleiroBatalha_2(char[][] tabuleiroBatalha_2){
        System.out.println("     | A | B | C | D | E | F | G | H | I | J |");
        System.out.printf("     ----------------------------------------");
        for (tamL = 0; tamL < 10; tamL++) {
            System.out.printf("\n   %d ", tamL);
            for (tamC = 0; tamC < 10; tamC++) {
                System.out.printf("| %c ", tabuleiroBatalha_2[tamL][tamC]);
            }
            System.out.printf("\n     |---|---|---|---|---|---|---|---|---|---|");
        }
    }
    
    public void encheTabuleiros(char tabuleiro[][], char[][] tabuleiro_1, char[][] tabuleiro_2, char[][] tabuleiroBatalha_1, char[][] tabuleiroBatalha_2) {
        for (tamL = 0; tamL < 10; tamL++) {
            for (tamC = 0; tamC < 10; tamC++) {
                tabuleiro[tamL][tamC] = 'O';
                tabuleiro_1[tamL][tamC] = 'O';
                tabuleiro_2[tamL][tamC] = 'O';
                tabuleiroBatalha_1[tamL][tamC] = 'O';
                tabuleiroBatalha_2[tamL][tamC] = 'O';
            }
        }
    }

    public void posicionamentoManual(char tabuleiro[][]) {
        int escolhaBarco = 0;
        boolean erro1 = false;
        boolean erro2 = false;
        int barco_1 = 4;
        int barco_2 = 3;
        int barco_3 = 2;
        int barco_4 = 1;
        int quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
        do {
            System.out.printf("\nBarco (1) tem 1 posição: %d barcos deste tipo restantes.", barco_1);
            System.out.printf("\nBarco (2) tem 2 posição: %d barcos deste tipo restantes.", barco_2);
            System.out.printf("\nBarco (3) tem 3 posição: %d barcos deste tipo restantes.", barco_3);
            System.out.printf("\nBarco (4) tem 4 posição: %d barcos deste tipo restantes.\n", barco_4);
            escolhaBarco = ler.nextInt();
            switch (escolhaBarco) {
                case 1:
                    if (barco_1 > 0) {
                        do {
                            linha = linha();
                            coluna = coluna();
                            if (tabuleiro[linha][coluna] == 'X') {
                                System.out.println("\nLocal já está ocupado!");
                                erro2 = true;
                            } else {
                                erro2 = false;
                            }
                        } while (erro2 != false);

                        if (erro2 == false) {
                            tamL = linha;
                            tamC = coluna;
                            tabuleiro[tamL][tamC] = 'X';
                            tabuleiro(tabuleiro);
                            System.out.println("\nPosicionado!");
                            barco_1--;
                            quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                        }
                    } else {
                        System.out.println("Sem barcos do tipo(1)!");
                    }
                    break;

                case 2:
                    if (barco_2 > 0) {
                        do {
                            linha = linha();
                            coluna = coluna();
                            switch (posicao()) {
                                case 1:
                                    if (linha <= 9 && linha >= 0 && coluna + 1 <= 9 && coluna + 1 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna + 1] == 'X') {
                                            System.out.println("\nLocal já está ocupado!");
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        System.out.println("Tamanho inválido!");
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL][tamC + 1] = 'X';
                                        tabuleiro(tabuleiro);
                                        System.out.println("\nPosicionado!");
                                        barco_2--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                case 2:
                                    if (linha <= 9 && linha >= 0 && linha + 1 <= 9 && linha + 1 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha + 1][coluna] == 'X') {
                                            System.out.println("\nLocal já está ocupado!");
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        System.out.println("Tamanho inválido!");
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL + 1][tamC] = 'X';
                                        tabuleiro(tabuleiro);
                                        System.out.println("\nPosicionado!");
                                        barco_2--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                default:
                                    System.out.println("Valor inválido!");
                                    break;
                            }
                        } while (erro1 != false || erro2 != false);
                    } else {
                        System.out.println("Sem barcos do tipo (2)!");
                    }
                    break;

                case 3:
                    if (barco_3 > 0) {
                        do {
                            linha = linha();
                            coluna = coluna();
                            switch (posicao()) {
                                case 1:
                                    if (linha <= 9 && linha >= 0 && coluna + 1 <= 9 && coluna + 1 >= 0 && coluna + 2 <= 9 && coluna + 2 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna + 1] == 'X' || tabuleiro[linha][coluna + 2] == 'X') {
                                            System.out.println("\nLocal já está ocupado!");
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        System.out.println("Tamanho inválido!");
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL][tamC + 1] = 'X';
                                        tabuleiro[tamL][tamC + 2] = 'X';
                                        tabuleiro(tabuleiro);
                                        System.out.println("\nPosicionado!");
                                        barco_3--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                case 2:
                                    if (linha <= 9 && linha >= 0 && linha + 1 <= 9 && linha + 1 >= 0 && linha + 2 <= 9 && linha + 2 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha + 1][coluna] == 'X' || tabuleiro[linha + 2][coluna] == 'X') {
                                            System.out.println("\nLocal já está ocupado!");
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        System.out.println("Tamanho inválido!");
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL + 1][tamC] = 'X';
                                        tabuleiro[tamL + 2][tamC] = 'X';
                                        tabuleiro(tabuleiro);
                                        System.out.println("\nPosicionado!");
                                        barco_3--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                default:
                                    System.out.println("Valor inválido!");
                                    break;
                            }
                        } while (erro1 != false || erro2 != false);
                    } else {
                        System.out.println("Sem barcos do tipo (3)!");
                    }
                    break;

                case 4:
                    if (barco_4 > 0) {
                        do {
                            linha = linha();
                            coluna = coluna();
                            switch (posicao()) {
                                case 1:
                                    if (linha <= 9 && linha >= 0 && coluna + 1 <= 9 && coluna + 1 >= 0 && coluna + 2 <= 9 && coluna + 2 >= 0 && coluna + 3 <= 9 && coluna + 3 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna + 1] == 'X' || tabuleiro[linha][coluna + 2] == 'X' || tabuleiro[linha][coluna + 3] == 'X') {
                                            System.out.println("\nLocal já está ocupado!");
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        System.out.println("Tamanho inválido!");
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL][tamC + 1] = 'X';
                                        tabuleiro[tamL][tamC + 2] = 'X';
                                        tabuleiro[tamL][tamC + 3] = 'X';
                                        tabuleiro(tabuleiro);
                                        System.out.println("\nPosicionado!");
                                        barco_4--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                case 2:
                                    if (linha <= 9 && linha >= 0 && linha + 1 <= 9 && linha + 1 >= 0 && linha + 2 <= 9 && linha + 2 >= 0 && linha + 3 <= 9 && linha + 3 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha + 1][coluna] == 'X' || tabuleiro[linha + 2][coluna] == 'X' || tabuleiro[linha + 3][coluna] == 'X') {
                                            System.out.println("\nLocal já está ocupado!");
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        System.out.println("Tamanho inválido!");
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL + 1][tamC] = 'X';
                                        tabuleiro[tamL + 2][tamC] = 'X';
                                        tabuleiro[tamL + 3][tamC] = 'X';
                                        tabuleiro(tabuleiro);
                                        System.out.println("\nPosicionado!");
                                        barco_4--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                default:
                                    System.out.println("Valor inválido!");
                                    break;
                            }
                        } while (erro1 != false || erro2 != false);
                    } else {
                        System.out.println("Sem barcos do tipo (4)!");
                    }
                    break;

                default:
                    System.out.println("Valor inválido!");
                    break;
            }
        } while (quantBarcos != 0);
    }

    public void posicionamentoAutomatico(char tabuleiro[][]) {
        int escolhaBarco = 0;
        boolean erro1 = false;
        boolean erro2 = false;
        int barco_1 = 4;
        int barco_2 = 3;
        int barco_3 = 2;
        int barco_4 = 1;
        int quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
        do {
            if (barco_1 > 0) {
                escolhaBarco = 1;
            }
            if (barco_2 > 0) {
                escolhaBarco = 2;
            }
            if (barco_3 > 0) {
                escolhaBarco = 3;
            }
            if (barco_4 > 0) {
                escolhaBarco = 4;
            }

            switch (escolhaBarco) {
                case 1:
                    if (barco_1 > 0) {
                        do {
                            linha = gerar.nextInt(0, 9);
                            coluna = gerar.nextInt(0, 9);
                            if (tabuleiro[linha][coluna] == 'X') {
                                erro2 = true;
                            } else {
                                erro2 = false;
                            }
                        } while (erro2 != false);

                        if (erro2 == false) {
                            tamL = linha;
                            tamC = coluna;
                            tabuleiro[tamL][tamC] = 'X';
                            barco_1--;
                            quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                        }
                    }
                    break;

                case 2:
                    if (barco_2 > 0) {
                        do {
                            linha = gerar.nextInt(0, 9);
                            coluna = gerar.nextInt(0, 9);
                            switch (posicaoM()) {
                                case 1:
                                    if (linha <= 9 && linha >= 0 && coluna <= 9 && coluna >= 0 && coluna + 1 <= 9 && coluna + 1 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna + 1] == 'X') {
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL][tamC + 1] = 'X';
                                        barco_2--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                case 2:
                                    if (linha <= 9 && linha >= 0 && coluna <= 9 && coluna >= 0 && linha + 1 <= 9 && linha + 1 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha + 1][coluna] == 'X') {
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL + 1][tamC] = 'X';
                                        barco_2--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } while (erro1 != false && erro2 != false);
                    }
                    break;

                case 3:
                    if (barco_3 > 0) {
                        do {
                            linha = gerar.nextInt(0, 9);
                            coluna = gerar.nextInt(0, 9);
                            switch (posicaoM()) {
                                case 1:
                                    if (linha <= 9 && linha >= 0 && coluna <= 9 && coluna >= 0 && coluna + 1 <= 9 && coluna + 1 >= 0 && coluna + 2 <= 9 && coluna + 2 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna + 1] == 'X' || tabuleiro[linha][coluna + 2] == 'X') {
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL][tamC + 1] = 'X';
                                        tabuleiro[tamL][tamC + 2] = 'X';
                                        barco_3--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                case 2:
                                    if (linha <= 9 && linha >= 0 && coluna <= 9 && coluna >= 0 && linha + 1 <= 9 && linha + 1 >= 0 && linha + 2 <= 9 && linha + 2 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha + 1][coluna] == 'X' || tabuleiro[linha + 2][coluna] == 'X') {
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL + 1][tamC] = 'X';
                                        tabuleiro[tamL + 2][tamC] = 'X';
                                        barco_3--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } while (erro1 != false && erro2 != false);
                    }
                    break;

                case 4:
                    if (barco_4 > 0) {
                        do {
                            linha = gerar.nextInt(0, 9);
                            coluna = gerar.nextInt(0, 9);
                            switch (posicaoM()) {
                                case 1:
                                    if (linha <= 9 && linha >= 0 && coluna <= 9 && coluna >= 0 && coluna + 1 <= 9 && coluna + 1 >= 0 && coluna + 2 <= 9 && coluna + 2 >= 0 && coluna + 3 <= 9 && coluna + 3 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna + 1] == 'X' || tabuleiro[linha][coluna + 2] == 'X' || tabuleiro[linha][coluna + 3] == 'X') {
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL][tamC + 1] = 'X';
                                        tabuleiro[tamL][tamC + 2] = 'X';
                                        tabuleiro[tamL][tamC + 3] = 'X';
                                        barco_4--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                case 2:
                                    if (linha <= 9 && linha >= 0 && coluna <= 9 && coluna >= 0 && linha + 1 <= 9 && linha + 1 >= 0 && linha + 2 <= 9 && linha + 2 >= 0 && linha + 3 <= 9 && linha + 3 >= 0) {
                                        erro1 = false;

                                        if (tabuleiro[linha][coluna] == 'X' || tabuleiro[linha + 1][coluna] == 'X' || tabuleiro[linha + 2][coluna] == 'X' || tabuleiro[linha + 3][coluna] == 'X') {
                                            erro2 = true;
                                        } else {
                                            erro2 = false;
                                        }
                                    } else {
                                        erro1 = true;
                                    }
                                    if (erro1 == false && erro2 == false) {
                                        tamL = linha;
                                        tamC = coluna;
                                        tabuleiro[tamL][tamC] = 'X';
                                        tabuleiro[tamL + 1][tamC] = 'X';
                                        tabuleiro[tamL + 2][tamC] = 'X';
                                        tabuleiro[tamL + 3][tamC] = 'X';
                                        barco_4--;
                                        quantBarcos = barco_1 + barco_2 + barco_3 + barco_4;
                                    }
                                    break;

                                default:
                                    break;
                            }
                        } while (erro1 != false && erro2 != false);
                    }
                    break;

                default:
                    break;
            }
        } while (quantBarcos != 0);
    }

    public void tiroJogador(char tabuleiroBatalha_1[][], char tabuleiro_2[][]) {
        boolean erro2 = false;
        boolean acerto = false;
        do {
            if (afundaBarco > 0) {
                do {
                    System.out.printf("\n     ----------------------------------------\n");
                    System.out.println("\t  Seu tabuleiro atual jogador 1!");
                    tabuleiroBatalha_1(tabuleiroBatalha_1);
                    System.out.println("\nInforme onde você deseja atirar jogador 1");
                    linha = linha();
                    coluna = coluna();
                    if (tabuleiroBatalha_1[linha][coluna] == 'X' || tabuleiroBatalha_1[linha][coluna] == 'A') {
                        System.out.println("Você já atirou aqui!\nTente outro lugar!");
                        erro2 = true;
                    } else {
                        erro2 = false;
                    }
                } while (erro2 != false);
                if (erro2 == false) {
                    if (tabuleiro_2[linha][coluna] == 'X') {
                        tamL = linha;
                        tamC = coluna;
                        tabuleiroBatalha_1[tamL][tamC] = 'X';
                        System.out.println("Você acertou um barco!");
                        tabuleiroBatalha_1(tabuleiroBatalha_1);
                        System.out.println("");
                        acerto = true;
                        afundaBarco = afundaBarco - 1;
                        if (afundaBarco == 0) {
                            acerto = false;
                        } else {
                            System.out.println("\nJogue novamente!");
                            System.out.println("Faltam " + afundaBarco + " lugares para acertar!");
                        }
                    } else {
                        if (tabuleiroBatalha_1[linha][coluna] != 'X') {
                            tamL = linha;
                            tamC = coluna;
                            System.out.println("\nVocê errou!");
                            tabuleiroBatalha_1[tamL][tamC] = 'A';
                            acerto = false;
                        }
                    }
                }
            }
        } while (acerto == true);
    }

    public void batalha(char tabuleiroBatalha_1[][], char tabuleiro_2[][], char tabuleiroBatalha_2[][], char tabuleiro_1[][]) {
        int afundaBarco2 = 20;
        boolean erro2 = false;
        boolean acerto2 = false;
        while (afundaBarco != 0 && afundaBarco2 != 0) {
            tiroJogador(tabuleiroBatalha_1, tabuleiro_2);
            if (afundaBarco > 0) {
                do {
                    if (afundaBarco2 > 0) {
                        do {
                            linha = gerar.nextInt(0, 9);
                            coluna = gerar.nextInt(0, 9);
                            if (tabuleiroBatalha_2[linha][coluna] == 'X' || tabuleiroBatalha_2[linha][coluna] == 'A') {
                                erro2 = true;
                            } else {
                                erro2 = false;
                            }
                        } while (erro2 == true);
                        if (erro2 == false) {
                            if (tabuleiro_1[linha][coluna] == 'X') {
                                tamL = linha;
                                tamC = coluna;
                                tabuleiroBatalha_2[tamL][tamC] = 'X';
                                System.out.println("\nA máquina acertou um barco!");
                                tabuleiroBatalha_2(tabuleiroBatalha_2);
                                System.out.println("");
                                acerto2 = true;
                                afundaBarco2 = afundaBarco2 - 1;
                                System.out.println("Faltam " + afundaBarco2 + " lugares para a máquina!");
                            } else {
                                if (tabuleiroBatalha_2[linha][coluna] != 'X') {
                                    tamL = linha;
                                    tamC = coluna;
                                    System.out.println("\nMáquina errou!");
                                    tabuleiroBatalha_2[tamL][tamC] = 'A';
                                    acerto2 = false;
                                }
                            }
                        }
                    }
                } while (acerto2 == true);
            }
        }
        if (afundaBarco == 0) {
            System.out.printf("\n     ----------------------------------------\n");
            System.out.println("\tO jogador 1 ganhou a partida!");
            System.out.printf("\n     ----------------------------------------\n");
        } else {
            System.out.printf("\n     ----------------------------------------\n");
            System.out.println("\tA máquina ganhou a partida!");
            System.out.printf("\n     ----------------------------------------\n");
        }
    }

    public void batalha2(char tabuleiroBatalha_1[][], char tabuleiro_2[][], char tabuleiroBatalha_2[][], char tabuleiro_1[][]) {
        boolean erro2 = false;
        boolean acerto2 = false;
        int afundaBarco2 = 20;
        while (afundaBarco != 0 && afundaBarco2 != 0) {
            tiroJogador(tabuleiroBatalha_1, tabuleiro_2);
            if (afundaBarco > 0) {
                do {
                    if (afundaBarco2 > 0) {
                        do {
                            System.out.printf("\n     ----------------------------------------\n");
                            System.out.println("\t   Seu tabuleiro atual jogador 2!");
                            tabuleiroBatalha_2(tabuleiroBatalha_2);
                            System.out.println("\nInforme onde você deseja atirar jogador 2!");
                            linha = linha();
                            coluna = coluna();
                            if (tabuleiroBatalha_2[linha][coluna] == 'X' || tabuleiroBatalha_2[linha][coluna] == 'A') {
                                System.out.println("Você já atirou aqui!\nTente outro lugar jogador 2!");
                                erro2 = true;
                            } else {
                                erro2 = false;
                            }
                        } while (erro2 != false);
                        if (erro2 == false) {
                            if (tabuleiro_1[linha][coluna] == 'X') {
                                tamL = linha;
                                tamC = coluna;
                                tabuleiroBatalha_2[tamL][tamC] = 'X';
                                System.out.println("Você acertou um barco jogador 2!");
                                tabuleiroBatalha_2(tabuleiroBatalha_2);
                                System.out.println("");
                                acerto2 = true;
                                afundaBarco2 = afundaBarco2 - 1;
                                if (afundaBarco2 == 0) {
                                    acerto2 = false;
                                } else {
                                    System.out.println("\nJogue novamente jogador 2!");
                                    System.out.println("Faltam " + afundaBarco2 + " lugares para acertar jogador 2!");
                                }
                            } else {
                                if (tabuleiroBatalha_2[linha][coluna] != 'X') {
                                    tamL = linha;
                                    tamC = coluna;
                                    System.out.println("\nVocê errou jogador 2!");
                                    tabuleiroBatalha_2[tamL][tamC] = 'A';
                                    acerto2 = false;
                                }
                            }
                        }
                    }
                } while (acerto2 == true);
            }
        }
        if (afundaBarco == 0) {
            System.out.printf("\n     ----------------------------------------\n");
            System.out.println("\tO jogador 1 ganhou a partida!");
            System.out.printf("\n     ----------------------------------------\n");
        } else {
            System.out.printf("\n     ----------------------------------------\n");
            System.out.println("\tO jogador 2 ganhou a partida!");
            System.out.printf("\n     ----------------------------------------\n");
        }
    }
}
