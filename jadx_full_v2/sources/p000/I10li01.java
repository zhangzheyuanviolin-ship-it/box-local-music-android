            package p000;
            
            public final class I10li01 extends Ioool0O {
                public OoI1I1i1 I00o0l1o1o0;
                public OI10i0Il I00o101lO;
                public I10llI0II11l I00oI0i;
                public OO1I0001000i I00oII;
                public OO1I0001000i I00oIiI10;
                public long I00oO101o;
                public long I00oOio10iI1;
                public I10lIO I00ol1;
                public I10lIO I00olI;
                public long I00oli;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    long j2;
/* 1 */             OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 16 */            if (o1iOIoOiO0.I00OloOo()) {
/* 26 */                j2 = (oO1I0001000iI001lllioOl.I00iOIl << 32) | (oO1I0001000iI001lllioOl.I00iiI & 4294967295L);
                    } else {
/* 29 */                OoI1I1i1 ooI1I1i1 = this.I00o0l1o1o0;
/* 31 */                int i = oO1I0001000iI001lllioOl.I00iOIl;
/* 33 */                if (ooI1I1i1 == null) {
/* 41 */                    j2 = (i << 32) | (oO1I0001000iI001lllioOl.I00iiI & 4294967295L);
/* 42 */                    this.I00oli = j2;
                        } else {
/* 51 */                    long j3 = (oO1I0001000iI001lllioOl.I00iiI & 4294967295L) | (i << 32);
/* 65 */                    OoI11o1OI ooI11o1OII00000oIO = ooI1I1i1.I00000oIO(new I10lOO0IOo(this, j3, 0), null, null, new I10lOO0IOo(this, j3, 1));
/* 71 */                    this.I00oI0i.I0001Ioi1lo = ooI11o1OII00000oIO;
/* 79 */                    j2 = ((IooOl0ol01) ooI11o1OII00000oIO.getValue()).I00000oIO;
/* 89 */                    this.I00oli = ((IooOl0ol01) ooI11o1OII00000oIO.getValue()).I00000oIO;
                        }
                    }
/* 91 */            boolean zI00OloOo = o1iOIoOiO0.I00OloOo();
/* 95 */            Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 97 */            if (zI00OloOo) {
/* 99 */                this.I00oII = oO1I0001000iI001lllioOl;
/* 101 */               this.I00oO101o = j2;
/* 111 */               return o1iOIoOiO0.I001i1lo1io((int) (j2 >> 32), (int) (j2 & 4294967295L), il011I1OiO0I, this.I00ol1);
                    }
/* 116 */           this.I00oIiI10 = oO1I0001000iI001lllioOl;
/* 118 */           this.I00oOio10iI1 = j2;
/* 128 */           return o1iOIoOiO0.I001i1lo1io((int) (j2 >> 32), (int) (j2 & 4294967295L), il011I1OiO0I, this.I00olI);
                }

                @Override
                public final void I010II() {
/* 6 */             this.I00oli = -9223372034707292160L;
                }
            }
