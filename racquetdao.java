@Service
@Transactional
public class UserService {

    @Autowired
    private RacketDao racketDao;

    public void registerRacquet(Racquet racquet) {
        racquetDao.save(racquet);
    }

    public Racquet getRacquetDetails(Long id) {
        return racquetDao.findById(id);
    }
}
