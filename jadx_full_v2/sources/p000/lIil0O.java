            package p000;

            import android.content.Context;
            import android.net.Uri;
            import android.os.Build;
            import android.os.StrictMode;
            import android.util.Log;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedReader;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            
            public abstract class lIil0O {
                public static volatile OIiiIl0iO I00000oIO;

                public static final int I00000oIO(int i) {
/* 27 */            return IlO1il.I00000oOI(IlO1il.I0000Il00O.I0000oI00(i).booleanValue(), (OOi110) IlO1il.I0000O.I0000oI00(i), (OOOlloIl1Oio) IlO1il.I0000oI00.I0000oI00(i));
                }

                public static final I1ii1o0 I00000oOI(int i, O111ol0lilll o111ol0lilll) {
                    IiO0O0 iiO0O0;
                    I1ii1o0 i1ii1o0;
                    O0i11O1 o0i11O1;
                    O0i10o01olo o0i10o01olo;
/* 5 */             boolean z = false;
/* 6 */             I1ii1o0 i1ii1o02 = new I1ii1o0(10, z);
/* 11 */            OI1IlOlol oI1IlOlol = (OI1IlOlol) o111ol0lilll.I00iiI;
/* 23 */            OOi0lO oOi0lO = (OOi0lO) IOOi0Ool1i.I00II0oii1o(i, ((OooO111lO1OI) o111ol0lilll.I00iio).I00000oIO);
/* 25 */            OooO0oI1 oooO0oI1 = OooO0oI1.I0000O;
/* 31 */            if (oOi0lO == null) {
/* 33 */                i1ii1o0 = null;
                    } else {
/* 48 */                Integer numValueOf = (oOi0lO.I00iiI & 1) == 1 ? Integer.valueOf(oOi0lO.I00iiO) : null;
/* 61 */                Integer numValueOf2 = (oOi0lO.I00iiI & 2) == 2 ? Integer.valueOf(oOi0lO.I00iio) : null;
/* 124 */               OooO0oI1 oooO0oI12 = numValueOf2 != null ? new OooO0oI1(numValueOf2.intValue() & 255, (numValueOf2.intValue() >> 8) & 255, (numValueOf2.intValue() >> 16) & 255) : numValueOf != null ? new OooO0oI1(numValueOf.intValue() & 7, (numValueOf.intValue() >> 3) & 15, (numValueOf.intValue() >> 7) & 127) : oooO0oI1;
/* 127 */               int iOrdinal = oOi0lO.I00ilI0I1.ordinal();
/* 131 */               if (iOrdinal == 0) {
/* 147 */                   iiO0O0 = IiO0O0.I00iOIl;
                        } else if (iOrdinal == 1) {
/* 144 */                   iiO0O0 = IiO0O0.I00iiI;
                        } else {
/* 135 */                   if (iOrdinal != 2) {
/* 140 */                       I000II.I00000oIO();
/* 30 */                        return null;
                            }
/* 137 */                   iiO0O0 = IiO0O0.I00iiO;
                        }
/* 161 */               Integer numValueOf3 = (oOi0lO.I00iiI & 8) == 8 ? Integer.valueOf(oOi0lO.I00ilO0) : null;
/* 174 */               String string = (oOi0lO.I00iiI & 16) == 16 ? oI1IlOlol.getString(oOi0lO.I00io1l) : null;
/* 177 */               OOi0l1Oi oOi0l1Oi = oOi0lO.I00ioIO;
/* 181 */               i1ii1o0 = new I1ii1o0(19, z);
/* 184 */               i1ii1o0.I00iiI = oooO0oI12;
/* 186 */               i1ii1o0.I00iiO = oOi0l1Oi;
/* 188 */               i1ii1o0.I00iio = iiO0O0;
/* 190 */               i1ii1o0.I00ilI0I1 = numValueOf3;
/* 192 */               i1ii1o0.I00ilO0 = string;
/* 194 */               VarHandle.storeStoreFence();
                    }
/* 197 */           if (i1ii1o0 == null && !o111ol0lilll.I00iOIl) {
/* 211 */               throw new IoOoiol010lI("No VersionRequirement with the given id in the table", null);
                    }
/* 219 */           OOi0l1Oi oOi0l1Oi2 = i1ii1o0 != null ? (OOi0l1Oi) i1ii1o0.I00iiO : null;
/* 231 */           int i2 = oOi0l1Oi2 == null ? -1 : OOlOi10IoO.I00000oIO[oOi0l1Oi2.ordinal()];
/* 233 */           if (i2 == -1) {
/* 254 */               o0i11O1 = O0i11O1.I00iio;
                    } else if (i2 == 1) {
/* 251 */               o0i11O1 = O0i11O1.I00iOIl;
                    } else if (i2 == 2) {
/* 248 */               o0i11O1 = O0i11O1.I00iiI;
                    } else {
/* 239 */               if (i2 != 3) {
/* 244 */                   I000II.I00000oIO();
/* 30 */                    return null;
                        }
/* 241 */               o0i11O1 = O0i11O1.I00iiO;
                    }
/* 263 */           IiO0O0 iiO0O02 = i1ii1o0 != null ? (IiO0O0) i1ii1o0.I00iio : null;
/* 274 */           int i3 = iiO0O02 == null ? -1 : OOlOi10IoO.I00000oOI[iiO0O02.ordinal()];
/* 276 */           if (i3 == -1) {
/* 295 */               o0i10o01olo = O0i10o01olo.I00iiO;
                    } else if (i3 == 1) {
/* 292 */               o0i10o01olo = O0i10o01olo.I00iOIl;
                    } else if (i3 != 2) {
/* 282 */               if (i3 != 3) {
/* 285 */                   I000II.I00000oIO();
/* 30 */                    return null;
                        }
/* 295 */               o0i10o01olo = O0i10o01olo.I00iiO;
                    } else {
/* 289 */               o0i10o01olo = O0i10o01olo.I00iiI;
                    }
/* 297 */           i1ii1o02.I00iiI = o0i11O1;
/* 299 */           i1ii1o02.I00iiO = o0i10o01olo;
/* 309 */           i1ii1o02.I00iio = i1ii1o0 != null ? (Integer) i1ii1o0.I00ilI0I1 : null;
/* 318 */           i1ii1o02.I00ilI0I1 = i1ii1o0 != null ? (String) i1ii1o0.I00ilO0 : null;
/* 320 */           if (i1ii1o0 != null) {
/* 325 */               oooO0oI1 = (OooO0oI1) i1ii1o0.I00iiI;
                    }
/* 327 */           int i4 = oooO0oI1.I00000oIO;
/* 329 */           int i5 = oooO0oI1.I00000oOI;
/* 331 */           int i6 = oooO0oI1.I0000Il00O;
/* 335 */           O0i0oolI o0i0oolI = new O0i0oolI();
/* 338 */           o0i0oolI.I00000oIO = i4;
/* 340 */           o0i0oolI.I00000oOI = i5;
/* 342 */           o0i0oolI.I0000Il00O = i6;
/* 344 */           VarHandle.storeStoreFence();
/* 347 */           i1ii1o02.I00ilO0 = o0i0oolI;
/* 551 */           return i1ii1o02;
                }

                /* JADX WARN: Removed duplicated region for block: B:97:0x02e5  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static O0OoII0ii1li I0000Il00O(OOOi0i1IOo oOOi0i1IOo, OI1IlOlol oI1IlOlol, boolean z, int i) {
/* 3 */             boolean z2 = false;
/* 8 */             boolean z3 = (i & 2) != 0 ? false : z;
/* 11 */            O0OoII0ii1li o0OoII0ii1li = new O0OoII0ii1li();
/* 20 */            Oi0Oooi oi0Oooi = new Oi0Oooi(oOOi0i1IOo.I00oo1iO0ll);
/* 23 */            OooO111lO1OI oooO111lO1OI = OooO111lO1OI.I00000oOI;
/* 41 */            O111ol0lilll o111ol0lilllI0000Il00O = new O111ol0lilll(oI1IlOlol, oi0Oooi, li1i10.I00000oIO(oOOi0i1IOo.I00ooiO1I), z3, Il01100l.I00iOIl, 16).I0000Il00O(oOOi0i1IOo.I00io1l);
/* 47 */            OI1IlOlol oI1IlOlol2 = (OI1IlOlol) o111ol0lilllI0000Il00O.I00iiI;
/* 51 */            List list = (List) o111ol0lilllI0000Il00O.I00ioIO;
/* 55 */            Oi0Oooi oi0Oooi2 = (Oi0Oooi) o111ol0lilllI0000Il00O.I00iiO;
/* 59 */            o0OoII0ii1li.I00000oIO = oOOi0i1IOo.I00iio;
/* 67 */            o0OoII0ii1li.I00000oOI = lIil0I0il.I00000oIO(oI1IlOlol2, oOOi0i1IOo.I00ilI0I1);
/* 73 */            Iterator it = oOOi0i1IOo.I00io1l.iterator();
/* 81 */            while (it.hasNext()) {
/* 95 */                o0OoII0ii1li.I0000Il00O.add(I000O01llI0((OOi0O1i1lOi) it.next(), o111ol0lilllI0000Il00O));
                    }
/* 105 */           Iterator it2 = lIOOli.I000OOo1O(oOOi0i1IOo, oi0Oooi2).iterator();
/* 113 */           while (it2.hasNext()) {
/* 127 */               o0OoII0ii1li.I0000O.add(I000II((OOi001oo1OOI) it2.next(), o111ol0lilllI0000Il00O));
                    }
/* 143 */           for (OOOiIOiii oOOiIOiii : oOOi0i1IOo.I00o0l1o1o0) {
/* 153 */               int i2 = oOOiIOiii.I00iio;
/* 155 */               O0Ool0iil o0Ool0iil = new O0Ool0iil();
/* 158 */               o0Ool0iil.I00000oIO = i2;
/* 165 */               o0Ool0iil.I00000oOI = new ArrayList();
/* 172 */               o0Ool0iil.I0000Il00O = new ArrayList(0);
/* 179 */               o0Ool0iil.I0000O = new ArrayList(0);
/* 183 */               O1li00Io.I00000oIO.getClass();
/* 186 */               List listI00000oIO = O1lOolo.I00000oIO();
/* 200 */               ArrayList arrayList = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 203 */               Iterator it3 = listI00000oIO.iterator();
/* 211 */               while (it3.hasNext()) {
/* 221 */                   ((O0I1Oo1oIO) ((O1li00Io) it3.next())).getClass();
/* 229 */                   arrayList.add(new O0I0olOli1o());
                        }
/* 233 */               o0Ool0iil.I0000oI00 = arrayList;
/* 235 */               VarHandle.storeStoreFence();
/* 238 */               List list2 = oOOiIOiii.I00ilI0I1;
/* 242 */               ArrayList arrayList2 = o0Ool0iil.I00000oOI;
/* 244 */               Iterator it4 = list2.iterator();
/* 252 */               while (it4.hasNext()) {
/* 264 */                   arrayList2.add(I000OOo1O((OOi0iiO0iOi) it4.next(), o111ol0lilllI0000Il00O));
                        }
/* 268 */               List list3 = oOOiIOiii.I00ilO0;
/* 272 */               ArrayList arrayList3 = o0Ool0iil.I0000Il00O;
/* 274 */               Iterator it5 = list3.iterator();
/* 282 */               while (it5.hasNext()) {
/* 298 */                   arrayList3.add(I00000oOI(((Integer) it5.next()).intValue(), o111ol0lilllI0000Il00O));
                        }
/* 305 */               Iterator it6 = list.iterator();
/* 313 */               while (it6.hasNext()) {
/* 323 */                   ((O0I1Oo1oIO) ((O1li00Io) it6.next())).getClass();
/* 336 */                   List list4 = oOOiIOiii.I00ioIO;
/* 340 */                   ArrayList arrayList4 = o0Ool0iil.I0000O;
/* 342 */                   Iterator it7 = list4.iterator();
/* 350 */                   while (it7.hasNext()) {
/* 362 */                       arrayList4.add(lIil0I0il.I00000oOI((OOOi000ooO) it7.next(), oI1IlOlol2));
                            }
/* 366 */                   Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 368 */                   O0IO00o0OI0.I00000oIO(oOOiIOiii, oI1IlOlol2, oi0Oooi2);
                        }
/* 374 */               o0OoII0ii1li.I000O01llI0.add(o0Ool0iil);
                    }
/* 385 */           I000OiO(o0OoII0ii1li, oOOi0i1IOo.I00o101lO, oOOi0i1IOo.I00oI0i, oOOi0i1IOo.I00oII, o111ol0lilllI0000Il00O);
/* 392 */           if ((oOOi0i1IOo.I00iiO & 4) == 4) {
/* 396 */               oI1IlOlol2.getString(oOOi0i1IOo.I00ilO0);
                    }
/* 403 */           Iterator it8 = oOOi0i1IOo.I00li1OI.iterator();
/* 411 */           while (it8.hasNext()) {
/* 429 */               o0OoII0ii1li.I000OOo1O.add(oI1IlOlol2.getString(((Integer) it8.next()).intValue()));
                    }
/* 435 */           Iterator it9 = oOOi0i1IOo.I00oIiI10.iterator();
                    while (true) {
/* 445 */               if (!it9.hasNext()) {
/* 603 */                   Iterator it10 = oOOi0i1IOo.I00oO101o.iterator();
/* 611 */                   while (it10.hasNext()) {
/* 629 */                       o0OoII0ii1li.I000l1.add(lIil0I0il.I00000oIO(oI1IlOlol2, ((Integer) it10.next()).intValue()));
                            }
/* 638 */                   if ((oOOi0i1IOo.I00iiO & 8) == 8) {
/* 642 */                       oI1IlOlol2.getString(oOOi0i1IOo.I00ol1);
                            }
/* 645 */                   int i3 = oOOi0i1IOo.I00iiO;
/* 668 */                   OOi001oo1OOI oOi001oo1OOII00100l0 = (i3 & 16) == 16 ? oOOi0i1IOo.I00olI : (i3 & 32) == 32 ? oi0Oooi2.I00100l0(oOOi0i1IOo.I00oli) : null;
/* 669 */                   if (oOi001oo1OOII00100l0 == null) {
/* 675 */                       if ((oOOi0i1IOo.I00iiO & 8) == 8) {
/* 681 */                           Iterator it11 = oOOi0i1IOo.I00oI0i.iterator();
/* 685 */                           Object obj = null;
                                    while (true) {
/* 690 */                               if (it11.hasNext()) {
/* 692 */                                   Object next = it11.next();
/* 697 */                                   OOOo0i11Ol oOOo0i11Ol = (OOOo0i11Ol) next;
/* 703 */                                   if (lIOOli.I0001Ioi1lo(oOOo0i11Ol, oi0Oooi2) == null && oI1IlOlol2.getString(oOOo0i11Ol.I00ilO0).equals(oI1IlOlol2.getString(oOOi0i1IOo.I00ol1))) {
/* 723 */                                       if (z2) {
                                                    break;
                                                }
/* 727 */                                       z2 = true;
/* 728 */                                       obj = next;
                                            }
                                        } else if (!z2) {
                                            break;
                                        }
                                    }
/* 725 */                           obj = null;
/* 733 */                           OOOo0i11Ol oOOo0i11Ol2 = (OOOo0i11Ol) obj;
/* 742 */                           oOi001oo1OOII00100l0 = oOOo0i11Ol2 != null ? lIOOli.I000O01llI0(oOOo0i11Ol2, oi0Oooi2) : null;
                                }
                            }
/* 749 */                   o0OoII0ii1li.I000lI = oOi001oo1OOII00100l0 != null ? I000II(oOi001oo1OOII00100l0, o111ol0lilllI0000Il00O) : null;
/* 757 */                   Iterator it12 = lIOOli.I00000oIO(oOOi0i1IOo, oi0Oooi2).iterator();
/* 765 */                   while (it12.hasNext()) {
/* 779 */                       o0OoII0ii1li.I000oI1ioi.add(I000II((OOi001oo1OOI) it12.next(), o111ol0lilllI0000Il00O));
                            }
/* 787 */                   Iterator it13 = oOOi0i1IOo.I00ooIo0.iterator();
/* 795 */                   while (it13.hasNext()) {
/* 813 */                       o0OoII0ii1li.I00100l0.add(I00000oOI(((Integer) it13.next()).intValue(), o111ol0lilllI0000Il00O));
                            }
/* 819 */                   Iterator it14 = list.iterator();
/* 827 */                   while (it14.hasNext()) {
/* 837 */                       ((O0I1Oo1oIO) ((O1li00Io) it14.next())).getClass();
/* 848 */                       O0I0oOlIi0O o0I0oOlIi0O = (O0I0oOlIi0O) ilO01lO.I00000oIO(o0OoII0ii1li.I00100o1O0lo, O0I0oOlIi0O.I00000oOI);
/* 854 */                       Iterator it15 = oOOi0i1IOo.I00oliIiO01i.iterator();
/* 862 */                       while (it15.hasNext()) {
/* 876 */                           o0OoII0ii1li.I000o00OoI0I.add(lIil0I0il.I00000oOI((OOOi000ooO) it15.next(), oI1IlOlol2));
                                }
/* 886 */                       Integer num = (Integer) lIOIiol1IoI.I00000oIO(oOOi0i1IOo, O0IIoOIiII0O.I000OOo1O);
/* 888 */                       if (num != null) {
/* 894 */                           oI1IlOlol2.getString(num.intValue());
                                }
/* 905 */                       Iterator it16 = ((List) oOOi0i1IOo.I000iOII(O0IIoOIiII0O.I000O01llI0)).iterator();
/* 913 */                       while (it16.hasNext()) {
/* 927 */                           o0I0oOlIi0O.I00000oIO.add(I0001Ioi1lo((OOOo0i11Ol) it16.next(), o111ol0lilllI0000Il00O));
                                }
/* 937 */                       Integer num2 = (Integer) lIOIiol1IoI.I00000oIO(oOOi0i1IOo, O0IIoOIiII0O.I000II);
/* 939 */                       if (num2 != null) {
/* 945 */                           oI1IlOlol2.getString(num2.intValue());
                                }
                            }
/* 958 */                   return o0OoII0ii1li;
                        }
/* 451 */               OOOl0lIlIoil oOOl0lIlIoil = (OOOl0lIlIoil) it9.next();
/* 456 */               if ((oOOl0lIlIoil.I00iiO & 1) != 1) {
/* 598 */                   throw new IoOoiol010lI("No name for EnumEntry", null);
                        }
/* 466 */               o0OoII0ii1li.I000OiO.add(oI1IlOlol2.getString(oOOl0lIlIoil.I00iio));
/* 473 */               String string = oI1IlOlol2.getString(oOOl0lIlIoil.I00iio);
/* 479 */               IoloOio0I ioloOio0I = new IoloOio0I(17);
/* 482 */               ioloOio0I.I00iiI = string;
/* 489 */               ioloOio0I.I00iiO = new ArrayList(0);
/* 493 */               O1li00Io.I00000oIO.getClass();
/* 496 */               List listI00000oIO2 = O1lOolo.I00000oIO();
/* 504 */               new ArrayList();
/* 507 */               Iterator it17 = listI00000oIO2.iterator();
/* 515 */               while (it17.hasNext()) {
/* 523 */                   ((O1li00Io) it17.next()).getClass();
                        }
/* 527 */               VarHandle.storeStoreFence();
/* 533 */               Iterator it18 = list.iterator();
/* 541 */               while (it18.hasNext()) {
/* 551 */                   ((O0I1Oo1oIO) ((O1li00Io) it18.next())).getClass();
/* 556 */                   Iterator it19 = oOOl0lIlIoil.I00ilI0I1.iterator();
/* 564 */                   while (it19.hasNext()) {
/* 580 */                       ((ArrayList) ioloOio0I.I00iiO).add(lIil0I0il.I00000oOI((OOOi000ooO) it19.next(), oI1IlOlol2));
                            }
                        }
/* 586 */               o0OoII0ii1li.I000iOII.add(ioloOio0I);
                    }
                }

                public static final Oi0Oooi I0000O(OOOlOO0IO oOOlOO0IO, O111ol0lilll o111ol0lilll) {
/* 6 */             Oi0Oooi oi0Oooi = new Oi0Oooi(13, false);
/* 11 */            ArrayList arrayList = new ArrayList(0);
/* 19 */            oi0Oooi.I00iiI = new ArrayList(0);
/* 21 */            VarHandle.storeStoreFence();
/* 24 */            int i = oOOlOO0IO.I00iiO;
/* 30 */            OOi001oo1OOI oOi001oo1OOII00100l0 = null;
/* 31 */            if ((oOOlOO0IO.I00iiI & 4) == 4) {
/* 33 */                OOOl1oi oOOl1oi = oOOlOO0IO.I00ilI0I1;
/* 35 */                if (oOOl1oi == null) {
/* 56 */                    I000II.I000iOII("Required value was null.");
/* 30 */                    return null;
                        }
/* 37 */                int iOrdinal = oOOl1oi.ordinal();
/* 41 */                if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
/* 50 */                    I000II.I00000oIO();
/* 30 */                    return null;
                        }
                    }
