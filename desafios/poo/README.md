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
