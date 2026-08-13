            package p000;
            
            public abstract class ilII1oOi1 {
                public static Object I00000oIO(Class cls, Object obj) {
/* 3 */             if (obj instanceof IloolIO1i0l0) {
/* 5 */                 return cls.cast(obj);
                    }
/* 12 */            if (obj instanceof IloolIii1o) {
/* 20 */                return I00000oIO(cls, ((IloolIii1o) obj).I0000Il00O());
                    }
/* 106 */           throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + IloolIO1i0l0.class + " or " + IloolIii1o.class);
                }
            }
