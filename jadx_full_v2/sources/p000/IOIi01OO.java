            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.GenericDeclaration;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class IOIi01OO implements O0IOli0o0, IOIO10iOi1, O0iI0I {
                public static final Map I00iiI;
                public Class I00iOIl;

                static {
/* 51 */            List listI000O01llI0 = IOOi1I.I000O01llI0(IllOOo00lI.class, Function1.class, IlliIl1l11O.class, Function3.class, IlliOIilI.class, IlliOIo0o10.class, IlliOll.class, Illiioi1.class, Illil0Iio.class, Illil0o1o.class, IllOiOo.class, IllOii1Oi0O0.class, IllOlI00O.class, IllOlIollo.class, IllOlO0oo.class, IllOli.class, IllOll1.class, IllOlo.class, IllOlo0i10.class, IllOo0.class, Illi01O0.class, Illi11O0I.class, Illi1lO0.class);
/* 65 */            ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI000O01llI0, 10));
/* 72 */            int i = 0;
/* 77 */            for (Object obj : listI000O01llI0) {
/* 83 */                int i2 = i + 1;
/* 85 */                if (i < 0) {
/* 103 */                   IOOi1I.I000lI();
/* 107 */                   throw null;
                        }
/* 98 */                arrayList.add(new OIoi0IIoi((Class) obj, Integer.valueOf(i)));
/* 101 */               i = i2;
                    }
/* 112 */           I00iiI = O1Oii0O0loo.I000OiO(arrayList);
                }

                public static void I0000O() {
/* 29 */            throw new Ii01OOool();
                }

                @Override
                public final GenericDeclaration I00000oIO() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final List I0000oI00() {
/* 1 */             I0000O();
/* 29 */            throw null;
                }

                @Override
                public final String I000O01llI0() {
                    String strI00000oIO;
/* 1 */             Class cls = this.I00iOIl;
/* 7 */             String strConcat = null;
/* 8 */             if (cls.isAnonymousClass() || cls.isLocalClass()) {
/* 7 */                 return null;
                    }
/* 22 */            if (!cls.isArray()) {
/* 60 */                String strI00000oIO2 = iOoO10.I00000oIO(cls.getName());
                        return strI00000oIO2 == null ? cls.getCanonicalName() : strI00000oIO2;
                    }
/* 24 */            Class<?> componentType = cls.getComponentType();
/* 32 */            if (componentType.isPrimitive() && (strI00000oIO = iOoO10.I00000oIO(componentType.getName())) != null) {
/* 46 */                strConcat = strI00000oIO.concat("Array");
                    }
                    return strConcat == null ? "kotlin.Array" : strConcat;
                }

                @Override
                public final Collection I000OiO() {
/* 1 */             I0000O();
/* 29 */            throw null;
                }

                @Override
                public final boolean I000iOII() {
/* 1 */             I0000O();
/* 29 */            throw null;
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 1 */             I0000O();
/* 29 */            throw null;
                }

                @Override
                public final String I000oI1ioi() {
                    String strI00000oOI;
/* 1 */             Class cls = this.I00iOIl;
/* 7 */             String strConcat = null;
/* 8 */             if (cls.isAnonymousClass()) {
/* 7 */                 return null;
                    }
/* 15 */            if (!cls.isLocalClass()) {
/* 108 */               if (!cls.isArray()) {
/* 144 */                   String strI00000oOI2 = iOoO10.I00000oOI(cls.getName());
                            return strI00000oOI2 == null ? cls.getSimpleName() : strI00000oOI2;
                        }
/* 110 */               Class<?> componentType = cls.getComponentType();
/* 120 */               if (componentType.isPrimitive() && (strI00000oOI = iOoO10.I00000oOI(componentType.getName())) != null) {
/* 132 */                   strConcat = strI00000oOI.concat("Array");
                        }
                        return strConcat == null ? "Array" : strConcat;
                    }
/* 17 */            String simpleName = cls.getSimpleName();
/* 21 */            Method enclosingMethod = cls.getEnclosingMethod();
/* 27 */            if (enclosingMethod != null) {
/* 48 */                return OlOoOIi0o.I00Iooi00oi(simpleName, enclosingMethod.getName() + '$', simpleName);
                    }
/* 53 */            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
/* 57 */            if (enclosingConstructor == null) {
/* 85 */                int iI001i1O0Ol = OlOoOIi0o.I001i1O0Ol(simpleName, '$', 0, 6);
                        return iI001i1O0Ol == -1 ? simpleName : simpleName.substring(iI001i1O0Ol + 1, simpleName.length());
                    }
/* 78 */            return OlOoOIi0o.I00Iooi00oi(simpleName, enclosingConstructor.getName() + '$', simpleName);
                }

                @Override
                public final boolean I001i1O0Ol(Object obj) {
/* 1 */             Class clsI00000oOI = this.I00iOIl;
/* 9 */             Integer num = (Integer) I00iiI.get(clsI00000oOI);
/* 11 */            if (num != null) {
/* 17 */                return OoOOI1100oI0.I0000O(num.intValue(), obj);
                    }
/* 26 */            if (clsI00000oOI.isPrimitive()) {
/* 34 */                clsI00000oOI = l0O00Ol.I00000oOI(OOoOl0i.I00000oIO.I00000oOI(clsI00000oOI));
                    }
/* 38 */            return clsI00000oOI.isInstance(obj);
                }

                @Override
                public final Collection I001i1lo1io() {
/* 1 */             I0000O();
/* 29 */            throw null;
                }

                @Override
                public final Class I001l0I00() {
/* 1 */             return this.I00iOIl;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IOIi01OO) && l0O00Ol.I00000oOI(this).equals(l0O00Ol.I00000oOI((O0IOli0o0) obj));
                }

                @Override
                public final List getTypeParameters() {
/* 1 */             I0000O();
/* 29 */            throw null;
                }

                @Override
                public final int hashCode() {
/* 5 */             return l0O00Ol.I00000oOI(this).hashCode();
                }

                public final String toString() {
/* 20 */            return this.I00iOIl.toString() + " (Kotlin reflection is not available)";
                }
            }
