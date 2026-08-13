            package p000;
            
            public final class OOiilOlOOI {
                public final Class I00000oIO;
                public final Class I00000oOI;

                public OOiilOlOOI(Class cls, Class cls2) {
/* 4 */             this.I00000oIO = cls;
/* 6 */             this.I00000oOI = cls2;
                }

                public static OOiilOlOOI I00000oIO(Class cls) {
/* 5 */             return new OOiilOlOOI(OOiil1Oll00.class, cls);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || OOiilOlOOI.class != obj.getClass()) {
/* 38 */                return false;
                    }
/* 16 */            OOiilOlOOI oOiilOlOOI = (OOiilOlOOI) obj;
/* 26 */            if (this.I00000oOI.equals(oOiilOlOOI.I00000oOI)) {
/* 33 */                return this.I00000oIO.equals(oOiilOlOOI.I00000oIO);
                    }
/* 38 */            return false;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oIO.hashCode() + (this.I00000oOI.hashCode() * 31);
                }

                public final String toString() {
/* 3 */             Class cls = this.I00000oOI;
/* 5 */             Class cls2 = this.I00000oIO;
/* 7 */             if (cls2 == OOiil1Oll00.class) {
/* 9 */                 return cls.getName();
                    }
/* 40 */            return "@" + cls2.getName() + " " + cls.getName();
                }
            }
