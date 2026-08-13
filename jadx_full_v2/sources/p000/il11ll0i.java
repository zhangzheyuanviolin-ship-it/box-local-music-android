            package p000;

            import android.os.Bundle;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class il11ll0i extends io0oi0oO {
                public I1Io0i0II I00iiI;
                public I1Io0i0II I00iiO;
                public long I00iio;

                public final void I010OIo1l(long j, String str) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             if (str == null || str.length() == 0) {
/* 38 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 40 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 47 */                l01o0io1ooo0.I00ilO0.I00000oOI("Ad unit id must be a non-empty string");
/* 106 */               return;
                    }
/* 14 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 16 */            l0olllO1i.I000II(l0o10ooo0);
/* 22 */            i1II10 i1ii10 = new i1II10(0);
/* 25 */            i1ii10.I00iiI = str;
/* 27 */            i1ii10.I00iiO = j;
/* 29 */            i1ii10.I00iio = this;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            l0o10ooo0.I010o0o0oO(i1ii10);
                }

                public final void I010i10l(long j, String str) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             if (str == null || str.length() == 0) {
/* 38 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 40 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 47 */                l01o0io1ooo0.I00ilO0.I00000oOI("Ad unit id must be a non-empty string");
/* 106 */               return;
                    }
/* 14 */            l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 16 */            l0olllO1i.I000II(l0o10ooo0);
/* 22 */            i1II10 i1ii10 = new i1II10(1);
/* 25 */            i1ii10.I00iiI = str;
/* 27 */            i1ii10.I00iiO = j;
/* 29 */            i1ii10.I00iio = this;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            l0o10ooo0.I010o0o0oO(i1ii10);
                }

                public final void I010iIIOlo(long j) {
/* 5 */             lO0liIO0 lo0liio0 = ((l0olllO1i) this.I00iOIl).I00ll1;
/* 7 */             l0olllO1i.I0001Ioi1lo(lo0liio0);
/* 11 */            lIol0ili1Oi liol0ili1oiI010ioo = lo0liio0.I010ioo(false);
/* 15 */            I1Io0i0II i1Io0i0II = this.I00iiI;
/* 23 */            Iterator it = ((I1Illo1io0) i1Io0i0II.keySet()).iterator();
/* 31 */            while (it.hasNext()) {
/* 37 */                String str = (String) it.next();
/* 51 */                I010l10O(str, j - ((Long) i1Io0i0II.get(str)).longValue(), liol0ili1oiI010ioo);
                    }
/* 59 */            if (!i1Io0i0II.isEmpty()) {
/* 65 */                I010ioo(j - this.I00iio, liol0ili1oiI010ioo);
                    }
/* 68 */            I010l1O(j);
                }

                public final void I010ioo(long j, lIol0ili1Oi liol0ili1oi) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             if (liol0ili1oi == null) {
/* 7 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 9 */                 l0olllO1i.I000II(l01o0io1ooo0);
/* 16 */                l01o0io1ooo0.I00lll10.I00000oOI("Not logging ad exposure. No active activity");
                    } else if (j < 1000) {
/* 26 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 28 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 39 */                l01o0io1ooo02.I00lll10.I0000Il00O("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
                    } else {
/* 45 */                Bundle bundle = new Bundle();
/* 50 */                bundle.putLong("_xt", j);
/* 54 */                lioil0ilIOi.I01O1I1(liol0ili1oi, bundle, true);
/* 57 */                lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 59 */                l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 66 */                lil1o1li.I010l1ol111("am", "_xa", bundle);
                    }
                }

                public final void I010l10O(String str, long j, lIol0ili1Oi liol0ili1oi) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             if (liol0ili1oi == null) {
/* 7 */                 l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 9 */                 l0olllO1i.I000II(l01o0io1ooo0);
/* 16 */                l01o0io1ooo0.I00lll10.I00000oOI("Not logging ad unit exposure. No active activity");
                    } else {
/* 24 */                if (j < 1000) {
/* 26 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 28 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 39 */                    l01o0io1ooo02.I00lll10.I0000Il00O("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
/* 42 */                    return;
                        }
/* 45 */                Bundle bundle = new Bundle();
/* 50 */                bundle.putString("_ai", str);
/* 55 */                bundle.putLong("_xt", j);
/* 59 */                lioil0ilIOi.I01O1I1(liol0ili1oi, bundle, true);
/* 62 */                lIl1O1li lil1o1li = l0olllo1i.I00lli11;
/* 64 */                l0olllO1i.I0001Ioi1lo(lil1o1li);
/* 71 */                lil1o1li.I010l1ol111("am", "_xu", bundle);
                    }
                }

                public final void I010l1O(long j) {
/* 1 */             I1Io0i0II i1Io0i0II = this.I00iiI;
/* 9 */             Iterator it = ((I1Illo1io0) i1Io0i0II.keySet()).iterator();
/* 17 */            while (it.hasNext()) {
/* 29 */                i1Io0i0II.put((String) it.next(), Long.valueOf(j));
                    }
/* 37 */            if (i1Io0i0II.isEmpty()) {
/* 77 */                return;
                    }
/* 39 */            this.I00iio = j;
                }
            }
