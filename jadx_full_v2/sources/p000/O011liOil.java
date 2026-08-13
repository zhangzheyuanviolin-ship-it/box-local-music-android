            package p000;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            
            @Retention(RetentionPolicy.RUNTIME)
            public @interface O011liOil {
                boolean nullSafe() default true;

                Class value();
            }
