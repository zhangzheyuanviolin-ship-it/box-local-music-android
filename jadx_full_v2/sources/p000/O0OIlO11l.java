            package p000;

            import java.math.BigInteger;
            
/* 8 */     public final class O0OIlO11l extends OOlo10O1I1IO {
                public final i01liIOOI I00iOIl;

                public O0OIlO11l(i01lOO0li i01loo0li, BigInteger bigInteger, byte[] bArr) {
/* 6 */             this(new i01liIOOI(i01loo0li, bigInteger, bArr));
                }

                @Override
                public final boolean I00Io1lO(Object obj) {
                    return obj instanceof O0OIoO ? ((O0OIoO) obj).I00000oIO.equals(this) : this.I00iOIl.I00Io1lO(obj);
                }

                public final Object clone() {
/* 5 */             return new O0OIlO11l(this.I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof O0OIlO11l) {
/* 13 */                return this.I00iOIl.equals(((O0OIlO11l) obj).I00iOIl);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

/* 9 */         public O0OIlO11l(i01liIOOI i01liiooi) {
/* 11 */            this.I00iOIl = i01liiooi;
                }
            }
