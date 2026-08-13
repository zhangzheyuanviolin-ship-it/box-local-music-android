            package p000;
            
            public final class O0olI0Oiili {
                public static final int I00000oOI = 66305;
                public int I00000oIO;

                public static String I00000oIO(int i) {
/* 1 */             int i2 = i & 255;
/* 4 */             String str = "Invalid";
/* 25 */            String str2 = i2 == 1 ? "Strategy.Simple" : i2 == 2 ? "Strategy.HighQuality" : i2 == 3 ? "Strategy.Balanced" : i2 == 0 ? "Strategy.Unspecified" : "Invalid";
/* 31 */            int i3 = (i >> 8) & 255;
/* 56 */            String str3 = i3 == 1 ? "Strictness.None" : i3 == 2 ? "Strictness.Loose" : i3 == 3 ? "Strictness.Normal" : i3 == 4 ? "Strictness.Strict" : i3 == 0 ? "Strictness.Unspecified" : "Invalid";
/* 62 */            int i4 = (i >> 16) & 255;
/* 64 */            if (i4 == 1) {
/* 66 */                str = "WordBreak.None";
                    } else if (i4 == 2) {
/* 71 */                str = "WordBreak.Phrase";
                    } else if (i4 == 0) {
/* 76 */                str = "WordBreak.Unspecified";
                    }
/* 90 */            return IIl001iO0Io.I00100l0(IIl001iO0Io.I00111O("LineBreak(strategy=", str2, ", strictness=", str3, ", wordBreak="), str, ")");
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof O0olI0Oiili) && this.I00000oIO == ((O0olI0Oiili) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return I00000oIO(this.I00000oIO);
                }
            }
