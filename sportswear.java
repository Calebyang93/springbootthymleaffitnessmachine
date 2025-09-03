@Entity
@Table(name = "sportswear")
public class SportsWear {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String material;
    private String clothestype;
    private float price;
    // Getters and Setters
}
