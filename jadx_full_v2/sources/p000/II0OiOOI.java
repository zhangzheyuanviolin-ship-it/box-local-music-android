            package p000;

            import java.util.Arrays;
            
            public final class II0OiOOI {
                public int I00000oIO;
                public CharSequence I00000oOI;

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof II0OiOOI)) {
/* 46 */                return false;
                    }
/* 5 */             II0OiOOI iI0OiOOI = (II0OiOOI) obj;
/* 11 */            if (this.I00000oIO != iI0OiOOI.I00000oIO) {
/* 46 */                return false;
                    }
/* 13 */            CharSequence charSequence = iI0OiOOI.I00000oOI;
/* 15 */            CharSequence charSequence2 = this.I00000oOI;
/* 25 */            String string = charSequence2 != null ? charSequence2.toString() : null;
/* 28 */            String string2 = charSequence != null ? charSequence.toString() : null;
/* 32 */            if (string == null && string2 == null) {
/* 44 */                return true;
                    }
                    return string != null && string.equals(string2);
                }

                public final int hashCode() {
/* 3 */             Integer numValueOf = Integer.valueOf(this.I00000oIO);
/* 7 */             CharSequence charSequence = this.I00000oOI;
/* 21 */            return Arrays.hashCode(new Object[]{numValueOf, charSequence != null ? charSequence.toString() : null});
                }
            }
