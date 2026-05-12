Atividade da disciplina de Padrões de Projeto – Builder
O projeto desenvolvido aplica o padrão Builder em um cenário de cadastro de funcionários, simulando a criação de objetos complexos que representam todas as informações necessárias para registrar um colaborador em uma empresa. 
A ideia central é demonstrar como o Builder facilita a construção de objetos com muitos atributos, permitindo que sejam configurados passo a passo de forma clara e organizada, sem depender de construtores longos e difíceis de manter.

No modelo proposto, a classe Funcionario representa o objeto principal, contendo dados como matrícula, nome, data de nascimento, filiação, documentos pessoais (CPF e RG), endereço completo, e informações adicionais como cargo e salário. 
Para simplificar a criação desses objetos, foi implementada a classe FuncionarioBuilder, que fornece métodos encadeados para configurar cada atributo e garante a validação de campos essenciais (como matrícula, nome e CPF) antes de finalizar a construção com o método build().

Escolhi o cenário de cadastro de funcionários porque ele reflete bem a lógica de construção gradual: cada colaborador pode ter diferentes combinações de dados, mas sempre precisa de informações mínimas para ser considerado válido. 
Isso torna o uso do Builder ideal para organizar a criação de objetos complexos, reduzir erros de inicialização e aumentar a legibilidade e manutenção do sistema.

Diagrama UML - https://drive.google.com/file/d/1QZOr9dNhbFr2leCFlPVj5c-Ew2E5FJ1w/view?usp=sharing
