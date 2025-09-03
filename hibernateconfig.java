// In your HibernateConfig class
@Bean
public PlatformTransactionManager hibernateTransactionManager() {
    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionFactory().getObject());
    return transactionManager;
}
