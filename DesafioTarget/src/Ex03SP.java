import java.io.FileReader;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class Ex03SP {
    public static void main(String[] args) {
        double[] faturamentoDiario = null;

        // Lê o arquivo JSON e armazena o array do faturamento diário
        try (JsonReader reader = Json.createReader(new FileReader("src/faturamento.json"))) {
            JsonObject json = reader.readObject();
            JsonArray faturamentoDiarioJson = json.getJsonArray("faturamentoDiario");
            faturamentoDiario = new double[faturamentoDiarioJson.size()];
            for (int i = 0; i < faturamentoDiarioJson.size(); i++) {
                faturamentoDiario[i] = faturamentoDiarioJson.getJsonNumber(i).doubleValue();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Calcula o menor e maior valor do faturamento diário
        double menorFaturamento = faturamentoDiario[0];
        double maiorFaturamento = faturamentoDiario[0];
        for (double faturamento : faturamentoDiario) {
            if (faturamento < menorFaturamento) {
                menorFaturamento = faturamento;
            }
            if (faturamento > maiorFaturamento) {
                maiorFaturamento = faturamento;
            }
        }

        // Calcula a média mensal do faturamento diário, ignorando os dias sem faturamento
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento != 0) {
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }
        double mediaMensal = somaFaturamento / diasComFaturamento;

        // Calcula o número de dias no mês em que o faturamento diário foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor de faturamento diário: " + menorFaturamento);
        System.out.println("Maior valor de faturamento diário: " + maiorFaturamento);
        System.out.println("Número de dias no mês com faturamento acima da média: " + diasAcimaDaMedia);
    }
}