            package p000;
            
            public final class IoIIoOilI111 implements Ol0i0olI {
                public Ill01o0lI0l I00iOIl;
                public boolean I00iiI;
                public I11l01l I00iiO;

                @Override
                public final synchronized void close() {
/* 4 */             if (this.I00iiI) {
/* 7 */                 return;
                    }
/* 9 */             this.I00iiI = true;
/* 19 */            ((IIIIiol) this.I00iiO.I0001Ioi1lo).I00OilO00Il("0\r\n\r\n");
/* 22 */            Ill01o0lI0l ill01o0lI0l = this.I00iOIl;
/* 24 */            Oo11IoI oo11IoI = ill01o0lI0l.I0000oI00;
/* 28 */            ill01o0lI0l.I0000oI00 = Oo11IoI.I0000O;
/* 30 */            oo11IoI.I00000oIO();
/* 33 */            oo11IoI.I00000oOI();
/* 39 */            this.I00iiO.I00000oOI = 3;
                }

                @Override
                public final synchronized void flush() {
/* 4 */             if (this.I00iiI) {
/* 7 */                 return;
                    }
/* 14 */            ((IIIIiol) this.I00iiO.I0001Ioi1lo).flush();
                }

                @Override
                public final Oo11IoI timeout() {
/* 1 */             return this.I00iOIl;
                }

                @Override
                public final void write(III1o0lOio0 iII1o0lOio0, long j) {
/* 5 */             IIIIiol iIIIiol = (IIIIiol) this.I00iiO.I0001Ioi1lo;
/* 9 */             if (this.I00iiI) {
/* 35 */                I000II.I001IO000("closed");
                    } else {
/* 15 */                if (j == 0) {
/* 17 */                    return;
                        }
/* 18 */                iIIIiol.I00i01iIIliI(j);
/* 23 */                iIIIiol.I00OilO00Il("\r\n");
/* 26 */                iIIIiol.write(iII1o0lOio0, j);
/* 29 */                iIIIiol.I00OilO00Il("\r\n");
                    }
                }
            }
