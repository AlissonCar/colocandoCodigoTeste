#Author: alissonc488@gmail.com


Feature: Pesquisar no google
  Eu como usuario quero acessar o site para realizar uma pesquisa
  
  Background: Acessar o google
    Given que eu esteja no "https://www.google.com.br"

  Scenario: Pesquisar E2E Treinamentos

    When pesquisar o nome da "E2E Treinamentos"
    Then valido "E2E Treinamentos"
    
    Scenario: Pesquisar Inovacao

    When pesquisar o nome da "Inovacão"
    Then valido "Inovação"
    
    Scenario: Pesquisar Felicidade

    When pesquisar o nome da "Felicidade"
    Then valido "Felicidade"



