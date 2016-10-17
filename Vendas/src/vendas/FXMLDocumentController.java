/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import produto.Categoria;

import produto.Produto;

/**
 *
 * @author Allan
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private ComboBox<Produto> produtosEmEstoque;
    
    @FXML
    private Label valorProduto;
    
    @FXML
    private TextField quantidadeProduto;
    
    @FXML
    private Label valorTotalProduto;
    
    @FXML
    private Label valorTotalVenda;
    
    ObservableList<Produto> listaProdutosEmEstoque = FXCollections.observableArrayList();
    
    public void mostrarValorProdutoUnitario(){
        if(produtosEmEstoque.getValue() == null){
            valorProduto.setText("");
        }else{
            valorProduto.setText(String.valueOf(produtosEmEstoque.getValue().getValor()));
            mutiplicarValorQuantidadeProduto();
        }
    }
    
    public void mutiplicarValorQuantidadeProduto(){
        if ((quantidadeProduto.getText() != null) && (produtosEmEstoque.getValue() != null)){
            double valor, quantidade, total;
            
            valor = produtosEmEstoque.getValue().getValor();
            quantidade = Double.parseDouble(quantidadeProduto.getText());
            total = quantidade * valor;
            valorTotalProduto.setText(String.valueOf(total));
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();
        Produto produto4 = new Produto();
        
        produto1.setDescricao("Feijão");
        produto1.setValor(15);
        produto1.setCategoria(Categoria.ALIMENTOS);
        produto2.setDescricao("Sabonete");
        produto2.setValor(3);
        produto2.setCategoria(Categoria.HIGIENE);
        produto3.setDescricao("Camiseta");
        produto3.setCategoria(Categoria.ROUPAS);
        produto3.setValor(20);
        produto4.setDescricao("Copo");
        produto4.setCategoria(Categoria.UTENSILIOS);
        produto4.setValor(5);
        
        listaProdutosEmEstoque.add(produto1);
        listaProdutosEmEstoque.add(produto2);
        listaProdutosEmEstoque.add(produto3);
        listaProdutosEmEstoque.add(produto4);
        
        produtosEmEstoque.setItems(listaProdutosEmEstoque);

        
    }    
    
}
