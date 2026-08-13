            package p000;

            import android.util.Log;
            import java.io.IOException;
            import java.util.regex.Pattern;
            
            public final class o01iIOoOi {
                public static final O1ii0l1iii I0001Ioi1lo;
                public I0i0io0oOOi I00000oIO;
                public OIOlo0OloOi I00000oOI;
                public IioiI0IIIIO I0000Il00O;
                public i0OI1l1Oo I0000O;
                public String I0000oI00;

                static {
                    O1ii0l1iii o1ii0l1iiiI00000oIO;
/* 1 */             Pattern pattern = O1ii0l1iii.I0000Il00O;
                    try {
/* 5 */                 o1ii0l1iiiI00000oIO = l1IiOI.I00000oIO("application/json; charset=utf-8");
                    } catch (IllegalArgumentException unused) {
/* 10 */                o1ii0l1iiiI00000oIO = null;
                    }
/* 11 */            I0001Ioi1lo = o1ii0l1iiiI00000oIO;
                }

                public final String I00000oIO(Io1Io0OOi011 io1Io0OOi011, String str, String str2, o01oIol1O o01oiol1o, o01oIol1O o01oiol1o2) {
                    String strI00iiI;
/* 7 */             I00Ol00 i00Ol00I0000O = I00Ol00.I0000O(I0001Ioi1lo, str2);
/* 15 */            I1ii1o0 i1ii1o0 = new I1ii1o0(14);
/* 22 */            i1ii1o0.I00iio = io1Io0OOi011.I000OOo1O();
/* 24 */            i1ii1o0.I00IoiI(str);
/* 29 */            i1ii1o0.I00Io1lO("POST", i00Ol00I0000O);
/* 32 */            I0Oi111ii i0Oi111iiI00100o1O0lo = i1ii1o0.I00100o1O0lo();
/* 36 */            OIOlo0OloOi oIOlo0OloOi = this.I00000oOI;
/* 38 */            oIOlo0OloOi.getClass();
                    try {
/* 47 */                Oi1001l0Il oi1001l0IlI0000oI00 = new OOlioiIOOO1(oIOlo0OloOi, i0Oi111iiI00100o1O0lo).I0000oI00();
/* 51 */                IoiOloi ioiOloi = oi1001l0IlI0000oI00.I00io1l;
/* 53 */                int i = oi1001l0IlI0000oI00.I00iio;
/* 55 */                o01oiol1o2.I0001Ioi1lo = i;
/* 59 */                loOill110Ol looill110ol = loOill110Ol.RPC_ERROR;
/* 61 */                if (i >= 200 && i < 300) {
                            try {
                                try {
/* 68 */                            String strI00iiI2 = ioiOloi.I00iiI();
/* 72 */                            ioiOloi.close();
/* 75 */                            return strI00iiI2;
                                } finally {
                                }
                            } catch (IOException e) {
/* 107 */                       Log.e("MLKitFbInstsRestClient", "Error retrieving response body from HTTPS POST request to <" + str + ">", e);
/* 110 */                       o01oiol1o2.I00000oIO(looill110ol);
/* 115 */                       o01oiol1o.I0000oI00.I000l1(looill110ol);
/* 46 */                        return null;
                            }
                        }
/* 144 */               Log.e("MLKitFbInstsRestClient", "Got HTTP status " + i + " from HTTPS POST request to <" + str + ">");
                        try {
                            try {
/* 147 */                       strI00iiI = ioiOloi.I00iiI();
/* 151 */                       ioiOloi.close();
                            } catch (IOException unused) {
/* 167 */                       strI00iiI = "<none>";
                            }
/* 171 */                   "HTTP Response Body:\n".concat(strI00iiI);
/* 174 */                   o01oiol1o2.I00000oIO(looill110ol);
/* 179 */                   o01oiol1o.I0000oI00.I000l1(looill110ol);
/* 46 */                    return null;
                        } finally {
/* 156 */                   if (ioiOloi != null) {
                                try {
/* 158 */                           ioiOloi.close();
                                } catch (Throwable th) {
/* 163 */                           th.addSuppressed(th);
                                }
                            }
                        }
                    } catch (IOException e2) {
/* 201 */               Log.e("MLKitFbInstsRestClient", "Connection error (or timeout) sending HTTPS POST request to <" + str + ">", e2);
/* 204 */               loOill110Ol looill110ol2 = loOill110Ol.NO_CONNECTION;
/* 206 */               o01oiol1o2.I00000oIO(looill110ol2);
/* 211 */               o01oiol1o.I0000oI00.I000l1(looill110ol2);
/* 46 */                return null;
                    }
                }
            }
