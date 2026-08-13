            package p000;

            import java.io.IOException;
            
            public class I1lll1Ii implements I00IO1oi11O, IoiolIoO1I0O {
                public final int I00iOIl;
                public final int I00iiI;
                public final I00Ol00 I00iiO;

                public I1lll1Ii(int i, int i2, I00Ol00 i00Ol00) {
/* 4 */             this.I00iOIl = i;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i00Ol00;
                }

                @Override
                public final I00OIO1 I0000O() {
                    try {
/* 1 */                 return I000OiO();
                    } catch (IOException e) {
/* 29 */                throw new I00OI1(e.getMessage(), 0);
                    }
                }

                @Override
                public I00OIO1 I000OiO() {
/* 7 */             return this.I00iiO.I000oI1ioi(this.I00iOIl, this.I00iiI);
                }
            }
