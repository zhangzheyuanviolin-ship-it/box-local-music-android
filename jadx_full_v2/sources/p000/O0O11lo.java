            package p000;

            import java.math.BigInteger;
            
/* 8 */     public final class O0O11lo extends OOlo10O1I1IO {
                public final i01liIOOI I00iOIl;

                public O0O11lo(i01lOO0li i01loo0li, BigInteger bigInteger, byte[] bArr) {
/* 6 */             this(new i01liIOOI(i01loo0li, bigInteger, bArr));
                }

                @Override
                public final boolean I00Io1lO(Object obj) {
                    return obj instanceof O0O1OiIO11 ? ((O0O1OiIO11) obj).I00000oIO.equals(this) : this.I00iOIl.I00Io1lO(obj);
                }

                public final Object clone() {
/* 5 */             return new O0O11lo(this.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof O0O11lo) {
/* 13 */                return this.I00iOIl.equals(((O0O11lo) obj).I00iOIl);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

/* 9 */         public O0O11lo(i01liIOOI i01liiooi) {
/* 11 */            this.I00iOIl = i01liiooi;
                }
            }
