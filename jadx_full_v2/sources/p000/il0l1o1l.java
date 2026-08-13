            package p000;
            
            public abstract class il0l1o1l {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IOoilo iOoilo) throws Throwable {
                    IiIilOo001i iiIilOo001i;
/* 3 */             if (iOoilo instanceof IiIilOo001i) {
/* 6 */                 iiIilOo001i = (IiIilOo001i) iOoilo;
/* 8 */                 int i = iiIilOo001i.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iiIilOo001i.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iiIilOo001i = new IiIilOo001i(iOoilo);
                        }
                    }
/* 25 */            Object obj = iiIilOo001i.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iiIilOo001i.I00iiI;
/* 32 */            if (i2 == 0) {
/* 46 */                lIoii1l01l0i.I00000oOI(obj);
/* 49 */                iiIilOo001i.I00iiI = 1;
/* 57 */                IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iiIilOo001i));
/* 60 */                iIoOoIol0Io0.I00111O();
/* 67 */                if (iIoOoIol0Io0.I0010I0i() == ii0111o) {
/* 69 */                    return;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 38 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 41 */                    return;
                        }
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 70 */            IOOlIIilOl0.I0000Il00O();
                }

                public static final Object I00000oOI(long j, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             if (j > 0) {
/* 15 */                IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(iOoil1iiIilo));
/* 18 */                iIoOoIol0Io0.I00111O();
/* 28 */                if (j < Long.MAX_VALUE) {
/* 36 */                    I0000Il00O(iIoOoIol0Io0.I00ilI0I1).I000l1(j, iIoOoIol0Io0);
                        }
/* 39 */                Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 45 */                if (objI0010I0i == Ii0111o.I00iOIl) {
/* 47 */                    return objI0010I0i;
                        }
                    }
/* 48 */            return OoiIlOl1iI.I00000oIO;
                }

                public static final IiIiOllooO I0000Il00O(Ii00l101O ii00l101O) {
/* 3 */             Ii00ilI1 ii00ilI1I00lli11 = ii00l101O.I00lli11(o0iOli.I00iiO);
/* 14 */            IiIiOllooO iiIiOllooO = ii00ilI1I00lli11 instanceof IiIiOllooO ? (IiIiOllooO) ii00ilI1I00lli11 : null;
                    return iiIiOllooO == null ? Ii1o1OoolI.I00000oIO : iiIiOllooO;
                }

                public static final long I0000O(long j) {
/* 1 */             IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 12 */            boolean z = j > 0;
/* 13 */            if (z) {
/* 28 */                return Iio1OlIo0.I0000Il00O(Iio1OlIo0.I0001Ioi1lo(j, ilI0IilIOi.I0000O(999999L, Iio1llolooo.I00iiI)));
                    }
/* 33 */            if (!z) {
/* 3 */                 return 0L;
                    }
/* 36 */            I000II.I00000oIO();
/* 3 */             return 0L;
                }
            }
