## 1) Determine se cada uma das seguintes afirmações é verdadeira ou falsa. Se uma instrução for falsa, explique por quê.

### Os construtores de superclasse não são herdados por subclasses. 
**Verdadeiro**

### Um relacionamento tem um é implementado via herança.
**Falso, pois não são implementados por herança, e sim por atributos de outras classes**

### Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.
**Falso, fala que o método foi sub-escrito, ou Override**

## 2) Alguns programadores preferem não utilizar acesso protected , porque acreditam que ele quebra o encapsulamento da superclasse. Discuta os méritos relativos de usar acesso protected versus acesso private em superclasses.
**O uso de private em superclasses garante maior encapsulamento e segurança dos dados, dificultando o acesso por subclasses, enquanto protected facilita a reutilização e extensão de comportamentos por subclasses, mas reduz o encapsulamento e pode aumentar o acoplamento. A escolha depende do equilíbrio entre segurança e flexibilidade na herança.**

## 3) Explique como funciona a chamada de construtores em hierarquias de herança. Por que é obrigatório que o construtor da superclasse seja chamado explicitamente ou implicitamente?
**Em hierarquias de herança em Java, a chamada ao construtor da superclasse é obrigatória porque ele é responsável por inicializar os atributos herdados; se não for chamado explicitamente com super(), o compilador o insere automaticamente. Isso garante que toda a estrutura da classe seja corretamente montada desde o topo da hierarquia, evitando objetos malformados ou com estados inconsistentes.**
