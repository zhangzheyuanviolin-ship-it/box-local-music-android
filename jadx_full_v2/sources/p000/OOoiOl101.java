            package p000;

            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public final class OOoiOl101 {
                public String I00000oIO;
                public Field I00000oOI;
                public String I0000Il00O;
                public Method I0000O;
                public OoO00O1IiOl I0000oI00;
                public OoO00O1IiOl I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;

                public final void I00000oIO(O01ooi1IIiiO o01ooi1IIiiO, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objInvoke;
/* 1 */             Field field = this.I00000oOI;
/* 3 */             Method method = this.I0000O;
/* 5 */             if (method != null) {
                        try {
/* 8 */                     objInvoke = method.invoke(obj, null);
                        } catch (InvocationTargetException e) {
/* 36 */                    throw new O01Oo001(IlIi0I0.I000lI("Accessor ", OOoi0l1.I0000O(method, false), " threw exception"), e.getCause());
                        }
                    } else {
/* 37 */                objInvoke = field.get(obj);
                    }
/* 41 */            if (objInvoke == obj) {
/* 43 */                return;
                    }
/* 46 */            o01ooi1IIiiO.I001i1lo1io(this.I00000oIO);
/* 51 */            this.I0000oI00.I0000Il00O(o01ooi1IIiiO, objInvoke);
                }
            }