/* 62 */            Oi0Oooi oi0Oooi2 = (Oi0Oooi) o111ol0lilll.I00iiO;
/* 64 */            int i2 = oOOlOO0IO.I00iiI;
/* 70 */            if ((i2 & 8) == 8) {
/* 72 */                oOi001oo1OOII00100l0 = oOOlOO0IO.I00ilO0;
                    } else if ((i2 & 16) == 16) {
/* 82 */                oOi001oo1OOII00100l0 = oi0Oooi2.I00100l0(oOOlOO0IO.I00io1l);
                    }
/* 86 */            if (oOi001oo1OOII00100l0 != null) {
/* 88 */                I000II(oOi001oo1OOII00100l0, o111ol0lilll);
                    }
/* 95 */            Iterator it = oOOlOO0IO.I00ioIO.iterator();
/* 103 */           while (it.hasNext()) {
/* 115 */               arrayList.add(I0000O((OOOlOO0IO) it.next(), o111ol0lilll));
                    }
/* 119 */           List list = oOOlOO0IO.I00l0I0l0lO1;
/* 125 */           ArrayList arrayList2 = (ArrayList) oi0Oooi.I00iiI;
/* 127 */           Iterator it2 = list.iterator();
/* 135 */           while (it2.hasNext()) {
/* 147 */               arrayList2.add(I0000O((OOOlOO0IO) it2.next(), o111ol0lilll));
                    }
