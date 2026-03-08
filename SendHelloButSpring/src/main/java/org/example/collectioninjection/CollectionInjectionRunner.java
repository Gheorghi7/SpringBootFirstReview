package org.example.collectioninjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionRunner {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "collection-injection-config.xml"
        );

        CollectionInjection runner = (CollectionInjection)
                context.getBean("collection");
        runner.getDocumentList();
        runner.getDocumentSet();
        runner.getDocumentMap();
        runner.getProperties();


    }
}
