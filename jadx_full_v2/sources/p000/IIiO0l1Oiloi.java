            package p000;

            import java.io.Serializable;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.Method;
            import java.util.LinkedHashMap;
            import java.util.List;
            
            public abstract class IIiO0l1Oiloi implements O0IOl1llI1I, Serializable, O0iI0I {
                public transient O0IOl1llI1I I00iOIl;
                public final Object I00iiI;
                public final Class I00iiO;
                public final String I00iio;
                public final String I00ilI0I1;
                public final boolean I00ilO0;

                public IIiO0l1Oiloi(Object obj, Class cls, String str, String str2, boolean z) {
/* 4 */             this.I00iiI = obj;
/* 6 */             this.I00iiO = cls;
/* 8 */             this.I00iio = str;
/* 10 */            this.I00ilI0I1 = str2;
/* 12 */            this.I00ilO0 = z;
                }

                @Override
                public final GenericDeclaration I00000oIO() throws SecurityException {
/* 1 */             O0IiO0OiI o0IiO0OiII001l0I00 = I001l0I00();
/* 7 */             if (!(o0IiO0OiII001l0I00 instanceof IOIO10iOi1)) {
/* 112 */               return null;
                    }
/* 12 */            String str = this.I00ilI0I1;
/* 14 */            String strI00O10llo = OlOoOIi0o.I00O10llo(str, '(');
/* 24 */            if (strI00O10llo.equals("<init>")) {
/* 541 */               throw new UnsupportedOperationException("Generic Java constructors are not supported: " + o0IiO0OiII001l0I00 + '/' + str);
                    }
/* 39 */            for (Method method : ((IOIO10iOi1) o0IiO0OiII001l0I00).I001l0I00().getDeclaredMethods()) {
/* 51 */                if (O0000Ioio00.I0000O(method.getName(), strI00O10llo)) {
/* 55 */                    StringBuilder sb = new StringBuilder();
/* 62 */                    sb.append(method.getName());
/* 67 */                    sb.append("(");
/* 76 */                    for (Class<?> cls : method.getParameterTypes()) {
/* 80 */                        l0ll1oll.I00000oIO(sb, cls);
                            }
/* 88 */                    sb.append(")");
/* 95 */                    l0ll1oll.I00000oIO(sb, method.getReturnType());
/* 106 */                   if (sb.toString().equals(str)) {
/* 108 */                       return method;
                            }
                        }
                    }
/* 112 */           return null;
                }

                public O0IOl1llI1I I0000O() {
/* 1 */             O0IOl1llI1I o0IOl1llI1I = this.I00iOIl;
/* 3 */             if (o0IOl1llI1I != null) {
/* 29 */                return o0IOl1llI1I;
                    }
/* 5 */             O0IOl1llI1I o0IOl1llI1II001IO000 = I001IO000();
/* 9 */             this.I00iOIl = o0IOl1llI1II001IO000;
/* 29 */            return o0IOl1llI1II001IO000;
                }

                @Override
                public final O0O01O0o I0001Ioi1lo() {
/* 5 */             return I001lIiIIo1O().I0001Ioi1lo();
                }

                @Override
                public final List I000II() {
/* 5 */             return I001lIiIIo1O().I000II();
                }

                @Override
                public final Object I000OOo1O(LinkedHashMap linkedHashMap) {
/* 5 */             return I001lIiIIo1O().I000OOo1O(linkedHashMap);
                }

                public abstract O0IOl1llI1I I001IO000();

                @Override
                public final List I001iOo1i0O() {
/* 5 */             return I001lIiIIo1O().I001iOo1i0O();
                }

                public final O0IiO0OiI I001l0I00() {
/* 1 */             Class cls = this.I00iiO;
/* 3 */             if (cls == null) {
/* 5 */                 return null;
                    }
                    return this.I00ilO0 ? OOoOl0i.I00000oIO.I0000Il00O(cls) : OOoOl0i.I00000oIO.I00000oOI(cls);
                }

                public abstract O0IOl1llI1I I001lIiIIo1O();

                @Override
                public final String getName() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final List getTypeParameters() {
/* 5 */             return I001lIiIIo1O().getTypeParameters();
                }
            }
