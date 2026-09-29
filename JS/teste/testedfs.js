import { dfs } from "../algorithms/dfs.js";
import { bfs } from "../algorithms/bfs.js";

const graph = {
    1: [2, 3],
    2: [4],
    3: [4],
    4: [5],
    5: []
};

const resultado = dfs(graph, 1);
const resultado2 = bfs(graph, 1);
console.log(resultado);
console.log(resultado2);