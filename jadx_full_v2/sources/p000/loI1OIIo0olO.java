            package p000;

            import java.lang.reflect.Method;
            
            public final class loI1OIIo0olO extends loIi0I1Ilo {
                public Method I00000oOI;

                @Override
                public final Object I00000oIO(Class cls) {
/* 1 */             String strI00000oIO = i0O1lIi1O0IO.I00000oIO(cls);
/* 6 */             if (strI00000oIO == null) {
/* 16 */                return this.I00000oOI.invoke(null, cls, Object.class);
                    }
/* 27 */            I000II.I000O01llI0("UnsafeAllocator is used for non-instantiable type: ".concat(strI00000oIO));
/* 5 */             return null;
                }
            }
