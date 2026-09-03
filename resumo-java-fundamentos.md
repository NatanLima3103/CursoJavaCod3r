# Resumo de Java — Fundamentos (PrimeiroPrograma)

> Cola de revisão baseada no seu próprio projeto. Cada item: o que é, a sintaxe base, e como **pensar** nela em português.

---

## 🧱 Tipos e Variáveis

### Tipos primitivos
`byte`, `short`, `int`, `long`, `float`, `double`, `boolean`, `char`

**Pense assim:** "que tipo de gaveta eu preciso pra guardar esse valor?" — número inteiro pequeno → `byte`/`short`/`int`; número inteiro gigante → `long`; número com casa decimal → `double` (padrão) ou `float`; verdadeiro/falso → `boolean`; um único caractere → `char`.

```java
int id = 56789;
double salario = 11445.44;
boolean estaDeFerias = true;
char status = 'A';
```

### `var` (inferência de tipo)
**Pense assim:** "deixa o Java descobrir o tipo sozinho, pelo valor que eu dei." Só funciona quando você já inicializa a variável na hora de criar.

```java
var b = 4.5;  // Java entende que é double
```

### Wrappers (versão "objeto" dos primitivos)
`Integer`, `Double`, `Boolean`, `Character`, etc.

**Pense assim:** "é o mesmo tipo, só que embrulhado num objeto" — usado quando você precisa chamar métodos (tipo `.toString()`) ou guardar em coleções (`ArrayList`, por exemplo, não aceita `int` puro).

```java
Integer i = Integer.parseInt("10000");
System.out.println(i.toString().length());
```

---

## 🔤 Strings

### Métodos encadeados (notação de ponto)
**Pense assim:** "cada `.método()` pega o resultado do anterior e continua trabalhando em cima dele" — como uma linha de produção.

```java
string y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!");
```

### Comparando Strings: `==` vs `.equals()`
**Pense assim:** `==` compara se é **o mesmo objeto na memória** (raramente é isso que você quer). `.equals()` compara se **o conteúdo é igual** (quase sempre é isso que você quer).

**Regra fixa: para comparar texto, sempre `.equals()`, nunca `==`.**

```java
"2".equals(s1)   // ✅ jeito certo
"2" == s1        // ❌ pode dar errado
```

### Conversão string ↔ Número
**Pense assim:** "número vira texto colando uma string vazia na frente ou usando `.toString()`; texto vira número com `Double.parseDouble()` ou `Integer.parseInt()`."

```java
double numero = Double.parseDouble("15,50".replace(",", "."));
```

---

## ➕ Operadores

### Aritméticos: `+ - * / %`
**Pense assim:** os quatro básicos + o `%` (resto da divisão) — "quanto sobra depois de dividir o máximo possível?"

```java
System.out.println(8 % 3); // sobra 2
```

### Relacionais: `== != > < >= <=`
**Pense assim:** "essa comparação é verdadeira ou falsa?" — sempre resulta em `boolean`.

### Lógicos: `&& || ! ^`
**Pense assim:**
- `&&` (E) → "as duas coisas precisam ser verdadeiras"
- `||` (OU) → "pelo menos uma precisa ser verdadeira"
- `!` (NÃO) → "inverte o valor"
- `^` (OU exclusivo) → "verdadeiro só quando são **diferentes** entre si"

```java
boolean temDesconto = bomComportamento && passouPorMedia;
```

### Atribuição composta: `+= -= *= /= %=`
**Pense assim:** "atalho pra fazer a conta e guardar no mesmo lugar." `c += b` é o mesmo que `c = c + b`.

### Unários: `++` e `--`
**Pense assim:** "soma ou subtrai 1." Só cuidado: `a++` usa o valor **antes** de somar; `++a` soma **antes** de usar.

### Ternário: `condição ? seVerdadeiro : seFalso`
**Pense assim:** "um `if/else` de uma linha só, que **devolve um valor**."

```java
string resultado = media >= 7.0 ? "aprovado" : "em recuperação";
```

---

## 🔀 Estruturas de Controle

### `if`
**Pense assim:** "**se** isso for verdade, faça aquilo."
```java
if (media >= 7.0) { System.out.println("Aprovado!"); }
```

### `if / else`
**Pense assim:** "**se** for verdade, faz A; **senão**, faz B." Só um dos dois caminhos roda.
```java
if (numero % 2 == 0) { ... } else { ... }
```

### `if / else if / else`
**Pense assim:** "vai testando várias condições em fila, e para na primeira que for verdadeira." A ordem importa!
```java
if (nota >= 8.1) { ... }
else if (nota >= 6.1) { ... }
else { ... }
```

### `for`
**Pense assim:** "eu **já sei** quantas vezes quero repetir (ou tenho uma regra clara de início/fim)."

Estrutura: `for (início; até quando; o que muda a cada volta)`
```java
for (int contador = 1; contador <= 10; contador++) { ... }
```

### `while`
**Pense assim:** "**enquanto** essa condição continuar verdadeira, continue fazendo isso." Não sei quantas vezes vai repetir de antemão — só sei quando parar.
```java
while (!valor.equalsIgnoreCase("sair")) {
    valor = entrada.nextLine();
}
```

### `do / while`
**Pense assim:** "faça pelo menos **uma vez**, e só depois verifica se deve repetir." Diferença pro `while` normal: aqui a ação roda antes de checar a condição.
```java
do {
    texto = entrada.nextLine();
} while (!texto.equalsIgnoreCase("Por favor"));
```

---

## 🎯 Dica de leitura rápida

Quando bater aquela trava, pergunte na ordem:
1. **Isso é uma repetição ou uma decisão?** → repetição = `for`/`while`; decisão = `if`
2. **Se for repetição, eu sei quantas vezes?** → sei = `for`; não sei = `while`
3. **Se for decisão, tem mais de um caminho possível?** → só um = `if`; dois = `if/else`; vários = `if/else if`

Isso resolve a "tradução lógica → sintaxe" em boa parte dos casos.
