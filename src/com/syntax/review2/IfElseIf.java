package com.syntax.review2;

public class IfElseIf {
    public static void main(String[] args) {
        /* when we have more condition to test



         */
        int task=12;
                if (task>25){
                    System.out.println("great job");
                } else if (task>=20) {
                    System.out.println("good job");
                } else if (task>=10) {
                    System.out.println("ok job");
                } else if (task>=5) {
                    System.out.println("not good job");
                }

        System.out.println("---------------------");
                String browser="opera";
                if(browser.equals("chrome")){
                    System.out.println("Test case executed on chrome browser");
                } else if (browser.equals("safari")) {
                    System.out.println("Test cases executed on safari browser");
                } else if (browser.equals("firefox")) {
                    System.out.println("Test executed on firefox browser");
                }else {
                    System.out.println("Browser is not supported");
                }

    }
}
