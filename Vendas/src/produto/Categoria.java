/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produto;

/**
 *
 * @author Allan
 */
public enum Categoria implements Strategy{

    ALIMENTOS{
        @Override
        public double calcularComissao(double valorProduto) {
            return(valorProduto * 0.1);
        }
    },
        
    HIGIENE{
        @Override
        public double calcularComissao(double valorProduto) {
            return(valorProduto * 0.07);
        }
    },
    
    ROUPAS{
        @Override
        public double calcularComissao(double valorProduto) {
            return(valorProduto * 0.04);
        }
    },
    
    UTENSILIOS{
        @Override
        public double calcularComissao(double valorProduto) {
            return(valorProduto * 0.02);
        }
    }
}
