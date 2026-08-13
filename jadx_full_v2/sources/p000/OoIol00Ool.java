            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import com.google.android.gms.common.api.Status;
            import com.google.mlkit.genai.common.GenAiException;
            import java.io.IOException;
            import java.io.UnsupportedEncodingException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicLong;
            import java.util.concurrent.atomic.AtomicReferenceArray;
            
/* 16 */    public final class OoIol00Ool implements i0O11oO1, i0Ii0I1ll, OIOolOo, iOiO11oOi1, iOllI01II, IIiOOIoi0, OliiillO, IOoillilli {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public OoIol00Ool(i0OI1l1Oo i0oi1l1oo, int i) {
/* 3 */             this.I00iOIl = 13;
/* 8 */             this.I00iiO = i0oi1l1oo;
/* 15 */            this.I00iiI = new AtomicReferenceArray(i);
                }

                public static ArrayList I0000oI00(ArrayList arrayList) throws IOException {
/* 3 */             ArrayList arrayList2 = new ArrayList();
/* 11 */            int size = arrayList.size() - 1;
/* 12 */            for (int i = 1; i < size; i++) {
/* 18 */                Oo1IiOllo0iI oo1IiOllo0iI = (Oo1IiOllo0iI) arrayList.get(i);
/* 20 */                int i2 = oo1IiOllo0iI.I0000Il00O;
/* 23 */                if (i2 == 5) {
/* 35 */                    arrayList2.add(Float.valueOf(Float.parseFloat(oo1IiOllo0iI.I00000oIO)));
                        } else {
/* 40 */                    if (i2 != 6) {
/* 83 */                        throw new IOException("Expected INTEGER or REAL but got " + oo1IiOllo0iI + " at array position " + i);
                            }
/* 50 */                    arrayList2.add(Integer.valueOf(oo1IiOllo0iI.I00000oIO()));
                        }
                    }
/* 186 */           return arrayList2;
                }

                public static byte[] I000II(byte[] bArr, int i, int i2) {
/* 2 */             if (i2 == -1) {
/* 4 */                 return bArr;
                    }
/* 7 */             if (bArr.length == 0 || i2 > bArr.length) {
/* 49 */                return new byte[0];
                    }
/* 15 */            byte[] bArr2 = new byte[bArr.length - i2];
/* 18 */            for (int i3 = 0; i3 < bArr.length; i3++) {
/* 22 */                int i4 = bArr[i3] & 255;
/* 26 */                int i5 = (i >> 8) ^ i4;
/* 27 */                if (i3 >= i2) {
/* 32 */                    bArr2[i3 - i2] = (byte) i5;
                        }
/* 44 */                i = 65535 & (((i4 + i) * 52845) + 22719);
                    }
/* 48 */            return bArr2;
                }

                public static OoIol00Ool I001i1O0Ol(I1ii1o0 i1ii1o0) {
/* 4 */             OoIol00Ool ooIol00Ool = new OoIol00Ool(7);
/* 14 */            ooIol00Ool.I00iiO = new IIlOoolol0ll(19);
/* 16 */            ooIol00Ool.I00iiI = i1ii1o0;
/* 18 */            i1i0olI.I0010o();
/* 21 */            VarHandle.storeStoreFence();
/* 49 */            return ooIol00Ool;
                }

                @Override
                public iOllI01II I00000oIO(OOoo1il oOoo1il) {
/* 1 */             this.I00iiO = oOoo1il;
/* 49 */            return this;
                }

                @Override
                public iOllI01II I00000oOI(iOIo11i ioio11i) {
/* 5 */             ((o01l1ioOo0) this.I00iiI).I00iiI = ioio11i;
/* 49 */            return this;
                }

                @Override
                public Object I0000Il00O() {
                    switch (this.I00iOIl) {
                        case 3:
/* 41 */                    i0O1I1o i0o1i1o = (i0O1I1o) this.I00iiI;
/* 45 */                    List list = (List) this.I00iiO;
/* 49 */                    HashMap map = new HashMap();
/* 66 */                    for (i0O10o1 i0o10o1 : i0o1i1o.I0000Il00O.values()) {
/* 78 */                        String str = (String) i0o10o1.I0000Il00O.I0000O;
/* 84 */                        if (list.contains(str)) {
/* 90 */                            i0O10o1 i0o10o12 = (i0O10o1) map.get(str);
/* 100 */                           if ((i0o10o12 == null ? -1 : i0o10o12.I00000oIO) < i0o10o1.I00000oIO) {
/* 102 */                               map.put(str, i0o10o1);
                                    }
                                }
                            }
/* 106 */                   return map;
                        default:
/* 8 */                     i0IOo0i0 i0ioo0i0 = (i0IOo0i0) this.I00iiO;
/* 14 */                    Object objI0000Il00O = ((i0IOo0i0) this.I00iiI).I0000Il00O();
/* 26 */                    i0OI1ii10 i0oi1ii10 = (i0OI1ii10) i0ioo0i0.I0000Il00O();
/* 28 */                    i0OI1IOoili1 i0oi1iooili1 = new i0OI1IOoili1();
/* 31 */                    i0oi1iooili1.I00000oIO = (i0Il00O1) objI0000Il00O;
/* 33 */                    i0oi1iooili1.I00000oOI = i0oi1ii10;
/* 35 */                    VarHandle.storeStoreFence();
/* 38 */                    return i0oi1iooili1;
                    }
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) {
                    Bundle bundle;
/* 3 */             OiI1lOO1O0i oiI1lOO1O0i = (OiI1lOO1O0i) this.I00iiI;
/* 7 */             Bundle bundle2 = (Bundle) this.I00iiO;
/* 13 */            if (!oloIIoII1oo.I000OOo1O() || (bundle = (Bundle) oloIIoII1oo.I000II()) == null || !bundle.containsKey("google.messenger")) {
/* 186 */               return oloIIoII1oo;
                    }
/* 32 */            o0IiOl o0iiolI00000oOI = oiI1lOO1O0i.I00000oOI(bundle2);
/* 36 */            Iii11l iii11l = Iii11l.I00iio;
/* 38 */            lOOlOoll loolooll = lOOlOoll.I00li1OI;
/* 40 */            o0iiolI00000oOI.getClass();
/* 45 */            o0IiOl o0iiol = new o0IiOl();
/* 55 */            o0iiolI00000oOI.I00000oOI.I000l1(new l0IIioiIOIo(iii11l, loolooll, o0iiol));
/* 58 */            o0iiolI00000oOI.I0010I0i();
/* 61 */            return o0iiol;
                }

                @Override
                public void I0001Ioi1lo(GenAiException genAiException) {
/* 3 */             iOil1lO10l ioil1lo10l = (iOil1lO10l) this.I00iiI;
/* 5 */             Object obj = this.I00iiO;
/* 7 */             ilOiOOII0I0 iloiooii0i0 = ioil1lo10l.I00iio;
/* 21 */            ioil1lo10l.I00iiO.I0000O(obj, iloiooii0i0 != null ? iloiooii0i0.I0001Ioi1lo : -1, genAiException.getErrorCode());
                }

                /* JADX WARN: Removed duplicated region for block: B:156:0x0458  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00fe  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OoIoiiol0o I000O01llI0(byte[] bArr, byte[] bArr2) throws IOException, NumberFormatException {
                    byte[] bArrI000II;
                    Object obj;
                    Oo1IiOllo0iI oo1IiOllo0iI;
                    OoIoiiol0o ooIoiiol0o;
                    char c;
/* 7 */             OoIoiiol0o ooIoiiol0o2 = new OoIoiiol0o();
/* 12 */            ooIoiiol0o2.I00iOIl = "";
/* 14 */            OoIoiiol0o ooIoiiol0o3 = null;
/* 15 */            ooIoiiol0o2.I00iiI = null;
/* 22 */            ooIoiiol0o2.I00iiO = new ArrayList();
/* 29 */            ooIoiiol0o2.I00iio = new ArrayList();
/* 31 */            ooIoiiol0o2.I00ilI0I1 = "";
/* 35 */            new ArrayList();
/* 40 */            new ArrayList();
/* 45 */            new ArrayList();
/* 50 */            new ArrayList();
/* 55 */            new ArrayList();
/* 60 */            new ArrayList();
/* 65 */            new ArrayList();
/* 70 */            new ArrayList();
/* 78 */            ooIoiiol0o2.I00ilO0 = new ArrayList();
/* 85 */            ooIoiiol0o2.I00io1l = new LinkedHashMap();
/* 92 */            ooIoiiol0o2.I00ioIO = new ConcurrentHashMap();
/* 94 */            VarHandle.storeStoreFence();
/* 97 */            this.I00iiO = ooIoiiol0o2;
                    try {
/* 99 */                I000OOo1O(bArr);
/* 103 */               if (bArr2.length > 0) {
/* 106 */                   int i = 4;
/* 109 */                   int i2 = 13;
/* 116 */                   if (bArr2.length < 4) {
/* 144 */                       bArrI000II = I000II(bArr2, 55665, 4);
/* 216 */                       I00Ol00 i00Ol00 = new I00Ol00(bArrI000II);
/* 219 */                       this.I00iiI = i00Ol00;
/* 221 */                       obj = i00Ol00.I0000O;
                                while (true) {
/* 223 */                           oo1IiOllo0iI = (Oo1IiOllo0iI) obj;
/* 227 */                           if (oo1IiOllo0iI == null || OlIo0Ooi1loI.I000l1.equals(oo1IiOllo0iI.I00000oIO)) {
                                        break;
                                    }
/* 241 */                           ((I00Ol00) this.I00iiI).I00100l0();
/* 248 */                           obj = ((I00Ol00) this.I00iiI).I0000O;
                                }
/* 253 */                       if (oo1IiOllo0iI != null) {
/* 1117 */                          IioIoO10iOiI.I000OOo1O("/Private token not found");
/* 14 */                            return null;
                                }
/* 255 */                       I000iOII(4, OlIo0Ooi1loI.I000l1);
/* 258 */                       int i3 = 6;
/* 263 */                       int iI00000oIO = I000OiO(6).I00000oIO();
/* 270 */                       I000iOII(3, "dict");
/* 275 */                       I000lI("dup");
/* 280 */                       I000iOII(3, "begin");
/* 283 */                       int iI00000oIO2 = 4;
/* 284 */                       int i4 = 0;
/* 287 */                       while (i4 < iI00000oIO && ((I00Ol00) this.I00iiI).I00100o1O0lo(i)) {
/* 306 */                           String str = I000OiO(i).I00000oIO;
/* 316 */                           if ("Subrs".equals(str)) {
/* 322 */                               int iI00000oIO3 = I000OiO(i3).I00000oIO();
/* 327 */                               for (int i5 = 0; i5 < iI00000oIO3; i5++) {
/* 335 */                                   ((OoIoiiol0o) this.I00iiO).I00ilO0.add(ooIoiiol0o3);
                                        }
/* 341 */                               I000iOII(3, "array");
/* 344 */                               int i6 = 0;
/* 345 */                               while (i6 < iI00000oIO3) {
/* 349 */                                   I00Ol00 i00Ol002 = (I00Ol00) this.I00iiI;
/* 355 */                                   if (((Oo1IiOllo0iI) i00Ol002.I0000O) == null || !i00Ol002.I00100o1O0lo(3) || !((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("dup")) {
                                                break;
                                            }
/* 383 */                                   I000iOII(3, "dup");
/* 386 */                                   Oo1IiOllo0iI oo1IiOllo0iII000OiO = I000OiO(i3);
/* 390 */                                   I000OiO(i3);
/* 393 */                                   Oo1IiOllo0iI oo1IiOllo0iII000OiO2 = I000OiO(i2);
/* 397 */                                   int iI00000oIO4 = oo1IiOllo0iII000OiO.I00000oIO();
/* 401 */                                   OoIoiiol0o ooIoiiol0o4 = ooIoiiol0o3;
/* 413 */                                   if (iI00000oIO4 < ((OoIoiiol0o) this.I00iiO).I00ilO0.size()) {
/* 427 */                                       ((OoIoiiol0o) this.I00iiO).I00ilO0.set(iI00000oIO4, I000II(oo1IiOllo0iII000OiO2.I00000oOI, 4330, iI00000oIO2));
                                            }
/* 430 */                                   I000oI1ioi();
/* 433 */                                   i6++;
/* 435 */                                   ooIoiiol0o3 = ooIoiiol0o4;
                                        }
/* 357 */                               ooIoiiol0o = ooIoiiol0o3;
/* 438 */                               I000l1();
                                    } else {
/* 442 */                               ooIoiiol0o = ooIoiiol0o3;
/* 450 */                               if ("OtherSubrs".equals(str)) {
/* 454 */                                   I00Ol00 i00Ol003 = (I00Ol00) this.I00iiI;
/* 460 */                                   if (((Oo1IiOllo0iI) i00Ol003.I0000O) == null) {
/* 511 */                                       IioIoO10iOiI.I000OOo1O("Missing start token of OtherSubrs procedure");
/* 514 */                                       return ooIoiiol0o;
                                            }
/* 467 */                                   if (i00Ol003.I00100o1O0lo(7)) {
/* 469 */                                       I00100o1O0lo();
/* 472 */                                       I000l1();
                                            } else {
/* 480 */                                       int iI00000oIO5 = I000OiO(i3).I00000oIO();
/* 484 */                                       I000iOII(3, "array");
/* 488 */                                       for (int i7 = 0; i7 < iI00000oIO5; i7++) {
/* 490 */                                           I000iOII(3, "dup");
/* 493 */                                           I000OiO(i3);
/* 496 */                                           I00100o1O0lo();
/* 499 */                                           I000oI1ioi();
                                                }
/* 505 */                                       I000l1();
                                            }
                                        } else if ("lenIV".equals(str)) {
/* 523 */                                   ArrayList arrayListI00100o1O0lo = I00100o1O0lo();
/* 527 */                                   I000l1();
/* 537 */                                   iI00000oIO2 = ((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO();
                                        } else {
/* 562 */                                   if ("ND".equals(str)) {
/* 564 */                                       c = '\t';
/* 566 */                                       I000OiO(9);
/* 569 */                                       I000lI("noaccess");
/* 572 */                                       I000iOII(3, "def");
/* 577 */                                       I000OiO(10);
/* 580 */                                       I000lI("executeonly");
/* 583 */                                       I000lI("readonly");
/* 586 */                                       I000iOII(3, "def");
                                            } else {
/* 591 */                                       c = '\t';
/* 601 */                                       if ("NP".equals(str)) {
/* 603 */                                           I000OiO(9);
/* 606 */                                           I000lI("noaccess");
/* 609 */                                           I000OiO(3);
/* 612 */                                           I000OiO(10);
/* 615 */                                           I000lI("executeonly");
/* 618 */                                           I000lI("readonly");
/* 621 */                                           I000iOII(3, "def");
                                                } else if ("RD".equals(str)) {
/* 633 */                                           I000OiO(9);
/* 636 */                                           I000o00OoI0I();
/* 641 */                                           I000lI("bind");
/* 644 */                                           I000lI("executeonly");
/* 647 */                                           I000lI("readonly");
/* 650 */                                           I000iOII(3, "def");
                                                } else {
/* 654 */                                           ArrayList arrayListI00100o1O0lo2 = I00100o1O0lo();
/* 658 */                                           I000l1();
/* 667 */                                           if (str.equals("BlueValues")) {
/* 671 */                                               OoIoiiol0o ooIoiiol0o5 = (OoIoiiol0o) this.I00iiO;
/* 673 */                                               I0000oI00(arrayListI00100o1O0lo2);
/* 676 */                                               ooIoiiol0o5.getClass();
                                                    } else if (str.equals("OtherBlues")) {
/* 692 */                                               OoIoiiol0o ooIoiiol0o6 = (OoIoiiol0o) this.I00iiO;
/* 694 */                                               I0000oI00(arrayListI00100o1O0lo2);
/* 697 */                                               ooIoiiol0o6.getClass();
                                                    } else if (str.equals("FamilyBlues")) {
/* 711 */                                               OoIoiiol0o ooIoiiol0o7 = (OoIoiiol0o) this.I00iiO;
/* 713 */                                               I0000oI00(arrayListI00100o1O0lo2);
/* 716 */                                               ooIoiiol0o7.getClass();
                                                    } else if (str.equals("FamilyOtherBlues")) {
/* 730 */                                               OoIoiiol0o ooIoiiol0o8 = (OoIoiiol0o) this.I00iiO;
/* 732 */                                               I0000oI00(arrayListI00100o1O0lo2);
/* 735 */                                               ooIoiiol0o8.getClass();
                                                    } else {
/* 745 */                                               if (str.equals("BlueScale")) {
/* 749 */                                                   OoIoiiol0o ooIoiiol0o9 = (OoIoiiol0o) this.I00iiO;
/* 760 */                                                   Float.parseFloat(((Oo1IiOllo0iI) arrayListI00100o1O0lo2.get(0)).I00000oIO);
/* 763 */                                                   ooIoiiol0o9.getClass();
                                                        } else if (str.equals("BlueShift")) {
/* 779 */                                                   OoIoiiol0o ooIoiiol0o10 = (OoIoiiol0o) this.I00iiO;
/* 787 */                                                   ((Oo1IiOllo0iI) arrayListI00100o1O0lo2.get(0)).I00000oIO();
/* 790 */                                                   ooIoiiol0o10.getClass();
                                                        } else if (str.equals("BlueFuzz")) {
/* 805 */                                                   OoIoiiol0o ooIoiiol0o11 = (OoIoiiol0o) this.I00iiO;
/* 813 */                                                   ((Oo1IiOllo0iI) arrayListI00100o1O0lo2.get(0)).I00000oIO();
/* 816 */                                                   ooIoiiol0o11.getClass();
                                                        } else if (str.equals("StdHW")) {
/* 831 */                                                   OoIoiiol0o ooIoiiol0o12 = (OoIoiiol0o) this.I00iiO;
/* 833 */                                                   I0000oI00(arrayListI00100o1O0lo2);
/* 836 */                                                   ooIoiiol0o12.getClass();
                                                        } else if (str.equals("StdVW")) {
/* 851 */                                                   OoIoiiol0o ooIoiiol0o13 = (OoIoiiol0o) this.I00iiO;
/* 853 */                                                   I0000oI00(arrayListI00100o1O0lo2);
/* 856 */                                                   ooIoiiol0o13.getClass();
                                                        } else if (str.equals("StemSnapH")) {
/* 871 */                                                   OoIoiiol0o ooIoiiol0o14 = (OoIoiiol0o) this.I00iiO;
/* 873 */                                                   I0000oI00(arrayListI00100o1O0lo2);
/* 876 */                                                   ooIoiiol0o14.getClass();
                                                        } else if (str.equals("StemSnapV")) {
/* 891 */                                                   OoIoiiol0o ooIoiiol0o15 = (OoIoiiol0o) this.I00iiO;
/* 893 */                                                   I0000oI00(arrayListI00100o1O0lo2);
/* 896 */                                                   ooIoiiol0o15.getClass();
                                                        } else if (str.equals("ForceBold")) {
/* 911 */                                                   OoIoiiol0o ooIoiiol0o16 = (OoIoiiol0o) this.I00iiO;
/* 924 */                                                   ((Oo1IiOllo0iI) arrayListI00100o1O0lo2.get(0)).I00000oIO.equals("true");
/* 927 */                                                   ooIoiiol0o16.getClass();
                                                        } else if (str.equals("LanguageGroup")) {
/* 942 */                                                   OoIoiiol0o ooIoiiol0o17 = (OoIoiiol0o) this.I00iiO;
/* 951 */                                                   ((Oo1IiOllo0iI) arrayListI00100o1O0lo2.get(0)).I00000oIO();
/* 954 */                                                   ooIoiiol0o17.getClass();
                                                        }
/* 957 */                                               i4++;
/* 960 */                                               ooIoiiol0o3 = ooIoiiol0o;
/* 962 */                                               i3 = 6;
/* 963 */                                               i = 4;
/* 964 */                                               i2 = 13;
                                                    }
                                                }
                                            }
/* 957 */                                   i4++;
/* 960 */                                   ooIoiiol0o3 = ooIoiiol0o;
/* 962 */                                   i3 = 6;
/* 963 */                                   i = 4;
/* 964 */                                   i2 = 13;
                                        }
                                    }
/* 541 */                           c = '\t';
/* 957 */                           i4++;
/* 960 */                           ooIoiiol0o3 = ooIoiiol0o;
/* 962 */                           i3 = 6;
/* 963 */                           i = 4;
/* 964 */                           i2 = 13;
                                }
                                while (true) {
/* 977 */                           if (((I00Ol00) this.I00iiI).I00100o1O0lo(4) && ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("CharStrings")) {
                                        break;
                                    }
/* 1108 */                          ((I00Ol00) this.I00iiI).I00100l0();
                                }
/* 1002 */                      I000iOII(4, "CharStrings");
/* 1010 */                      int iI00000oIO6 = I000OiO(6).I00000oIO();
/* 1014 */                      I000iOII(3, "dict");
/* 1017 */                      I000iOII(3, "dup");
/* 1020 */                      I000iOII(3, "begin");
/* 1026 */                      for (int i8 = 0; i8 < iI00000oIO6; i8++) {
/* 1030 */                          I00Ol00 i00Ol004 = (I00Ol00) this.I00iiI;
/* 1036 */                          if (((Oo1IiOllo0iI) i00Ol004.I0000O) == null || (i00Ol004.I00100o1O0lo(3) && ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("end"))) {
                                        break;
                                    }
/* 1067 */                          String str2 = I000OiO(4).I00000oIO;
/* 1070 */                          I000OiO(6);
/* 1091 */                          ((OoIoiiol0o) this.I00iiO).I00io1l.put(str2, I000II(I000OiO(13).I00000oOI, 4330, iI00000oIO2));
/* 1094 */                          I000l1();
                                }
/* 1100 */                      I000iOII(3, "end");
                            } else {
/* 123 */                       for (int i9 = 0; i9 < 4; i9++) {
/* 125 */                           byte b = bArr2[i9];
/* 127 */                           if (b != 10 && b != 13 && b != 32 && b != 9 && Character.digit((char) b, 16) == -1) {
/* 144 */                               bArrI000II = I000II(bArr2, 55665, 4);
                                        break;
                                    }
                                }
/* 154 */                       int i10 = 0;
/* 155 */                       for (byte b2 : bArr2) {
/* 164 */                           if (Character.digit((char) b2, 16) != -1) {
/* 166 */                               i10++;
                                    }
                                }
/* 173 */                       byte[] bArr3 = new byte[i10 / 2];
/* 176 */                       int i11 = -1;
/* 178 */                       int i12 = 0;
/* 179 */                       for (byte b3 : bArr2) {
/* 184 */                           int iDigit = Character.digit((char) b3, 16);
/* 188 */                           if (iDigit != -1) {
/* 190 */                               if (i11 == -1) {
/* 192 */                                   i11 = iDigit;
                                        } else {
/* 200 */                                   bArr3[i12] = (byte) ((i11 * 16) + iDigit);
/* 202 */                                   i11 = -1;
/* 194 */                                   i12++;
                                        }
                                    }
                                }
/* 210 */                       bArrI000II = I000II(bArr3, 55665, 4);
/* 216 */                       I00Ol00 i00Ol005 = new I00Ol00(bArrI000II);
/* 219 */                       this.I00iiI = i00Ol005;
/* 221 */                       obj = i00Ol005.I0000O;
                                while (true) {
/* 223 */                           oo1IiOllo0iI = (Oo1IiOllo0iI) obj;
/* 227 */                           if (oo1IiOllo0iI == null) {
                                        break;
                                    }
                                    break;
                                    break;
/* 241 */                           ((I00Ol00) this.I00iiI).I00100l0();
/* 248 */                           obj = ((I00Ol00) this.I00iiI).I0000O;
                                }
/* 253 */                       if (oo1IiOllo0iI != null) {
                                }
                            }
                        }
/* 1123 */              return (OoIoiiol0o) this.I00iiO;
                    } catch (NumberFormatException e) {
/* 2988 */              throw new IOException(e);
                    }
                }

                public void I000OOo1O(byte[] bArr) throws IOException, NumberFormatException {
                    Oo1IiOllo0iI oo1IiOllo0iI;
/* 2 */             if (bArr.length == 0) {
/* 944 */               IioIoO10iOiI.I000OOo1O("ASCII segment of type 1 font is empty");
/* 966 */               return;
                    }
/* 6 */             if (bArr.length < 2 || !(bArr[0] == 37 || bArr[1] == 33)) {
/* 938 */               IioIoO10iOiI.I000OOo1O("Invalid start of ASCII segment of type 1 font");
/* 941 */               return;
                    }
/* 24 */            I00Ol00 i00Ol00 = new I00Ol00(bArr);
/* 27 */            this.I00iiI = i00Ol00;
/* 43 */            if ("FontDirectory".equals(((Oo1IiOllo0iI) i00Ol00.I0000O).I00000oIO)) {
/* 45 */                I000iOII(3, "FontDirectory");
/* 48 */                I000OiO(4);
/* 53 */                I000iOII(3, "known");
/* 58 */                I000OiO(9);
/* 61 */                I000o00OoI0I();
/* 64 */                I000OiO(9);
/* 67 */                I000o00OoI0I();
/* 72 */                I000iOII(3, "ifelse");
                    }
/* 80 */            int iI00000oIO = I000OiO(6).I00000oIO();
/* 86 */            I000iOII(3, "dict");
/* 91 */            I000lI("dup");
/* 96 */            I000iOII(3, "begin");
/* 104 */           for (int i = 0; i < iI00000oIO && (oo1IiOllo0iI = (Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O) != null; i++) {
/* 118 */               String str = oo1IiOllo0iI.I00000oIO;
/* 122 */               if (oo1IiOllo0iI.I0000Il00O == 3 && (str.equals("currentdict") || str.equals("end"))) {
                            break;
                        }
/* 142 */               String str2 = I000OiO(4).I00000oIO;
/* 150 */               if (str2.equals("FontInfo") || str2.equals("Fontinfo")) {
/* 661 */                   for (Map.Entry entry : I00100l0().entrySet()) {
/* 673 */                       String str3 = (String) entry.getKey();
/* 679 */                       List list = (List) entry.getValue();
/* 687 */                       if (str3.equals("version")) {
/* 691 */                           OoIoiiol0o ooIoiiol0o = (OoIoiiol0o) this.I00iiO;
/* 699 */                           String str4 = ((Oo1IiOllo0iI) list.get(0)).I00000oIO;
/* 701 */                           ooIoiiol0o.getClass();
                                } else if (str3.equals("Notice")) {
/* 715 */                           OoIoiiol0o ooIoiiol0o2 = (OoIoiiol0o) this.I00iiO;
/* 723 */                           String str5 = ((Oo1IiOllo0iI) list.get(0)).I00000oIO;
/* 725 */                           ooIoiiol0o2.getClass();
                                } else if (str3.equals("FullName")) {
/* 749 */                           ((OoIoiiol0o) this.I00iiO).I00ilI0I1 = ((Oo1IiOllo0iI) list.get(0)).I00000oIO;
                                } else if (str3.equals("FamilyName")) {
/* 762 */                           OoIoiiol0o ooIoiiol0o3 = (OoIoiiol0o) this.I00iiO;
/* 770 */                           String str6 = ((Oo1IiOllo0iI) list.get(0)).I00000oIO;
/* 772 */                           ooIoiiol0o3.getClass();
                                } else if (str3.equals("Weight")) {
/* 786 */                           OoIoiiol0o ooIoiiol0o4 = (OoIoiiol0o) this.I00iiO;
/* 794 */                           String str7 = ((Oo1IiOllo0iI) list.get(0)).I00000oIO;
/* 796 */                           ooIoiiol0o4.getClass();
                                } else if (str3.equals("ItalicAngle")) {
/* 811 */                           OoIoiiol0o ooIoiiol0o5 = (OoIoiiol0o) this.I00iiO;
/* 821 */                           Float.parseFloat(((Oo1IiOllo0iI) list.get(0)).I00000oIO);
/* 824 */                           ooIoiiol0o5.getClass();
                                } else if (str3.equals("isFixedPitch")) {
/* 839 */                           OoIoiiol0o ooIoiiol0o6 = (OoIoiiol0o) this.I00iiO;
/* 851 */                           ((Oo1IiOllo0iI) list.get(0)).I00000oIO.equals("true");
/* 854 */                           ooIoiiol0o6.getClass();
                                } else if (str3.equals("UnderlinePosition")) {
/* 869 */                           OoIoiiol0o ooIoiiol0o7 = (OoIoiiol0o) this.I00iiO;
/* 879 */                           Float.parseFloat(((Oo1IiOllo0iI) list.get(0)).I00000oIO);
/* 882 */                           ooIoiiol0o7.getClass();
                                } else if (str3.equals("UnderlineThickness")) {
/* 897 */                           OoIoiiol0o ooIoiiol0o8 = (OoIoiiol0o) this.I00iiO;
/* 907 */                           Float.parseFloat(((Oo1IiOllo0iI) list.get(0)).I00000oIO);
/* 910 */                           ooIoiiol0o8.getClass();
                                }
                            }
                        } else if (str2.equals("Metrics")) {
/* 170 */                   I00100l0();
                        } else if (!str2.equals("Encoding")) {
/* 443 */                   ArrayList arrayListI00100o1O0lo = I00100o1O0lo();
/* 447 */                   I000l1();
/* 456 */                   if (str2.equals("FontName")) {
/* 470 */                       ((OoIoiiol0o) this.I00iiO).I00iOIl = ((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO;
                            } else if (str2.equals("PaintType")) {
/* 484 */                       OoIoiiol0o ooIoiiol0o9 = (OoIoiiol0o) this.I00iiO;
/* 492 */                       ((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO();
/* 495 */                       ooIoiiol0o9.getClass();
                            } else if (str2.equals("FontType")) {
/* 510 */                       OoIoiiol0o ooIoiiol0o10 = (OoIoiiol0o) this.I00iiO;
/* 518 */                       ((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO();
/* 521 */                       ooIoiiol0o10.getClass();
                            } else if (str2.equals("FontMatrix")) {
/* 542 */                       ((OoIoiiol0o) this.I00iiO).I00iiO = I0000oI00(arrayListI00100o1O0lo);
                            } else if (str2.equals("FontBBox")) {
/* 562 */                       ((OoIoiiol0o) this.I00iiO).I00iio = I0000oI00(arrayListI00100o1O0lo);
                            } else if (str2.equals("UniqueID")) {
/* 576 */                       OoIoiiol0o ooIoiiol0o11 = (OoIoiiol0o) this.I00iiO;
/* 584 */                       ((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO();
/* 587 */                       ooIoiiol0o11.getClass();
                            } else if (str2.equals("StrokeWidth")) {
/* 602 */                       OoIoiiol0o ooIoiiol0o12 = (OoIoiiol0o) this.I00iiO;
/* 612 */                       Float.parseFloat(((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO);
/* 615 */                       ooIoiiol0o12.getClass();
                            } else if (str2.equals("FID")) {
/* 630 */                       OoIoiiol0o ooIoiiol0o13 = (OoIoiiol0o) this.I00iiO;
/* 638 */                       String str8 = ((Oo1IiOllo0iI) arrayListI00100o1O0lo.get(0)).I00000oIO;
/* 640 */                       ooIoiiol0o13.getClass();
                            }
                        } else if (((I00Ol00) this.I00iiI).I00100o1O0lo(3)) {
/* 205 */                   String str9 = ((I00Ol00) this.I00iiI).I00100l0().I00000oIO;
/* 213 */                   if (!str9.equals("StandardEncoding")) {
/* 237 */                       IioIoO10iOiI.I000OOo1O("Unknown encoding: ".concat(str9));
/* 240 */                       return;
                            } else {
/* 221 */                       ((OoIoiiol0o) this.I00iiO).I00iiI = OlIlI1ooOO.I0000O;
/* 223 */                       I000lI("readonly");
/* 226 */                       I000iOII(3, "def");
                            }
                        } else {
/* 245 */                   I000OiO(6).I00000oIO();
/* 250 */                   I000lI("array");
                            while (true) {
/* 261 */                       if (((I00Ol00) this.I00iiI).I00100o1O0lo(3) && (((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("dup") || ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("readonly") || ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("def"))) {
                                    break;
                                } else {
/* 438 */                           ((I00Ol00) this.I00iiI).I00100l0();
                                }
                            }
/* 315 */                   HashMap map = new HashMap();
/* 326 */                   while (((I00Ol00) this.I00iiI).I00100o1O0lo(3) && ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("dup")) {
/* 344 */                       I000iOII(3, "dup");
/* 351 */                       int iI00000oIO2 = I000OiO(6).I00000oIO();
/* 359 */                       String str10 = I000OiO(4).I00000oIO;
/* 363 */                       I000iOII(3, "put");
/* 370 */                       map.put(Integer.valueOf(iI00000oIO2), str10);
                            }
/* 376 */                   OoIoiiol0o ooIoiiol0o14 = (OoIoiiol0o) this.I00iiO;
/* 381 */                   IIIOII iiioii = new IIIOII(5);
/* 396 */                   for (Map.Entry entry2 : map.entrySet()) {
/* 420 */                       iiioii.I0000O(((Integer) entry2.getKey()).intValue(), (String) entry2.getValue());
                            }
/* 424 */                   ooIoiiol0o14.I00iiI = iiioii;
/* 426 */                   I000lI("readonly");
/* 429 */                   I000iOII(3, "def");
                        }
                    }
/* 919 */           I000lI("currentdict");
/* 922 */           I000iOII(3, "end");
/* 927 */           I000iOII(3, "currentfile");
/* 932 */           I000iOII(3, "eexec");
                }

                public Oo1IiOllo0iI I000OiO(int i) throws IOException {
/* 5 */             Oo1IiOllo0iI oo1IiOllo0iII00100l0 = ((I00Ol00) this.I00iiI).I00100l0();
/* 9 */             if (oo1IiOllo0iII00100l0 != null && oo1IiOllo0iII00100l0.I0000Il00O == i) {
/* 15 */                return oo1IiOllo0iII00100l0;
                    }
/* 22 */            StringBuilder sb = new StringBuilder("Found ");
/* 25 */            sb.append(oo1IiOllo0iII00100l0);
/* 28 */            String strI001lloI = Oi010OO0.I001lloI(i);
/* 34 */            sb.append(" but expected ");
/* 37 */            sb.append(strI001lloI);
/* 49 */            throw new IOException(sb.toString());
                }

                public void I000iOII(int i, String str) throws IOException {
/* 1 */             Oo1IiOllo0iI oo1IiOllo0iII000OiO = I000OiO(i);
/* 5 */             String str2 = oo1IiOllo0iII000OiO.I00000oIO;
/* 7 */             if (str2 == null || !str2.equals(str)) {
/* 20 */                IoOOl0iOl1io.I000OiO("Found ", oo1IiOllo0iII000OiO, " but expected ", str);
                    }
                }

                public void I000l1() throws IOException {
/* 3 */             I000lI("readonly");
/* 8 */             I000lI("noaccess");
/* 12 */            Oo1IiOllo0iI oo1IiOllo0iII000OiO = I000OiO(3);
/* 16 */            String str = oo1IiOllo0iII000OiO.I00000oIO;
/* 24 */            if (str.equals("ND") || str.equals("|-")) {
/* 113 */               return;
                    }
/* 39 */            if (str.equals("noaccess")) {
/* 41 */                oo1IiOllo0iII000OiO = I000OiO(3);
                    }
/* 53 */            if (oo1IiOllo0iII000OiO.I00000oIO.equals("def")) {
/* 113 */               return;
                    }
/* 80 */            throw new IOException("Found " + oo1IiOllo0iII000OiO + " but expected ND");
                }

                public Oo1IiOllo0iI I000lI(String str) {
/* 10 */            if (((I00Ol00) this.I00iiI).I00100o1O0lo(3) && ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals(str)) {
/* 32 */                return ((I00Ol00) this.I00iiI).I00100l0();
                    }
/* 37 */            return null;
                }

                public void I000o00OoI0I() throws IOException {
/* 1 */             int i = 1;
                    while (true) {
/* 4 */                 I00Ol00 i00Ol00 = (I00Ol00) this.I00iiI;
/* 10 */                if (((Oo1IiOllo0iI) i00Ol00.I0000O) == null) {
/* 48 */                    IioIoO10iOiI.I000OOo1O("Malformed procedure: missing token");
/* 113 */                   return;
                        }
/* 18 */                if (i00Ol00.I00100o1O0lo(9)) {
/* 20 */                    i++;
                        }
/* 34 */                if (((I00Ol00) this.I00iiI).I00100l0().I0000Il00O == 10 && i - 1 == 0) {
/* 42 */                    I000lI("executeonly");
/* 45 */                    return;
                        }
                    }
                }

                public void I000oI1ioi() throws IOException {
/* 3 */             I000lI("readonly");
/* 7 */             Oo1IiOllo0iI oo1IiOllo0iII000OiO = I000OiO(3);
/* 11 */            String str = oo1IiOllo0iII000OiO.I00000oIO;
/* 19 */            if (str.equals("NP") || str.equals("|")) {
/* 113 */               return;
                    }
/* 36 */            if (str.equals("noaccess")) {
/* 38 */                oo1IiOllo0iII000OiO = I000OiO(3);
                    }
/* 50 */            if (oo1IiOllo0iII000OiO.I00000oIO.equals("put")) {
/* 113 */               return;
                    }
/* 77 */            throw new IOException("Found " + oo1IiOllo0iII000OiO + " but expected NP");
                }

                public HashMap I00100l0() throws IOException {
/* 3 */             HashMap map = new HashMap();
/* 11 */            int iI00000oIO = I000OiO(6).I00000oIO();
/* 18 */            I000iOII(3, "dict");
/* 23 */            I000lI("dup");
/* 28 */            I000iOII(3, "begin");
/* 34 */            for (int i = 0; i < iI00000oIO; i++) {
/* 38 */                I00Ol00 i00Ol00 = (I00Ol00) this.I00iiI;
/* 44 */                if (((Oo1IiOllo0iI) i00Ol00.I0000O) == null) {
                            break;
                        }
/* 51 */                if (i00Ol00.I00100o1O0lo(3) && !((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("end")) {
/* 69 */                    I000OiO(3);
                        }
/* 74 */                I00Ol00 i00Ol002 = (I00Ol00) this.I00iiI;
/* 80 */                if (((Oo1IiOllo0iI) i00Ol002.I0000O) == null || (i00Ol002.I00100o1O0lo(3) && ((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O).I00000oIO.equals("end"))) {
                            break;
                        }
/* 111 */               String str = I000OiO(4).I00000oIO;
/* 113 */               ArrayList arrayListI00100o1O0lo = I00100o1O0lo();
/* 117 */               I000l1();
/* 120 */               map.put(str, arrayListI00100o1O0lo);
                    }
/* 126 */           I000iOII(3, "end");
/* 131 */           I000lI("readonly");
/* 136 */           I000iOII(3, "def");
/* 541 */           return map;
                }

                public ArrayList I00100o1O0lo() throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 10 */            Oo1IiOllo0iI oo1IiOllo0iII00100l0 = ((I00Ol00) this.I00iiI).I00100l0();
/* 22 */            if (((Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O) != null) {
/* 26 */                arrayList.add(oo1IiOllo0iII00100l0);
/* 29 */                int i = oo1IiOllo0iII00100l0.I0000Il00O;
/* 37 */                int i2 = 1;
/* 38 */                if (i == 7) {
                            while (true) {
/* 42 */                        I00Ol00 i00Ol00 = (I00Ol00) this.I00iiI;
/* 48 */                        if (((Oo1IiOllo0iI) i00Ol00.I0000O) == null) {
                                    break;
                                }
/* 56 */                        if (i00Ol00.I00100o1O0lo(7)) {
/* 58 */                            i2++;
                                }
/* 64 */                        Oo1IiOllo0iI oo1IiOllo0iII00100l02 = ((I00Ol00) this.I00iiI).I00100l0();
/* 68 */                        arrayList.add(oo1IiOllo0iII00100l02);
/* 75 */                        if (oo1IiOllo0iII00100l02.I0000Il00O == 8 && i2 - 1 == 0) {
                                    break;
                                }
                            }
                        } else if (i == 9) {
/* 86 */                    ArrayList arrayList2 = new ArrayList();
                            while (true) {
/* 91 */                        I00Ol00 i00Ol002 = (I00Ol00) this.I00iiI;
/* 97 */                        if (((Oo1IiOllo0iI) i00Ol002.I0000O) == null) {
/* 143 */                           IioIoO10iOiI.I000OOo1O("Malformed procedure: missing token");
/* 31 */                            return null;
                                }
/* 103 */                       if (i00Ol002.I00100o1O0lo(9)) {
/* 105 */                           i2++;
                                }
/* 111 */                       Oo1IiOllo0iI oo1IiOllo0iII00100l03 = ((I00Ol00) this.I00iiI).I00100l0();
/* 115 */                       arrayList2.add(oo1IiOllo0iII00100l03);
/* 120 */                       if (oo1IiOllo0iII00100l03.I0000Il00O == 10 && i2 - 1 == 0) {
/* 128 */                           Oo1IiOllo0iI oo1IiOllo0iII000lI = I000lI("executeonly");
/* 132 */                           if (oo1IiOllo0iII000lI != null) {
/* 134 */                               arrayList2.add(oo1IiOllo0iII000lI);
                                    }
/* 137 */                           arrayList.addAll(arrayList2);
                                }
                            }
                        } else if (i == 11) {
/* 153 */                   I000OiO(12);
/* 156 */                   return arrayList;
                        }
/* 163 */               Oo1IiOllo0iI oo1IiOllo0iI = (Oo1IiOllo0iI) ((I00Ol00) this.I00iiI).I0000O;
/* 165 */               if (oo1IiOllo0iI == null) {
/* 238 */                   IioIoO10iOiI.I000OOo1O("Missing start token for the system dictionary");
/* 31 */                    return null;
                        }
/* 175 */               if ("systemdict".equals(oo1IiOllo0iI.I00000oIO)) {
/* 178 */                   I000iOII(3, "systemdict");
/* 184 */                   I000iOII(4, "internaldict");
/* 189 */                   I000iOII(3, "known");
/* 192 */                   I000OiO(9);
/* 195 */                   I000o00OoI0I();
/* 198 */                   I000OiO(9);
/* 201 */                   I000o00OoI0I();
/* 206 */                   I000iOII(3, "ifelse");
/* 209 */                   I000OiO(9);
/* 214 */                   I000iOII(3, "pop");
/* 217 */                   arrayList.clear();
/* 224 */                   arrayList.addAll(I00100o1O0lo());
/* 227 */                   I000OiO(10);
/* 232 */                   I000iOII(3, "if");
                        }
                    }
/* 235 */           return arrayList;
                }

                public void I0010I0i(boolean z, Status status) {
                    HashMap map;
                    HashMap map2;
/* 3 */             Map map3 = (Map) this.I00iiI;
                    synchronized (map3) {
/* 8 */                 map = new HashMap(map3);
                    }
/* 14 */            Map map4 = (Map) this.I00iiO;
                    synchronized (map4) {
/* 19 */                map2 = new HashMap(map4);
                    }
/* 35 */            for (Map.Entry entry : map.entrySet()) {
/* 43 */                if (z || ((Boolean) entry.getValue()).booleanValue()) {
/* 62 */                    entry.getKey().getClass();
/* 65 */                    OIiilo1Ool0o.I00000oIO();
/* 68 */                    return;
                        }
                    }
/* 81 */            for (Map.Entry entry2 : map2.entrySet()) {
/* 89 */                if (z || ((Boolean) entry2.getValue()).booleanValue()) {
/* 114 */                   ((OloIlI0ll) entry2.getKey()).I0000Il00O(new I11OiOl(status));
                        }
                    }
                }

                public li1OooOo0OO I0010o(boolean z, String str, int i) {
/* 3 */             AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.I00iiI;
/* 9 */             li1OooOo0OO li1ooooo0oo = (li1OooOo0OO) atomicReferenceArray.get(i);
/* 11 */            if (li1ooooo0oo != null) {
/* 215 */               return li1ooooo0oo;
                    }
/* 17 */            li0I1IiiOi li0i1iiioiI00000oOI = ((i0OI1l1Oo) this.I00iiO).I00000oOI(str, z);
/* 26 */            if (atomicReferenceArray.compareAndSet(i, null, li0i1iiioiI00000oOI)) {
/* 37 */                return li0i1iiioiI00000oOI;
                    }
/* 32 */            li1OooOo0OO li1ooooo0oo2 = (li1OooOo0OO) atomicReferenceArray.get(i);
/* 34 */            li1ooooo0oo2.getClass();
/* 37 */            return li1ooooo0oo2;
                }

                public li1OooOo0OO I00111O(int i, long j, String str) {
/* 3 */             AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.I00iiI;
/* 9 */             li1OooOo0OO li1ooooo0oo = (li1OooOo0OO) atomicReferenceArray.get(i);
                    li1OooOo0OO li1ooooo0oo2 = li1ooooo0oo;
/* 11 */            if (li1ooooo0oo == null) {
/* 23 */                li0oli1 li0oli1Var = new li0oli1(str, (IOoi01o) ((i0OI1l1Oo) this.I00iiO).I00iOIl);
/* 26 */                li0oli1Var.I00ilO0 = j;
/* 28 */                VarHandle.storeStoreFence();
/* 32 */                boolean zCompareAndSet = atomicReferenceArray.compareAndSet(i, null, li0oli1Var);
                        li1ooooo0oo2 = li0oli1Var;
/* 36 */                if (!zCompareAndSet) {
/* 42 */                    li1OooOo0OO li1ooooo0oo3 = (li1OooOo0OO) atomicReferenceArray.get(i);
/* 44 */                    li1ooooo0oo3.getClass();
/* 47 */                    return li1ooooo0oo3;
                        }
                    }
/* 215 */           return li1ooooo0oo2;
                }

                public synchronized void I001IIilI0O(int i, long j, long j2) {
/* 6 */             AtomicLong atomicLong = (AtomicLong) this.I00iiO;
/* 8 */             long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 20 */            if (atomicLong.get() != -1 && jElapsedRealtime - ((AtomicLong) this.I00iiO).get() <= 1800000) {
/* 41 */                return;
                    }
/* 79 */            o0IiOl o0iiolI0000Il00O = ((i0i01Ii0iII) this.I00iiI).I0000Il00O(new OloOI1o(0, Arrays.asList(new O1lli10oolO(25503, i, 0, j, j2, null, null, 0, -1))));
/* 86 */            Io1OIO1l0o io1OIO1l0o = new Io1OIO1l0o(5);
/* 89 */            io1OIO1l0o.I00iiO = this;
/* 91 */            io1OIO1l0o.I00iiI = jElapsedRealtime;
/* 93 */            VarHandle.storeStoreFence();
/* 96 */            o0iiolI0000Il00O.I0000Il00O(io1OIO1l0o);
                }

                public li1OooOo0OO I001IO000(String str, int i, String str2) {
/* 3 */             AtomicReferenceArray atomicReferenceArray = (AtomicReferenceArray) this.I00iiI;
/* 9 */             li1OooOo0OO li1ooooo0oo = (li1OooOo0OO) atomicReferenceArray.get(i);
/* 11 */            if (li1ooooo0oo != null) {
/* 215 */               return li1ooooo0oo;
                    }
/* 17 */            li1IIolo li1iioloI000II = ((i0OI1l1Oo) this.I00iiO).I000II(str, str2);
/* 26 */            if (atomicReferenceArray.compareAndSet(i, null, li1iioloI000II)) {
/* 37 */                return li1iioloI000II;
                    }
/* 32 */            li1OooOo0OO li1ooooo0oo2 = (li1OooOo0OO) atomicReferenceArray.get(i);
/* 34 */            li1ooooo0oo2.getClass();
/* 37 */            return li1ooooo0oo2;
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
                    switch (this.I00iOIl) {
                        case 10:
/* 84 */                    ilOI1I0lloOl iloi1i0llool = (ilOI1I0lloOl) this.I00iiI;
                            try {
/* 95 */                        liiiOl01O liiiol01oI00000oIO = iloi1i0llool.I00000oIO(((il011ilOliio) this.I00iiO).I00000oIO, new iiOIOI(iIiOOI));
/* 101 */                       iiI1IlI iii1ili = new iiI1IlI(0);
/* 104 */                       iii1ili.I00iiI = liiiol01oI00000oIO;
/* 106 */                       VarHandle.storeStoreFence();
/* 111 */                       iIiOOI.I00000oIO(iii1ili, iloi1i0llool.I0000O);
                                break;
                            } catch (RemoteException e) {
/* 131 */                       iIiOOI.I0000O(iOlI0O0iIiO.I0000Il00O(6, e, "Failed to prepare inference engine"));
/* 6 */                         return null;
                            } catch (RuntimeException e2) {
/* 123 */                       iIiOOI.I0000O(iOlI0O0iIiO.I0000Il00O(0, e2, "Failed to prepare inference engine"));
/* 6 */                         return null;
                            }
                        default:
/* 13 */                    ioii01Ii100 ioii01ii100 = (ioii01Ii100) this.I00iiI;
/* 17 */                    l00Oi001i1l l00oi001i1l = (l00Oi001i1l) this.I00iiO;
                            try {
/* 31 */                        iOio1i0 ioio1i0I0000O = ioii01ii100.I0000O(l00oi001i1l.I00000oIO, new io0O1l(ioii01ii100, iIiOOI, 1));
/* 37 */                        io1O1OoO1 io1o1ooo1 = new io1O1OoO1(1);
/* 40 */                        io1o1ooo1.I00iiI = ioio1i0I0000O;
/* 42 */                        VarHandle.storeStoreFence();
/* 47 */                        iIiOOI.I00000oIO(io1o1ooo1, ioii01ii100.I0000O);
                                break;
                            } catch (RemoteException e3) {
/* 66 */                        Log.e("ioii01Ii100", "Failed to prepare inference engine.", e3);
/* 73 */                        iIiOOI.I0000O(ilIoOl.I0000Il00O(6, e3, "Failed to prepare inference engine."));
/* 6 */                         return null;
                            } catch (RuntimeException e4) {
/* 55 */                        Log.e("ioii01Ii100", "Failed to prepare inference engine.", e4);
/* 62 */                        iIiOOI.I0000O(ilIoOl.I0000Il00O(0, e4, "Failed to prepare inference engine."));
/* 6 */                         return null;
                            }
                    }
/* 6 */             return null;
                }

                @Override
                public Object get() {
/* 17 */            return ((I1oIIooI) ((l1Il1IliOI1l) this.I00iiI).I00iOIl).I00000oIO(((i1lIIl01O) this.I00iiO).I000oI1ioi());
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 13 */            ((Map) ((OoIol00Ool) this.I00iiO).I00iiO).remove((OloIlI0ll) this.I00iiI);
                }

                @Override
                public String zzc() {
                    String str;
/* 9 */             iOl1111iO iol1111io = ((o01l1ioOo0) this.I00iiI).I001i1lo1io().I00000oIO;
                    return (iol1111io == null || (str = iol1111io.I0000O) == null || str.isEmpty()) ? "NA" : str;
                }

                @Override
                public byte[] zzd(int i) {
/* 1 */             i1O01oOIoI0I i1o01ooioi0i = i1O01oOIoI0I.I00ol1;
/* 5 */             o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) this.I00iiI;
/* 23 */            ((OOoo1il) this.I00iiO).I000OOo1O = Boolean.valueOf(1 == (i ^ 1));
/* 27 */            OOoo1il oOoo1il = (OOoo1il) this.I00iiO;
/* 31 */            oOoo1il.I000II = Boolean.FALSE;
/* 37 */            o01l1iooo0.I00iOIl = oOoo1il.I000OiO();
                    try {
/* 39 */                iOloo0O0O.I000l1();
/* 42 */                if (i == 0) {
/* 44 */                    iOO010illOlI ioo010illoliI001i1lo1io = o01l1iooo0.I001i1lo1io();
/* 50 */                    O01IiIi1l o01IiIi1l = new O01IiIi1l();
/* 53 */                    i1o01ooioi0i.configure(o01IiIi1l);
/* 56 */                    o01IiIi1l.I0000O = true;
/* 68 */                    return o01IiIi1l.I00000oIO().I000l1(ioo010illoliI001i1lo1io).getBytes("utf-8");
                        }
/* 73 */                iOO010illOlI ioo010illoliI001i1lo1io2 = o01l1iooo0.I001i1lo1io();
/* 80 */                iio0oIll1 iio0oill1 = new iio0oIll1(2);
/* 85 */                HashMap map = new HashMap();
/* 88 */                iio0oill1.I00000oOI = map;
/* 92 */                HashMap map2 = new HashMap();
/* 95 */                iio0oill1.I0000Il00O = map2;
/* 97 */                l0iO10io0IOO l0io10io0ioo = iio0oIll1.I0001Ioi1lo;
/* 99 */                VarHandle.storeStoreFence();
/* 102 */               i1o01ooioi0i.configure(iio0oill1);
/* 109 */               HashMap map3 = new HashMap(map);
/* 114 */               HashMap map4 = new HashMap(map2);
/* 117 */               l1Il1IliOI1l l1il1ilioi1l = new l1Il1IliOI1l();
/* 120 */               l1il1ilioi1l.I00iOIl = map3;
/* 122 */               l1il1ilioi1l.I00iiI = map4;
/* 124 */               l1il1ilioi1l.I00iiO = l0io10io0ioo;
/* 126 */               VarHandle.storeStoreFence();
/* 129 */               return l1il1ilioi1l.I0000oI00(ioo010illoliI001i1lo1io2);
                    } catch (UnsupportedEncodingException e) {
/* 186 */               throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
                    }
                }

/* 17 */        public OoIol00Ool(int i) {
/* 18 */            this.I00iOIl = i;
                }

/* 18 */        public OoIol00Ool(OoIol00Ool ooIol00Ool, Oo0OI01Il oo0OI01Il) {
                    this.I00iOIl = 1;
                    this.I00iiI = ooIol00Ool;
                    this.I00iiO = oo0OI01Il;
                }
            }
