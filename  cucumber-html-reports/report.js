$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("java/arquivos_teste.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: [211908] Rafael M Jakubovsky"
    },
    {
      "line": 2,
      "value": "#Keywords Summary:"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition Step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then,Steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "# (Comments)"
    },
    {
      "line": 18,
      "value": "#Feature para a realização de testes"
    }
  ],
  "line": 20,
  "name": "Cliente faz saque de dinheiro como um cliente,",
  "description": "eu gostaria de sacar dinheiro em caixa eletrônico,\r\npara que eu não tenha que esperar em uma fila do banco.",
  "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 25,
  "name": "Cliente especial com saldo negativo",
  "description": "",
  "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-especial-com-saldo-negativo",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "Um cliente especial com saldo atual de -200 reais",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "for solicitado um saque no valor de 100 reais",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "deve efetuar o saque e atualizar o saldo da conta para -300 reais",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 32,
  "name": "Cliente comum com saldo negativo",
  "description": "",
  "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 31,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Um cliente comum com saldo atual de -200 reais",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "solicitar um saque no valor de 200 reais",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo;",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ],
      "line": 38,
      "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "sucess"
      ],
      "line": 39,
      "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo;;2"
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ],
      "line": 40,
      "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 39,
  "name": "Cliente comum com saldo negativo",
  "description": "",
  "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 31,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Um cliente comum com saldo atual de -200 reais",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "solicitar um saque no valor de 200 reais",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 40,
  "name": "Cliente comum com saldo negativo",
  "description": "",
  "id": "cliente-faz-saque-de-dinheiro-como-um-cliente,;cliente-comum-com-saldo-negativo;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 31,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Um cliente comum com saldo atual de -200 reais",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "solicitar um saque no valor de 200 reais",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "não deve efetuar o saque e deve retornar a mensagem Saldo Insuficiente",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});