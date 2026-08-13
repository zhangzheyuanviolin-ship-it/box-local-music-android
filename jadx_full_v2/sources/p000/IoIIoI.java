            package p000;

            import java.io.IOException;
            
            public abstract class IoIIoI implements OlI1ii {
                public final Ill01o0lI0l I00iOIl;
                public boolean I00iiI;
                public final I11l01l I00iiO;

                public IoIIoI(I11l01l i11l01l) {
/* 4 */             this.I00iiO = i11l01l;
/* 19 */            this.I00iOIl = new Ill01o0lI0l(((IIIIlO11I0lO) i11l01l.I0000oI00).timeout());
                }

                public final void I00000oIO() {
/* 1 */             I11l01l i11l01l = this.I00iiO;
/* 3 */             int i = i11l01l.I00000oOI;
/* 6 */             if (i == 6) {
/* 8 */                 return;
                    }
/* 10 */            if (i != 5) {
/* 113 */               throw new IllegalStateException("state: " + i11l01l.I00000oOI);
                    }
/* 12 */            Ill01o0lI0l ill01o0lI0l = this.I00iOIl;
/* 14 */            Oo11IoI oo11IoI = ill01o0lI0l.I0000oI00;
/* 18 */            ill01o0lI0l.I0000oI00 = Oo11IoI.I0000O;
/* 20 */            oo11IoI.I00000oIO();
/* 23 */            oo11IoI.I00000oOI();
/* 26 */            i11l01l.I00000oOI = 6;
                }

                @Override
                public long read(III1o0lOio0 iII1o0lOio0, long j) throws IOException {
/* 1 */             I11l01l i11l01l = this.I00iiO;
                    try {
/* 7 */                 return ((IIIIlO11I0lO) i11l01l.I0000oI00).read(iII1o0lOio0, j);
                    } catch (IOException e) {
/* 17 */                ((OOll1O) i11l01l.I0000O).I000OOo1O();
/* 20 */                this.I00000oIO();
/* 89 */                throw e;
                    }
                }

                @Override
                public final Oo11IoI timeout() {
/* 1 */             return this.I00iOIl;
                }
            }
