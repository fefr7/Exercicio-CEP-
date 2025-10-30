# 📍 Cliente Java para API ViaCEP

Este projeto tem como objetivo desenvolver um cliente Java nativo capaz de realizar consultas à API pública [ViaCEP](https://viacep.com.br/) para obter dados de endereços a partir de um Código de Endereçamento Postal (CEP).

## 🚀 Tecnologias e Funcionalidades

* **Linguagem:** Java
* **API Externa:** [ViaCEP](https://viacep.com.br/) - Serviço gratuito e aberto de consulta de CEP.
* **Conexão:** Uso de classes e bibliotecas nativas do Java para fazer requisições HTTP (como `java.net.URL` e `HttpURLConnection`).
* **Processamento de Dados:** Utilização de bibliotecas para processar a resposta em formato JSON e mapear os dados para um objeto Java (POJO).

## 💻 Como Rodar o Projeto

### Pré-requisitos

* JDK (Java Development Kit) instalado (versão 8 ou superior).
* Ferramenta de build instalada (ex: Gradle ou Maven, se aplicável).

### Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://docs.github.com/pt/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github](https://docs.github.com/pt/migrations/importing-source-code/using-the-command-line-to-import-source-code/adding-locally-hosted-code-to-github)
    cd nome-do-seu-projeto
    ```

2.  **Compile e Execute:**
    * *Se estiver usando uma IDE (IntelliJ, Eclipse), basta abrir o projeto e executar a classe principal.*
    * *Se estiver usando a linha de comando com o Gradle (ou Maven), utilize os comandos de build apropriados.*

O cliente deve solicitar a inserção de um CEP e exibir o endereço completo retornado pela API.

## 🔑 Exemplo de Uso (Consulta)

Ao executar o programa, ele deve permitir a consulta de um CEP, como:

| CEP de Entrada | Saída Esperada |
| :--- | :--- |
| **01001-000** | Logradouro: Praça da Sé, Bairro: Sé, Localidade: São Paulo, UF: SP |

## 🤝 Contribuição

Sinta-se à vontade para sugerir melhorias, como tratamento de erros, testes unitários e refatorações no código.

1.  Faça um Fork do projeto.
2.  Crie uma nova Branch (`git checkout -b feature/melhoria`).
3.  Faça o Commit das suas alterações (`git commit -m 'feat: adiciona tratamento de erros na requisição'`).
4.  Faça o Push para a Branch (`git push origin feature/melhoria`).
5.  Abra um **Pull Request**.
