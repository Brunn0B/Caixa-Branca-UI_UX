## Grafo de Fluxo de Controle

Abaixo está o grafo de fluxo de controle para o método `verificarUsuario`:

![Grafo de Fluxo de Controle](/Etapa-3/ETAPA-3-GRAFO.jpeg)






## Complexidade Ciclomática

A complexidade ciclomática do código é calculada como **3**, conforme a seguinte fórmula:

\[V(G) = E - N + 2P\]

Onde:
- **E** é o número de arestas no grafo de fluxo de controle: 12
- **N** é o número de nodos: 11
- **P** é o número de componentes conexos: 1

Com isso, temos que a **complexidade ciclomática** do código é **3**.

---

## Caminhos Independentes

Com base na complexidade ciclomática, identificamos os seguintes **caminhos independentes** no código:

### Caminho 1:
**N1 → N5 → N6 → N7 → N8 → N9 → N11**

Este caminho segue sem passar por exceções.

### Caminho 2:
**N1 → N5 → N6 → N7 → N10 → N11**

Este caminho segue pelo bloco de exceção no `try/catch`.

### Caminho 3:
**N1 → N5 → N6 → N7 → N8 → N10 → N11**

Este caminho segue após uma falha na autenticação ou banco de dados, passando pela exceção.

---

Esses caminhos independentes ajudam a entender as diferentes trajetórias que o código pode tomar durante a execução.
