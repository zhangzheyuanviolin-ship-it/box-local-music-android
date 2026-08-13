            package p000;

            import java.io.Serializable;
            
            public enum O00oOoOo {
                VOID(Void.class, null),
                INT(Integer.class, 0),
                LONG(Long.class, 0L),
                FLOAT(Float.class, Float.valueOf(0.0f)),
                DOUBLE(Double.class, Double.valueOf(0.0d)),
                BOOLEAN(Boolean.class, Boolean.FALSE),
                STRING(String.class, ""),
                BYTE_STRING(IIO1i00loOo.class, IIO1i00loOo.I00iiI),
                ENUM(Integer.class, null),
                MESSAGE(Object.class, null);

                public final Class I00iOIl;

                O00oOoOo(Class cls, Serializable serializable) {
/* 4 */             this.I00iOIl = cls;
                }
            }
