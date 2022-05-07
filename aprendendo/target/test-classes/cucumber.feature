#Author: alissonc488@gmail.com

Feature: Pesquisar no google
  I eu como usuario quero acessar o site para realizar uma pesquisa

  Scenario: Pesquisar o nome da escola no google
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar o nome da escola
    Then valido as informacoes
    
    