            package p000;

            import java.lang.annotation.Annotation;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.Map;
            
            public final class IlIO00o1 {
                public final String I00000oIO;
                public final Map I00000oOI;

                public IlIO00o1(String str, Map map) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = map;
                }

                public static OlOO1i11110 I00000oIO(String str) {
/* 5 */             OlOO1i11110 olOO1i11110 = new OlOO1i11110(13);
/* 9 */             olOO1i11110.I00iiO = null;
/* 11 */            olOO1i11110.I00iiI = str;
/* 13 */            VarHandle.storeStoreFence();
/* 29 */            return olOO1i11110;
                }

                public static IlIO00o1 I0000Il00O(String str) {
/* 5 */             return new IlIO00o1(str, Collections.EMPTY_MAP);
                }

                public final Annotation I00000oOI(Class cls) {
/* 7 */             return (Annotation) this.I00000oOI.get(cls);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IlIO00o1)) {
/* 7 */                 return false;
                    }
/* 11 */            IlIO00o1 ilIO00o1 = (IlIO00o1) obj;
                    return this.I00000oIO.equals(ilIO00o1.I00000oIO) && this.I00000oOI.equals(ilIO00o1.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 32 */            return "FieldDescriptor{name=" + this.I00000oIO + ", properties=" + this.I00000oOI.values() + "}";
                }
            }
