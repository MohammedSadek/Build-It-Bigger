package com.udactity.gradle.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.udacity.gradle.builditbigger.EndpointAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;



@RunWith(AndroidJUnit4.class)
public class EndpointAsyncTaskTest extends AndroidTestCase{

    @Test
    public void testEndpointTask() throws InterruptedException {

       EndpointAsyncTask task =  new EndpointAsyncTask(InstrumentationRegistry.getTargetContext());
        task.execute();
        String res = null;
        try {
            res = task.get();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        Thread.sleep(5000);

        assertNotNull(res);
        assertTrue(res.length() > 0);
    }
}
