            package p000;

            import android.view.inputmethod.HandwritingGesture;
            import java.lang.invoke.VarHandle;
            
            public abstract class illOi10o {
                public static int I00000oIO(HandwritingGesture handwritingGesture, OIoO1Ol oIoO1Ol) {
/* 1 */             String fallbackText = handwritingGesture.getFallbackText();
/* 5 */             if (fallbackText == null) {
/* 7 */                 return 3;
                    }
/* 15 */            oIoO1Ol.invoke(new IOi0OoOOIlli(fallbackText, 1));
/* 18 */            return 5;
                }

                public static void I00000oOI(long j, I1111OO10i i1111OO10i, boolean z, OIoO1Ol oIoO1Ol) {
/* 6 */             if (z) {
/* 8 */                 int i = Oo0lI00l.I0000Il00O;
/* 14 */                int iCharCount = (int) (j >> 32);
/* 17 */                int iCharCount2 = (int) (j & 4294967295L);
/* 27 */                int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(i1111OO10i, iCharCount) : 10;
/* 36 */                int iCodePointAt = iCharCount2 < i1111OO10i.I00iiI.length() ? Character.codePointAt(i1111OO10i, iCharCount2) : 10;
/* 44 */                if (illiOoIi.I000O01llI0(iCodePointBefore) && (illiOoIi.I000II(iCodePointAt) || illiOoIi.I0001Ioi1lo(iCodePointAt))) {
/* 73 */                    do {
/* 62 */                        iCharCount -= Character.charCount(iCodePointBefore);
/* 63 */                        if (iCharCount == 0) {
                                    break;
                                } else {
/* 65 */                            iCodePointBefore = Character.codePointBefore(i1111OO10i, iCharCount);
                                }
/* 73 */                    } while (illiOoIi.I000O01llI0(iCodePointBefore));
/* 75 */                    j = lOliOi0Oi.I00000oIO(iCharCount, iCharCount2);
                        } else if (illiOoIi.I000O01llI0(iCodePointAt) && (illiOoIi.I000II(iCodePointBefore) || illiOoIi.I0001Ioi1lo(iCodePointBefore))) {
/* 119 */                   do {
/* 102 */                       iCharCount2 += Character.charCount(iCodePointAt);
/* 109 */                       if (iCharCount2 == i1111OO10i.I00iiI.length()) {
                                    break;
                                } else {
/* 111 */                           iCodePointAt = Character.codePointAt(i1111OO10i, iCharCount2);
                                }
/* 119 */                   } while (illiOoIi.I000O01llI0(iCodePointAt));
/* 121 */                   j = lOliOi0Oi.I00000oIO(iCharCount, iCharCount2);
                        }
                    }
/* 128 */           int i2 = (int) (4294967295L & j);
/* 143 */           Iioi1O[] iioi1OArr = {new Oio0ilI1l(i2, i2), new IiIo10oo1il(Oo0lI00l.I0000oI00(j), 0)};
/* 152 */           Io1I0O io1I0O = new Io1I0O();
/* 155 */           io1I0O.I00000oIO = iioi1OArr;
/* 157 */           VarHandle.storeStoreFence();
/* 160 */           oIoO1Ol.invoke(io1I0O);
                }
            }
