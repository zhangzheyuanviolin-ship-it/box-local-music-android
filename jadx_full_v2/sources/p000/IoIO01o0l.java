            package p000;
            
            public final class IoIO01o0l implements Ol0i0olI {
                public Ill01o0lI0l I00iOIl;
                public boolean I00iiI;
                public I11l01l I00iiO;

                @Override
                public final void close() {
/* 1 */             I11l01l i11l01l = this.I00iiO;
/* 5 */             if (this.I00iiI) {
/* 7 */                 return;
                    }
/* 9 */             this.I00iiI = true;
/* 11 */            Ill01o0lI0l ill01o0lI0l = this.I00iOIl;
/* 13 */            Oo11IoI oo11IoI = ill01o0lI0l.I0000oI00;
/* 17 */            ill01o0lI0l.I0000oI00 = Oo11IoI.I0000O;
/* 19 */            oo11IoI.I00000oIO();
/* 22 */            oo11IoI.I00000oOI();
/* 26 */            i11l01l.I00000oOI = 3;
                }

                @Override
                public final void flush() {
/* 3 */             if (this.I00iiI) {
/* 5 */                 return;
                    }
/* 12 */            ((IIIIiol) this.I00iiO.I0001Ioi1lo).flush();
                }

                @Override
                public final Oo11IoI timeout() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) {
/* 3 */             if (this.I00iiI) {
/* 25 */                I000II.I001IO000("closed");
                    } else {
/* 10 */                OollIoI001lo.I0000Il00O(iII1o0lOio0.I00iiI, 0L, j);
/* 19 */                ((IIIIiol) this.I00iiO.I0001Ioi1lo).write(iII1o0lOio0, j);
                    }
                }
            }
