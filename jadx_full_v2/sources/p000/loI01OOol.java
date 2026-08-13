            package p000;

            import java.lang.reflect.Method;
            
            public final class loI01OOol extends loIi0I1Ilo {
                public Method I00000oOI;
                public Object I0000Il00O;

                @Override
                public final Object I00000oIO(Class cls) {
/* 1 */             String strI00000oIO = i0O1lIi1O0IO.I00000oIO(cls);
/* 5 */             if (strI00000oIO != null) {
/* 26 */                I000II.I000O01llI0("UnsafeAllocator is used for non-instantiable type: ".concat(strI00000oIO));
/* 29 */                return null;
                    }
/* 15 */            return this.I00000oOI.invoke(this.I0000Il00O, cls);
                }
            }
