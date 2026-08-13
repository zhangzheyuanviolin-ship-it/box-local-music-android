            package p000;

            import java.util.ArrayList;
            
            public final class OlooIOI0O {
                public static final OlooIOI0O I00000oOI = new OlooIOI0O(0);
                public static final OlooIOI0O I0000Il00O = new OlooIOI0O(1);
                public static final OlooIOI0O I0000O = new OlooIOI0O(2);
                public final int I00000oIO;

                public OlooIOI0O(int i) {
/* 4 */             this.I00000oIO = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof OlooIOI0O) {
                        return this.I00000oIO == ((OlooIOI0O) obj).I00000oIO;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             return this.I00000oIO;
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             if (i == 0) {
/* 5 */                 return "TextDecoration.None";
                    }
/* 10 */            ArrayList arrayList = new ArrayList();
/* 15 */            if ((i & 1) != 0) {
/* 19 */                arrayList.add(OIllioIilO.I01Iio10lo);
                    }
/* 24 */            if ((i & 2) != 0) {
/* 28 */                arrayList.add(OIllioIilO.I01Ilioliio);
                    }
/* 36 */            if (arrayList.size() != 1) {
/* 71 */                return IlIi0I0.I000lI("TextDecoration[", O10lllI0o0.I00000oIO(arrayList, ", ", null, 62), "]");
                    }
/* 53 */            return "TextDecoration." + arrayList.get(0);
                }
            }
