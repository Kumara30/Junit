package org.junit;

public class Sample 
{
@BeforeClass	
public static void beforeclass() {
System.out.println("bclass");
}
@AfterClass
public static void afterclass() {
System.out.println("aclass");
}
@Before
public void beforemethod() {
System.out.println("beforemethod");
}
@After
public void aftermethod() {
System.out.println("aftermethod");
}
@Test
public void test1() {
System.out.println("test1");
}
@Test
public void test2() {
System.out.println("test2");
}
@Test
public void test3() {
System.out.println("test3");
}
}
