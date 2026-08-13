            package p000;

            import java.lang.invoke.VarHandle;
            
/* 4 */     public final class OoIoO0I0oOI implements Iio1i00IOI {
                public final int I00000oIO;
                public final int I00000oOI;
                public final IioIllI11l0I I0000Il00O;

                public OoIoO0I0oOI(int i, IioIllI11l0I iioIllI11l0I, int i2) {
/* 8 */             this(i, 0, (i2 & 4) != 0 ? IioO00o.I00000oIO : iioIllI11l0I);
                }

                @Override
                public final Ooo1lO01O0 I00000oIO(OoIoOiiO1 ooIoOiiO1) {
/* 1 */             return I0001Ioi1lo();
                }

                public final IoOi0looIo I0001Ioi1lo() {
/* 3 */             IoOi0looIo ioOi0looIo = new IoOi0looIo();
/* 6 */             int i = this.I00000oIO;
/* 8 */             ioOi0looIo.I00iOIl = i;
/* 10 */            int i2 = this.I00000oOI;
/* 12 */            ioOi0looIo.I00iiI = i2;
/* 18 */            IlOOoIlOl0io ilOOoIlOl0io = new IlOOoIlOl0io();
/* 21 */            ilOOoIlOl0io.I00000oIO = i;
/* 25 */            ilOOoIlOl0io.I00000oOI = this.I0000Il00O;
/* 32 */            ilOOoIlOl0io.I0000Il00O = i * 1000000;
/* 36 */            ilOOoIlOl0io.I0000O = i2 * 1000000;
/* 38 */            VarHandle.storeStoreFence();
/* 44 */            ioOi0looIo.I00iiO = new OillOo0(ilOOoIlOl0io);
/* 46 */            VarHandle.storeStoreFence();
/* 55 */            return ioOi0looIo;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof OoIoO0I0oOI) {
/* 6 */                 OoIoO0I0oOI ooIoO0I0oOI = (OoIoO0I0oOI) obj;
/* 12 */                if (ooIoO0I0oOI.I00000oIO == this.I00000oIO && ooIoO0I0oOI.I00000oOI == this.I00000oOI && O0000Ioio00.I0000O(ooIoO0I0oOI.I0000Il00O, this.I0000Il00O)) {
/* 30 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 16 */            return ((this.I0000Il00O.hashCode() + (this.I00000oIO * 31)) * 31) + this.I00000oOI;
                }

                @Override
/* 5 */         public final Ooo1oiI0 I00000oIO(OoIoOiiO1 ooIoOiiO1) {
/* 6 */             return I0001Ioi1lo();
                }

/* 11 */        public OoIoO0I0oOI(int i, int i2, IioIllI11l0I iioIllI11l0I) {
/* 13 */            this.I00000oIO = i;
/* 14 */            this.I00000oOI = i2;
/* 15 */            this.I0000Il00O = iioIllI11l0I;
                }
            }
