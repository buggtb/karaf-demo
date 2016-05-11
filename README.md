feature:install pax-jdbc pax-jdbc-derby pax-jdbc-config
feature:install jaas aries-blueprint transaction jndi jpa jdbc pax-cdi pax-jdbc-pool-dbcp2
feature:repo-add cxf 3.1.5
feature:install cxf webconsole
feature:install spring-web/3.2.14.RELEASE_1 hibernate

org.ops4j.datasource-systemdb.cfg

osgi.jdbc.driver.name=derby
url=jdbc:derby:memory:system;create=true
dataSourceName=systemdb

