
import java.lang.annotation.*;
import java.lang.reflect.Method;


@Retention(RetentionPolicy.RUNTIME)
@interface info{String author() default "n/a"; String version() default "n/a";}

@info(author="author1",version="1.0")
class A
{

}


@info(author="author2")
class B 
{ 

	
}
 
public class meta 
{ 
    public static void getInfo()
    {
        
		meta ob = new meta();
		Class <?> c = ob.getClass();
    	 try{
              Method m = c.getMethod("getInfo");
                info anno = A.class.getAnnotation(info.class);
                	System.out.println(A.class+":"+" Author: "+anno.author()+" Version: "+anno.version());
                info anno1 = B.class.getAnnotation(info.class);
                System.out.println(B.class+" Author: "+anno1.author()+" Version: "+anno1.version());
                 }
    	 catch(NoSuchMethodException e)
    	 {
                e.printStackTrace();
            }
          

    }
    public static void main(String[] args)
    {
    	getInfo();
    }
    
}
