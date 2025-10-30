package org.felipe;

import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class cep {
    public static void main(String[] args) {Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("\nDigite o CEP (somente números): ");
            String cep = input.nextLine().trim();

            if (!cep.matches("\\d{8}")) {
                System.out.println("CEP inválido. Deve conter exatamente 8 dígitos numéricos.");
            } else {
                String urlString = "https://viacep.com.br/ws/" + cep + "/json/";

                try {
                    URL url = new URL(urlString);
                    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                    conn.setRequestMethod("GET");

                    if (conn.getResponseCode() != 200) {
                        System.out.println("Erro ao conectar com a API. Código: " + conn.getResponseCode());
                    } else {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                        StringBuilder jsonBuilder = new StringBuilder();
                        String line;

                        while ((line = reader.readLine()) != null) {
                            jsonBuilder.append(line);
                        }

                        reader.close();

                        JSONObject json = new JSONObject(jsonBuilder.toString());

                        if (json.has("erro")) {
                            System.out.println("CEP não encontrado.");
                        } else {
                            System.out.println("\n Endereço encontrado:");
                            System.out.println("Logradouro: " + json.getString("logradouro"));
                            System.out.println("Bairro: " + json.getString("bairro"));
                            System.out.println("Cidade: " + json.getString("localidade"));
                            System.out.println("Estado: " + json.getString("uf"));
                            System.out.println("DDD: " + json.getString("ddd"));
                        }
                    }
                } catch (Exception e) {
                    System.out.println("CEP não encontrado: " + e.getMessage());
                }
            }

            System.out.print("\nVocê quer consultar outro CEP? (S/N): ");
            String resposta = input.nextLine().trim().toUpperCase();
            if (!resposta.equals("S")) {
                continuar = false;
                System.out.println("Programa finalizado");
            }
        }

        input.close();

    }
}