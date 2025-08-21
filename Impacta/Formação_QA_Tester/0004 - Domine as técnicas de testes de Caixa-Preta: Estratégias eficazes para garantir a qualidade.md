## Aula 01: Introdução às técnicas de testes e princípios de testes

### O que são técnicas de testes?

* São métodos ou abordagens que usamos para planejar e escrever testes;

* Classificados como caixa-preta, caixa-branca ou baseada na experiência.

* Técnica de Caixa Preta
   * Particionamento de equivalência
   * Tabela Decisão
   * Transição de estado

* Técnicas de Caixa branca
   * Cobertura de instrução
   * Teste de decisão
   * Cobertura de código 

* Técnica baseada em Experiência
   * teste exploratório
   * Baseado em checklist
   * Suposição do erro
 
Testes de *caixa preta* focam em verificar a funcionalidade de um componente *sem considerar sua implementação interna.
---

<br><br>
<div style="page-break-after: always;"></div>

## Aula 02: Os sete princípios de testes

### Os sete princípios de teste

1. O teste mostra a presença de defeitos e não sua ausência
2. Testes exaustivos são impossíveis
3. O teste inicial economiza tempo e dinheiro
4. Defeitos se agrupam
5. Cuidado com o paradoxo do pesticida
6. O teste depende do contexto
7. A ausência de erro é uma ilusão

---

<br><br>
<div style="page-break-after: always;"></div>

## Aula 03: Técnicas baseadas em experiências

## Testes baseados em lista de verificação (checklist)

O testador modela, implementa e executa testes para cobrir as condições de teste de uma lista de verificação.

---

## Teste baseado em suposição de erro

Usada para prever a ocorrência de erros, defeitos e falhas, com base no conhecimento do testador ou usuário

* Como o aplicativo funcionou no passado;
* Quais os tipos de erros que os desenvolvedores tendem a cometer
Os tipos de falhas que ocorreram em outros aplicativos semelhantes

<br><br>
<div style="page-break-after: always;"></div>

## Aula 04: Particionamento de Equivalência

### Particionamento de Equivalência

* Também conhecida como classes de equivalência ou partições de equivalência;
* As partes devem ser formados por valores válidos e inválidos
* É baseada em regra de negócio

#### História de usuário

*Como* administrador do sistema de aula,
*Quero* garantir que os alunos se registrem corretamente,
*Para* que possam usufruir do sistema de ensino online.

#### Regras de Negócio
* RN01: Apenas alunos com idade entre 18 e 65 anos podem ser registrados.
* RN02: O registro de novos alunos é permitido apenas das 8h às 20h (horário local).
* RN03: Cada aula tem um limite de 30 alunos. Se a capacidade for atingida o aluno deve ser colocado em uma lista de espera.
* RN04: Alunos antigos matriculados a mais de 2 anos tem direito a um desconto de 15% nas mensalidades.

<img width="1364" height="1030" alt="image" src="https://github.com/user-attachments/assets/925e4200-bb86-4483-94ba-6afc1e505678" />


---

<br><br>
<div style="page-break-after: always;"></div>
