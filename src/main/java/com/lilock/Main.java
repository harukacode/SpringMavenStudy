package com.lilock;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017-3-31.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        /*ServiceBean service = new MyServiceBean();*/
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        ServiceBean  service = (ServiceBean) factory.getBean("service");
        service.addUser("bill", "hello");
        service.addUser("tom", "goodbye");
        service.addUser("tracy", "morning");
        System.out.println("tom's password is: " + service.getPassword("tom"));
        if(service.findUser("tom")) {
            service.deleteUser("tom");
        }
    }
}
