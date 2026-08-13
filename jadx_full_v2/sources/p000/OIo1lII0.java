            package p000;
            
            public final class OIo1lII0 implements O0lOOii {
                public OIoIoIO0oI1O I00000oIO;

                @Override
                public final int I00000oIO() {
/* 3 */             return this.I00000oIO.I000o00OoI0I();
                }

                @Override
                public final int I00000oOI() {
/* 23 */            return Math.min(r1.I000o00OoI0I() - 1, ((O1iOii1) IOOi0Ool1i.I00Io1o110i(this.I00000oIO.I000lI().I00000oIO)).I00000oIO);
                }

                @Override
                public final int I0000Il00O() {
                    int i;
/* 1 */             OIoIoIO0oI1O oIoIoIO0oI1O = this.I00000oIO;
/* 13 */            if (oIoIoIO0oI1O.I000lI().I00000oIO.size() == 0) {
/* 15 */                return 0;
                    }
/* 21 */            int iI00000oIO = l1o01i0.I00000oIO(oIoIoIO0oI1O.I000lI());
/* 37 */            int i2 = oIoIoIO0oI1O.I000lI().I00000oOI + oIoIoIO0oI1O.I000lI().I0000Il00O;
/* 39 */            if (i2 != 0 && (i = iI00000oIO / i2) >= 1) {
/* 55 */                return i;
                    }
/* 38 */            return 1;
                }

                @Override
                public final boolean I0000O() {
/* 15 */            return !this.I00000oIO.I000lI().I00000oIO.isEmpty();
                }

                @Override
                public final int I0000oI00() {
/* 6 */             return Math.max(0, this.I00000oIO.I0000oI00);
                }
            }
