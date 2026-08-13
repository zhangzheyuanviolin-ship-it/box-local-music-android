            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OOOo0i11Ol extends Io000liOIo {
                public static final OOOo0i11Ol I0100i;
                public static final O0II0llIl I0100o111I = new O0II0llIl(18);
                public IIOII1 I00iiI;
                public int I00iiO;
                public int I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public OOi001oo1OOI I00io1l;
                public int I00ioIO;
                public List I00l0I0l0lO1;
                public OOi001oo1OOI I00l0OO0IO;
                public int I00li1OI;
                public List I00ll1;
                public List I00lli11;
                public List I00o0iI0io1;
                public OOi0iiO0iOi I00o0l1o1o0;
                public int I00o101lO;
                public int I00oI0i;
                public List I00oII;
                public List I00oIiI10;
                public List I00oO101o;
                public List I00oOio10iI1;
                public List I00ol1;
                public List I00olI;
                public List I00oli;
                public List I00oliIiO01i;
                public OOOilI I00oo1iO0ll;
                public OOOilI I00ooIo0;
                public int I00lll10 = -1;
                public byte I00ooiO1I = -1;
                public int I00oooO = -1;

                static {
/* 12 */            OOOo0i11Ol oOOo0i11Ol = new OOOo0i11Ol();
/* 16 */            oOOo0i11Ol.I00lll10 = -1;
/* 18 */            oOOo0i11Ol.I00ooiO1I = (byte) -1;
/* 20 */            oOOo0i11Ol.I00oooO = -1;
/* 24 */            oOOo0i11Ol.I00iiI = IIOII1.I00iOIl;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            I0100i = oOOo0i11Ol;
/* 31 */            oOOo0i11Ol.I00100o1O0lo();
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
                /* JADX WARN: Type inference failed for: r7v11 */
                /* JADX WARN: Type inference failed for: r7v13 */
                /* JADX WARN: Type inference failed for: r7v15 */
                /* JADX WARN: Type inference failed for: r7v17 */
                /* JADX WARN: Type inference failed for: r7v19 */
                /* JADX WARN: Type inference failed for: r7v21 */
                /* JADX WARN: Type inference failed for: r7v23 */
                /* JADX WARN: Type inference failed for: r7v25 */
                /* JADX WARN: Type inference failed for: r7v27 */
                /* JADX WARN: Type inference failed for: r7v29 */
                /* JADX WARN: Type inference failed for: r7v3 */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v7 */
                /* JADX WARN: Type inference failed for: r7v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public OOOo0i11Ol(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
                    OOi0i1i oOi0i1iI000O01llI0;
/* 17 */            I00100o1O0lo();
/* 20 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 24 */            boolean z = true;
/* 25 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 29 */            boolean z2 = false;
/* 30 */            char c = 0;
                    while (true) {
/* 40 */                boolean z3 = z;
/* 50 */                if (z2) {
/* 1101 */                  if (((c == true ? 1 : 0) & 32) == 32) {
/* 1109 */                      this.I00l0I0l0lO1 = Collections.unmodifiableList(this.I00l0I0l0lO1);
                            }
/* 1115 */                  if (((c == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
/* 1123 */                      this.I00ll1 = Collections.unmodifiableList(this.I00ll1);
                            }
/* 1129 */                  if (((c == true ? 1 : 0) & Barcode.FORMAT_UPC_A) == 512) {
/* 1137 */                      this.I00lli11 = Collections.unmodifiableList(this.I00lli11);
                            }
/* 1143 */                  if (((c == true ? 1 : 0) & 65536) == 65536) {
/* 1151 */                      this.I00oO101o = Collections.unmodifiableList(this.I00oO101o);
                            }
/* 1157 */                  if (((c == true ? 1 : 0) & 131072) == 131072) {
/* 1165 */                      this.I00oOio10iI1 = Collections.unmodifiableList(this.I00oOio10iI1);
                            }
/* 1171 */                  if (((c == true ? 1 : 0) & 262144) == 262144) {
/* 1179 */                      this.I00ol1 = Collections.unmodifiableList(this.I00ol1);
                            }
/* 1183 */                  if (((c == true ? 1 : 0) & Barcode.FORMAT_UPC_E) == 1024) {
/* 1191 */                      this.I00o0iI0io1 = Collections.unmodifiableList(this.I00o0iI0io1);
                            }
/* 1195 */                  if (((c == true ? 1 : 0) & 16384) == 16384) {
/* 1203 */                      this.I00oII = Collections.unmodifiableList(this.I00oII);
                            }
/* 1207 */                  if (((c == true ? 1 : 0) & 32768) == 32768) {
/* 1215 */                      this.I00oIiI10 = Collections.unmodifiableList(this.I00oIiI10);
                            }
/* 1219 */                  if (((c == true ? 1 : 0) & 524288) == 524288) {
/* 1227 */                      this.I00olI = Collections.unmodifiableList(this.I00olI);
                            }
/* 1231 */                  if (((c == true ? 1 : 0) & 1048576) == 1048576) {
/* 1239 */                      this.I00oli = Collections.unmodifiableList(this.I00oli);
                            }
/* 1243 */                  if (((c == true ? 1 : 0) & 2097152) == 2097152) {
/* 1251 */                      this.I00oliIiO01i = Collections.unmodifiableList(this.I00oliIiO01i);
                            }
                            try {
/* 1253 */                      i1I1OO00o1oI00111O.I000l1();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
/* 1268 */                      this.I00iiI = iIOI0o10I000lI.I000II();
/* 1270 */                      throw th;
                            }
/* 1260 */                  this.I00iiI = iIOI0o10I000lI.I000II();
/* 1271 */                  I000lI();
/* 1274 */                  return;
                        }
                        try {
                            try {
/* 52 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 56 */                        OOOiOi0o oOOiOi0oI000OOo1O = null;
/* 56 */                        OOOiOi0o oOOiOi0oI000OOo1O2 = null;
/* 56 */                        OOOoooI oOOoooII0010o = null;
/* 56 */                        OOOoooI oOOoooII0010o2 = null;
                                switch (iI000o00OoI0I) {
                                    case 0:
/* 67 */                                z2 = z3;
/* 900 */                               z = z3;
                                        c = c;
                                    case 8:
                                        this.I00iiO |= 2;
/* 898 */                               this.I00ilI0I1 = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case 16:
                                        this.I00iiO |= 4;
/* 885 */                               this.I00ilO0 = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case PoseLandmark.RIGHT_KNEE:
/* 835 */                               if ((this.I00iiO & 8) == 8) {
/* 837 */                                   OOi001oo1OOI oOi001oo1OOI = this.I00io1l;
/* 839 */                                   oOi001oo1OOI.getClass();
/* 842 */                                   oOOoooII0010o2 = OOi001oo1OOI.I0010o(oOi001oo1OOI);
                                        }
/* 846 */                               OOOoooI oOOoooI = oOOoooII0010o2;
/* 854 */                               OOi001oo1OOI oOi001oo1OOI2 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 856 */                               this.I00io1l = oOi001oo1OOI2;
/* 858 */                               if (oOOoooI != null) {
/* 860 */                                   oOOoooI.I000OOo1O(oOi001oo1OOI2);
/* 867 */                                   this.I00io1l = oOOoooI.I000II();
                                        }
                                        this.I00iiO |= 8;
/* 900 */                               z = z3;
                                        c = c;
                                    case 34:
/* 803 */                               int i = (c == true ? 1 : 0) & 32;
                                        c = c;
/* 807 */                               if (i != 32) {
/* 814 */                                   this.I00l0I0l0lO1 = new ArrayList();
/* 816 */                                   c = (c == true ? 1 : 0) | ' ';
                                        }
/* 826 */                               this.I00l0I0l0lO1.add(iOOOIOiO0io1.I000II(OOi0O1i1lOi.I00o0iI0io1, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 42:
/* 760 */                               if ((this.I00iiO & 32) == 32) {
/* 762 */                                   OOi001oo1OOI oOi001oo1OOI3 = this.I00l0OO0IO;
/* 764 */                                   oOi001oo1OOI3.getClass();
/* 767 */                                   oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI3);
                                        }
/* 771 */                               OOOoooI oOOoooI2 = oOOoooII0010o;
/* 779 */                               OOi001oo1OOI oOi001oo1OOI4 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 781 */                               this.I00l0OO0IO = oOi001oo1OOI4;
/* 783 */                               if (oOOoooI2 != null) {
/* 785 */                                   oOOoooI2.I000OOo1O(oOi001oo1OOI4);
/* 792 */                                   this.I00l0OO0IO = oOOoooI2.I000II();
                                        }
                                        this.I00iiO |= 32;
/* 900 */                               z = z3;
                                        c = c;
                                    case 50:
/* 709 */                               if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 711 */                                   OOi0iiO0iOi oOi0iiO0iOi = this.I00o0l1o1o0;
/* 713 */                                   oOi0iiO0iOi.getClass();
/* 716 */                                   oOi0i1iI000O01llI0 = OOi0i1i.I000O01llI0();
/* 720 */                                   oOi0i1iI000O01llI0.I000OOo1O(oOi0iiO0iOi);
                                        } else {
/* 724 */                                   oOi0i1iI000O01llI0 = null;
                                        }
/* 732 */                               OOi0iiO0iOi oOi0iiO0iOi2 = (OOi0iiO0iOi) iOOOIOiO0io1.I000II(OOi0iiO0iOi.I00o0iI0io1, il1lll0iI);
/* 734 */                               this.I00o0l1o1o0 = oOi0iiO0iOi2;
/* 736 */                               if (oOi0i1iI000O01llI0 != null) {
/* 738 */                                   oOi0i1iI000O01llI0.I000OOo1O(oOi0iiO0iOi2);
/* 745 */                                   this.I00o0l1o1o0 = oOi0i1iI000O01llI0.I000II();
                                        }
                                        this.I00iiO |= Barcode.FORMAT_ITF;
/* 900 */                               z = z3;
                                        c = c;
                                    case 56:
                                        this.I00iiO |= Barcode.FORMAT_QR_CODE;
/* 700 */                               this.I00o101lO = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case Barcode.FORMAT_EAN_8:
                                        this.I00iiO |= Barcode.FORMAT_UPC_A;
/* 685 */                               this.I00oI0i = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case 72:
                                        this.I00iiO |= 16;
/* 670 */                               this.I00ioIO = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case 80:
                                        this.I00iiO |= 64;
/* 656 */                               this.I00li1OI = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case 88:
                                        this.I00iiO |= 1;
/* 642 */                               this.I00iio = iOOOIOiO0io1.I000iOII();
/* 900 */                               z = z3;
                                        c = c;
                                    case 98:
/* 604 */                               int i2 = (c == true ? 1 : 0) & Barcode.FORMAT_QR_CODE;
                                        c = c;
/* 608 */                               if (i2 != 256) {
/* 615 */                                   this.I00ll1 = new ArrayList();
/* 617 */                                   c = (c == true ? 1 : 0) | 256;
                                        }
/* 627 */                               this.I00ll1.add(iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 104:
/* 574 */                               int i3 = (c == true ? 1 : 0) & Barcode.FORMAT_UPC_A;
                                        c = c;
/* 578 */                               if (i3 != 512) {
/* 585 */                                   this.I00lli11 = new ArrayList();
/* 587 */                                   c = (c == true ? 1 : 0) | 512;
                                        }
/* 599 */                               this.I00lli11.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
/* 900 */                               z = z3;
                                        c = c;
                                    case 106:
/* 524 */                               int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 528 */                               int i4 = (c == true ? 1 : 0) & Barcode.FORMAT_UPC_A;
                                        c = c;
/* 532 */                               if (i4 != 512) {
                                            c = c;
/* 538 */                                   if (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 545 */                                       this.I00lli11 = new ArrayList();
/* 547 */                                       c = (c == true ? 1 : 0) | 512;
                                            }
                                        }
/* 553 */                               while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 565 */                                   this.I00lli11.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                        }
/* 569 */                               iOOOIOiO0io1.I0000O(iI0000oI00);
/* 900 */                               z = z3;
                                        c = c;
                                    case 114:
/* 493 */                               int i5 = (c == true ? 1 : 0) & 65536;
                                        c = c;
/* 497 */                               if (i5 != 65536) {
/* 504 */                                   this.I00oO101o = new ArrayList();
/* 506 */                                   c = (c == true ? 1 : 0) | 0;
                                        }
/* 515 */                               this.I00oO101o.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 122:
/* 466 */                               int i6 = (c == true ? 1 : 0) & 131072;
                                        c = c;
/* 470 */                               if (i6 != 131072) {
/* 477 */                                   this.I00oOio10iI1 = new ArrayList();
/* 479 */                                   c = (c == true ? 1 : 0) | 0;
                                        }
/* 488 */                               this.I00oOio10iI1.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 130:
/* 437 */                               int i7 = (c == true ? 1 : 0) & 262144;
                                        c = c;
/* 441 */                               if (i7 != 262144) {
/* 448 */                                   this.I00ol1 = new ArrayList();
/* 450 */                                   c = (c == true ? 1 : 0) | 0;
                                        }
/* 459 */                               this.I00ol1.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 138:
/* 407 */                               int i8 = (c == true ? 1 : 0) & Barcode.FORMAT_UPC_E;
                                        c = c;
/* 409 */                               if (i8 != 1024) {
/* 416 */                                   this.I00o0iI0io1 = new ArrayList();
/* 418 */                                   c = (c == true ? 1 : 0) | 1024;
                                        }
/* 428 */                               this.I00o0iI0io1.add(iOOOIOiO0io1.I000II(OOi0iiO0iOi.I00o0iI0io1, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 248:
/* 375 */                               int i9 = (c == true ? 1 : 0) & 16384;
                                        c = c;
/* 377 */                               if (i9 != 16384) {
/* 384 */                                   this.I00oII = new ArrayList();
/* 386 */                                   c = (c == true ? 1 : 0) | 16384;
                                        }
/* 398 */                               this.I00oII.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
/* 900 */                               z = z3;
                                        c = c;
                                    case 250:
/* 323 */                               int iI0000oI002 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 327 */                               int i10 = (c == true ? 1 : 0) & 16384;
                                        c = c;
/* 329 */                               if (i10 != 16384) {
                                            c = c;
/* 335 */                                   if (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 342 */                                       this.I00oII = new ArrayList();
/* 344 */                                       c = (c == true ? 1 : 0) | 16384;
                                            }
                                        }
/* 350 */                               while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 362 */                                   this.I00oII.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                        }
/* 366 */                               iOOOIOiO0io1.I0000O(iI0000oI002);
/* 900 */                               z = z3;
                                        c = c;
                                    case 258:
/* 290 */                               int i11 = (c == true ? 1 : 0) & 32768;
                                        c = c;
/* 292 */                               if (i11 != 32768) {
/* 299 */                                   this.I00oIiI10 = new ArrayList();
/* 301 */                                   c = (c == true ? 1 : 0) | 32768;
                                        }
/* 310 */                               this.I00oIiI10.add(iOOOIOiO0io1.I000II(OOOi1IIOOO01.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 266:
/* 261 */                               int i12 = (c == true ? 1 : 0) & 524288;
                                        c = c;
/* 263 */                               if (i12 != 524288) {
/* 270 */                                   this.I00olI = new ArrayList();
/* 272 */                                   c = (c == true ? 1 : 0) | 0;
                                        }
/* 281 */                               this.I00olI.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 274:
/* 232 */                               int i13 = (c == true ? 1 : 0) & 1048576;
                                        c = c;
/* 234 */                               if (i13 != 1048576) {
/* 241 */                                   this.I00oli = new ArrayList();
/* 243 */                                   c = (c == true ? 1 : 0) | 0;
                                        }
/* 252 */                               this.I00oli.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 282:
/* 203 */                               int i14 = (c == true ? 1 : 0) & 2097152;
                                        c = c;
/* 205 */                               if (i14 != 2097152) {
/* 212 */                                   this.I00oliIiO01i = new ArrayList();
/* 214 */                                   c = (c == true ? 1 : 0) | 0;
                                        }
/* 223 */                               this.I00oliIiO01i.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 900 */                               z = z3;
                                        c = c;
                                    case 322:
/* 158 */                               if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024) {
/* 160 */                                   OOOilI oOOilI = this.I00oo1iO0ll;
/* 162 */                                   oOOilI.getClass();
/* 165 */                                   oOOiOi0oI000OOo1O2 = OOOilI.I000OOo1O(oOOilI);
                                        }
/* 169 */                               OOOiOi0o oOOiOi0o = oOOiOi0oI000OOo1O2;
/* 177 */                               OOOilI oOOilI2 = (OOOilI) iOOOIOiO0io1.I000II(OOOilI.I00ilO0, il1lll0iI);
/* 179 */                               this.I00oo1iO0ll = oOOilI2;
/* 181 */                               if (oOOiOi0o != null) {
/* 183 */                                   oOOiOi0o.I000OiO(oOOilI2);
/* 190 */                                   this.I00oo1iO0ll = oOOiOi0o.I0001Ioi1lo();
                                        }
                                        this.I00iiO |= Barcode.FORMAT_UPC_E;
/* 900 */                               z = z3;
                                        c = c;
                                    case 330:
                                        try {
/* 87 */                                    if ((this.I00iiO & Barcode.FORMAT_PDF417) == 2048) {
/* 89 */                                        OOOilI oOOilI3 = this.I00ooIo0;
/* 91 */                                        oOOilI3.getClass();
/* 94 */                                        oOOiOi0oI000OOo1O = OOOilI.I000OOo1O(oOOilI3);
                                            }
/* 98 */                                    OOOiOi0o oOOiOi0o2 = oOOiOi0oI000OOo1O;
/* 108 */                                   OOOilI oOOilI4 = (OOOilI) iOOOIOiO0io1.I000II(OOOilI.I00ilO0, il1lll0iI);
/* 110 */                                   this.I00ooIo0 = oOOilI4;
/* 112 */                                   if (oOOiOi0o2 != null) {
/* 114 */                                       oOOiOi0o2.I000OiO(oOOilI4);
/* 121 */                                       this.I00ooIo0 = oOOiOi0o2.I0001Ioi1lo();
                                            }
                                            this.I00iiO |= Barcode.FORMAT_PDF417;
/* 900 */                                   z = z3;
                                            c = c;
                                        } catch (O001110li e) {
/* 144 */                                   e = e;
/* 916 */                                   e.I00iOIl = this;
/* 918 */                                   throw e;
                                        } catch (IOException e2) {
/* 137 */                                   e = e2;
/* 910 */                                   O001110li o001110li = new O001110li(e.getMessage());
/* 913 */                                   o001110li.I00iOIl = this;
/* 915 */                                   throw o001110li;
                                        } catch (Throwable th2) {
/* 130 */                                   th = th2;
/* 923 */                                   if (((c == true ? 1 : 0) & 32) == 32) {
/* 931 */                                       this.I00l0I0l0lO1 = Collections.unmodifiableList(this.I00l0I0l0lO1);
                                            }
/* 937 */                                   if (((c == true ? 1 : 0) & Barcode.FORMAT_QR_CODE) == 256) {
/* 945 */                                       this.I00ll1 = Collections.unmodifiableList(this.I00ll1);
                                            }
/* 951 */                                   if (((c == true ? 1 : 0) & Barcode.FORMAT_UPC_A) == 512) {
/* 959 */                                       this.I00lli11 = Collections.unmodifiableList(this.I00lli11);
                                            }
/* 965 */                                   if (((c == true ? 1 : 0) & 65536) == 65536) {
/* 973 */                                       this.I00oO101o = Collections.unmodifiableList(this.I00oO101o);
                                            }
/* 979 */                                   if (((c == true ? 1 : 0) & 131072) == 131072) {
/* 987 */                                       this.I00oOio10iI1 = Collections.unmodifiableList(this.I00oOio10iI1);
                                            }
/* 993 */                                   if (((c == true ? 1 : 0) & 262144) == 262144) {
/* 1001 */                                      this.I00ol1 = Collections.unmodifiableList(this.I00ol1);
                                            }
/* 1005 */                                  if (((c == true ? 1 : 0) & Barcode.FORMAT_UPC_E) == 1024) {
/* 1013 */                                      this.I00o0iI0io1 = Collections.unmodifiableList(this.I00o0iI0io1);
                                            }
/* 1017 */                                  if (((c == true ? 1 : 0) & 16384) == 16384) {
/* 1025 */                                      this.I00oII = Collections.unmodifiableList(this.I00oII);
                                            }
/* 1029 */                                  if (((c == true ? 1 : 0) & 32768) == 32768) {
/* 1037 */                                      this.I00oIiI10 = Collections.unmodifiableList(this.I00oIiI10);
                                            }
/* 1041 */                                  if (((c == true ? 1 : 0) & 524288) == 524288) {
/* 1049 */                                      this.I00olI = Collections.unmodifiableList(this.I00olI);
                                            }
/* 1053 */                                  if (((c == true ? 1 : 0) & 1048576) == 1048576) {
/* 1061 */                                      this.I00oli = Collections.unmodifiableList(this.I00oli);
                                            }
/* 1065 */                                  if (((c == true ? 1 : 0) & 2097152) == 2097152) {
/* 1073 */                                      this.I00oliIiO01i = Collections.unmodifiableList(this.I00oliIiO01i);
                                            }
                                            try {
/* 1075 */                                      i1I1OO00o1oI00111O.I000l1();
                                            } catch (IOException unused2) {
                                            } catch (Throwable th3) {
/* 1090 */                                      this.I00iiI = iIOI0o10I000lI.I000II();
/* 1092 */                                      throw th3;
                                            }
/* 1082 */                                  this.I00iiI = iIOI0o10I000lI.I000II();
/* 1093 */                                  I000lI();
/* 1096 */                                  throw th;
                                        }
                                    default:
/* 65 */                                if (!I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                        }
/* 900 */                               z = z3;
                                        c = c;
                                        break;
                                }
                            } catch (Throwable th4) {
/* 71 */                        th = th4;
                            }
                        } catch (O001110li e3) {
/* 77 */                    e = e3;
                        } catch (IOException e4) {
/* 74 */                    e = e4;
                        }
                    }
                }

                @Override
                public final I01Ilioliio I00000oIO() {
/* 1 */             return I0100i;
                }

                @Override
                public final boolean I00000oOI() {
/* 1 */             byte b = this.I00ooiO1I;
/* 4 */             if (b == 1) {
/* 3 */                 return true;
                    }
/* 8 */             if (b == 0) {
/* 7 */                 return false;
                    }
/* 11 */            int i = this.I00iiO;
/* 16 */            if ((i & 4) != 4) {
/* 408 */               this.I00ooiO1I = (byte) 0;
/* 7 */                 return false;
                    }
/* 21 */            if ((i & 8) == 8 && !this.I00io1l.I00000oOI()) {
/* 31 */                this.I00ooiO1I = (byte) 0;
/* 7 */                 return false;
                    }
/* 41 */            for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 55 */                if (!((OOi0O1i1lOi) this.I00l0I0l0lO1.get(i2)).I00000oOI()) {
/* 57 */                    this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 68 */            if ((this.I00iiO & 32) == 32 && !this.I00l0OO0IO.I00000oOI()) {
/* 78 */                this.I00ooiO1I = (byte) 0;
/* 7 */                 return false;
                    }
/* 88 */            for (int i3 = 0; i3 < this.I00ll1.size(); i3++) {
/* 102 */               if (!((OOi001oo1OOI) this.I00ll1.get(i3)).I00000oOI()) {
/* 104 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 117 */           for (int i4 = 0; i4 < this.I00o0iI0io1.size(); i4++) {
/* 131 */               if (!((OOi0iiO0iOi) this.I00o0iI0io1.get(i4)).I00000oOI()) {
/* 133 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 144 */           if ((this.I00iiO & Barcode.FORMAT_ITF) == 128 && !this.I00o0l1o1o0.I00000oOI()) {
/* 154 */               this.I00ooiO1I = (byte) 0;
/* 7 */                 return false;
                    }
/* 164 */           for (int i5 = 0; i5 < this.I00oIiI10.size(); i5++) {
/* 178 */               if (!((OOOi1IIOOO01) this.I00oIiI10.get(i5)).I00000oOI()) {
/* 180 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 193 */           for (int i6 = 0; i6 < this.I00oO101o.size(); i6++) {
/* 207 */               if (!((OOOi000ooO) this.I00oO101o.get(i6)).I00000oOI()) {
/* 209 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 222 */           for (int i7 = 0; i7 < this.I00oOio10iI1.size(); i7++) {
/* 236 */               if (!((OOOi000ooO) this.I00oOio10iI1.get(i7)).I00000oOI()) {
/* 238 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 251 */           for (int i8 = 0; i8 < this.I00ol1.size(); i8++) {
/* 265 */               if (!((OOOi000ooO) this.I00ol1.get(i8)).I00000oOI()) {
/* 267 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 280 */           for (int i9 = 0; i9 < this.I00olI.size(); i9++) {
/* 294 */               if (!((OOOi000ooO) this.I00olI.get(i9)).I00000oOI()) {
/* 296 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 309 */           for (int i10 = 0; i10 < this.I00oli.size(); i10++) {
/* 323 */               if (!((OOOi000ooO) this.I00oli.get(i10)).I00000oOI()) {
/* 325 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 338 */           for (int i11 = 0; i11 < this.I00oliIiO01i.size(); i11++) {
/* 352 */               if (!((OOOi000ooO) this.I00oliIiO01i.get(i11)).I00000oOI()) {
/* 354 */                   this.I00ooiO1I = (byte) 0;
/* 7 */                     return false;
                        }
                    }
/* 365 */           if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024 && !this.I00oo1iO0ll.I00000oOI()) {
/* 375 */               this.I00ooiO1I = (byte) 0;
/* 7 */                 return false;
                    }
/* 383 */           if ((this.I00iiO & Barcode.FORMAT_PDF417) == 2048 && !this.I00ooIo0.I00000oOI()) {
/* 393 */               this.I00ooiO1I = (byte) 0;
/* 7 */                 return false;
                    }
/* 400 */           if (I000OOo1O()) {
/* 405 */               this.I00ooiO1I = (byte) 1;
/* 3 */                 return true;
                    }
/* 402 */           this.I00ooiO1I = (byte) 0;
/* 7 */             return false;
                }

                @Override
                public final int I0000Il00O() {
                    List list;
                    List list2;
/* 1 */             int i = this.I00oooO;
/* 4 */             if (i != -1) {
/* 6 */                 return i;
                    }
/* 22 */            int iI0000oI00 = (this.I00iiO & 2) == 2 ? I1I1OO00o1o.I0000oI00(1, this.I00ilI0I1) : 0;
/* 27 */            if ((this.I00iiO & 4) == 4) {
/* 35 */                iI0000oI00 += I1I1OO00o1o.I0000oI00(2, this.I00ilO0);
                    }
/* 41 */            if ((this.I00iiO & 8) == 8) {
/* 50 */                iI0000oI00 += I1I1OO00o1o.I000II(3, this.I00io1l);
                    }
/* 58 */            for (int i2 = 0; i2 < this.I00l0I0l0lO1.size(); i2++) {
/* 72 */                iI0000oI00 += I1I1OO00o1o.I000II(4, (I01Ilioliio) this.I00l0I0l0lO1.get(i2));
                    }
/* 81 */            if ((this.I00iiO & 32) == 32) {
/* 90 */                iI0000oI00 += I1I1OO00o1o.I000II(5, this.I00l0OO0IO);
                    }
/* 96 */            if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 105 */               iI0000oI00 += I1I1OO00o1o.I000II(6, this.I00o0l1o1o0);
                    }
/* 111 */           if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 120 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(7, this.I00o101lO);
                    }
/* 126 */           if ((this.I00iiO & Barcode.FORMAT_UPC_A) == 512) {
/* 134 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(8, this.I00oI0i);
                    }
/* 140 */           if ((this.I00iiO & 16) == 16) {
/* 150 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(9, this.I00ioIO);
                    }
/* 156 */           if ((this.I00iiO & 64) == 64) {
/* 166 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(10, this.I00li1OI);
                    }
/* 170 */           if ((this.I00iiO & 1) == 1) {
/* 180 */               iI0000oI00 += I1I1OO00o1o.I0000oI00(11, this.I00iio);
                    }
/* 188 */           for (int i3 = 0; i3 < this.I00ll1.size(); i3++) {
/* 204 */               iI0000oI00 += I1I1OO00o1o.I000II(12, (I01Ilioliio) this.I00ll1.get(i3));
                    }
/* 208 */           int i4 = 0;
/* 209 */           int iI0001Ioi1lo = 0;
                    while (true) {
/* 212 */               int size = this.I00lli11.size();
/* 216 */               list = this.I00lli11;
/* 218 */               if (i4 >= size) {
                            break;
                        }
/* 234 */               iI0001Ioi1lo += I1I1OO00o1o.I0001Ioi1lo(((Integer) list.get(i4)).intValue());
/* 235 */               i4++;
                    }
/* 238 */           int iI000II = iI0000oI00 + iI0001Ioi1lo;
/* 243 */           if (!list.isEmpty()) {
/* 251 */               iI000II = iI000II + 1 + I1I1OO00o1o.I0001Ioi1lo(iI0001Ioi1lo);
                    }
/* 252 */           this.I00lll10 = iI0001Ioi1lo;
/* 261 */           for (int i5 = 0; i5 < this.I00oO101o.size(); i5++) {
/* 277 */               iI000II += I1I1OO00o1o.I000II(14, (I01Ilioliio) this.I00oO101o.get(i5));
                    }
/* 288 */           for (int i6 = 0; i6 < this.I00oOio10iI1.size(); i6++) {
/* 304 */               iI000II += I1I1OO00o1o.I000II(15, (I01Ilioliio) this.I00oOio10iI1.get(i6));
                    }
/* 315 */           for (int i7 = 0; i7 < this.I00ol1.size(); i7++) {
/* 329 */               iI000II += I1I1OO00o1o.I000II(16, (I01Ilioliio) this.I00ol1.get(i7));
                    }
/* 340 */           for (int i8 = 0; i8 < this.I00o0iI0io1.size(); i8++) {
/* 356 */               iI000II += I1I1OO00o1o.I000II(17, (I01Ilioliio) this.I00o0iI0io1.get(i8));
                    }
/* 360 */           int i9 = 0;
/* 361 */           int iI0001Ioi1lo2 = 0;
                    while (true) {
/* 364 */               int size2 = this.I00oII.size();
/* 368 */               list2 = this.I00oII;
/* 370 */               if (i9 >= size2) {
                            break;
                        }
/* 386 */               iI0001Ioi1lo2 += I1I1OO00o1o.I0001Ioi1lo(((Integer) list2.get(i9)).intValue());
/* 387 */               i9++;
                    }
/* 396 */           int size3 = (list2.size() * 2) + iI000II + iI0001Ioi1lo2;
/* 404 */           for (int i10 = 0; i10 < this.I00oIiI10.size(); i10++) {
/* 418 */               size3 += I1I1OO00o1o.I000II(32, (I01Ilioliio) this.I00oIiI10.get(i10));
                    }
/* 429 */           for (int i11 = 0; i11 < this.I00olI.size(); i11++) {
/* 445 */               size3 += I1I1OO00o1o.I000II(33, (I01Ilioliio) this.I00olI.get(i11));
                    }
/* 456 */           for (int i12 = 0; i12 < this.I00oli.size(); i12++) {
/* 472 */               size3 += I1I1OO00o1o.I000II(34, (I01Ilioliio) this.I00oli.get(i12));
                    }
/* 482 */           for (int i13 = 0; i13 < this.I00oliIiO01i.size(); i13++) {
/* 498 */               size3 += I1I1OO00o1o.I000II(35, (I01Ilioliio) this.I00oliIiO01i.get(i13));
                    }
/* 507 */           if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024) {
/* 517 */               size3 += I1I1OO00o1o.I000II(40, this.I00oo1iO0ll);
                    }
/* 523 */           if ((this.I00iiO & Barcode.FORMAT_PDF417) == 2048) {
/* 533 */               size3 += I1I1OO00o1o.I000II(41, this.I00ooIo0);
                    }
/* 545 */           int size4 = this.I00iiI.size() + I000OiO() + size3;
/* 546 */           this.I00oooO = size4;
/* 2840 */          return size4;
                }

                @Override
                public final Ilooool1l0 I0000O() {
/* 1 */             return OOOo0OI01l.I000O01llI0();
                }

                @Override
                public final Ilooool1l0 I0000oI00() {
/* 1 */             OOOo0OI01l oOOo0OI01lI000O01llI0 = OOOo0OI01l.I000O01llI0();
/* 5 */             oOOo0OI01lI000O01llI0.I000OOo1O(this);
/* 29 */            return oOOo0OI01lI000O01llI0;
                }

                @Override
                public final void I0001Ioi1lo(I1I1OO00o1o i1I1OO00o1o) throws IOException {
/* 1 */             I0000Il00O();
/* 4 */             OlOO1i11110 olOO1i11110I000o00OoI0I = I000o00OoI0I();
/* 13 */            if ((this.I00iiO & 2) == 2) {
/* 17 */                i1I1OO00o1o.I001lllioOl(1, this.I00ilI0I1);
                    }
/* 24 */            if ((this.I00iiO & 4) == 4) {
/* 28 */                i1I1OO00o1o.I001lllioOl(2, this.I00ilO0);
                    }
/* 36 */            if ((this.I00iiO & 8) == 8) {
/* 41 */                i1I1OO00o1o.I00II0Ol1O0l(3, this.I00io1l);
                    }
/* 52 */            for (int i = 0; i < this.I00l0I0l0lO1.size(); i++) {
/* 62 */                i1I1OO00o1o.I00II0Ol1O0l(4, (I01Ilioliio) this.I00l0I0l0lO1.get(i));
                    }
/* 73 */            if ((this.I00iiO & 32) == 32) {
/* 78 */                i1I1OO00o1o.I00II0Ol1O0l(5, this.I00l0OO0IO);
                    }
/* 86 */            if ((this.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 91 */                i1I1OO00o1o.I00II0Ol1O0l(6, this.I00o0l1o1o0);
                    }
/* 99 */            if ((this.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 104 */               i1I1OO00o1o.I001lllioOl(7, this.I00o101lO);
                    }
/* 112 */           if ((this.I00iiO & Barcode.FORMAT_UPC_A) == 512) {
/* 116 */               i1I1OO00o1o.I001lllioOl(8, this.I00oI0i);
                    }
/* 124 */           if ((this.I00iiO & 16) == 16) {
/* 130 */               i1I1OO00o1o.I001lllioOl(9, this.I00ioIO);
                    }
/* 138 */           if ((this.I00iiO & 64) == 64) {
/* 144 */               i1I1OO00o1o.I001lllioOl(10, this.I00li1OI);
                    }
/* 150 */           if ((this.I00iiO & 1) == 1) {
/* 156 */               i1I1OO00o1o.I001lllioOl(11, this.I00iio);
                    }
/* 166 */           for (int i2 = 0; i2 < this.I00ll1.size(); i2++) {
/* 178 */               i1I1OO00o1o.I00II0Ol1O0l(12, (I01Ilioliio) this.I00ll1.get(i2));
                    }
/* 190 */           if (this.I00lli11.size() > 0) {
/* 194 */               i1I1OO00o1o.I00Io1lO(106);
/* 199 */               i1I1OO00o1o.I00Io1lO(this.I00lll10);
                    }
/* 209 */           for (int i3 = 0; i3 < this.I00lli11.size(); i3++) {
/* 223 */               i1I1OO00o1o.I001lloI(((Integer) this.I00lli11.get(i3)).intValue());
                    }
/* 236 */           for (int i4 = 0; i4 < this.I00oO101o.size(); i4++) {
/* 248 */               i1I1OO00o1o.I00II0Ol1O0l(14, (I01Ilioliio) this.I00oO101o.get(i4));
                    }
/* 261 */           for (int i5 = 0; i5 < this.I00oOio10iI1.size(); i5++) {
/* 273 */               i1I1OO00o1o.I00II0Ol1O0l(15, (I01Ilioliio) this.I00oOio10iI1.get(i5));
                    }
/* 286 */           for (int i6 = 0; i6 < this.I00ol1.size(); i6++) {
/* 296 */               i1I1OO00o1o.I00II0Ol1O0l(16, (I01Ilioliio) this.I00ol1.get(i6));
                    }
/* 309 */           for (int i7 = 0; i7 < this.I00o0iI0io1.size(); i7++) {
/* 321 */               i1I1OO00o1o.I00II0Ol1O0l(17, (I01Ilioliio) this.I00o0iI0io1.get(i7));
                    }
/* 334 */           for (int i8 = 0; i8 < this.I00oII.size(); i8++) {
/* 350 */               i1I1OO00o1o.I001lllioOl(31, ((Integer) this.I00oII.get(i8)).intValue());
                    }
/* 363 */           for (int i9 = 0; i9 < this.I00oIiI10.size(); i9++) {
/* 373 */               i1I1OO00o1o.I00II0Ol1O0l(32, (I01Ilioliio) this.I00oIiI10.get(i9));
                    }
/* 386 */           for (int i10 = 0; i10 < this.I00olI.size(); i10++) {
/* 398 */               i1I1OO00o1o.I00II0Ol1O0l(33, (I01Ilioliio) this.I00olI.get(i10));
                    }
/* 411 */           for (int i11 = 0; i11 < this.I00oli.size(); i11++) {
/* 423 */               i1I1OO00o1o.I00II0Ol1O0l(34, (I01Ilioliio) this.I00oli.get(i11));
                    }
/* 435 */           for (int i12 = 0; i12 < this.I00oliIiO01i.size(); i12++) {
/* 447 */               i1I1OO00o1o.I00II0Ol1O0l(35, (I01Ilioliio) this.I00oliIiO01i.get(i12));
                    }
/* 458 */           if ((this.I00iiO & Barcode.FORMAT_UPC_E) == 1024) {
/* 464 */               i1I1OO00o1o.I00II0Ol1O0l(40, this.I00oo1iO0ll);
                    }
/* 472 */           if ((this.I00iiO & Barcode.FORMAT_PDF417) == 2048) {
/* 478 */               i1I1OO00o1o.I00II0Ol1O0l(41, this.I00ooIo0);
                    }
/* 483 */           olOO1i11110I000o00OoI0I.I001iOo1i0O(19000, i1I1OO00o1o);
/* 488 */           i1I1OO00o1o.I00IO1oi11O(this.I00iiI);
                }

                public final void I00100o1O0lo() {
/* 3 */             this.I00iio = 518;
/* 7 */             this.I00ilI0I1 = 2054;
/* 10 */            this.I00ilO0 = 0;
/* 12 */            OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 14 */            this.I00io1l = oOi001oo1OOI;
/* 16 */            this.I00ioIO = 0;
/* 18 */            List list = Collections.EMPTY_LIST;
/* 20 */            this.I00l0I0l0lO1 = list;
/* 22 */            this.I00l0OO0IO = oOi001oo1OOI;
/* 24 */            this.I00li1OI = 0;
/* 26 */            this.I00ll1 = list;
/* 28 */            this.I00lli11 = list;
/* 30 */            this.I00o0iI0io1 = list;
/* 34 */            this.I00o0l1o1o0 = OOi0iiO0iOi.I00lll10;
/* 36 */            this.I00o101lO = 0;
/* 38 */            this.I00oI0i = 0;
/* 40 */            this.I00oII = list;
/* 42 */            this.I00oIiI10 = list;
/* 44 */            this.I00oO101o = list;
/* 46 */            this.I00oOio10iI1 = list;
/* 48 */            this.I00ol1 = list;
/* 50 */            this.I00olI = list;
/* 52 */            this.I00oli = list;
/* 54 */            this.I00oliIiO01i = list;
/* 56 */            OOOilI oOOilI = OOOilI.I00ilI0I1;
/* 58 */            this.I00oo1iO0ll = oOOilI;
/* 60 */            this.I00ooIo0 = oOOilI;
                }
            }
