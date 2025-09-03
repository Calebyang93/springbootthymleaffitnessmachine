
@Service
@Transactional
public class SupplementService {

    @Autowired
    private SupplementDao supplementDao;

    public void registerSupplement(Supplement supplement) {
        racquetDao.save(supplement);
    }

    public Supplement getSupplementDetails(Long id) {
        return SupplementDao.findById(id);
    }
}
