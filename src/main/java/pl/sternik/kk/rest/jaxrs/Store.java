package pl.sternik.kk.rest.jaxrs;

import javax.ws.rs.*;

@Path("/store")
public class Store {

    //http://localhost:8080/store/article/5
    @GET
    @Path("/article/{id}")
    @Produces("application/json")
    public Article getArticle(@PathParam("id") String id) {
        Article article = new Article();
        article.setId(Integer.valueOf(id));
        article.setName("Mleko");
        return article;
    }

    //http://localhost:8080/store/articles?id=6
    @GET
    @Path("/articles")
    @Produces("application/xml")
    public Article getArticles(@QueryParam("id") String id) {
        Article article = new Article();
        article.setId(Integer.valueOf(id));
        article.setName("Mleko");
        return article;
    }



    @PUT
    @Path("/article")
    @Consumes("application/json")
    public void addArticle(Article art) {
    }
}
