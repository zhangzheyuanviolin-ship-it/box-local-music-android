            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OlIoo1 implements I110IiI0o1Il {
                public IlIoO1ilo1 I00000oIO;
                public long I00000oOI;

                @Override
                public final Ooo1lO01O0 I00000oIO(OoIoOiiO1 ooIoOiiO1) {
/* 3 */             Ooo1lO01O0 ooo1lO01O0I00000oIO = this.I00000oIO.I00000oIO(ooIoOiiO1);
/* 9 */             long j = this.I00000oOI;
/* 11 */            OlIoooIioOI olIoooIioOI = new OlIoooIioOI();
/* 14 */            olIoooIioOI.I00iOIl = ooo1lO01O0I00000oIO;
/* 16 */            olIoooIioOI.I00iiI = j;
/* 18 */            VarHandle.storeStoreFence();
/* 29 */            return olIoooIioOI;
                }

                public final boolean equals(Object obj) {
/* 3 */             if (!(obj instanceof OlIoo1)) {
/* 28 */                return false;
                    }
/* 6 */             OlIoo1 olIoo1 = (OlIoo1) obj;
                    return olIoo1.I00000oOI == this.I00000oOI && O0000Ioio00.I0000O(olIoo1.I00000oIO, this.I00000oIO);
                }

                public final int hashCode() {
/* 15 */            return Long.hashCode(this.I00000oOI) + (this.I00000oIO.hashCode() * 31);
                }
            }
