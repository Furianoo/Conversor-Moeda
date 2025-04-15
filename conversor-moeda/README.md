Conversor de Moeda
Descrição
O Conversor de Moeda é um aplicativo simples desenvolvido em Java que permite converter valores entre diferentes moedas, incluindo pesos argentinos (ARS), bolivianos (BOB), pesos chilenos (CLP), pesos colombianos (COP), dólares americanos (USD) e reais brasileiros (BRL). O programa permite também conversões personalizadas entre qualquer par de moedas disponíveis, além de registrar todas as conversões realizadas em um histórico.

Funcionalidades
Conversão entre as seguintes moedas:

ARS (Peso Argentino) → BRL (Real Brasileiro)

BOB (Boliviano) → BRL

CLP (Peso Chileno) → BRL

COP (Peso Colombiano) → BRL

USD (Dólar Americano) → BRL

BRL (Real Brasileiro) → ARS (Peso Argentino)

BRL → BOB

BRL → CLP

BRL → COP

BRL → USD

Conversão personalizada, permitindo que o usuário escolha qualquer par de moedas entre as moedas disponíveis.

Histórico das conversões realizadas, que pode ser visualizado a qualquer momento.

Como Usar
Clone este repositório para o seu computador:

bash
Copiar
Editar
git clone https://github.com/seu-usuario/conversor-moeda.git
Navegue até o diretório do projeto:

bash
Copiar
Editar
cd conversor-moeda
Compile o projeto utilizando o Maven (ou o seu gerenciador de dependências preferido):

bash
Copiar
Editar
mvn compile
Execute o programa:

bash
Copiar
Editar
mvn exec:java
O programa exibirá um menu com as opções de conversão. Siga as instruções para escolher a moeda de origem e destino, e insira o valor a ser convertido.

O histórico das conversões pode ser visualizado selecionando a opção de "Exibir histórico" no menu.

Exemplo de Uso
Após executar o programa, o menu será exibido:

scss
Copiar
Editar
╔══════════════════════════════════════╗
║         CONVERSOR DE MOEDAS         ║
╠══════════════════════════════════════╣
║ 1  - ARS (Peso Argentino) → BRL      ║
║ 2  - BOB (Boliviano) → BRL           ║
║ 3  - CLP (Peso Chileno) → BRL        ║
║ 4  - COP (Peso Colombiano) → BRL     ║
║ 5  - USD (Dólar Americano) → BRL     ║
║ 6  - BRL → ARS                       ║
║ 7  - BRL → BOB                       ║
║ 8  - BRL → CLP                       ║
║ 9  - BRL → COP                       ║
║ 10 - BRL → USD                       ║
║ 11 - Conversão personalizada         ║
║ 12 - Exibir histórico                ║
║ 0  - Sair                            ║
╚══════════════════════════════════════╝
Após escolher a opção de conversão, o programa solicitará que você insira o valor e exibirá o resultado da conversão.

Estrutura do Projeto
O projeto é estruturado da seguinte forma:

app/: Contém a classe principal ConversorDeMoedaApp.java que executa o aplicativo e gerencia as interações com o usuário.

model/: Contém as classes que representam os dados do sistema, como Conversao, ConversaoRequest, ConversaoResponse, entre outras.

service/: Contém as classes de serviço que lidam com a lógica de conversão, histórico e chamadas à API externa para obter taxas de câmbio.

exception/: Contém exceções personalizadas, como APIException e ConversaoException, usadas para lidar com erros no processo de conversão.

util/: Contém utilitários, como o HttpClientUtil, responsável por fazer as requisições HTTP para obter as taxas de câmbio.

Requisitos
JDK 11 ou superior

Maven (ou outra ferramenta de build)

Licença
Este projeto está licenciado sob a licença MIT - consulte o arquivo LICENSE para mais detalhes.