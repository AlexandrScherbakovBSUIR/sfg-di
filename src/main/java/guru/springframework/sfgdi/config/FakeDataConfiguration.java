package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.fakeDB.FakeDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakeDataConfiguration {
/*      FakeDataSource fakeDataSource(SFGConfig sfgConfig) implement necessary logic
 @Bean
    FakeDataSource fakeDataSource(@Value("${fake.userName}") String userName,
                                  @Value("${fake.password}") String password,
                                  @Value("${fake.jdbcUrl}") String jdbcUrl){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(userName);
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcUrl(jdbcUrl);
        return fakeDataSource;

    }*/

/*   FakeDataSource fakeDataSource(SFGConstructorConfig sfgConstructorConfig) better because of Constructor implementation
 @Bean
    FakeDataSource fakeDataSource(SFGConfig sfgConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(sfgConfig.getUserName());
        fakeDataSource.setPassword(sfgConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgConfig.getJdbcUrl());
        return fakeDataSource;
    }*/

    @Bean
    FakeDataSource fakeDataSource(SFGConstructorConfig sfgConstructorConfig){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(sfgConstructorConfig.getUserName());
        fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
        fakeDataSource.setJdbcUrl(sfgConstructorConfig.getJdbcUrl());
        return fakeDataSource;
    }
}
