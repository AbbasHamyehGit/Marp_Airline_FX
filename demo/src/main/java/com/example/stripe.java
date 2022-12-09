package com.example;
import java.util.HashMap;

import com.stripe.Stripe;
import java.util.Map;
import com.stripe.exception;

public class stripe {

    public static void main (Strings[] args) throws StripeException {
         Stripe.apiKey = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
         Map <String, Object> customerParameter = new HashMap<String, Object>();
         customerParameter.put("email","roy.gebrayel10@gmail.com");
         Customer newcustomer = Customer.create(customerParameter); 
    }

   
    
}
