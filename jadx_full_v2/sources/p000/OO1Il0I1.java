            package p000;
            
            public final class OO1Il0I1 {
                public static final OO1Il0I1 I0000Il00O = new OO1Il0I1(0, false);
                public boolean I00000oIO;
                public int I00000oOI;

                public OO1Il0I1(int i, boolean z) {
/* 4 */             this.I00000oIO = z;
/* 6 */             this.I00000oOI = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof OO1Il0I1)) {
/* 7 */                 return false;
                    }
/* 13 */            OO1Il0I1 oO1Il0I1 = (OO1Il0I1) obj;
                    return this.I00000oIO == oO1Il0I1.I00000oIO && this.I00000oOI == oO1Il0I1.I00000oOI;
                }

                public final int hashCode() {
/* 15 */            return Integer.hashCode(this.I00000oOI) + (Boolean.hashCode(this.I00000oIO) * 31);
                }

                public final String toString() {
/* 32 */            return "PlatformParagraphStyle(includeFontPadding=" + this.I00000oIO + ", emojiSupportMatch=" + IioolI0lo0il.I00000oOI(this.I00000oOI) + ")";
                }
            }
