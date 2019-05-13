package com.app.service;

import java.util.List;

import com.app.model.User;


/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-security-oauth2-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 31/12/17
 * Time: 15.52
 * To change this template use File | Settings | File Templates.
 */

public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
