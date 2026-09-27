# Espelho Consultor

Protótipo em Java de um chatbot comercial integrado conceitualmente a um
espelho inteligente de provador. O sistema permite solicitar outros tamanhos e
cores, receber sugestões de combinações e pedir ajuda para finalizar a compra
por meio de opções numeradas.

O projeto foi desenvolvido individualmente para a disciplina de Projeto
Integrador I-A do primeiro semestre de Análise e Desenvolvimento de Sistemas.
Seu objetivo é aplicar fundamentos iniciais de lógica de programação sem
utilizar frameworks, banco de dados ou serviços externos.

## Funcionalidades

- solicitação de outro tamanho;
- solicitação de outra cor;
- sugestões para ocasiões casuais, trabalho, festas ou práticas esportivas;
- simulação do encaminhamento da compra para um atendente;
- retorno ao menu principal;
- validação de opções inexistentes;
- encerramento controlado do atendimento.

## Demonstração

```text
+------------------------------------------+
|            ESPELHO CONSULTOR             |
+------------------------------------------+
Olá! Estou aqui para ajudar no provador.

Como posso ajudar?
1 - Solicitar outro tamanho
2 - Solicitar outra cor
3 - Receber uma sugestão de combinação
4 - Comprar a peça
0 - Encerrar atendimento
```

O terminal representa a interface que seria exibida no espelho. O teclado
simula a seleção das opções pelo cliente.

## Tecnologias e conceitos

- Java 21;
- entrada de dados com `Scanner`;
- seleção com `switch`;
- repetição com `while`;
- organização do programa em métodos;
- compilação e execução pelo terminal.

## Estrutura publicável

```text
Chatbot/
├── docs/
│   └── fluxo-conversacional.md
├── src/
│   └── ChatbotEspelho.java
├── testes/
│   └── cenarios-de-teste.md
└── executar.bat
```

O relatório acadêmico, as orientações da disciplina, o roteiro da apresentação
e os arquivos compilados são mantidos apenas localmente.

## Como executar

### Windows

Abra `Chatbot/executar.bat` com dois cliques. O arquivo compila e inicia o
programa automaticamente.

### Terminal

É necessário ter um JDK instalado. Na pasta `Chatbot`, execute:

```powershell
javac -encoding UTF-8 -d out src/ChatbotEspelho.java
java -cp out ChatbotEspelho
```

O projeto foi compilado e validado com o Eclipse Temurin JDK 21.

## Verificação

Foram executados oito cenários cobrindo abertura, tamanho, cor, combinação,
compra, entrada inválida, retorno e encerramento. Resultado: **8 de 8 cenários
aprovados**.

Os casos estão descritos em
[`Chatbot/testes/cenarios-de-teste.md`](Chatbot/testes/cenarios-de-teste.md).

## Limitações

Este é um protótipo executado no terminal. Não há espelho físico, consulta de
estoque, pagamento, cadastro de clientes ou comunicação real com atendentes.

## Autor

Rikelme Santos

## Licença

Distribuído sob a licença MIT. Consulte o arquivo `LICENSE` na raiz do
repositório.
