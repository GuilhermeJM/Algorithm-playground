export function dfs(graph, startNode, visitados = new Set(),retorno = new Array()) {
    retorno.push(startNode);
    visitados.add(startNode);
    for (const vizinho of graph[startNode]) {
        if (!visitados.has(vizinho)) {
            retorno = dfs(graph, vizinho, visitados, retorno);
        }
    }

    return retorno;
}