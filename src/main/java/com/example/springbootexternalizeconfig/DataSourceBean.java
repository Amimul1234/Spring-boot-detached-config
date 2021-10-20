package com.example.springbootexternalizeconfig;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @Author Amimul Ehsan
 * @Created at 10/20/21
 * @Project Spring boot externalize config
 */

@Repository
@Profile("production")
public class DataSourceBean {
}
