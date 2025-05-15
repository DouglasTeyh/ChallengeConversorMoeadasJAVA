# 💱 Conversor de Moedas em Java

> **Converta valores entre Dólar, Real, Euro e Iene em tempo real!**

---

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![API](https://img.shields.io/badge/ExchangeRate--API-blue?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

---

## 🚀 Sobre o projeto

Este projeto é um conversor de moedas simples feito em **Java** que busca as cotações em tempo real usando a API [ExchangeRate-API](https://www.exchangerate-api.com/).

Ideal para quem quer praticar Java, manipular APIs REST e construir um programa com menu interativo em terminal.

---

## 🎯 Funcionalidades

- Conversão entre as moedas:  
  💵 Dólar (USD) ↔ Real (BRL)  
  💶 Euro (EUR) ↔ Real (BRL)  
  💴 Iene Japonês (JPY) ↔ Real (BRL)  
- Menu interativo via terminal, fácil de usar.  
- Atualiza a taxa de câmbio em tempo real.  
- Permite múltiplas conversões até você decidir sair.

---

## 🛠️ Tecnologias e Ferramentas

- Java 11+ (para uso de HttpClient e switch expressions)  
- Biblioteca Gson para JSON parsing (adicionar manualmente no classpath)  
- API ExchangeRate-API para cotações atualizadas  

---

## ⚙️ Como usar

1. **Clone o repositório:**

```bash
git clone https://github.com/seuusuario/conversor-moedas-java.git
cd conversor-moedas-java
```
Baixe o Gson JAR e coloque na pasta do projeto.

Compile:
```
bash
Copiar
Editar
javac -cp gson-2.10.1.jar -d bin src/**/*.java
```
Execute:
```
bash
Copiar
Editar
java -cp bin:gson-2.10.1.jar Main
```
##📋 Menu de opções
text
Copiar
Editar
```
======= CONVERSOR DE MOEDAS =======
1) 💲 Dólar para Real
2) 💲 Real para Dólar
3) 💶 Euro para Real
4) 💶 Real para Euro
5) 💴 Iene para Real
6) 💴 Real para Iene
7) ❌ Sair
Digite o número da opção, informe o valor, e veja o resultado na tela!
```
🧩 Estrutura do projeto
```
src/
 ├── api/
 │    └── ExchangeRateApiClient.java
 ├── model/
 │    └── ExchangeRateResponse.java
 ├── service/
 │    └── CurrencyConverterService.java
 ├── util/
 │    └── HttpUtil.java
 └── Main.java
```


📄 Licença
Distribuído sob a licença MIT. Veja LICENSE para mais informações.

👤 Autor
Douglas Teyh – @douglasteyh

Made with ❤️ em Java!