/* 551 */           return oi0Oooi;
                }

                public static final O0i01Ii01IiI I0000oI00(OOOll1o0 oOOll1o0, O111ol0lilll o111ol0lilll) {
/* 3 */             int i = oOOll1o0.I00iio;
/* 11 */            ((OI1IlOlol) o111ol0lilll.I00iiI).getString(oOOll1o0.I00ilO0);
/* 14 */            O0i01Ii01IiI o0i01Ii01IiI = new O0i01Ii01IiI();
/* 17 */            o0i01Ii01IiI.I00000oIO = i;
/* 25 */            o0i01Ii01IiI.I00000oOI = new ArrayList(0);
/* 32 */            o0i01Ii01IiI.I0000Il00O = new ArrayList(0);
/* 36 */            new ArrayList(0);
/* 44 */            o0i01Ii01IiI.I0000O = new ArrayList();
/* 48 */            ArrayList arrayList = new ArrayList();
/* 56 */            o0i01Ii01IiI.I0000oI00 = new ArrayList(0);
/* 63 */            o0i01Ii01IiI.I0001Ioi1lo = new ArrayList(0);
/* 67 */            O1li00Io.I00000oIO.getClass();
/* 70 */            List listI00000oIO = O1lOolo.I00000oIO();
/* 84 */            ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 87 */            Iterator it = listI00000oIO.iterator();
/* 95 */            while (it.hasNext()) {
/* 105 */               ((O0I1Oo1oIO) ((O1li00Io) it.next())).getClass();
/* 113 */               arrayList2.add(new O0I10I1I());
                    }
/* 117 */           o0i01Ii01IiI.I000II = arrayList2;
/* 119 */           VarHandle.storeStoreFence();
/* 124 */           O111ol0lilll o111ol0lilllI0000Il00O = o111ol0lilll.I0000Il00O(oOOll1o0.I00l0I0l0lO1);
/* 130 */           OI1IlOlol oI1IlOlol = (OI1IlOlol) o111ol0lilllI0000Il00O.I00iiI;
/* 134 */           Oi0Oooi oi0Oooi = (Oi0Oooi) o111ol0lilllI0000Il00O.I00iiO;
/* 136 */           List list = oOOll1o0.I00l0I0l0lO1;
/* 140 */           ArrayList arrayList3 = o0i01Ii01IiI.I00000oOI;
/* 142 */           Iterator it2 = list.iterator();
/* 150 */           while (it2.hasNext()) {
/* 162 */               arrayList3.add(I000O01llI0((OOi0O1i1lOi) it2.next(), o111ol0lilllI0000Il00O));
                    }
/* 166 */           OOi001oo1OOI oOi001oo1OOII0000oI00 = lIOOli.I0000oI00(oOOll1o0, oi0Oooi);
/* 170 */           if (oOi001oo1OOII0000oI00 != null) {
/* 172 */               I000II(oOi001oo1OOII0000oI00, o111ol0lilllI0000Il00O);
                    }
/* 179 */           Iterator it3 = oOOll1o0.I00o0iI0io1.iterator();
/* 187 */           while (it3.hasNext()) {
/* 199 */               arrayList.add(I000OOo1O((OOi0iiO0iOi) it3.next(), o111ol0lilllI0000Il00O));
                    }
/* 209 */           if (oOOll1o0.I00o0iI0io1.isEmpty() && !oOOll1o0.I00ll1.isEmpty()) {
/* 227 */               Iterator it4 = lIOOli.I00000oOI(oOOll1o0, oi0Oooi).iterator();
/* 235 */               while (it4.hasNext()) {
/* 243 */                   I000II((OOi001oo1OOI) it4.next(), o111ol0lilllI0000Il00O);
/* 251 */                   arrayList.add(new O0i0o1iOoII(0));
                        }
                    }
/* 255 */           List list2 = oOOll1o0.I00o0l1o1o0;
/* 259 */           ArrayList arrayList4 = o0i01Ii01IiI.I0000O;
/* 261 */           Iterator it5 = list2.iterator();
/* 269 */           while (it5.hasNext()) {
/* 281 */               arrayList4.add(I000OOo1O((OOi0iiO0iOi) it5.next(), o111ol0lilllI0000Il00O));
                    }
/* 289 */           I000II(lIOOli.I000II(oOOll1o0, oi0Oooi), o111ol0lilllI0000Il00O);
/* 297 */           if ((oOOll1o0.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 299 */               OOOilI oOOilI = oOOll1o0.I00oII;
/* 304 */               ArrayList arrayList5 = new ArrayList(1);
/* 317 */               for (OOOiooooI1o oOOiooooI1o : oOOilI.I00iiI) {
/* 328 */                   if ((oOOiooooI1o.I00iiI & 1) == 1) {
/* 330 */                       OOOiol0loO1O oOOiol0loO1O = oOOiooooI1o.I00iiO;
/* 335 */                       if (oOOiol0loO1O == null) {
/* 455 */                           I000II.I000iOII("Required value was null.");
/* 332 */                           return null;
                                }
/* 337 */                       int iOrdinal = oOOiol0loO1O.ordinal();
/* 342 */                       if (iOrdinal != 0 && iOrdinal != 1 && iOrdinal != 2) {
/* 351 */                           I000II.I00000oIO();
/* 332 */                           return null;
                                }
/* 348 */                       O0Ooo1I[] o0Ooo1IArr = O0Ooo1I.I00iOIl;
/* 364 */                       if ((oOOiooooI1o.I00iiI & 4) == 4) {
/* 366 */                           OOOiolI oOOiolI = oOOiooooI1o.I00ilO0;
/* 368 */                           if (oOOiolI == null) {
/* 393 */                               I000II.I000iOII("Required value was null.");
/* 332 */                               return null;
                                    }
/* 370 */                           int iOrdinal2 = oOOiolI.ordinal();
/* 374 */                           if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 2) {
/* 383 */                               I000II.I00000oIO();
/* 332 */                               return null;
                                    }
/* 380 */                           O0Ooo0lIlIl[] o0Ooo0lIlIlArr = O0Ooo0lIlIl.I00iOIl;
                                }
/* 401 */                       Iioi0lilII iioi0lilII = new Iioi0lilII(13);
/* 406 */                       ArrayList arrayList6 = new ArrayList(1);
/* 409 */                       VarHandle.storeStoreFence();
/* 416 */                       Iterator it6 = oOOiooooI1o.I00iio.iterator();
/* 424 */                       while (it6.hasNext()) {
/* 436 */                           arrayList6.add(I0000O((OOOlOO0IO) it6.next(), o111ol0lilllI0000Il00O));
                                }
/* 443 */                       if ((oOOiooooI1o.I00iiI & 2) == 2) {
/* 447 */                           I0000O(oOOiooooI1o.I00ilI0I1, o111ol0lilllI0000Il00O);
                                }
/* 450 */                       arrayList5.add(iioi0lilII);
                            }
                        }
                    }
/* 459 */           List list3 = oOOll1o0.I00oI0i;
/* 463 */           ArrayList arrayList7 = o0i01Ii01IiI.I0000oI00;
/* 465 */           Iterator it7 = list3.iterator();
/* 473 */           while (it7.hasNext()) {
/* 489 */               arrayList7.add(I00000oOI(((Integer) it7.next()).intValue(), o111ol0lilllI0000Il00O));
                    }
/* 499 */           Iterator it8 = ((List) o111ol0lilllI0000Il00O.I00ioIO).iterator();
/* 507 */           while (it8.hasNext()) {
/* 517 */               ((O0I1Oo1oIO) ((O1li00Io) it8.next())).getClass();
/* 530 */               List list4 = oOOll1o0.I00oO101o;
/* 534 */               ArrayList arrayList8 = o0i01Ii01IiI.I0001Ioi1lo;
/* 536 */               Iterator it9 = list4.iterator();
/* 544 */               while (it9.hasNext()) {
/* 556 */                   arrayList8.add(lIil0I0il.I00000oOI((OOOi000ooO) it9.next(), oI1IlOlol));
                        }
/* 560 */               List list5 = oOOll1o0.I00oOio10iI1;
/* 564 */               ArrayList arrayList9 = o0i01Ii01IiI.I0000Il00O;
/* 566 */               Iterator it10 = list5.iterator();
/* 574 */               while (it10.hasNext()) {
/* 586 */                   arrayList9.add(lIil0I0il.I00000oOI((OOOi000ooO) it10.next(), oI1IlOlol));
                        }
/* 590 */               Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 592 */               O0IO00o0OI0.I0000Il00O(oOOll1o0, oI1IlOlol, oi0Oooi);
/* 601 */               Integer num = (Integer) lIOIiol1IoI.I00000oIO(oOOll1o0, O0IIoOIiII0O.I0000Il00O);
/* 603 */               if (num != null) {
/* 609 */                   oI1IlOlol.getString(num.intValue());
                        }
                    }
/* 2988 */          return o0i01Ii01IiI;
                }

                public static final O0i0IiI0 I0001Ioi1lo(OOOo0i11Ol oOOo0i11Ol, O111ol0lilll o111ol0lilll) {
/* 3 */             int i = oOOo0i11Ol.I00iio;
/* 11 */            ((OI1IlOlol) o111ol0lilll.I00iiI).getString(oOOo0i11Ol.I00ilO0);
/* 26 */            int iI00000oIO = (oOOo0i11Ol.I00iiO & Barcode.FORMAT_QR_CODE) == 256 ? oOOo0i11Ol.I00o101lO : I00000oIO(oOOo0i11Ol.I00iio);
/* 42 */            int iI00000oIO2 = (oOOo0i11Ol.I00iiO & Barcode.FORMAT_UPC_A) == 512 ? oOOo0i11Ol.I00oI0i : I00000oIO(oOOo0i11Ol.I00iio);
/* 46 */            O0i0IiI0 o0i0IiI0 = new O0i0IiI0();
/* 49 */            o0i0IiI0.I00000oIO = i;
/* 59 */            I00Ol00 i00Ol00I0000oI00 = ilOOoio1lI.I0000oI00(new IlO1Oi1(IlO1il.I001lIiIIo1O, 1));
/* 70 */            I00Ol00 i00Ol00I0000oI002 = ilOOoio1lI.I0000oI00(new IlO1Oi1(IlO1il.I001l0I00, 1));
/* 76 */            O0i0iiiloO o0i0iiiloO = new O0i0iiiloO(iI00000oIO);
/* 79 */            O0O00I1Ili[] o0O00I1IliArr = O0i0IiI0.I000iOII;
/* 81 */            O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[1];
/* 102 */           IlO1O11Ioi.I00ioIO.I0010o(o0i0IiI0, Integer.valueOf(i00Ol00I0000oI002.I00000oOI | Integer.valueOf(o0i0IiI0.I00000oIO).intValue()));
/* 105 */           o0i0IiI0.I00000oOI = o0i0iiiloO;
/* 108 */           O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[0];
/* 124 */           o0i0IiI0.I0000Il00O = i00Ol00I0000oI00.I000OiO(o0i0IiI0) ? new O0i0iiiloO(iI00000oIO2) : null;
/* 131 */           o0i0IiI0.I0000O = new ArrayList(0);
/* 138 */           o0i0IiI0.I0000oI00 = new ArrayList(0);
/* 142 */           new ArrayList(0);
/* 147 */           ArrayList arrayList = new ArrayList();
/* 155 */           o0i0IiI0.I0001Ioi1lo = new ArrayList(0);
/* 162 */           o0i0IiI0.I000II = new ArrayList(0);
/* 169 */           o0i0IiI0.I000O01llI0 = new ArrayList(0);
/* 176 */           o0i0IiI0.I000OOo1O = new ArrayList(0);
/* 180 */           O1li00Io.I00000oIO.getClass();
/* 183 */           List listI00000oIO = O1lOolo.I00000oIO();
/* 197 */           ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(listI00000oIO, 10));
/* 200 */           Iterator it = listI00000oIO.iterator();
/* 208 */           while (it.hasNext()) {
/* 218 */               ((O0I1Oo1oIO) ((O1li00Io) it.next())).getClass();
/* 226 */               arrayList2.add(new O0I1o100o0());
                    }
