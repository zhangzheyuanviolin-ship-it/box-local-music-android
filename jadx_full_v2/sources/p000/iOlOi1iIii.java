            package p000;

            import android.os.Bundle;
            import android.os.SystemClock;
            import java.lang.invoke.VarHandle;
            
            public final class iOlOi1iIii {
                public final int I00000oIO;
                public long I00000oOI;
                public long I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;

                public iOlOi1iIii(int i) {
/* 1 */             this.I00000oIO = i;
                    switch (i) {
                        case 1:
                            break;
                        default:
/* 16 */                    this.I0000O = new lIO0IIo(3, (byte) 0);
/* 23 */                    this.I0000oI00 = new lIO0IIo(3, (byte) 0);
/* 30 */                    this.I0001Ioi1lo = new lIO0IIo(3, (byte) 0);
                            break;
                    }
                }

                public static iOlOi1iIii I00000oIO(ii0oooi0IO0l ii0oooi0io0l) {
/* 3 */             String str = ii0oooi0io0l.I00iOIl;
/* 5 */             String str2 = ii0oooi0io0l.I00iiO;
/* 9 */             Bundle bundleI0001Ioi1lo = ii0oooi0io0l.I00iiI.I0001Ioi1lo();
/* 13 */            long j = ii0oooi0io0l.I00iio;
/* 15 */            long j2 = ii0oooi0io0l.I00ilI0I1;
/* 18 */            iOlOi1iIii ioloi1iiii = new iOlOi1iIii(1);
/* 21 */            ioloi1iiii.I0000O = str;
/* 23 */            ioloi1iiii.I0000oI00 = str2;
/* 25 */            ioloi1iiii.I0001Ioi1lo = bundleI0001Ioi1lo;
/* 27 */            ioloi1iiii.I00000oOI = j;
/* 29 */            ioloi1iiii.I0000Il00O = j2;
/* 31 */            VarHandle.storeStoreFence();
/* 77 */            return ioloi1iiii;
                }

                public ii0oooi0IO0l I00000oOI() {
/* 30 */            return new ii0oooi0IO0l((String) this.I0000O, new ii0il0lOolIo(new Bundle((Bundle) this.I0001Ioi1lo)), (String) this.I0000oI00, this.I00000oOI, this.I0000Il00O);
                }

                public void I0000Il00O() {
/* 12 */            if (this.I0000Il00O == 0) {
/* 18 */                this.I0000Il00O = SystemClock.elapsedRealtime();
                    } else {
/* 23 */                I000II.I001IO000("Method endTiming is not supposed to be called more than once.");
                    }
                }

                public void I0000O() {
/* 12 */            if (this.I00000oOI == 0) {
/* 18 */                this.I00000oOI = SystemClock.elapsedRealtime();
                    } else {
/* 23 */                I000II.I001IO000("Method startTiming is not supposed to be called more than once.");
                    }
                }

                public String toString() {
                    switch (this.I00000oIO) {
                        case 1:
/* 13 */                    String str = (String) this.I0000oI00;
/* 19 */                    String string = ((Bundle) this.I0001Ioi1lo).toString();
/* 27 */                    int length = String.valueOf(str).length();
/* 33 */                    String str2 = (String) this.I0000O;
/* 55 */                    StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
/* 62 */                    IIl001iO0Io.I001lIiIIo1O(sb, "origin=", str, ",name=", str2);
/* 67 */                    return IIl001iO0Io.I00100l0(sb, ",params=", string);
                        default:
/* 6 */                     return super.toString();
                    }
                }
            }
