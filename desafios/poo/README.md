## Diagrama UML

O diagrama UML abaixo mostra a estrutura das interfaces e a classe `Iphone`, incluindo as relações de implementação entre elas.

## Contexto do projeto

O iPhone, lançado em 2007, trouxe várias funcionalidades inovadoras, integrando um reprodutor musical, um aparelho telefônico e um navegador de internet em um único dispositivo. O diagrama modela essas funcionalidades como interfaces separadas, com a classe `Iphone` implementando essas interfaces para fornecer a funcionalidade completa do dispositivo.

## Objetivo do projeto

O objetivo deste projeto foi criar um diagrama de classes utilizando os pilares da Programação Orientada a Objetos (POO), incluindo herança, polimorfismo e interfaces. O diagrama foi desenvolvido para representar a estrutura e as funcionalidades de um componente, destacando como essas características da POO são aplicadas para modelar e organizar o sistema.


```mermaid
classDiagram
    class ReprodutorMusical {
        <<interface>>
        +tocar()
        +pausar()
        +selecionarMusica(String nomeMusica)
    }
class AparelhoTelefonico {
        <<interface>>
        +ligar(String numeroTelefone)
        +atender()
        +iniciarCorreioVoz()
    }

class NavegadorInternet {
        <<interface>>
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()
    }

class Iphone {
        +tocar()
        +pausar()
        +selecionarMusica(String nomeMusica)
        +ligar(String numeroTelefone)
        +atender()
        +iniciarCorreioVoz()
        +exibirPagina(String url)
        +adicionarNovaAba()
        +atualizarPagina()

    }

  ReprodutorMusical <|-- Iphone
  AparelhoTelefonico <|-- Iphone
  NavegadorInternet <|-- Iphone
