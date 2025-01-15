package Controller;

import Model.Spieler;
import Model.Vereine;
import Repository.IRepository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Controller class that manages operations on Product and Client entities using their respective repositories.
 */
public class Controller {

    private final IRepository<Vereine> vereineRepo;
    private final IRepository<Spieler> spielerRepo;

    /**
     * Constructs a Controller with the given Product and Client repositories.
     *
     * @param repo1 the repository for Product entities
     * @param repo2 the repository for Client entities
     */
    public Controller(IRepository<Vereine> repo1, IRepository<Spieler> repo2) {
        this.vereineRepo = repo1;
        this.spielerRepo = repo2;

    }

    /**
     * Initializes the repository with predefined Product and Client data.
     */
//    public void initializeRepository() {
//        Product p1 = new Product(1, "Ski", 120, "winter");
//        Product p2 = new Product(2, "Sanie", 150, "winter");
//        Product p3 = new Product(3, "Basketball", 200, "spring");
//        Product p4 = new Product(4, "Football", 100, "summer");
//
//        productRepo.create(p1);
//        productRepo.create(p2);
//        productRepo.create(p3);
//        productRepo.create(p4);
//
//        Client client1 = new Client(1, "Ana", "Cluj");
//        Client client2 = new Client(2, "Bob","Sibiu");
//        Client client3 = new Client(3, "Charlie", "Floresti");
//
//        clientRepo.create(client1);
//        clientRepo.create(client2);
//        clientRepo.create(client3);
//
//        addProductToClient(1, 2);
//        addProductToClient(1, 3);
//        addProductToClient(4, 1);
//        addProductToClient(2, 3);
//    }

    /**
     * Adds a Product entity to the repository.
     *
     * @param Vereine the Product to add
     */
    public void addVereine(Vereine Vereine) {
        vereineRepo.create(Vereine);
    }

    /**
     * Retrieves all Product entities from the repository.
     *
     * @return a list of all Products
     */
    public List<Vereine> getProducts() {
        return vereineRepo.getAll();
    }

    /**
     * Updates an existing Product in the repository.
     *
     * @param Vereine the Product to update
     */
    public void updateProduct(Vereine Vereine) {
        vereineRepo.update(Model.Vereine.getName(), Vereine);
    }

