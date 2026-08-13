            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.Method;
            import java.util.List;
            
            public abstract class lIl1l0IO {
                public static IOIOo1o I00000oIO(Class cls) {
/* 1 */             int i = 0;
/* 6 */             while (cls.isArray()) {
/* 8 */                 i++;
/* 10 */                cls = cls.getComponentType();
                    }
/* 19 */            if (!cls.isPrimitive()) {
/* 130 */               IOIOill iOIOillI00000oIO = OOo1Io0I0.I00000oIO(cls);
/* 134 */               String str = O00oO0liO11.I00000oIO;
/* 140 */               IOIOill iOIOillI000II = O00oO0liO11.I000II(iOIOillI00000oIO.I00000oIO());
/* 144 */               if (iOIOillI000II != null) {
/* 147 */                   iOIOillI00000oIO = iOIOillI000II;
                        }
/* 150 */               return new IOIOo1o(iOIOillI00000oIO, i);
                    }
/* 27 */            if (cls.equals(Void.TYPE)) {
/* 33 */                Ill0IO ill0IOI000OOo1O = OlIllOO11lOl.I0000O.I000OOo1O();
/* 52 */                return new IOIOo1o(new IOIOill(ill0IOI000OOo1O.I00000oOI(), ill0IOI000OOo1O.I00000oIO.I000II()), i);
                    }
/* 64 */            OOIil01OI oOIil01OII0000Il00O = O0I1lo0l.I00000oOI(cls.getName()).I0000Il00O();
/* 68 */            if (i > 0) {
/* 78 */                Ill0IO ill0IO = (Ill0IO) oOIil01OII0000Il00O.I00iio.getValue();
/* 97 */                return new IOIOo1o(new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II()), i - 1);
                    }
/* 109 */           Ill0IO ill0IO2 = (Ill0IO) oOIil01OII0000Il00O.I00iiO.getValue();
/* 126 */           return new IOIOo1o(new IOIOill(ill0IO2.I00000oOI(), ill0IO2.I00000oIO.I000II()), i);
                }

                public static void I00000oOI(O0iI1olO0O o0iI1olO0O, Annotation annotation) {
/* 7 */             Class clsI001l0I00 = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00();
/* 20 */            O0iI0IlO0iI o0iI0IlO0iII0000oI00 = o0iI1olO0O.I0000oI00(OOo1Io0I0.I00000oIO(clsI001l0I00), new OOo1Il01OliO(annotation));
/* 24 */            if (o0iI0IlO0iII0000oI00 != null) {
/* 26 */                I0000Il00O(o0iI0IlO0iII0000oI00, annotation, clsI001l0I00);
                    }
                }

                public static void I0000Il00O(O0iI0IlO0iI o0iI0IlO0iI, Annotation annotation, Class cls) {
/* 8 */             for (Method method : cls.getDeclaredMethods()) {
                        try {
/* 13 */                    Object objInvoke = method.invoke(annotation, null);
/* 21 */                    OI1Iio0ii1 oI1Iio0ii1I0000oI00 = OI1Iio0ii1.I0000oI00(method.getName());
/* 25 */                    Class<?> enclosingClass = objInvoke.getClass();
/* 35 */                    if (enclosingClass.equals(Class.class)) {
/* 43 */                        o0iI0IlO0iI.I001IO000(oI1Iio0ii1I0000oI00, I00000oIO((Class) objInvoke));
                            } else if (OOoOOOOoI1.I00000oIO.contains(enclosingClass)) {
/* 56 */                        o0iI0IlO0iI.I000lI(oI1Iio0ii1I0000oI00, objInvoke);
                            } else {
/* 61 */                        List list = OOo1Io0I0.I00000oIO;
/* 69 */                        if (Enum.class.isAssignableFrom(enclosingClass)) {
/* 75 */                            if (!enclosingClass.isEnum()) {
/* 78 */                                enclosingClass = enclosingClass.getEnclosingClass();
                                    }
/* 96 */                            o0iI0IlO0iI.I001iOo1i0O(oI1Iio0ii1I0000oI00, OOo1Io0I0.I00000oIO(enclosingClass), OI1Iio0ii1.I0000oI00(((Enum) objInvoke).name()));
                                } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
/* 117 */                           Class cls2 = (Class) I1IoiO1l.I00II0oii1o(enclosingClass.getInterfaces());
/* 123 */                           O0iI0IlO0iI o0iI0IlO0iII00IO1 = o0iI0IlO0iI.I00IO1(OOo1Io0I0.I00000oIO(cls2), oI1Iio0ii1I0000oI00);
/* 127 */                           if (o0iI0IlO0iII00IO1 != null) {
/* 133 */                               I0000Il00O(o0iI0IlO0iII00IO1, (Annotation) objInvoke, cls2);
                                    }
                                } else {
/* 142 */                           if (!enclosingClass.isArray()) {
/* 294 */                               throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                                    }
/* 144 */                           O0iI1ol o0iI1olI001i1lo1io = o0iI0IlO0iI.I001i1lo1io(oI1Iio0ii1I0000oI00);
/* 148 */                           if (o0iI1olI001i1lo1io != null) {
/* 152 */                               Class<?> componentType = enclosingClass.getComponentType();
/* 160 */                               if (componentType.isEnum()) {
/* 162 */                                   IOIOill iOIOillI00000oIO = OOo1Io0I0.I00000oIO(componentType);
/* 170 */                                   for (Object obj : (Object[]) objInvoke) {
/* 184 */                                       o0iI1olI001i1lo1io.I0000Il00O(iOIOillI00000oIO, OI1Iio0ii1.I0000oI00(((Enum) obj).name()));
                                            }
                                        } else if (componentType.equals(Class.class)) {
/* 200 */                                   for (Object obj2 : (Object[]) objInvoke) {
/* 210 */                                       o0iI1olI001i1lo1io.I0000oI00(I00000oIO((Class) obj2));
                                            }
                                        } else if (Annotation.class.isAssignableFrom(componentType)) {
/* 226 */                                   for (Object obj3 : (Object[]) objInvoke) {
/* 234 */                                       O0iI0IlO0iI o0iI0IlO0iII00000oIO = o0iI1olI001i1lo1io.I00000oIO(OOo1Io0I0.I00000oIO(componentType));
/* 238 */                                       if (o0iI0IlO0iII00000oIO != null) {
/* 243 */                                           I0000Il00O(o0iI0IlO0iII00000oIO, (Annotation) obj3, componentType);
                                                }
                                            }
                                        } else {
/* 253 */                                   for (Object obj4 : (Object[]) objInvoke) {
/* 257 */                                       o0iI1olI001i1lo1io.I00000oOI(obj4);
                                            }
                                        }
/* 263 */                               o0iI1olI001i1lo1io.I000OOo1O();
                                    }
                                }
                            }
                        } catch (IllegalAccessException unused) {
                        }
                    }
/* 299 */           o0iI0IlO0iI.I000OOo1O();
                }
            }
