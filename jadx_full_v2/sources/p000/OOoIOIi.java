            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.AnnotatedElement;
            import java.lang.reflect.Member;
            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.lang.reflect.Type;
            import java.util.ArrayList;
            import java.util.Collection;
            
            public abstract class OOoIOIi extends OOoI1O implements O00l0Oi0o, O00llIO00 {
                @Override
                public final OOo1O1i I00000oIO(Ill0IO ill0IO) {
/* 7 */             Annotation[] declaredAnnotations = ((AnnotatedElement) I00000oOI()).getDeclaredAnnotations();
/* 11 */            if (declaredAnnotations != null) {
/* 13 */                return lIlIi0Ii1.I00000oIO(declaredAnnotations, ill0IO);
                    }
/* 18 */            return null;
                }

                public abstract Member I00000oOI();

                public final OI1Iio0ii1 I0000Il00O() {
/* 5 */             String name = I00000oOI().getName();
                    return name != null ? OI1Iio0ii1.I0000oI00(name) : OlIIoO0Ol0o1.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final ArrayList I0000O(Type[] typeArr, Annotation[][] annotationArr, boolean z) {
                    Method method;
                    ArrayList arrayList;
                    String str;
                    boolean z2;
                    OlOO1i11110 olOO1i11110;
/* 4 */             ArrayList arrayList2 = new ArrayList(typeArr.length);
/* 7 */             IIIOlol iIIOlol = IIIOlol.I00iio;
/* 9 */             Member memberI00000oOI = I00000oOI();
/* 13 */            OlOO1i11110 olOO1i111102 = IIIOlol.I00ilI0I1;
/* 15 */            Object obj = null;
/* 16 */            if (olOO1i111102 == null) {
                        synchronized (iIIOlol) {
/* 19 */                    olOO1i111102 = IIIOlol.I00ilI0I1;
/* 21 */                    if (olOO1i111102 == null) {
/* 23 */                        Class<?> cls = memberI00000oOI.getClass();
/* 27 */                        int i = 16;
                                try {
/* 53 */                            olOO1i11110 = new OlOO1i11110(i, cls.getMethod("getParameters", null), OOo1Io0I0.I0000O(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
                                } catch (NoSuchMethodException unused) {
/* 59 */                            olOO1i11110 = new OlOO1i11110(i, obj, obj);
                                }
/* 62 */                        IIIOlol.I00ilI0I1 = olOO1i11110;
/* 64 */                        olOO1i111102 = olOO1i11110;
                            }
                        }
                    }
/* 74 */            Method method2 = (Method) olOO1i111102.I00iiI;
/* 77 */            if (method2 == null || (method = (Method) olOO1i111102.I00iiO) == null) {
/* 79 */                arrayList = null;
                    } else {
/* 92 */                Object[] objArr = (Object[]) method2.invoke(memberI00000oOI, null);
/* 97 */                arrayList = new ArrayList(objArr.length);
/* 102 */               for (Object obj2 : objArr) {
/* 112 */                   arrayList.add((String) method.invoke(obj2, null));
                        }
                    }
/* 127 */           int size = arrayList != null ? arrayList.size() - typeArr.length : 0;
/* 128 */           int length = typeArr.length;
/* 130 */           for (int i2 = 0; i2 < length; i2++) {
/* 134 */               OOoIlii oOoIliiI00000oIO = lIli0ooiOill.I00000oIO(typeArr[i2]);
/* 138 */               if (arrayList != null) {
/* 146 */                   str = (String) IOOi0Ool1i.I00II0oii1o(i2 + size, arrayList);
/* 148 */                   if (str == null) {
/* 210 */                       throw new IllegalStateException(("No parameter with index " + i2 + '+' + size + " (name=" + I0000Il00O() + " type=" + oOoIliiI00000oIO + ") in " + this).toString());
                            }
                        } else {
/* 211 */                   str = null;
                        }
/* 212 */               if (z) {
/* 215 */                   z2 = true;
/* 217 */                   if (i2 != typeArr.length - 1) {
/* 220 */                       z2 = false;
                            }
                        }
/* 223 */               Annotation[] annotationArr2 = annotationArr[i2];
/* 225 */               OOoO1I0i oOoO1I0i = new OOoO1I0i();
/* 228 */               oOoO1I0i.I00000oIO = oOoIliiI00000oIO;
/* 230 */               oOoO1I0i.I00000oOI = annotationArr2;
/* 232 */               oOoO1I0i.I0000Il00O = str;
/* 234 */               oOoO1I0i.I0000O = z2;
/* 236 */               VarHandle.storeStoreFence();
/* 239 */               arrayList2.add(oOoO1I0i);
                    }
/* 2160 */          return arrayList2;
                }

                public final I0I1liIO0ii I0000oI00() {
/* 5 */             int modifiers = I00000oOI().getModifiers();
                    return Modifier.isPublic(modifiers) ? O01010.I00o0iI0io1 : Modifier.isPrivate(modifiers) ? O01010.I00ll1 : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? O01010.I00io1l : O01010.I00ilO0 : O01010.I00ilI0I1;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OOoIOIi) && O0000Ioio00.I0000O(I00000oOI(), ((OOoIOIi) obj).I00000oOI());
                }

                @Override
                public final Collection getAnnotations() {
/* 7 */             Annotation[] declaredAnnotations = ((AnnotatedElement) I00000oOI()).getDeclaredAnnotations();
/* 18 */            return declaredAnnotations != null ? lIlIi0Ii1.I00000oOI(declaredAnnotations) : Il01100l.I00iOIl;
                }

                public final int hashCode() {
/* 5 */             return I00000oOI().hashCode();
                }

                public final String toString() {
/* 26 */            return getClass().getName() + ": " + I00000oOI();
                }
            }
