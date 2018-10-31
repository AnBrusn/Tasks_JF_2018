package brusnitsyna.fifth;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SubmarineInfo {
	String name() default "USS Nautilus";
	int launched() default 1954;
}
