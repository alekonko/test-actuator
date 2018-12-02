# CONCO Simple Actuator enabled. with mariadb be


DS_MARIADB_SAMPLEDB="jdbc:mariadb://mariadb:3306/sampledb"
DS_MARIADB_USERNAME=user5X5
DS_MARIADB_PASSWORD=au7I72OwevAn2HQT
DS_MARIADB_DRIVER="org.mariadb.jdbc.Driver"


spring.datasource.url=${DS_MARIADB_SAMPLEDB}
spring.datasource.username=${DS_MARIADB_USERNAME}
spring.datasource.password=${DS_MARIADB_PASSWORD}
spring.datasource.driver-class-name=${DS_MARIADB_DRIVER}
spring.jpa.hibernate.ddl-auto=create-drop

