@Repository
public class sportswearDao {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(sportswear sportswear) {
        sessionFactory.getCurrentSession().save(sportswear);
    }

    public SportsWear findById(Long id) {
        return sessionFactory.getCurrentSession().get(SportsWear.class, id);
    }
}
