            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ol1OlloIO {
                public final OI1I0OoOl I00000oIO = new OI1I0OoOl();
                public final OIooliIO0 I00000oOI = lOO00IiI0li.I00000oIO(null);

                public static Object I00000oOI(Ol1OlloIO ol1OlloIO, String str, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 1 */             Ol1OIo0O0O0l ol1OIo0O0O0l = Ol1OIo0O0O0l.I00iiI;
/* 9 */             boolean z = (i & 4) == 0;
/* 12 */            if ((i & 8) != 0) {
/* 14 */                ol1OIo0O0O0l = Ol1OIo0O0O0l.I00iOIl;
                    }
/* 16 */            ol1OlloIO.getClass();
/* 21 */            Ol1Ol1l1oO ol1Ol1l1oO = new Ol1Ol1l1oO();
/* 24 */            ol1Ol1l1oO.I00000oIO = str;
/* 26 */            ol1Ol1l1oO.I00000oOI = z;
/* 28 */            ol1Ol1l1oO.I0000Il00O = ol1OIo0O0O0l;
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            return ol1OlloIO.I00000oIO(ol1Ol1l1oO, iOoil1iiIilo);
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
                
                    if (r9 == r1) goto L25;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r7v0, types: [Ol1OlloIO] */
                /* JADX WARN: Type inference failed for: r7v1, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r7v4, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r7v5, types: [OI11ol] */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference failed for: r7v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(Ol1Ol1l1oO ol1Ol1l1oO, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    Ol1OliIii ol1OliIii;
                    OI1I0OoOl oI1I0OoOl;
/* 3 */             if (iOoil1iiIilo instanceof Ol1OliIii) {
/* 6 */                 ol1OliIii = (Ol1OliIii) iOoil1iiIilo;
/* 8 */                 int i = ol1OliIii.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ol1OliIii.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ol1OliIii = new Ol1OliIii(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object objI0010I0i = ol1OliIii.I00iiO;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ol1OliIii.I00ilI0I1;
/* 31 */            OIooliIO0 oIooliIO0 = this.I00000oOI;
                    try {
                        try {
/* 36 */                    if (i2 == 0) {
/* 64 */                        lIoii1l01l0i.I00000oOI(objI0010I0i);
/* 67 */                        ol1OliIii.I00iOIl = ol1Ol1l1oO;
/* 69 */                        OI1I0OoOl oI1I0OoOl2 = this.I00000oIO;
/* 71 */                        ol1OliIii.I00iiI = oI1I0OoOl2;
/* 73 */                        ol1OliIii.I00ilI0I1 = 1;
/* 75 */                        Object objI00000oIO = oI1I0OoOl2.I00000oIO(ol1OliIii);
                                oI1I0OoOl = oI1I0OoOl2;
/* 79 */                        if (objI00000oIO != ii0111o) {
                                }
/* 121 */                       return ii0111o;
                            }
/* 38 */                    if (i2 != 1) {
/* 40 */                        if (i2 != 2) {
/* 52 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 35 */                            return null;
                                }
/* 42 */                        OI11ol oI11ol = ol1OliIii.I00iiI;
/* 44 */                        lIoii1l01l0i.I00000oOI(objI0010I0i);
                                this = oI11ol;
/* 128 */                       return objI0010I0i;
                            }
/* 56 */                    ?? r7 = ol1OliIii.I00iiI;
/* 58 */                    ol1Ol1l1oO = ol1OliIii.I00iOIl;
/* 60 */                    lIoii1l01l0i.I00000oOI(objI0010I0i);
                            oI1I0OoOl = r7;
/* 82 */                    ol1OliIii.I00iOIl = ol1Ol1l1oO;
/* 84 */                    ol1OliIii.I00iiI = oI1I0OoOl;
/* 86 */                    ol1OliIii.I00ilI0I1 = 2;
/* 94 */                    IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(ol1OliIii));
/* 97 */                    iIoOoIol0Io0.I00111O();
/* 102 */                   Ol1OiolO0 ol1OiolO0 = new Ol1OiolO0();
/* 105 */                   ol1OiolO0.I00000oIO = ol1Ol1l1oO;
/* 107 */                   ol1OiolO0.I00000oOI = iIoOoIol0Io0;
/* 109 */                   VarHandle.storeStoreFence();
/* 112 */                   oIooliIO0.setValue(ol1OiolO0);
/* 115 */                   objI0010I0i = iIoOoIol0Io0.I0010I0i();
                            this = oI1I0OoOl;
                        } finally {
/* 131 */                   oIooliIO0.setValue(null);
                        }
                    } finally {
/* 135 */               this.I00000oOI(null);
                    }
                }
            }
