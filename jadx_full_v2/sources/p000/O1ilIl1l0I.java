            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.InputStream;
            
            public final class O1ilIl1l0I implements lloO1Oolo {
                public final int I00iOIl;
                public boolean I00iiI;

                public O1ilIl1l0I(int i) {
/* 1 */             this.I00iOIl = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public Object I00000oIO(OillOo0 oillOo0) {
                    lOio0i0 loio0i0I00000oIO;
/* 1 */             InputStream inputStreamI00000oOI = ll1110lO.I00000oOI(oillOo0);
                    try {
/* 5 */                 boolean z = this.I00iiI;
/* 7 */                 int i = Barcode.FORMAT_AZTEC;
/* 9 */                 if (z) {
/* 13 */                    if (inputStreamI00000oOI instanceof lo0liol11lI) {
/* 22 */                        long length = ((lo0liol11lI) inputStreamI00000oOI).zza().length();
/* 30 */                        if (length == 0) {
/* 32 */                            i = Barcode.FORMAT_UPC_A;
                                } else if (length < 4096) {
/* 41 */                            i = (int) length;
                                }
                            }
/* 50 */                    loio0i0I00000oIO = lOio0i0.I00000oIO(IOOOIO1O.I00IO1oi11O(inputStreamI00000oOI, i), true);
                        } else {
/* 60 */                    loio0i0I00000oIO = lOio0i0.I00000oIO(IOOOIO1O.I00IO1oi11O(inputStreamI00000oOI, Barcode.FORMAT_AZTEC), false);
                        }
/* 65 */                ii1OOii.I00000oIO(inputStreamI00000oOI, null);
/* 68 */                return loio0i0I00000oIO;
                    } catch (Throwable th) {
                        try {
/* 69 */                    throw th;
                        } catch (Throwable th2) {
/* 71 */                    ii1OOii.I00000oIO(inputStreamI00000oOI, th);
/* 77 */                    throw th2;
                        }
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
                            return this.I00iiI ? "Main memory only with no size restriction" : "Scratch file only with no size restriction";
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
