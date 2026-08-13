            package p000;

            import java.io.Serializable;
            
            public enum O00oOIl1O1i {
                VOID(Void.class, null),
                INT(Integer.class, 0),
                LONG(Long.class, 0L),
                FLOAT(Float.class, Float.valueOf(0.0f)),
                DOUBLE(Double.class, Double.valueOf(0.0d)),
                BOOLEAN(Boolean.class, Boolean.FALSE),
                STRING(String.class, ""),
                BYTE_STRING(IIOI1Ii1I.class, IIOI1Ii1I.I00iiI),
                ENUM(Integer.class, null),
                MESSAGE(Object.class, null);

                public final Class I00iOIl;

                O00oOIl1O1i(Class cls, Serializable serializable) {
/* 4 */             this.I00iOIl = cls;
                }
            }
