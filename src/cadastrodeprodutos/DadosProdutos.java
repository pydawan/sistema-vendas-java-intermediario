
package cadastrodeprodutos;

import java.util.ArrayList;

public class DadosProdutos {
    ArrayList<Produto> produtos = new ArrayList();
    
    public int qtdProdutos() {
        return produtos.size();
    }
    
    public String qtd() {
        return produtos.size() + "";
    }
    
    // método para cadastrar produto no ArrayList
    public void cadastrarProdutos(Produto produto) {
        produtos.add(produto);
    }
}
