            package p000;

            import android.os.Bundle;
            
            public final class OooI11loO0I implements Ooo1lO01O0 {
                public long I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Object I00iio;

                @Override
                public boolean I00000oIO() {
/* 1 */             return true;
                }

                @Override
                public long I00000oOI(I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 1 */             return Long.MAX_VALUE;
                }

                public long I0000Il00O(long j) {
/* 1 */             long j2 = this.I00iiI;
/* 9 */             if (j + j2 <= 0) {
/* 5 */                 return 0L;
                    }
/* 12 */            long j3 = j + j2;
/* 13 */            long j4 = this.I00iOIl;
/* 15 */            long j5 = j3 / j4;
                    return (((Oi010oI) this.I00iio) == Oi010oI.I00iOIl || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
                }

                public I110ooool I0000O(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 1 */             long j2 = this.I00iiI;
/* 3 */             long j3 = j + j2;
/* 4 */             long j4 = this.I00iOIl;
                    return j3 > j4 ? ((Ooo1oiI0) this.I00iiO).I000oI1ioi(j4 - j2, i110ooool, i110ooool3, i110ooool2) : i110ooool2;
                }

                public boolean I0000oI00(long j, boolean z, boolean z2) {
/* 3 */             li10O1l0 li10o1l0 = (li10O1l0) this.I00iio;
/* 5 */             li10o1l0.I010II();
/* 8 */             li10o1l0.I010OIo1l();
/* 13 */            l0olllO1i l0olllo1i = (l0olllO1i) li10o1l0.I00iOIl;
/* 15 */            boolean zI00000oIO = l0olllo1i.I00000oIO();
/* 19 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 21 */            if (zI00000oIO) {
/* 23 */                l0Oi0o l0oi0o = l0olllo1i.I00ilI0I1;
/* 25 */                l0olllO1i.I0000oI00(l0oi0o);
/* 28 */                l0O0o010I l0o0o010i = l0oi0o.I00o0l1o1o0;
/* 32 */                l0olllo1i.I00li1OI.getClass();
/* 39 */                l0o0o010i.I00000oOI(System.currentTimeMillis());
                    }
/* 44 */            long j2 = j - this.I00iOIl;
/* 46 */            if (!z && j2 < 1000) {
/* 55 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 66 */                l01o0io1ooo0.I00lll10.I0000Il00O("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
/* 69 */                return false;
                    }
/* 71 */            if (!z2) {
/* 75 */                j2 = j - this.I00iiI;
/* 77 */                this.I00iiI = j;
                    }
/* 79 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 90 */            l01o0io1ooo0.I00lll10.I0000Il00O("Recording user engagement, ms", Long.valueOf(j2));
/* 95 */            Bundle bundle = new Bundle();
/* 100 */           bundle.putLong("_et", j2);
                    boolean z3 = !l0olllo1i.I00iio.I0111i();
/* 111 */           lO0liIO0 lo0liio0 = l0olllo1i.I00ll1;
/* 113 */           l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 120 */           lioil0ilIOi.I01O1I1(lo0liio0.I010ioo(z3), bundle, true);
/* 123 */           if (!z2) {
/* 125 */               lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 127 */               l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 134 */               lil1o1li.I010l1ol111("auto", "_e", bundle);
                    }
/* 137 */           this.I00iOIl = j;
/* 141 */           li0O100iO01 li0o100io01 = (li0O100iO01) this.I00iiO;
/* 143 */           li0o100io01.I0000Il00O();
/* 159 */           li0o100io01.I00000oOI(((Long) iol1II1ii1i.I00ilO0.I00000oIO(null)).longValue());
/* 109 */           return true;
                }

                @Override
                public I110ooool I000oI1ioi(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 19 */            return ((Ooo1oiI0) this.I00iiO).I000oI1ioi(I0000Il00O(j), i110ooool, i110ooool2, I0000O(j, i110ooool, i110ooool3, i110ooool2));
                }

                @Override
                public I110ooool I00Io1lO(long j, I110ooool i110ooool, I110ooool i110ooool2, I110ooool i110ooool3) {
/* 19 */            return ((Ooo1oiI0) this.I00iiO).I00Io1lO(I0000Il00O(j), i110ooool, i110ooool2, I0000O(j, i110ooool, i110ooool3, i110ooool2));
                }
            }
