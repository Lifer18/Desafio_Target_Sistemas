public class Ex04SP {

    public static void main(String[] args) {
        double valorTotal = 0;
        double valorSP = 67836.43;
        double valorRJ = 36678.66;
        double valorMG = 29229.88;
        double valorES = 27165.48;
        double valorOutros = 19849.53;

        valorTotal = valorSP + valorRJ + valorMG + valorES + valorOutros;

        double percentualSP = (valorSP / valorTotal) * 100;
        double percentualRJ = (valorRJ / valorTotal) * 100;
        double percentualMG = (valorMG / valorTotal) * 100;
        double percentualES = (valorES / valorTotal) * 100;
        double percentualOutros = (valorOutros / valorTotal) * 100;

        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
        System.out.printf("Percentual de representação dos outros estados: %.2f%%\n", percentualOutros);
    }
}