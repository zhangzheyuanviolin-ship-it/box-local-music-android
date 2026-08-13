            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oi10001 {
                public I0Oi111ii I00000oIO;
                public OOiIO0oi I00000oOI;
                public String I0000O;
                public Io11ol I0000oI00;
                public IoiOloi I000II;
                public Oi1001l0Il I000O01llI0;
                public Oi1001l0Il I000OOo1O;
                public Oi1001l0Il I000OiO;
                public long I000iOII;
                public long I000l1;
                public IOI0oloi01 I000lI;
                public int I0000Il00O = -1;
                public Io1IlO1I1i I0001Ioi1lo = new Io1IlO1I1i();

                public static void I00000oOI(String str, Oi1001l0Il oi1001l0Il) {
/* 1 */             if (oi1001l0Il != null) {
/* 5 */                 if (oi1001l0Il.I00io1l != null) {
/* 56 */                    I000II.I0010I0i(str.concat(".body != null"));
/* 89 */                    return;
                        }
/* 9 */                 if (oi1001l0Il.I00ioIO != null) {
/* 46 */                    I000II.I0010I0i(str.concat(".networkResponse != null"));
                        } else if (oi1001l0Il.I00l0I0l0lO1 != null) {
/* 36 */                    I000II.I0010I0i(str.concat(".cacheResponse != null"));
                        } else {
/* 17 */                    if (oi1001l0Il.I00l0OO0IO == null) {
/* 89 */                        return;
                            }
/* 26 */                    I000II.I0010I0i(str.concat(".priorResponse != null"));
                        }
                    }
                }

                public final Oi1001l0Il I00000oIO() {
/* 1 */             int i = this.I0000Il00O;
/* 4 */             if (i < 0) {
/* 97 */                OIiilo1Ool0o.I00000oOI(this.I0000Il00O, "code < 0: ");
/* 3 */                 return null;
                    }
/* 6 */             I0Oi111ii i0Oi111ii = this.I00000oIO;
/* 8 */             if (i0Oi111ii == null) {
/* 89 */                I000II.I001IO000("request == null");
/* 3 */                 return null;
                    }
/* 10 */            OOiIO0oi oOiIO0oi = this.I00000oOI;
/* 12 */            if (oOiIO0oi == null) {
/* 83 */                I000II.I001IO000("protocol == null");
/* 3 */                 return null;
                    }
/* 14 */            String str = this.I0000O;
/* 16 */            if (str == null) {
/* 77 */                I000II.I001IO000("message == null");
/* 3 */                 return null;
                    }
/* 18 */            Io11ol io11ol = this.I0000oI00;
/* 22 */            Io1Io0OOi011 io1Io0OOi011I0000Il00O = this.I0001Ioi1lo.I0000Il00O();
/* 26 */            IoiOloi ioiOloi = this.I000II;
/* 28 */            Oi1001l0Il oi1001l0Il = this.I000O01llI0;
/* 30 */            Oi1001l0Il oi1001l0Il2 = this.I000OOo1O;
/* 32 */            Oi1001l0Il oi1001l0Il3 = this.I000OiO;
/* 34 */            long j = this.I000iOII;
/* 36 */            long j2 = this.I000l1;
/* 38 */            IOI0oloi01 iOI0oloi01 = this.I000lI;
/* 42 */            Oi1001l0Il oi1001l0Il4 = new Oi1001l0Il();
/* 45 */            oi1001l0Il4.I00iOIl = i0Oi111ii;
/* 47 */            oi1001l0Il4.I00iiI = oOiIO0oi;
/* 49 */            oi1001l0Il4.I00iiO = str;
/* 51 */            oi1001l0Il4.I00iio = i;
/* 53 */            oi1001l0Il4.I00ilI0I1 = io11ol;
/* 55 */            oi1001l0Il4.I00ilO0 = io1Io0OOi011I0000Il00O;
/* 57 */            oi1001l0Il4.I00io1l = ioiOloi;
/* 59 */            oi1001l0Il4.I00ioIO = oi1001l0Il;
/* 61 */            oi1001l0Il4.I00l0I0l0lO1 = oi1001l0Il2;
/* 63 */            oi1001l0Il4.I00l0OO0IO = oi1001l0Il3;
/* 65 */            oi1001l0Il4.I00li1OI = j;
/* 67 */            oi1001l0Il4.I00ll1 = j2;
/* 69 */            oi1001l0Il4.I00lli11 = iOI0oloi01;
/* 71 */            VarHandle.storeStoreFence();
/* 74 */            return oi1001l0Il4;
                }
            }
