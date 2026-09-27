# Cenários de teste — Espelho Consultor

Estes cenários registram o comportamento esperado sem introduzir uma biblioteca
de testes que ainda não faz parte do conteúdo da disciplina.

## T-1 — Abrir o atendimento

**Dado** que o programa foi iniciado, **quando** o menu for exibido, **então**
devem aparecer as opções tamanho, cor, combinação, compra e encerramento.

## T-2 — Solicitar outro tamanho

**Dado** o menu principal, **quando** forem informadas as opções `1` e `1`,
**então** o chatbot deve confirmar a solicitação de uma peça um tamanho maior.

## T-3 — Solicitar outra cor

**Dado** o menu principal, **quando** forem informadas as opções `2` e `3`,
**então** o chatbot deve confirmar a solicitação de uma peça azul.

## T-4 — Receber uma combinação

**Dado** o menu principal, **quando** forem informadas as opções `3` e `2`,
**então** o chatbot deve recomendar uma combinação para trabalho.

## T-5 — Confirmar a compra

**Dado** o menu principal, **quando** forem informadas as opções `4` e `1`,
**então** o chatbot deve informar que um atendente foi chamado para finalizar a
compra.

## T-6 — Rejeitar uma opção inexistente

**Dado** qualquer menu, **quando** o usuário informar uma opção não apresentada,
**então** o chatbot deve informar que a opção é inválida e exibir novamente o
mesmo menu.

## T-7 — Voltar ao menu principal

**Dado** um submenu, **quando** o usuário informar `9`, **então** o menu
principal deve ser exibido novamente.

## T-8 — Encerrar

**Dado** o menu principal, **quando** o usuário informar `0`, **então** o
chatbot deve se despedir e o programa deve terminar.

## Estado da verificação

O código foi compilado com o Eclipse Temurin JDK 21 e os oito cenários foram
executados em 26/09/2026. Resultado: **8 de 8 cenários aprovados**.
