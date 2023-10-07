package com.selivanov.part3;

import com.selivanov.part3.bean.Bird;
import com.selivanov.part3.bean.Flyable;
import com.selivanov.part3.bean.Helicopter;
import com.selivanov.part3.bean.Plane;
import com.selivanov.part3.config.JavaCodeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //1.
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaCodeConfig.class);
//        Plane planeBean = context.getBean(Plane.class);
//        Helicopter helicopterBean = context.getBean(Helicopter.class);
//        Bird birdBean = context.getBean(Bird.class);

        //2.
        AnnotationConfigApplicationContext contextBird = new AnnotationConfigApplicationContext(Bird.class);
        AnnotationConfigApplicationContext contextPlane = new AnnotationConfigApplicationContext(Plane.class);
        AnnotationConfigApplicationContext contextHelicopter = new AnnotationConfigApplicationContext(Helicopter.class);

        Bird birdBean = contextBird.getBean(Bird.class);
        Plane bean = contextPlane.getBean(Plane.class);
        Helicopter helicopter = contextHelicopter.getBean(Helicopter.class);

        //3.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaCodeConfig.class);
        Flyable flyable = context.getBean(Flyable.class);
        System.out.println(flyable);
        //При вызове метода getBean() Spring ищет бин, который реализует интерфейс Flyable,
        // и возвращает его экземпляр. Если такой бин не найден или найдено несколько бинов,
        // будет выброшено соответствующее исключение.
    }
}
