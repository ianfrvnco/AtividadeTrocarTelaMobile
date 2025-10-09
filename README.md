# 🎮 Aula de Troca de Telas

Um aplicativo Android simples desenvolvido em **Java + XML** no **Android Studio**, com o intuito de aprender a realizar troca de telas em aplicativo mobile.  
Projeto criado como parte dos estudos de **desenvolvimento mobile nativo** e personalização de interfaces Android.

---

## 🧠 Sobre o Projeto

O aplicativo é uma prática para entender a lógica por trás da troca de telas:

- Estrutura básica de um projeto Android (Activities e Layouts)
- Interação via eventos de clique (`onClick`)
- Lógica de programação (condicionais, aleatoriedade)
- Manipulação de telas

---

## 🛠️ Tecnologias Utilizadas

| Categoria | Ferramenta |
|------------|-------------|
| IDE | Android Studio |
| Linguagem | Java |
| Layouts | XML |
| Versão mínima Android | API 26 (Android 8.0 Oreo) |
| Estrutura de UI | ConstraintLayout / LinearLayout |
| Recursos gráficos | Drawable Resources |

---

## 📱 Estrutura do Projeto

```
app/
 ├── java/
 │    └── br/ulbra/appjokenpo/
 │         └── MainActivity.java
 ├── res/
 │    ├── layout/
 │    │     └── activity_main.xml
 |    |     └── tela2.xml
 │    └── values/
 │          └── strings.xml
 └── AndroidManifest.xml
```

---

## 🧩 Funcionar do App

A classe `MainActivity` controla toda a lógica do App:

1. O usuário clica no botão.
2. O aplicativo joga para a outra tela.

---

## 🧰 Estrutura XML

O layout principal (`activity_main.xml`) contém:
- 3 botões (Pedra, Papel, Tesoura)
- 1 `ImageView` (escolha do app)
- 1 `TextView` (resultado)
- 1 `TextView` opcional para placar

Exemplo de uso do atributo `onClick`:
```xml
<Button
    android:id="@+id/btnTrocaTela"
    android:onClick="selecionadoPedra"
    android:text="Trocar de tela"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"/>
```

---

## 🏗️ Funcionalidades Implementadas

✅ Ao clicar no botão de trocar de tela, o aplicativo migra a tela pra outra.

---

## 👩‍💻 Autor / Equipe

**Nome:** *Ian Franco*  
**Instituição:** *São Lucas, Curso Técnico em Informática*  
**Disciplina:** *Desenvolvimento Mobile Android*  
**Professor:** *Jeferson Leon*  

---

## 📚 Licença

Este projeto foi desenvolvido para fins **educacionais**.  
Você pode modificar, reutilizar e distribuir livremente o código, mantendo os devidos créditos.

---

## 🚀 Let's Code!  
> "A melhor forma de aprender é construindo. Então... bora codar!"
