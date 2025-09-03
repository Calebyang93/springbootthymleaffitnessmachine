@Service
@Transactional
public class SupplementService {

    @Autowired
    private SupplementDao supplementDao;

    public void registerSupplement(Supplement supplement) {
        supplementDao.save(supplement);
    }

    public Supplement getSupplemetByDetails(Long id) {
        return supplementDao.findById(id);
    }
}
