            package p000;

            import kotlin.jvm.functions.Function1;
            
            public abstract class iO0oloi1IO0 {
                public static final Object I00000oIO = new Object();

                public static final boolean I00000oIO(OlO0o0 olO0o0, int i, I01Io11IiiiO i01Io11IiiiO, boolean z) {
                    boolean z2;
                    synchronized (I00000oIO) {
                        try {
/* 4 */                     int i2 = olO0o0.I0000O;
/* 6 */                     if (i2 == i) {
/* 8 */                         olO0o0.I0000Il00O = i01Io11IiiiO;
/* 10 */                        z2 = true;
/* 11 */                        if (z) {
                                    olO0o0.I0000oI00++;
                                }
/* 22 */                        olO0o0.I0000O = i2 + 1;
                            } else {
/* 25 */                        z2 = false;
                            }
                        } catch (Throwable th) {
/* 204 */                   throw th;
                        }
                    }
/* 27 */            return z2;
                }

                public static final boolean I00000oOI(Ol1o0O0O0 ol1o0O0O0, Function1 function1) {
                    int i;
                    I01Io11IiiiO i01Io11IiiiO;
                    Object objInvoke;
                    Ol1il1o1 ol1il1o1I000O01llI0;
                    boolean zI00000oIO;
/* 59 */            do {
                        synchronized (I00000oIO) {
/* 10 */                    OlO0o0 olO0o0 = (OlO0o0) Ol1l1lI1Ili.I0001Ioi1lo(ol1o0O0O0.I00iOIl);
/* 12 */                    i = olO0o0.I0000O;
/* 14 */                    i01Io11IiiiO = olO0o0.I0000Il00O;
                        }
/* 17 */                OO100II1 oo100ii1I000iOII = i01Io11IiiiO.I000iOII();
/* 21 */                objInvoke = function1.invoke(oo100ii1I000iOII);
/* 25 */                I01Io11IiiiO i01Io11IiiiOI000OOo1O = oo100ii1I000iOII.I000OOo1O();
/* 33 */                if (O0000Ioio00.I0000O(i01Io11IiiiOI000OOo1O, i01Io11IiiiO)) {
                            break;
                        }
/* 35 */                OlO0o0 olO0o02 = ol1o0O0O0.I00iOIl;
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 40 */                    ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 51 */                    zI00000oIO = I00000oIO((OlO0o0) Ol1l1lI1Ili.I001i1O0Ol(olO0o02, ol1o0O0O0, ol1il1o1I000O01llI0), i, i01Io11IiiiOI000OOo1O, true);
                        }
/* 56 */                Ol1l1lI1Ili.I000l1(ol1il1o1I000O01llI0, ol1o0O0O0);
/* 59 */            } while (!zI00000oIO);
/* 67 */            return ((Boolean) objInvoke).booleanValue();
                }

                public static final void I0000Il00O(int i, int i2) {
/* 1 */             if (i < 0 || i >= i2) {
/* 16 */                I000II.I0010o(Oi010OO0.I0010o("index (", i, ") is out of bound of [0, ", i2, ")"));
                    }
                }
            }
