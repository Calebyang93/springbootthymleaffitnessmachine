@Service
@Transactional
public class SportsWearDaoService {

    @Autowired
    private sportswearDao sportswearDao;

    public void registerSportsWear(SportsWear sportswear) {
        SportsWearDao.save(sportswear);
    }

    public SportsWear getSportsWearDetails(Long id) {
        return SportsWearDao.findById(id);
    }
}
