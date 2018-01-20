package org.plcopen.xml.tc60201;

import org.apache.commons.lang3.reflect.FieldUtils;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public interface PlcNode {

    static Method findMethod(String name, Class<?> clazz) {
        name = name.toLowerCase();
        for (Method method : clazz.getMethods()) {
            if (method.getName()
                      .equalsIgnoreCase(name)) {
                return method;
            }
        }
        return null;
    }

    /**
     *
     * @param clazz
     * @param <T>
     * @return All Objects in the project tree that are an instance of T
     */
    default <T> List<T> getAllChildren(Class<T> clazz) {
        final List<T> children = new ArrayList<>();

        if (this.getClass()
                .isAnnotationPresent(XmlAccessorType.class)) {
            XmlAccessorType accessorType = this.getClass()
                                               .getAnnotation(XmlAccessorType.class);
            if (accessorType.value() == XmlAccessType.FIELD) {
                for (Field field : FieldUtils.getAllFieldsList(this.getClass())) {

                    String fieldname = field.getName();
                    if (field.isAnnotationPresent(XmlElement.class)) {
                        XmlElement element = field.getAnnotation(XmlElement.class);
                        if (!element.name()
                                    .equals("##default")) {
                            fieldname = element.name();
                        }
                    }
                    try {
                        Method method = findMethod("get" + fieldname, this.getClass());
                        if (method == null) {
                            method = findMethod("is" + fieldname, this.getClass());
                        }
                        if (method == null) continue;
                        Object value = method.invoke(this);
                        if (clazz.isAssignableFrom(field.getType()) || field.getType()
                                                                            .equals(Object.class)) {
                            if (clazz.isInstance(value)) {
                                children.add(clazz.cast(value));
                            }
                        }
                        if (List.class.isAssignableFrom(field.getType())) {
                            if (value instanceof List<?>) {
                                for (Object item : (List<?>) value) {
                                    if (clazz.isInstance(item)) {
                                        children.add(clazz.cast(item));
                                    }
                                    if (item instanceof PlcNode) {
                                        children.addAll(((PlcNode) item).getChildren(clazz));
                                    }
                                }
                            }
                        }
                        if (value instanceof PlcNode) {
                            children.addAll(((PlcNode) value).getChildren(clazz));
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return children;
    }

    /**
     *
     * @param clazz the desired class
     * @param <T>
     * @return all directly contained elements that are an instance of T
     */
    default <T> List<T> getChildren(Class<T> clazz) {
        final List<T> children = new ArrayList<>();

        if (this.getClass()
                .isAnnotationPresent(XmlAccessorType.class)) {
            XmlAccessorType accessorType = this.getClass()
                                               .getAnnotation(XmlAccessorType.class);
            if (accessorType.value() == XmlAccessType.FIELD) {
                for (Field field : FieldUtils.getAllFieldsList(this.getClass())) {

                    String fieldname = field.getName();
                    if (field.isAnnotationPresent(XmlElement.class)) {
                        XmlElement element = field.getAnnotation(XmlElement.class);
                        if (!element.name()
                                    .equals("##default")) {
                            fieldname = element.name();
                        }
                    }
                    try {
                        Method method = findMethod("get" + fieldname, this.getClass());
                        if (method == null) {
                            method = findMethod("is" + fieldname, this.getClass());
                        }
                        if (method == null) continue;
                        Object value = method.invoke(this);
                        if (clazz.isAssignableFrom(field.getType()) || field.getType()
                                                                            .equals(Object.class)) {
                            if (clazz.isInstance(value)) {
                                children.add(clazz.cast(value));
                            }
                        }
                        if (List.class.isAssignableFrom(field.getType())) {
                            if (value instanceof List<?>) {
                                for (Object item : (List<?>) value) {
                                    if (clazz.isInstance(item)) {
                                        children.add(clazz.cast(item));
                                    }
                                }
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return children;
    }

}
