
class fila {

    constructor(){
        this.itens = [];
    }
    entrar(elemento){
        this.itens.push(elemento);
    }
    sair(){
        return this.itens.shift();
    }
    proximo(){
        return this.itens[0];
    }
    vazia(){
        return this.itens.length === 0;
    }
}

export function bfs(graph, startNode) {
    const retorno = new Array();
    retorno.push(startNode);

    const visitados = new Set();
    visitados.add(startNode);

    const minhafila = new fila();
    minhafila.entrar(startNode);

    while (!minhafila.vazia()) {
        const no = minhafila.sair();

        for(const vizinho of graph[no]) {
            if (!visitados.has(vizinho)) {
                visitados.add(vizinho);
                minhafila.entrar(vizinho);
                retorno.push(vizinho);
            }
        }
    }
    return retorno;
}


