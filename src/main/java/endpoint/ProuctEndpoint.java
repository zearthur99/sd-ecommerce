package endpoint;

import jakarta.annotation.PostConstruct;
import model.Product;
import services.ProductService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProuctEndpoint {

    @Inject
    ProductService productService;


    @POST
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Product createProduct(Product p) {
        return productService.insert(p);
    }

}
