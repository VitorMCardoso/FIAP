import model.Produto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.ProdutoService;

import java.util.Arrays;

public class SpringJPATeste {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new
                ClassPathXmlApplicationContext("../resources/spring.xml");
        ProdutoService produtoService = ctx.getBean(ProdutoService.class);
        produtoService.add(new Produto(1, "Laranja"));
        produtoService.add(new Produto(2, "Limao"));
        System.out.println(produtoService.findAll());

        produtoService.addAll(Arrays.asList(
                new Produto(3, "Pera"),
                new Produto(4, "Morango"),
                new Produto(5, "Maracuja")
        ));

        System.out.println(produtoService.findAll());
        System.out.println(produtoService.findByName("Maracuja"));
        ctx.close();
    }
}
