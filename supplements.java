@Entity
@Table(name = "Supplements")
public class Supplements {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String ingredients;
    private float price;
    // Getters and Setters
}
