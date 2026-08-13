            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            
            public final class OOo1O1i extends OOoI1O {
                public final Annotation I00000oIO;

                public OOo1O1i(Annotation annotation) {
/* 4 */             this.I00000oIO = annotation;
                }

                public final ArrayList I00000oOI() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 1 */             Annotation annotation = this.I00000oIO;
/* 13 */            Method[] declaredMethods = ((IOIO10iOi1) l0O00Ol.I00000oIO(annotation)).I001l0I00().getDeclaredMethods();
/* 20 */            ArrayList arrayList = new ArrayList(declaredMethods.length);
/* 25 */            for (Method method : declaredMethods) {
/* 46 */                arrayList.add(lIl1l1IolOi.I00000oIO(OI1Iio0ii1.I0000oI00(method.getName()), method.invoke(annotation, null)));
                    }
/* 113 */           return arrayList;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OOo1O1i) {
                        return this.I00000oIO == ((OOo1O1i) obj).I00000oIO;
                    }
/* 15 */            return false;
                }

                public final int hashCode() {
/* 3 */             return System.identityHashCode(this.I00000oIO);
                }

                public final String toString() {
/* 22 */            return OOo1O1i.class.getName() + ": " + this.I00000oIO;
                }
            }
