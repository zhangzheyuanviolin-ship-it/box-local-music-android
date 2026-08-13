            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.AccessibleObject;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            public final class IiOIIIIIili1 implements IllOOo00lI {
                public final int I00iOIl;
                public final IiOIOIli I00iiI;

                public IiOIIIIIili1(IiOIOIli iiOIOIli, int i) {
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = iiOIOIli;
                }

                @Override
                public final Object invoke() throws I1o1lOlooI1, SecurityException {
/* 1 */             int i = this.I00iOIl;
/* 3 */             IiOIOIli iiOIOIli = this.I00iiI;
                    switch (i) {
                        case 0:
/* 210 */                   IiOIIll01I10 iiOIIll01I10 = new IiOIIll01I10();
/* 213 */                   iiOIIll01I10.I00li1OI = iiOIOIli;
/* 215 */                   VarHandle.storeStoreFence();
/* 218 */                   return iiOIIll01I10;
                        default:
/* 8 */                     Object objI00IO1oi11O = iiOIOIli.I00IO1oi11O();
                            try {
/* 16 */                        Object obj = IiOO0iilOO1.I00lll10;
/* 36 */                        Object objI00000oIO = lIll0lII1.I00000oIO(iiOIOIli) ? li1O10Oli1i1.I00000oIO(iiOIOIli.I00li1OI, iiOIOIli.I001lloI()) : null;
/* 37 */                        if (objI00000oIO == obj) {
/* 40 */                            objI00000oIO = null;
                                }
/* 41 */                        lIll0lII1.I00000oIO(iiOIOIli);
/* 50 */                        AccessibleObject accessibleObject = objI00IO1oi11O != null ? (AccessibleObject) objI00IO1oi11O : null;
/* 51 */                        if (accessibleObject != null) {
/* 57 */                            accessibleObject.setAccessible(l0i0illl0ooi.I00000oIO(iiOIOIli));
                                }
/* 60 */                        if (objI00IO1oi11O == null) {
/* 22 */                            return null;
                                }
/* 65 */                        if (objI00IO1oi11O instanceof Field) {
/* 69 */                            return ((Field) objI00IO1oi11O).get(objI00000oIO);
                                }
/* 76 */                        if (!(objI00IO1oi11O instanceof Method)) {
/* 197 */                           throw new AssertionError("delegate field/method " + objI00IO1oi11O + " neither field nor method");
                                }
/* 85 */                        int length = ((Method) objI00IO1oi11O).getParameterTypes().length;
/* 86 */                        if (length == 0) {
/* 170 */                           return ((Method) objI00IO1oi11O).invoke(null, null);
                                }
/* 89 */                        if (length == 1) {
/* 142 */                           Method method = (Method) objI00IO1oi11O;
/* 144 */                           if (objI00000oIO == null) {
/* 155 */                               objI00000oIO = Oolli0oi0.I0000Il00O(((Method) objI00IO1oi11O).getParameterTypes()[0]);
                                    }
/* 163 */                           return method.invoke(null, objI00000oIO);
                                }
/* 92 */                        if (length == 2) {
/* 113 */                           return ((Method) objI00IO1oi11O).invoke(null, objI00000oIO, Oolli0oi0.I0000Il00O(((Method) objI00IO1oi11O).getParameterTypes()[1]));
                                }
/* 140 */                       throw new AssertionError("delegate method " + objI00IO1oi11O + " should take 0, 1, or 2 parameters");
                            } catch (IllegalAccessException e) {
/* 207 */                       throw new I1o1lOlooI1("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", e, 5);
                            }
                    }
                }
            }