/* 230 */           o0i0IiI0.I000OiO = arrayList2;
/* 232 */           VarHandle.storeStoreFence();
/* 237 */           O111ol0lilll o111ol0lilllI0000Il00O = o111ol0lilll.I0000Il00O(oOOo0i11Ol.I00l0I0l0lO1);
/* 243 */           OI1IlOlol oI1IlOlol = (OI1IlOlol) o111ol0lilllI0000Il00O.I00iiI;
/* 247 */           Oi0Oooi oi0Oooi = (Oi0Oooi) o111ol0lilllI0000Il00O.I00iiO;
/* 249 */           List list = oOOo0i11Ol.I00l0I0l0lO1;
/* 253 */           ArrayList arrayList3 = o0i0IiI0.I0000O;
/* 255 */           Iterator it2 = list.iterator();
/* 263 */           while (it2.hasNext()) {
/* 275 */               arrayList3.add(I000O01llI0((OOi0O1i1lOi) it2.next(), o111ol0lilllI0000Il00O));
                    }
/* 279 */           OOi001oo1OOI oOi001oo1OOII0001Ioi1lo = lIOOli.I0001Ioi1lo(oOOo0i11Ol, oi0Oooi);
/* 283 */           if (oOi001oo1OOII0001Ioi1lo != null) {
/* 285 */               I000II(oOi001oo1OOII0001Ioi1lo, o111ol0lilllI0000Il00O);
                    }
