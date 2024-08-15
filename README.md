# Desafio de Projeto Banco

Trata-se de um desafio de projeto proposto pela plataforma Digital Inovation One (DIO) onde se foi criado um pequeno modelo de Banco, utilizando os conceitos aprendidos dos princípios de OOP.

### Alterações Propostas

A lógica usada foi a seguinte:
* O Cliente faz parte da Conta; A Conta faz parte do Banco. Então seria o Banco quem deveria criar a Conta e está não pode existir sem o Cliente;
* As instanciações são feitas por dentro da Classe, não no metodo Main. Assim, o Banco irá criar uma Conta e esta será salva em um objeto específico.
* Toda vez que uma Conta é criada, seja ela Corrente ou Poupança, irá integrar uma lista no Banco automaticamente. Assim, poderão ser gerenciadas propriamente;