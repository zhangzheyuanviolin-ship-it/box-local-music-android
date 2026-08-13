            package com.google.mlkit.genai.schema.annotations;

            import java.lang.annotation.ElementType;
            import java.lang.annotation.Retention;
            import java.lang.annotation.RetentionPolicy;
            import java.lang.annotation.Target;
            import kotlin.Metadata;
            
            @Target({ElementType.FIELD, ElementType.PARAMETER})
            @Retention(RetentionPolicy.RUNTIME)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0087\u0002\u0018\u00002\u00020\u0001Br\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\b(\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\u00020\u0006B\u0004\b\u0003\u0010\u0001\u0012\u000e\b\u0002\u0010\u0007\u001a\u00020\u0006B\u0004\b\u0003\u0010\u0001\u0012\u0015\b\u0002\u0010\b\u001a\u00020\tB\u000b\b\u0006!\u0000\u0000\u0000\u0000\u0000\u0000ø\u007f\u0012\u0015\b\u0002\u0010\n\u001a\u00020\tB\u000b\b\u0006!\u0000\u0000\u0000\u0000\u0000\u0000ø\u007f\u0012\u0012\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fB\u0002\b\fR\u0012\u0010\u0002\u001a\u00020\u0003X\u0086\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\rR\u0012\u0010\u0005\u001a\u00020\u0006X\u0086\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000eR\u0012\u0010\u0007\u001a\u00020\u0006X\u0086\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u000eR\u0012\u0010\b\u001a\u00020\tX\u0086\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000fR\u0012\u0010\n\u001a\u00020\tX\u0086\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000fR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\fX\u0086\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/mlkit/genai/schema/annotations/Guide;", "", "description", "", "", "maxItems", "", "minItems", "maximum", "", "minimum", "enumValues", "", "()Ljava/lang/String;", "()I", "()D", "()[Ljava/lang/String;", "java.com.google.android.libraries.mlkit.granules.genai.schema_mlkit_genai_schema"}, m18k = 1, mv = {2, 3, 0}, xi = 48)
            public @interface Guide {
                String description() default "";

                String[] enumValues() default {};

                int maxItems() default -1;

                double maximum() default Double.NaN;

                int minItems() default -1;

                double minimum() default Double.NaN;
            }
