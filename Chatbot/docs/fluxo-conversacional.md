# Fluxo conversacional

## Contexto

O Espelho Consultor representa um chatbot comercial exibido em um espelho
inteligente dentro de um provador. O terminal simula a tela sensível ao toque do
espelho.

## Menu principal

```text
1 - Solicitar outro tamanho
2 - Solicitar outra cor
3 - Receber uma sugestão de combinação
4 - Comprar a peça
0 - Encerrar atendimento
```

## Respostas possíveis

### Outro tamanho

- `1`: solicitar uma peça um tamanho maior;
- `2`: solicitar uma peça dois tamanhos maiores;
- `3`: chamar um atendente;
- `9`: voltar ao menu principal.

### Outra cor

- `1`: solicitar a cor preta;
- `2`: solicitar a cor branca;
- `3`: solicitar a cor azul;
- `4`: chamar um atendente para apresentar outras cores;
- `9`: voltar ao menu principal.

### Sugestão de combinação

- `1`: combinação casual;
- `2`: combinação para trabalho;
- `3`: combinação para festa;
- `4`: combinação esportiva;
- `9`: voltar ao menu principal.

### Compra

- `1`: chamar um atendente para finalizar a compra;
- `2`: continuar experimentando a peça;
- `9`: voltar ao menu principal.

Em todos os menus, uma entrada diferente das opções apresentadas gera uma
mensagem de erro e permite uma nova tentativa.
