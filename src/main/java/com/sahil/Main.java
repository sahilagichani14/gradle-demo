package com.sahil;
import org.json.JSONObject;
import src.main.java.com.sahil.Calculator;
public class Main {
    public static void main(String[] args) {
        if(args.length!=3){
            System.err.println("Need 3 args to run: [operation] [val1] [val2]");
            System.exit(0);
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("lib", "added");

        String operation = args[0];
        Integer a = Integer.valueOf(args[1]);
        Integer b = Integer.valueOf(args[2]);

        Calculator calculator = new Calculator();

        if("add".equals(operation)){
            calculator.add(a,b);
        } else if ("sub".equals(operation)) {
            calculator.sub(a,b);
        } else {
            System.out.println("Invalid args provided");
        }
    }
}
