package com.selivanov.dihw.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.Map;
@Primary
@Component
public class House{
    private Window window;
    private Door door;
    private Material material;

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Material getMaterial() {
        return material;
    }
}
