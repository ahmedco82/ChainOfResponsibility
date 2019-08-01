package com.ahmedco.chainofresponsibility;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ahmedco.test1.CloudDataHandler;
import com.ahmedco.test1.DBDataHandler;
import com.ahmedco.test1.FileDataHandler;
import com.ahmedco.test1.RequestData;
import com.ahmedco.test1.RequestHandler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test1();
    }

    private void Test1() {
        //configure Chain of Responsibility
        Chain c1 = new NegativeProcessor();
        Chain c2 = new ZeroProcessor();
        Chain c3 = new PositiveProcessor();
        c1.setNext(c2);
        c2.setNext(c3);
        // calling chain of responsibility
        //c1.process(new Number(90));
        //c1.process(new Number(-50));
        // c1.process(new Number(0));
       // c1.process(new Number(91));
        c1.process(new Number(1));
    }

    private void Test2(){
        RequestData requestData = new RequestData();
        List<RequestHandler> requestHandlers = new ArrayList< >();
        requestHandlers.add(new DBDataHandler());
        requestHandlers.add(new FileDataHandler());
        requestHandlers.add(new CloudDataHandler());
        // create the chain of Handler
        for (int i = 0; i < requestHandlers.size()-1; i++){
            requestHandlers.get(i).setNextRequestHandler(requestHandlers.get(i + 1));
        }
        requestHandlers.get(0).process(requestData);
        System.out.println(requestData);
    }

}