/* 292 */           Iterator it3 = oOOo0i11Ol.I00o0iI0io1.iterator();
/* 300 */           while (it3.hasNext()) {
/* 312 */               arrayList.add(I000OOo1O((OOi0iiO0iOi) it3.next(), o111ol0lilllI0000Il00O));
                    }
/* 322 */           if (oOOo0i11Ol.I00o0iI0io1.isEmpty() && !oOOo0i11Ol.I00ll1.isEmpty()) {
/* 340 */               Iterator it4 = lIOOli.I0000Il00O(oOOo0i11Ol, oi0Oooi).iterator();
/* 348 */               while (it4.hasNext()) {
/* 356 */                   I000II((OOi001oo1OOI) it4.next(), o111ol0lilllI0000Il00O);
/* 364 */                   arrayList.add(new O0i0o1iOoII(0));
                        }
                    }
/* 373 */           if ((oOOo0i11Ol.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 377 */               I000OOo1O(oOOo0i11Ol.I00o0l1o1o0, o111ol0lilllI0000Il00O);
                    }
/* 384 */           I000II(lIOOli.I000O01llI0(oOOo0i11Ol, oi0Oooi), o111ol0lilllI0000Il00O);
/* 387 */           List list2 = oOOo0i11Ol.I00oII;
/* 391 */           ArrayList arrayList4 = o0i0IiI0.I0001Ioi1lo;
/* 393 */           Iterator it5 = list2.iterator();
/* 401 */           while (it5.hasNext()) {
/* 417 */               arrayList4.add(I00000oOI(((Integer) it5.next()).intValue(), o111ol0lilllI0000Il00O));
                    }
/* 427 */           Iterator it6 = ((List) o111ol0lilllI0000Il00O.I00ioIO).iterator();
/* 435 */           while (it6.hasNext()) {
/* 445 */               ((O0I1Oo1oIO) ((O1li00Io) it6.next())).getClass();
/* 458 */               List list3 = oOOo0i11Ol.I00oO101o;
/* 462 */               ArrayList arrayList5 = o0i0IiI0.I000II;
/* 464 */               Iterator it7 = list3.iterator();
/* 472 */               while (it7.hasNext()) {
/* 484 */                   arrayList5.add(lIil0I0il.I00000oOI((OOOi000ooO) it7.next(), oI1IlOlol));
                        }
/* 488 */               List list4 = oOOo0i11Ol.I00oOio10iI1;
/* 494 */               ArrayList arrayList6 = o0i0IiI0.I00000oOI.I00000oOI;
/* 496 */               Iterator it8 = list4.iterator();
/* 504 */               while (it8.hasNext()) {
/* 516 */                   arrayList6.add(lIil0I0il.I00000oOI((OOOi000ooO) it8.next(), oI1IlOlol));
                        }
/* 520 */               O0i0iiiloO o0i0iiiloO2 = o0i0IiI0.I0000Il00O;
/* 522 */               if (o0i0iiiloO2 != null) {
/* 524 */                   List list5 = oOOo0i11Ol.I00ol1;
/* 528 */                   ArrayList arrayList7 = o0i0iiiloO2.I00000oOI;
/* 530 */                   Iterator it9 = list5.iterator();
/* 538 */                   while (it9.hasNext()) {
/* 550 */                       arrayList7.add(lIil0I0il.I00000oOI((OOOi000ooO) it9.next(), oI1IlOlol));
                            }
                        }
/* 554 */               List list6 = oOOo0i11Ol.I00olI;
/* 558 */               ArrayList arrayList8 = o0i0IiI0.I0000oI00;
/* 560 */               Iterator it10 = list6.iterator();
/* 568 */               while (it10.hasNext()) {
/* 580 */                   arrayList8.add(lIil0I0il.I00000oOI((OOOi000ooO) it10.next(), oI1IlOlol));
                        }
/* 584 */               List list7 = oOOo0i11Ol.I00oli;
/* 588 */               ArrayList arrayList9 = o0i0IiI0.I000O01llI0;
/* 590 */               Iterator it11 = list7.iterator();
/* 598 */               while (it11.hasNext()) {
/* 610 */                   arrayList9.add(lIil0I0il.I00000oOI((OOOi000ooO) it11.next(), oI1IlOlol));
                        }
/* 614 */               List list8 = oOOo0i11Ol.I00oliIiO01i;
/* 618 */               ArrayList arrayList10 = o0i0IiI0.I000OOo1O;
/* 620 */               Iterator it12 = list8.iterator();
/* 628 */               while (it12.hasNext()) {
/* 640 */                   arrayList10.add(lIil0I0il.I00000oOI((OOOi000ooO) it12.next(), oI1IlOlol));
                        }
/* 644 */               Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 646 */               O0IO00o0OI0.I00000oOI(oOOo0i11Ol, oI1IlOlol, oi0Oooi, true);
/* 655 */               O0IIO0lO o0IIO0lO = (O0IIO0lO) lIOIiol1IoI.I00000oIO(oOOo0i11Ol, O0IIoOIiII0O.I0000O);
/* 668 */               O0III0iooOOi o0III0iooOOi = (o0IIO0lO == null || !o0IIO0lO.I000OOo1O()) ? null : o0IIO0lO.I00ilI0I1;
/* 681 */               O0III0iooOOi o0III0iooOOi2 = (o0IIO0lO == null || (o0IIO0lO.I00iiI & 8) != 8) ? null : o0IIO0lO.I00ilO0;
/* 690 */               ((Number) oOOo0i11Ol.I000iOII(O0IIoOIiII0O.I0000oI00)).intValue();
/* 693 */               if (o0III0iooOOi != null) {
/* 697 */                   oI1IlOlol.getString(o0III0iooOOi.I00iiO);
/* 702 */                   oI1IlOlol.getString(o0III0iooOOi.I00iio);
                        }
/* 705 */               if (o0III0iooOOi2 != null) {
/* 709 */                   oI1IlOlol.getString(o0III0iooOOi2.I00iiO);
/* 714 */                   oI1IlOlol.getString(o0III0iooOOi2.I00iio);
                        }
/* 728 */               O0III0iooOOi o0III0iooOOi3 = (o0IIO0lO == null || (o0IIO0lO.I00iiI & 2) != 2) ? null : o0IIO0lO.I00iio;
/* 729 */               if (o0III0iooOOi3 != null) {
/* 733 */                   oI1IlOlol.getString(o0III0iooOOi3.I00iiO);
/* 738 */                   oI1IlOlol.getString(o0III0iooOOi3.I00iio);
                        }
/* 753 */               O0III0iooOOi o0III0iooOOi4 = (o0IIO0lO == null || (o0IIO0lO.I00iiI & 16) != 16) ? null : o0IIO0lO.I00io1l;
/* 754 */               if (o0III0iooOOi4 != null) {
/* 758 */                   oI1IlOlol.getString(o0III0iooOOi4.I00iiO);
/* 763 */                   oI1IlOlol.getString(o0III0iooOOi4.I00iio);
                        }
                    }
/* 2988 */          return o0i0IiI0;
                }

                public static final O0i0iioIlO I000II(OOi001oo1OOI oOi001oo1OOI, O111ol0lilll o111ol0lilll) {
                    l0lOoI o0OoiOIOI;
                    O0i0ol1o o0i0ol1o;
/* 3 */             Oi0Oooi oi0Oooi = (Oi0Oooi) o111ol0lilll.I00iiO;
/* 7 */             OI1IlOlol oI1IlOlol = (OI1IlOlol) o111ol0lilll.I00iiI;
/* 18 */            O0i0iioIlO o0i0iioIlO = new O0i0iioIlO((oOi001oo1OOI.I00ilI0I1 ? 1 : 0) + (oOi001oo1OOI.I00o101lO << 1));
/* 25 */            O0i01II o0i01II = null;
/* 26 */            if (oOi001oo1OOI.I00100o1O0lo()) {
/* 36 */                o0OoiOIOI = new O0OoOl10(lIil0I0il.I00000oIO(oI1IlOlol, oOi001oo1OOI.I00l0I0l0lO1));
                    } else {
/* 40 */                int i = oOi001oo1OOI.I00iiO;
/* 46 */                if ((i & Barcode.FORMAT_ITF) == 128) {
/* 52 */                    String strI00000oIO = lIil0I0il.I00000oIO(oI1IlOlol, oOi001oo1OOI.I00ll1);
/* 56 */                    O0Ooi10o0000 o0Ooi10o0000 = new O0Ooi10o0000();
/* 59 */                    o0Ooi10o0000.I00000oIO = strI00000oIO;
/* 61 */                    VarHandle.storeStoreFence();
                            o0OoiOIOI = o0Ooi10o0000;
                        } else if ((i & 32) == 32) {
/* 75 */                    o0OoiOIOI = new O0OoiOIOI(oOi001oo1OOI.I00l0OO0IO);
                        } else {
/* 82 */                    if ((i & 64) != 64) {
/* 551 */                       throw new IoOoiol010lI("No classifier (class, type alias or type parameter) recorded for Type", null);
                            }
/* 86 */                    Integer numI00000oIO = o111ol0lilll.I00000oIO(oOi001oo1OOI.I00li1OI);
/* 90 */                    if (numI00000oIO == null) {
/* 411 */                       throw new IoOoiol010lI("No type parameter id for ".concat(oI1IlOlol.getString(oOi001oo1OOI.I00li1OI)), null);
                            }
/* 98 */                    o0OoiOIOI = new O0OoiOIOI(numI00000oIO.intValue());
                        }
                    }
/* 102 */           o0i0iioIlO.I00000oOI = o0OoiOIOI;
/* 116 */           for (OOOooIOl oOOooIOl : oOi001oo1OOI.I00iio) {
/* 124 */               OOOoil1l010 oOOoil1l010 = oOOooIOl.I00iiO;
/* 126 */               if (oOOoil1l010 == null) {
/* 211 */                   I000II.I000iOII("Required value was null.");
/* 25 */                    return null;
                        }
/* 128 */               int iOrdinal = oOOoil1l010.ordinal();
/* 132 */               if (iOrdinal == 0) {
/* 153 */                   o0i0ol1o = O0i0ol1o.I00iiI;
                        } else if (iOrdinal == 1) {
/* 150 */                   o0i0ol1o = O0i0ol1o.I00iiO;
                        } else if (iOrdinal == 2) {
/* 147 */                   o0i0ol1o = O0i0ol1o.I00iOIl;
                        } else {
/* 139 */                   if (iOrdinal != 3) {
/* 143 */                       I000II.I00000oIO();
/* 25 */                        return null;
                            }
/* 141 */                   o0i0ol1o = null;
                        }
/* 155 */               ArrayList arrayList = o0i0iioIlO.I0000Il00O;
/* 157 */               if (o0i0ol1o != null) {
/* 159 */                   int i2 = oOOooIOl.I00iiI;
/* 179 */                   OOi001oo1OOI oOi001oo1OOII00100l0 = (i2 & 2) == 2 ? oOOooIOl.I00iio : (i2 & 4) == 4 ? oi0Oooi.I00100l0(oOOooIOl.I00ilI0I1) : null;
/* 180 */                   if (oOi001oo1OOII00100l0 == null) {
/* 202 */                       throw new IoOoiol010lI("No type argument for non-STAR projection in Type", null);
                            }
/* 191 */                   arrayList.add(new O0i0o11i(o0i0ol1o, I000II(oOi001oo1OOII00100l0, o111ol0lilll)));
                        } else {
/* 205 */                   arrayList.add(O0i0o11i.I0000Il00O);
                        }
                    }
/* 215 */           int i3 = oOi001oo1OOI.I00iiO;
/* 238 */           OOi001oo1OOI oOi001oo1OOII00100l02 = (i3 & Barcode.FORMAT_UPC_E) == 1024 ? oOi001oo1OOI.I00o0iI0io1 : (i3 & Barcode.FORMAT_PDF417) == 2048 ? oi0Oooi.I00100l0(oOi001oo1OOI.I00o0l1o1o0) : null;
/* 247 */           o0i0iioIlO.I0000O = oOi001oo1OOII00100l02 != null ? I000II(oOi001oo1OOII00100l02, o111ol0lilll) : null;
/* 249 */           OOi001oo1OOI oOi001oo1OOII0000O = lIOOli.I0000O(oOi001oo1OOI, oi0Oooi);
/* 261 */           o0i0iioIlO.I0000oI00 = oOi001oo1OOII0000O != null ? I000II(oOi001oo1OOII0000O, o111ol0lilll) : null;
/* 263 */           int i4 = oOi001oo1OOI.I00iiO;
/* 284 */           OOi001oo1OOI oOi001oo1OOII00100l03 = (i4 & 4) == 4 ? oOi001oo1OOI.I00io1l : (i4 & 8) == 8 ? oi0Oooi.I00100l0(oOi001oo1OOI.I00ioIO) : null;
/* 285 */           if (oOi001oo1OOII00100l03 != null) {
/* 287 */               O0i0iioIlO o0i0iioIlOI000II = I000II(oOi001oo1OOII00100l03, o111ol0lilll);
/* 300 */               String string = (oOi001oo1OOI.I00iiO & 2) == 2 ? oI1IlOlol.getString(oOi001oo1OOI.I00ilO0) : null;
/* 304 */               O0i01II o0i01II2 = new O0i01II();
/* 307 */               o0i01II2.I00000oIO = o0i0iioIlOI000II;
/* 309 */               o0i01II2.I00000oOI = string;
/* 311 */               o0i01II = o0i01II2;
                    }
/* 312 */           o0i0iioIlO.I0001Ioi1lo = o0i01II;
/* 320 */           Iterator it = ((List) o111ol0lilll.I00ioIO).iterator();
/* 328 */           while (it.hasNext()) {
/* 338 */               ((O0I1Oo1oIO) ((O1li00Io) it.next())).getClass();
/* 349 */               O0IOi1 o0IOi1 = (O0IOi1) ilO01lO.I00000oIO(o0i0iioIlO.I000II, O0IOi1.I0000Il00O);
/* 363 */               o0IOi1.I00000oIO = ((Boolean) oOi001oo1OOI.I000iOII(O0IIoOIiII0O.I0001Ioi1lo)).booleanValue();
/* 367 */               Iterator it2 = oOi001oo1OOI.I00oI0i.iterator();
/* 375 */               while (it2.hasNext()) {
/* 389 */                   o0IOi1.I00000oOI.add(lIil0I0il.I00000oOI((OOOi000ooO) it2.next(), oI1IlOlol));
                        }
                    }
/* 393 */           return o0i0iioIlO;
                }

                public static final O0i0liO0oIO I000O01llI0(OOi0O1i1lOi oOi0O1i1lOi, O111ol0lilll o111ol0lilll) {
                    O0i0ol1o o0i0ol1o;
/* 3 */             OI1IlOlol oI1IlOlol = (OI1IlOlol) o111ol0lilll.I00iiI;
/* 5 */             OOi0Illolii oOi0Illolii = oOi0O1i1lOi.I00io1l;
/* 8 */             if (oOi0Illolii == null) {
/* 153 */               I000II.I000iOII("Required value was null.");
/* 7 */                 return null;
                    }
/* 10 */            int iOrdinal = oOi0Illolii.ordinal();
/* 14 */            if (iOrdinal == 0) {
/* 32 */                o0i0ol1o = O0i0ol1o.I00iiI;
                    } else if (iOrdinal == 1) {
/* 29 */                o0i0ol1o = O0i0ol1o.I00iiO;
                    } else {
/* 20 */                if (iOrdinal != 2) {
/* 25 */                    I000II.I00000oIO();
/* 7 */                     return null;
                        }
/* 22 */                o0i0ol1o = O0i0ol1o.I00iOIl;
                    }
/* 36 */            boolean z = oOi0O1i1lOi.I00ilO0;
/* 46 */            O0i0liO0oIO o0i0liO0oIO = new O0i0liO0oIO(z ? 1 : 0, oI1IlOlol.getString(oOi0O1i1lOi.I00ilI0I1), oOi0O1i1lOi.I00iio, o0i0ol1o);
/* 59 */            Iterator it = lIOOli.I000iOII(oOi0O1i1lOi, (Oi0Oooi) o111ol0lilll.I00iiO).iterator();
/* 67 */            while (it.hasNext()) {
/* 81 */                o0i0liO0oIO.I0000oI00.add(I000II((OOi001oo1OOI) it.next(), o111ol0lilll));
                    }
/* 91 */            Iterator it2 = ((List) o111ol0lilll.I00ioIO).iterator();
/* 99 */            while (it2.hasNext()) {
/* 109 */               ((O0I1Oo1oIO) ((O1li00Io) it2.next())).getClass();
/* 120 */               O0IOiI001I o0IOiI001I = (O0IOiI001I) ilO01lO.I00000oIO(o0i0liO0oIO.I0001Ioi1lo, O0IOiI001I.I00000oOI);
/* 124 */               Iterator it3 = oOi0O1i1lOi.I00li1OI.iterator();
/* 132 */               while (it3.hasNext()) {
/* 146 */                   o0IOiI001I.I00000oIO.add(lIil0I0il.I00000oOI((OOOi000ooO) it3.next(), oI1IlOlol));
                        }
                    }
/* 150 */           return o0i0liO0oIO;
                }

                public static final O0i0o1iOoII I000OOo1O(OOi0iiO0iOi oOi0iiO0iOi, O111ol0lilll o111ol0lilll) {
/* 3 */             int i = oOi0iiO0iOi.I00iio;
/* 5 */             int i2 = oOi0iiO0iOi.I00ilI0I1;
/* 9 */             OI1IlOlol oI1IlOlol = (OI1IlOlol) o111ol0lilll.I00iiI;
/* 11 */            oI1IlOlol.getString(i2);
/* 14 */            O0i0o1iOoII o0i0o1iOoII = new O0i0o1iOoII(i);
/* 19 */            Oi0Oooi oi0Oooi = (Oi0Oooi) o111ol0lilll.I00iiO;
/* 25 */            I000II(lIOOli.I000OiO(oOi0iiO0iOi, oi0Oooi), o111ol0lilll);
/* 28 */            int i3 = oOi0iiO0iOi.I00iiO;
/* 51 */            OOi001oo1OOI oOi001oo1OOII00100l0 = (i3 & 16) == 16 ? oOi0iiO0iOi.I00ioIO : (i3 & 32) == 32 ? oi0Oooi.I00100l0(oOi0iiO0iOi.I00l0I0l0lO1) : null;
/* 52 */            if (oOi001oo1OOII00100l0 != null) {
/* 54 */                I000II(oOi001oo1OOII00100l0, o111ol0lilll);
                    }
/* 62 */            if ((oOi0iiO0iOi.I00iiO & 64) == 64) {
/* 66 */                lIil0I0il.I0000Il00O(oOi0iiO0iOi.I00li1OI, oI1IlOlol);
                    }
/* 75 */            Iterator it = ((List) o111ol0lilll.I00ioIO).iterator();
/* 83 */            while (it.hasNext()) {
/* 93 */                ((O0I1Oo1oIO) ((O1li00Io) it.next())).getClass();
/* 100 */               Iterator it2 = oOi0iiO0iOi.I00l0OO0IO.iterator();
/* 108 */               while (it2.hasNext()) {
/* 122 */                   o0i0o1iOoII.I00000oOI.add(lIil0I0il.I00000oOI((OOOi000ooO) it2.next(), oI1IlOlol));
                        }
                    }
/* 551 */           return o0i0o1iOoII;
                }

                public static final void I000OiO(O0Ooo0Ol1i o0Ooo0Ol1i, List list, List list2, List list3, O111ol0lilll o111ol0lilll) {
                    OOi001oo1OOI oOi001oo1OOII00100l0;
                    OOi001oo1OOI oOi001oo1OOII00100l02;
/* 3 */             ArrayList arrayListI00000oOI = o0Ooo0Ol1i.I00000oOI();
/* 7 */             Iterator it = list.iterator();
/* 15 */            while (it.hasNext()) {
/* 27 */                arrayListI00000oOI.add(I0000oI00((OOOll1o0) it.next(), o111ol0lilll));
                    }
/* 33 */            ArrayList arrayListI00000oIO = o0Ooo0Ol1i.I00000oIO();
/* 37 */            Iterator it2 = list2.iterator();
/* 45 */            while (it2.hasNext()) {
/* 57 */                arrayListI00000oIO.add(I0001Ioi1lo((OOOo0i11Ol) it2.next(), o111ol0lilll));
                    }
/* 63 */            ArrayList arrayListI0000Il00O = o0Ooo0Ol1i.I0000Il00O();
/* 67 */            Iterator it3 = list3.iterator();
/* 75 */            while (it3.hasNext()) {
/* 81 */                OOi0IOIIOO oOi0IOIIOO = (OOi0IOIIOO) it3.next();
/* 85 */                int i = oOi0IOIIOO.I00iio;
/* 93 */                ((OI1IlOlol) o111ol0lilll.I00iiI).getString(oOi0IOIIOO.I00ilI0I1);
/* 96 */                O0i0lO1I1oO1 o0i0lO1I1oO1 = new O0i0lO1I1oO1();
/* 99 */                o0i0lO1I1oO1.I00000oIO = i;
/* 107 */               o0i0lO1I1oO1.I00000oOI = new ArrayList(0);
/* 114 */               o0i0lO1I1oO1.I0000Il00O = new ArrayList(0);
/* 121 */               o0i0lO1I1oO1.I0000O = new ArrayList(0);
/* 125 */               O1li00Io.I00000oIO.getClass();
/* 128 */               List listI00000oIO = O1lOolo.I00000oIO();
/* 136 */               new ArrayList();
/* 139 */               Iterator it4 = listI00000oIO.iterator();
/* 147 */               while (it4.hasNext()) {
/* 155 */                   ((O1li00Io) it4.next()).getClass();
                        }
/* 159 */               VarHandle.storeStoreFence();
/* 164 */               O111ol0lilll o111ol0lilllI0000Il00O = o111ol0lilll.I0000Il00O(oOi0IOIIOO.I00ilO0);
/* 170 */               Oi0Oooi oi0Oooi = (Oi0Oooi) o111ol0lilllI0000Il00O.I00iiO;
/* 172 */               List list4 = oOi0IOIIOO.I00ilO0;
/* 176 */               ArrayList arrayList = o0i0lO1I1oO1.I00000oOI;
/* 178 */               Iterator it5 = list4.iterator();
/* 186 */               while (it5.hasNext()) {
/* 198 */                   arrayList.add(I000O01llI0((OOi0O1i1lOi) it5.next(), o111ol0lilllI0000Il00O));
                        }
/* 202 */               int i2 = oOi0IOIIOO.I00iiO;
/* 207 */               if ((i2 & 4) == 4) {
/* 209 */                   oOi001oo1OOII00100l0 = oOi0IOIIOO.I00io1l;
                        } else {
/* 216 */                   if ((i2 & 8) != 8) {
/* 360 */                       I000II.I001IO000("No underlyingType in ProtoBuf.TypeAlias");
/* 966 */                       return;
                            }
/* 220 */                   oOi001oo1OOII00100l0 = oi0Oooi.I00100l0(oOi0IOIIOO.I00ioIO);
                        }
/* 224 */               I000II(oOi001oo1OOII00100l0, o111ol0lilllI0000Il00O);
/* 227 */               int i3 = oOi0IOIIOO.I00iiO;
/* 233 */               if ((i3 & 16) == 16) {
/* 235 */                   oOi001oo1OOII00100l02 = oOi0IOIIOO.I00l0I0l0lO1;
                        } else {
/* 242 */                   if ((i3 & 32) != 32) {
/* 354 */                       I000II.I001IO000("No expandedType in ProtoBuf.TypeAlias");
/* 357 */                       return;
                            }
/* 246 */                   oOi001oo1OOII00100l02 = oi0Oooi.I00100l0(oOi0IOIIOO.I00l0OO0IO);
                        }
/* 250 */               I000II(oOi001oo1OOII00100l02, o111ol0lilllI0000Il00O);
/* 253 */               List list5 = oOi0IOIIOO.I00li1OI;
/* 257 */               ArrayList arrayList2 = o0i0lO1I1oO1.I0000Il00O;
/* 259 */               Iterator it6 = list5.iterator();
/* 267 */               while (it6.hasNext()) {
/* 283 */                   arrayList2.add(lIil0I0il.I00000oOI((OOOi000ooO) it6.next(), (OI1IlOlol) o111ol0lilllI0000Il00O.I00iiI));
                        }
/* 287 */               List list6 = oOi0IOIIOO.I00ll1;
/* 291 */               ArrayList arrayList3 = o0i0lO1I1oO1.I0000O;
/* 293 */               Iterator it7 = list6.iterator();
/* 301 */               while (it7.hasNext()) {
/* 317 */                   arrayList3.add(I00000oOI(((Integer) it7.next()).intValue(), o111ol0lilllI0000Il00O));
                        }
/* 327 */               Iterator it8 = ((List) o111ol0lilllI0000Il00O.I00ioIO).iterator();
/* 335 */               while (it8.hasNext()) {
/* 343 */                   ((O1li00Io) it8.next()).getClass();
                        }
/* 347 */               arrayListI0000Il00O.add(o0i0lO1I1oO1);
                    }
                }

                /* JADX WARN: Finally extract failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, all -> 0x0068, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x0179, B:15:0x0025, B:17:0x002d, B:21:0x003a, B:23:0x0040, B:25:0x0048, B:74:0x0176, B:76:0x017c, B:77:0x017f, B:78:0x0180, B:26:0x004c, B:28:0x0050, B:29:0x005d, B:31:0x0063, B:37:0x0078, B:39:0x007e, B:40:0x008a, B:61:0x015b, B:62:0x015e, B:70:0x016d, B:69:0x016a, B:71:0x016e, B:72:0x0173, B:73:0x0174, B:34:0x006b, B:36:0x006f), top: B:83:0x0007 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static OIiiIl0iO I000iOII(Context context) {
                    OIiiIl0iO oIiiIl0iOI0000Il00O;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
                    OIiiIl0iO oIiiIl0iOI0000Il00O2;
                    char c;
/* 1 */             OIiiIl0iO oIiiIl0iO = I00000oIO;
/* 3 */             if (oIiiIl0iO != null) {
/* 966 */               return oIiiIl0iO;
                    }
                    synchronized (lIil0O.class) {
                        try {
/* 8 */                     oIiiIl0iOI0000Il00O = I00000oIO;
/* 10 */                    if (oIiiIl0iOI0000Il00O == null) {
/* 12 */                        String str = Build.TYPE;
/* 14 */                        String str2 = Build.TAGS;
/* 16 */                        I1Io0i0II i1Io0i0II = lIillol1io.I00000oIO;
/* 24 */                        if (str.equals("eng") || str.equals("userdebug")) {
/* 44 */                            if (str2.contains("dev-keys") || str2.contains("test-keys")) {
/* 71 */                                Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
/* 73 */                                threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
/* 77 */                                StrictMode.allowThreadDiskWrites();
/* 80 */                                char c2 = 0;
                                        try {
/* 91 */                                    File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
/* 108 */                                   oIiiIl0iOI0000Il00O2 = file.exists() ? OIiiIl0iO.I0000Il00O(file) : I00iIi0i1o.I00iOIl;
                                        } catch (RuntimeException e) {
/* 116 */                                   Log.e("HermeticFileOverrides", "no data dir", e);
/* 119 */                                   oIiiIl0iOI0000Il00O2 = I00iIi0i1o.I00iOIl;
                                        }
/* 125 */                               if (oIiiIl0iOI0000Il00O2.I00000oOI()) {
/* 131 */                                   File file2 = (File) oIiiIl0iOI0000Il00O2.I00000oIO();
                                            try {
/* 151 */                                       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                                try {
/* 156 */                                           Ol0Ii10o1 ol0Ii10o1 = new Ol0Ii10o1(0);
/* 161 */                                           HashMap map = new HashMap();
                                                    while (true) {
/* 164 */                                               String line = bufferedReader.readLine();
/* 168 */                                               if (line == null) {
                                                            break;
                                                        }
/* 173 */                                               String[] strArrSplit = line.split(" ", 3);
/* 178 */                                               if (strArrSplit.length != 3) {
/* 190 */                                                   StringBuilder sb = new StringBuilder(line.length() + 9);
/* 193 */                                                   sb.append("Invalid: ");
/* 196 */                                                   sb.append(line);
/* 203 */                                                   Log.e("HermeticFileOverrides", sb.toString());
                                                        } else {
/* 215 */                                                   String str3 = new String(strArrSplit[c2]);
/* 226 */                                                   String strDecode = Uri.decode(new String(strArrSplit[1]));
/* 237 */                                                   String strDecode2 = (String) map.get(strArrSplit[2]);
/* 239 */                                                   if (strDecode2 == null) {
/* 245 */                                                       String str4 = new String(strArrSplit[2]);
/* 248 */                                                       strDecode2 = Uri.decode(str4);
/* 258 */                                                       if (strDecode2.length() < 1024 || strDecode2 == str4) {
/* 262 */                                                           map.put(str4, strDecode2);
                                                                }
                                                            }
/* 269 */                                                   Ol0Ii10o1 ol0Ii10o12 = (Ol0Ii10o1) ol0Ii10o1.get(str3);
/* 271 */                                                   if (ol0Ii10o12 == null) {
/* 275 */                                                       c = 0;
/* 276 */                                                       ol0Ii10o12 = new Ol0Ii10o1(0);
/* 279 */                                                       ol0Ii10o1.put(str3, ol0Ii10o12);
                                                            } else {
/* 283 */                                                       c = 0;
                                                            }
/* 284 */                                                   ol0Ii10o12.put(strDecode, strDecode2);
/* 287 */                                                   c2 = c;
                                                        }
                                                    }
/* 291 */                                           String string = file2.toString();
/* 295 */                                           String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
/* 316 */                                           StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
/* 319 */                                           sb2.append("Parsed ");
/* 322 */                                           sb2.append(string);
/* 325 */                                           sb2.append(" for Android package ");
/* 328 */                                           sb2.append(packageName);
/* 335 */                                           Log.w("HermeticFileOverrides", sb2.toString());
/* 340 */                                           lIii11i liii11i = new lIii11i();
/* 343 */                                           liii11i.I00000oIO = ol0Ii10o1;
/* 345 */                                           VarHandle.storeStoreFence();
/* 348 */                                           bufferedReader.close();
/* 351 */                                           oIiiIl0iOI0000Il00O = OIiiIl0iO.I0000Il00O(liii11i);
                                                } catch (Throwable th) {
                                                    try {
/* 358 */                                               bufferedReader.close();
/* 366 */                                               throw th;
                                                    } catch (Throwable th2) {
/* 363 */                                               th.addSuppressed(th2);
/* 366 */                                               throw th;
                                                    }
                                                }
                                            } catch (IOException e2) {
/* 372 */                                       throw new RuntimeException(e2);
                                            }
                                        } else {
/* 373 */                                   oIiiIl0iOI0000Il00O = I00iIi0i1o.I00iOIl;
                                        }
/* 375 */                               StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                                    } else {
/* 55 */                                oIiiIl0iOI0000Il00O = I00iIi0i1o.I00iOIl;
                                    }
/* 378 */                           I00000oIO = oIiiIl0iOI0000Il00O;
                                }
                            }
                        } catch (Throwable th3) {
/* 381 */                   StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
/* 384 */                   throw th3;
                        } finally {
                        }
                    }
/* 386 */           return oIiiIl0iOI0000Il00O;
                }
            }
