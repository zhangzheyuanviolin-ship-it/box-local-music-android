            package p000;

            import java.lang.invoke.VarHandle;
            
/* 17 */    public final class Ill0IO {
                public static final Ill0IO I0000Il00O = new Ill0IO("");
                public Ill0OI0lo I00000oIO;
                public transient Ill0IO I00000oOI;

                public Ill0IO(String str) {
/* 6 */             Ill0OI0lo ill0OI0lo = new Ill0OI0lo();
/* 9 */             ill0OI0lo.I00000oIO = str;
/* 11 */            ill0OI0lo.I00000oOI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            this.I00000oIO = ill0OI0lo;
                }

                public final Ill0IO I00000oIO(OI1Iio0ii1 oI1Iio0ii1) {
/* 5 */             Ill0OI0lo ill0OI0loI00000oIO = this.I00000oIO.I00000oIO(oI1Iio0ii1);
/* 9 */             Ill0IO ill0IO = new Ill0IO();
/* 12 */            ill0IO.I00000oIO = ill0OI0loI00000oIO;
/* 14 */            ill0IO.I00000oOI = this;
/* 16 */            VarHandle.storeStoreFence();
/* 49 */            return ill0IO;
                }

                public final Ill0IO I00000oOI() {
/* 1 */             Ill0OI0lo ill0OI0lo = this.I00000oIO;
/* 3 */             Ill0IO ill0IO = this.I00000oOI;
/* 5 */             if (ill0IO != null) {
/* 7 */                 return ill0IO;
                    }
/* 12 */            if (ill0OI0lo.I0000Il00O()) {
/* 28 */                I000II.I001IO000("root");
/* 31 */                return null;
                    }
/* 20 */            Ill0IO ill0IO2 = new Ill0IO(ill0OI0lo.I0000oI00());
/* 23 */            this.I00000oOI = ill0IO2;
/* 25 */            return ill0IO2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
                    return (obj instanceof Ill0IO) && O0000Ioio00.I0000O(this.I00000oIO, ((Ill0IO) obj).I00000oIO);
                }

                public final int hashCode() {
/* 5 */             return this.I00000oIO.I00000oIO.hashCode();
                }

                public final String toString() {
/* 3 */             return this.I00000oIO.toString();
                }

/* 18 */        public Ill0IO(Ill0OI0lo ill0OI0lo) {
/* 20 */            this.I00000oIO = ill0OI0lo;
                }
            }
