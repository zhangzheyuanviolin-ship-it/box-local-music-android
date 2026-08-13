            package p000;

            import java.io.OutputStream;
            
            public abstract class iOIiooI10I {
                /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
                
                    if (I00000oIO(r6, r7, r0) == r1) goto L37;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(OIio0oloI1I oIio0oloI1I, OutputStream outputStream, IOoilo iOoilo) throws Throwable {
                    I0lOIll i0lOIll;
/* 3 */             if (iOoilo instanceof I0lOIll) {
/* 6 */                 i0lOIll = (I0lOIll) iOoilo;
/* 8 */                 int i = i0lOIll.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0lOIll.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0lOIll = new I0lOIll(iOoilo);
                        }
                    }
/* 25 */            Object obj = i0lOIll.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0lOIll.I00iiO;
                    try {
/* 34 */                if (i2 == 0) {
/* 57 */                    lIoii1l01l0i.I00000oOI(obj);
/* 62 */                    if (oIio0oloI1I instanceof OIio0O0iiOoi) {
/* 70 */                        outputStream.write(((OIio0O0iiOoi) oIio0oloI1I).I0000O());
                            } else if (oIio0oloI1I instanceof IiIIi1ii111) {
/* 80 */                        IIIoloiiI1 iIIoloiiI1I0000O = ((IiIIi1ii111) oIio0oloI1I).I0000O();
/* 84 */                        i0lOIll.I00iOIl = outputStream;
/* 86 */                        i0lOIll.I00iiO = 1;
/* 97 */                        if (liIOi0oii.I00000oIO(iIIoloiiI1I0000O, outputStream, Long.MAX_VALUE, i0lOIll) == ii0111o) {
/* 123 */                           return ii0111o;
                                }
                            } else if (!(oIio0oloI1I instanceof Il00l1o)) {
/* 107 */                       if (!(oIio0oloI1I instanceof OiIIoIIIii)) {
/* 136 */                           throw new IOiIIo1l(6);
                                }
/* 111 */                       OIio0oloI1I oIio0oloI1I2 = ((OiIIoIIIii) oIio0oloI1I).I00000oIO;
/* 113 */                       i0lOIll.I00iOIl = outputStream;
/* 115 */                       i0lOIll.I00iiO = 3;
                            }
                        } else {
/* 36 */                    if (i2 != 1 && i2 != 2 && i2 != 3) {
/* 53 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 33 */                        return null;
                            }
/* 43 */                    outputStream = i0lOIll.I00iOIl;
/* 45 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 124 */               ii1OOii.I00000oIO(outputStream, null);
/* 127 */               return OoiIlOl1iI.I00000oIO;
                    } finally {
                    }
                }
            }
