            package p000;
            
            public final class OlooIlII1 {
                public int I00000oIO;

                public static String I00000oIO(int i) {
                    return i == 1 ? "Ltr" : i == 2 ? "Rtl" : i == 3 ? "Content" : i == 4 ? "ContentOrLtr" : i == 5 ? "ContentOrRtl" : i == 0 ? "Unspecified" : "Invalid";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OlooIlII1) && this.I00000oIO == ((OlooIlII1) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oIO(this.I00000oIO);
                }
            }
