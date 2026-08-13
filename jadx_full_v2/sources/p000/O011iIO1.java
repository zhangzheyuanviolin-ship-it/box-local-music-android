            package p000;

            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            
            @Retention(RetentionPolicy.RUNTIME)
            public @interface O011iIO1 {
                public static final String UNSET_NAME = "\u0000";

                boolean ignore() default false;

                String name() default "\u0000";
            }
