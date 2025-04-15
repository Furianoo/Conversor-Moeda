# 💱 Conversor de Moeda

O **Conversor de Moeda** é um aplicativo Java simples e funcional que permite converter valores entre diferentes moedas utilizando uma API externa. O sistema oferece conversões pré-definidas, conversões personalizadas e mantém um histórico das operações realizadas.

---

## 🚀 Funcionalidades

✅ Conversões pré-definidas:
- ARS (Peso Argentino) → BRL (Real Brasileiro)  
- BOB (Boliviano) → BRL  
- CLP (Peso Chileno) → BRL  
- COP (Peso Colombiano) → BRL  
- USD (Dólar Americano) → BRL  
- BRL → ARS  
- BRL → BOB  
- BRL → CLP  
- BRL → COP  
- BRL → USD  

✅ Conversão personalizada:  
Permite ao usuário escolher qualquer par de moedas disponíveis na API.

✅ Histórico de conversões:  
O usuário pode consultar todas as conversões realizadas durante a execução da aplicação.

---

## 🛠️ Como usar

### 1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/conversor-moeda.git
cd conversor-moeda
mvn compile
mvn exec:java
╔══════════════════════════════════════╗
║        CONVERSOR DE MOEDAS          ║
╠══════════════════════════════════════╣
║ 1 - ARS (Peso Argentino) → BRL      ║
║ 2 - BOB (Boliviano) → BRL           ║
║ 3 - CLP (Peso Chileno) → BRL        ║
║ 4 - COP (Peso Colombiano) → BRL     ║
║ 5 - USD (Dólar Americano) → BRL     ║
║ 6 - BRL → ARS                        ║
║ 7 - BRL → BOB                        ║
║ 8 - BRL → CLP                        ║
║ 9 - BRL → COP                        ║
║ 10 - BRL → USD                       ║
║ 11 - Conversão personalizada         ║
║ 12 - Exibir histórico                ║
║ 0 - Sair                             ║
╚══════════════════════════════════════╝
conversor-moeda/
├── app/              # Classe principal (ConversorDeMoedaApp.java)
├── model/            # Classes de dados (Conversao, ConversaoRequest, etc.)
├── service/          # Lógica de negócio e chamadas à API
├── exception/        # Exceções personalizadas (APIException, etc.)
├── util/             # Utilitários (HttpClientUtil)
├── pom.xml           # Configuração do Maven
📦 Requisitos
Java JDK 11 ou superior

Maven (ou outro gerenciador de build)

Conexão com a internet (para acessar a API de câmbio)

📄 Licença
Distribuído sob a licença MIT. Veja o arquivo LICENSE para mais detalhes.

✨ Melhorias futuras (opcional)
Persistência do histórico em arquivo .json

Interface gráfica (Swing ou JavaFX)

Suporte offline com cache local de taxas

Testes unitários com JUnit

Integração contínua no GitHub Actions
