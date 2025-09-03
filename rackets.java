@Entity
@Table(name = "racquet")
public class Racquets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String sport;
    private char model;
    private string material;
    private float price;
    // Getters and Setters
}
