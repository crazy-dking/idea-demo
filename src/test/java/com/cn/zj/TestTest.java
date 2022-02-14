package test.com.cn.zj;

import com.cn.zj.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
* Test Tester. 
* 
* @author <Authors name> 
* @since <pre>2月 13, 2022</pre> 
* @version 1.0 
*/ 
public class TestTest { 

@Before
public void before() throws Exception {
    Person person = new Person();
    person.setAge(0);
    person.setName("");

} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: main(String[] args) 
* 
*/ 
@Test
public void testMain() throws Exception { 
//TODO: Test goes here... 
} 


} 
