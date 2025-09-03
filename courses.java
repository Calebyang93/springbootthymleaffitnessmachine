@Entity
@Table(name = "supplement")
public class supplements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prdtid;
    private String name;
    private String ingredients;
    private char brand;
    private float price;
    // Getters and Setters
}
