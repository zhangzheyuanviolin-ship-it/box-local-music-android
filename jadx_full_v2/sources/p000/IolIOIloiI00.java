            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IolIOIloiI00 implements I110IiI0o1Il {
                public Iio1i00IOI I00000oIO;
                public Oi010oI I00000oOI;

                @Override
                public final Ooo1lO01O0 I00000oIO(OoIoOiiO1 ooIoOiiO1) {
/* 5 */             Ooo1oiI0 ooo1oiI0I00000oIO = this.I00000oIO.I00000oIO(ooIoOiiO1);
/* 9 */             Oi010oI oi010oI = this.I00000oOI;
/* 11 */            OooI11loO0I oooI11loO0I = new OooI11loO0I();
/* 14 */            oooI11loO0I.I00iiO = ooo1oiI0I00000oIO;
/* 16 */            oooI11loO0I.I00iio = oi010oI;
/* 32 */            oooI11loO0I.I00iOIl = (ooo1oiI0I00000oIO.I00IOO() + ooo1oiI0I00000oIO.I001lllioOl()) * 1000000;
/* 36 */            oooI11loO0I.I00iiI = 0L;
/* 38 */            VarHandle.storeStoreFence();
/* 77 */            return oooI11loO0I;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof IolIOIloiI00)) {
/* 25 */                return false;
                    }
/* 5 */             IolIOIloiI00 iolIOIloiI00 = (IolIOIloiI00) obj;
                    return iolIOIloiI00.I00000oIO.equals(this.I00000oIO) && iolIOIloiI00.I00000oOI == this.I00000oOI;
                }

                public final int hashCode() {
/* 24 */            return Long.hashCode(0L) + ((this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31)) * 31);
                }
            }
