#Author: your.email@your.domain.com


Feature: Pesquisar google
  Eu como usuario quero realizar pesquisa no google para validar informacoes



  Scenario Outline: Pesquisar no google
    Given que eu esteja no "https://www.google.com.br"
    When pesquisar o nome da <pesquisa> 
    Then visualizo as <informacoes>

    Examples: 
      |pesquisa                 | informacoes      |
      |"banco itau"             |"banco itau"      |         
      |"banco Bradesco   "      |"banco Bradesco"  |  
      |"Nubank "                |"Nubank "         |
