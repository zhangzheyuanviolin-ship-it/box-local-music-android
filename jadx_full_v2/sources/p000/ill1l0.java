            package p000;

            import java.io.Serializable;
            
            public enum ill1l0 {
                VOID(Void.class, null),
                INT(Integer.class, 0),
                LONG(Long.class, 0L),
                FLOAT(Float.class, Float.valueOf(0.0f)),
                DOUBLE(Double.class, Double.valueOf(0.0d)),
                BOOLEAN(Boolean.class, Boolean.FALSE),
                STRING(String.class, ""),
                BYTE_STRING(iiooOi11li.class, iiooOi11li.I00iiO),
                ENUM(Integer.class, null),
                MESSAGE(Object.class, null);

                public final Class I00iOIl;

                ill1l0(Class cls, Serializable serializable) {
/* 4 */             this.I00iOIl = cls;
                }
            }
