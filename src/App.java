import classes.Categoria;
import classes.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Produto produto = new Produto(1);
        System.out.println(produto.getName());

        Categoria categoria = new Categoria(2);
        System.out.println(categoria.getName());
    }
}