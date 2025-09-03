@Service
@Transactional
public class RacketDaoService {

    @Autowired
    private RacketDao racketDao;

    public void registerRacket(Racket racket) {
        racketDao.save(racket);
    }

    public Racket getRacketDetails(Long id) {
        return racketDao.findById(id);
    }
}
