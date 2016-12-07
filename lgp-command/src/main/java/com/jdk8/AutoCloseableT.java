/*
 * Copyright (c) 2016.
 * All Rights Reserved.
 *     www.heyunchou.com
 */

package com.jdk8;

/**
 * TODO
 *
 * @author <a href="mailto:meacial@live.cn">Gangping Li</a>
 * @version 1.0, 2016/12/7 18:06
 */
public class AutoCloseableT {

    public static void main(String[] args) {
        AutoCloseableT autoCloseableT = new AutoCloseableT();
        try (CanCloseType canCloseType = new CanCloseType()) {
            canCloseType.doInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class CanCloseType implements AutoCloseable {
        public void doInit() {
            System.out.println("doInit");
        }
        @Override
        public void close() throws Exception {
            System.out.println("autoClose!");
        }
    }
}

