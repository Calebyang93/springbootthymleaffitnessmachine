// Java-based Configuration
@Configuration
@EnableTransactionManagement
public class HibernateConfig {

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setPackagesToScan("com.example.model"); // Package where your entity classes are located
        sessionFactory.setHibernateProperties(hibernateProperties());
        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        // Configure your data source (e.g., BasicDataSource, HikariCP)
        // Set driver class, URL, username, password
        return new BasicDataSource(); // Example
    }

    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.setProperty("hibernate.hbm2ddl.auto", "update"); // Or "create", "create-drop"
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect"); // Use your database dialect
        return properties;
    }
}
