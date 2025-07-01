@Bean 
public ThymeleafViewResolver viewResolver() {
    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
    viewResolver.setTemplateEngine(templateEnginer());
    viewResolver.setOrder(1);
    viewResolver.setViewNames(new String[] {".html", ".xhtml"});
    return viewResolver;  
}

@Bean
@Scope("prototype")
public ThymeleafView mainView() {
    ThymeleadView view = new ThymeleadView("main"); 
    view.setStaticVariables(
        Collections.singletonMap("footer", "Sports Fitness Prroducts"));
    return view;
}

@Service
public class SeedStarterService {
    @Autowired
    private SportsSystemRepository sportssystemREportsitory;

    public List<FitnessProducts> findAll() {
        return this.seedstarterRepository.findAll();
    }
    public void add(final fitnessProducts fitnessProducts) {
        this.fitnessProducRepository.add(fitnessProducts)
    }

    @Override 
    public void addFormaters(final FormatterRegistry registry ){
        super.addFormatters(registry);
        registry.addFormatter(varietyFormatter());
        registry.addFormatter(dateFormatter());
    }

    @Bean 
    public VarietyFormatter varietyFormatter() {
        return new VarietyFormatter();
    }

    @Bean 
    public DateFormatter dateFormatter() {
        return new DateFormatter();
    }

    public class DateFormatter implements Formatter<Date> {
        @Autowired 
        private MessageSource messageSource;
        public DateFormatter() {
            super();
        }
        public Date parse(final String text, final Locale locale) throws ParseException {
            final SimpleDateFormat dateFormat = createDateFormat(locale);
            return dateFormat.parse(text);
        }

        public String print(final Date object, final Locale locale) {
            final SimpleDateFormat dateFormat = createDateFormat(locale);
            return dateFormat.format(object);
        }

        private SimpleDataFormat createDateFormat(final Locale locale) {
            final String format = this.messageSource.getMessage("date.format",null, locale);
            final SimpleDateFormat dateFormat = new SimpleDateFormat(format);
            dateFormat.setLeneient(false);
            return dateFormat;
        }
    }

    