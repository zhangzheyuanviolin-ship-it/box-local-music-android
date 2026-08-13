            package p000;

            import android.content.Context;
            import android.util.Log;
            import com.google.ai.edge.gallery.data.ValueType;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O11i0Oi extends Oll0io implements IlliIl1l11O {
                public long I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final O11iO00I1o I00iio;
                public final String I00ilI0I1;
                public final O1oIOiI11o0 I00ilO0;
                public final List I00io1l;
                public final String I00ioIO;
                public final Function1 I00l0I0l0lO1;
                public final List I00l0OO0IO;
                public final boolean I00li1OI;
                public final Function1 I00ll1;
                public final Function1 I00lli11;
                public final IllOOo00lI I00lll10;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11i0Oi(O11iO00I1o o11iO00I1o, String str, O1oIOiI11o0 o1oIOiI11o0, List list, String str2, Function1 function1, List list2, boolean z, Function1 function12, Function1 function13, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) {
/* 24 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = o11iO00I1o;
/* 3 */             this.I00ilI0I1 = str;
/* 5 */             this.I00ilO0 = o1oIOiI11o0;
/* 7 */             this.I00io1l = list;
/* 9 */             this.I00ioIO = str2;
/* 11 */            this.I00l0I0l0lO1 = function1;
/* 13 */            this.I00l0OO0IO = list2;
/* 15 */            this.I00li1OI = z;
/* 17 */            this.I00ll1 = function12;
/* 19 */            this.I00lli11 = function13;
/* 21 */            this.I00lll10 = illOOo00lI;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 26 */            O11i0Oi o11i0Oi = new O11i0Oi(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, this.I00lli11, this.I00lll10, iOoil1iiIilo);
/* 29 */            o11i0Oi.I00iiO = obj;
/* 37 */            return o11i0Oi;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((O11i0Oi) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:26:0x00e1, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(500, r40) == r2) goto L27;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:40:0x02ce  */
                /* JADX WARN: Type inference failed for: r3v10 */
                /* JADX WARN: Type inference failed for: r3v5, types: [IO1oiol] */
                /* JADX WARN: Type inference failed for: r3v7 */
                /* JADX WARN: Type inference failed for: r4v20 */
                /* JADX WARN: Type inference failed for: r4v3 */
                /* JADX WARN: Type inference failed for: r4v6, types: [boolean] */
                /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoiIlOl1iI ooiIlOl1iI;
                    O1oIOiI11o0 o1oIOiI11o0;
                    O11iO00I1o o11iO00I1o;
                    Function1 function1;
                    O1oIOiI11o0 o1oIOiI11o02;
                    ?? r4;
                    long jCurrentTimeMillis;
                    ?? r3;
                    byte b;
                    O11iO00I1o o11iO00I1o2;
                    Map mapSingletonMap;
/* 5 */             Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 7 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 9 */             int i = this.I00iiI;
/* 12 */            OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
/* 16 */            String str = this.I00ioIO;
/* 18 */            String str2 = this.I00ilI0I1;
/* 21 */            Function1 function12 = this.I00l0I0l0lO1;
/* 24 */            O1oIOiI11o0 o1oIOiI11o03 = this.I00ilO0;
/* 26 */            O11iO00I1o o11iO00I1o3 = this.I00iio;
/* 28 */            if (i == 0) {
/* 68 */                ooiIlOl1iI = ooiIlOl1iI2;
/* 70 */                lIoii1l01l0i.I00000oOI(obj);
/* 73 */                o11iO00I1o3.I000iOII(true);
/* 76 */                o11iO00I1o3.I000lI(true);
/* 83 */                if (str2.length() > 0) {
/* 85 */                    IO1loOo1o iO1loOo1oI00100l0 = o11iO00I1o3.I00100l0();
/* 89 */                    Context context = o11iO00I1o3.I0000oI00;
/* 91 */                    String str3 = o1oIOiI11o03.I00000oIO;
/* 93 */                    IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(o11iO00I1o3);
/* 97 */                    IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 115 */                   o1oIOiI11o0 = o1oIOiI11o03;
/* 117 */                   o11iO00I1o = o11iO00I1o3;
/* 125 */                   iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new O11iIIOO01i0(this.I00io1l, context, o11iO00I1o, o1oIOiI11o0, iO1loOo1oI00100l0, this.I00ilI0I1, null), 2);
                        } else {
/* 130 */                   o1oIOiI11o0 = o1oIOiI11o03;
/* 132 */                   o11iO00I1o = o11iO00I1o3;
                        }
/* 147 */               function1 = function12;
/* 148 */               IO1oiol iO1oiol = o11iO00I1o;
/* 150 */               o1oIOiI11o02 = o1oIOiI11o0;
/* 152 */               r4 = 0;
/* 153 */               IO1i11 iO1i11 = new IO1i11(IO1iIoo.I00io1l, IO1loo.I00iiI, 0.0f, str, false, 52);
/* 156 */               iO1i11.I000II = "";
/* 158 */               iO1i11.I000O01llI0 = str;
/* 160 */               VarHandle.storeStoreFence();
/* 163 */               iO1oiol.I0000oI00(o1oIOiI11o02, iO1i11);
/* 172 */               jCurrentTimeMillis = System.currentTimeMillis() + 30000;
                        r3 = iO1oiol;
                    } else {
/* 30 */                if (i != 1) {
/* 32 */                    if (i != 2) {
/* 47 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 11 */                        return null;
                            }
/* 34 */                    lIoii1l01l0i.I00000oOI(obj);
/* 37 */                    ooiIlOl1iI = ooiIlOl1iI2;
/* 39 */                    function1 = function12;
/* 40 */                    o1oIOiI11o02 = o1oIOiI11o03;
/* 41 */                    o11iO00I1o2 = o11iO00I1o3;
/* 42 */                    b = 0;
/* 231 */                   ArrayList arrayList = new ArrayList();
/* 236 */                   Iterator it = this.I00l0OO0IO.iterator();
                            byte b2 = b;
/* 244 */                   while (it.hasNext()) {
/* 250 */                       IO1Oi1oOloiI iO1Oi1oOloiI = (IO1Oi1oOloiI) it.next();
/* 252 */                       byte[] bArr = iO1Oi1oOloiI.I000II;
/* 254 */                       int length = bArr.length;
/* 257 */                       int i2 = length + 44;
/* 259 */                       int i3 = iO1Oi1oOloiI.I000O01llI0;
/* 267 */                       int i4 = (i3 * 16) / 8;
/* 274 */                       byte b3 = b2;
/* 373 */                       byte[] bArr2 = new byte[44];
/* 377 */                       bArr2[b3] = 82;
/* 383 */                       bArr2[1] = 73;
/* 389 */                       bArr2[2] = 70;
/* 393 */                       bArr2[3] = 70;
/* 397 */                       bArr2[4] = (byte) (i2 & 255);
/* 400 */                       bArr2[5] = (byte) ((i2 >> 8) & 255);
/* 403 */                       bArr2[6] = (byte) ((i2 >> 16) & 255);
/* 406 */                       bArr2[7] = (byte) ((i2 >> 24) & 255);
/* 410 */                       bArr2[8] = 87;
/* 416 */                       bArr2[9] = 65;
/* 420 */                       bArr2[10] = 86;
/* 426 */                       bArr2[11] = 69;
/* 432 */                       bArr2[12] = 102;
/* 438 */                       bArr2[13] = 109;
/* 444 */                       bArr2[14] = 116;
/* 450 */                       bArr2[15] = 32;
/* 452 */                       bArr2[16] = 16;
/* 456 */                       bArr2[17] = b3;
/* 460 */                       bArr2[18] = b3;
/* 464 */                       bArr2[19] = b3;
/* 470 */                       bArr2[20] = 1;
/* 474 */                       bArr2[21] = b3;
/* 478 */                       bArr2[22] = 1;
/* 482 */                       bArr2[23] = b3;
/* 484 */                       bArr2[24] = (byte) (i3 & 255);
/* 488 */                       bArr2[25] = (byte) ((i3 >> 8) & 255);
/* 490 */                       bArr2[26] = (byte) ((i3 >> 16) & 255);
/* 494 */                       bArr2[27] = (byte) ((i3 >> 24) & 255);
/* 498 */                       bArr2[28] = (byte) (i4 & 255);
/* 502 */                       bArr2[29] = (byte) ((i4 >> 8) & 255);
/* 506 */                       bArr2[30] = (byte) ((i4 >> 16) & 255);
/* 510 */                       bArr2[31] = (byte) ((i4 >> 24) & 255);
/* 514 */                       bArr2[32] = 2;
/* 518 */                       bArr2[33] = b3;
/* 522 */                       bArr2[34] = 16;
/* 526 */                       bArr2[35] = b3;
/* 532 */                       bArr2[36] = 100;
/* 538 */                       bArr2[37] = 97;
/* 542 */                       bArr2[38] = 116;
/* 546 */                       bArr2[39] = 97;
/* 550 */                       bArr2[40] = (byte) (length & 255);
/* 554 */                       bArr2[41] = (byte) ((length >> 8) & 255);
/* 558 */                       bArr2[42] = (byte) ((length >> 16) & 255);
/* 562 */                       bArr2[43] = (byte) ((length >> 24) & 255);
/* 564 */                       int length2 = bArr.length;
/* 567 */                       byte[] bArrCopyOf = Arrays.copyOf(bArr2, 44 + length2);
/* 573 */                       System.arraycopy(bArr, b3, bArrCopyOf, 44, length2);
/* 576 */                       arrayList.add(bArrCopyOf);
/* 579 */                       it = it;
/* 581 */                       b2 = 0;
                            }
/* 586 */                   int i5 = 16;
/* 588 */                   int i6 = 26;
/* 592 */                   OOo0l0ii10l oOo0l0ii10l = new OOo0l0ii10l();
/* 596 */                   oOo0l0ii10l.I00iOIl = true;
/* 598 */                   long jCurrentTimeMillis2 = System.currentTimeMillis();
/* 604 */                   OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 609 */                   OOo0o0oO oOo0o0oO = new OOo0o0oO();
                            try {
/* 612 */                       Function1 function13 = this.I00ll1;
/* 614 */                       Function1 function14 = this.I00lli11;
/* 616 */                       IllOOo00lI illOOo00lI = this.I00lll10;
/* 622 */                       O11i0Ili o11i0Ili = new O11i0Ili();
/* 625 */                       o11i0Ili.I00iOIl = oOo0ll111;
/* 627 */                       o11i0Ili.I00iiI = oOo0o0oO;
/* 629 */                       o11i0Ili.I00iiO = o11iO00I1o2;
/* 631 */                       o11i0Ili.I00iio = o1oIOiI11o02;
/* 633 */                       o11i0Ili.I00ilI0I1 = str;
/* 635 */                       o11i0Ili.I00ilO0 = jCurrentTimeMillis2;
/* 637 */                       o11i0Ili.I00io1l = function13;
/* 639 */                       o11i0Ili.I00ioIO = oOo0l0ii10l;
/* 641 */                       o11i0Ili.I00l0I0l0lO1 = function14;
/* 643 */                       o11i0Ili.I00l0OO0IO = illOOo00lI;
/* 645 */                       VarHandle.storeStoreFence();
/* 652 */                       IlIi0Il ilIi0Il = new IlIi0Il(i5);
/* 655 */                       ilIi0Il.I00iiI = o11iO00I1o2;
/* 657 */                       VarHandle.storeStoreFence();
/* 664 */                       IiioilIl1Il iiioilIl1Il = new IiioilIl1Il(i6);
/* 667 */                       iiioilIl1Il.I00iiO = o11iO00I1o2;
/* 669 */                       iiioilIl1Il.I00iiI = function1;
/* 671 */                       VarHandle.storeStoreFence();
/* 676 */                       if (this.I00li1OI) {
/* 678 */                           o1oIOiI11o02.getClass();
/* 719 */                           mapSingletonMap = ((Boolean) iilooIoO0I.I00000oIO(o1oIOiI11o02.I00IoIO0lI.getOrDefault("Enable thinking", Boolean.FALSE), ValueType.BOOLEAN)).booleanValue() ? Collections.singletonMap("enable_thinking", "true") : null;
                                }
/* 729 */                       List list = (List) o11iO00I1o2.I000O01llI0.remove(o1oIOiI11o02.I00000oIO);
/* 731 */                       if (list != null) {
/* 733 */                           O11il1ilio1o o11il1ilio1oI00000oIO = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o02);
/* 739 */                           if (o11il1ilio1oI00000oIO instanceof O111ooi11li) {
/* 743 */                               ((O111ooi11li) o11il1ilio1oI00000oIO).I000OiO(o1oIOiI11o02, list);
                                    } else if (o11il1ilio1oI00000oIO instanceof O1111lilIi0) {
/* 753 */                               ((O1111lilIi0) o11il1ilio1oI00000oIO).I000OOo1O(o1oIOiI11o02, list);
                                    }
                                }
/* 774 */                       Iterable iterable = (List) ((IO1looOIi) o11iO00I1o2.I0000Il00O.I00iOIl.getValue()).I0000O.get(o1oIOiI11o02.I00000oIO);
/* 776 */                       if (iterable == null) {
/* 778 */                           iterable = Il01100l.I00iOIl;
                                }
/* 784 */                       ArrayList arrayList2 = new ArrayList();
/* 795 */                       for (Object obj2 : iterable) {
/* 803 */                           if (obj2 instanceof IO1iI1i) {
/* 805 */                               arrayList2.add(obj2);
                                    }
                                }
/* 811 */                       ArrayList arrayList3 = new ArrayList();
/* 814 */                       Iterator it2 = arrayList2.iterator();
/* 822 */                       while (it2.hasNext()) {
/* 824 */                           Object next = it2.next();
/* 831 */                           IO1loo iO1loo = ((IO1iI1i) next).I000O01llI0;
/* 835 */                           if (iO1loo == IO1loo.I00iOIl || iO1loo == IO1loo.I00iiI) {
/* 841 */                               arrayList3.add(next);
                                    }
                                }
/* 853 */                       ArrayList arrayList4 = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 856 */                       Iterator it3 = arrayList3.iterator();
/* 864 */                       while (it3.hasNext()) {
/* 870 */                           IO1iI1i iO1iI1i = (IO1iI1i) it3.next();
/* 892 */                           arrayList4.add(new OIoi0IIoi(Boolean.valueOf(iO1iI1i.I000O01llI0 == IO1loo.I00iOIl), iO1iI1i.I000II));
                                }
/* 896 */                       boolean zIsEmpty = arrayList4.isEmpty();
                                ArrayList arrayListI001l0I00 = arrayList4;
/* 900 */                       if (!zIsEmpty) {
/* 912 */                           boolean zBooleanValue = ((Boolean) ((OIoi0IIoi) IOOi0Ool1i.I00Io1o110i(arrayList4)).I00iOIl).booleanValue();
                                    arrayListI001l0I00 = arrayList4;
/* 916 */                           if (zBooleanValue) {
/* 926 */                               boolean zI0000O = O0000Ioio00.I0000O(((OIoi0IIoi) IOOi0Ool1i.I00Io1o110i(arrayList4)).I00iiI, str2);
                                        arrayListI001l0I00 = arrayList4;
/* 930 */                               if (zI0000O) {
/* 932 */                                   arrayListI001l0I00 = IOOi0Ool1i.I001l0I00(arrayList4);
                                        }
                                    }
                                }
/* 936 */                       O11il1ilio1o o11il1ilio1oI00000oIO2 = l1Oo0iIiO1i.I00000oIO(o1oIOiI11o02);
/* 948 */                       if ((o11il1ilio1oI00000oIO2 instanceof O111ooi11li ? (O111ooi11li) o11il1ilio1oI00000oIO2 : null) != null) {
/* 950 */                           O111ooi11li.I000l1(o1oIOiI11o02, arrayListI001l0I00, str2);
                                }
/* 979 */                       l1Oo0iIiO1i.I00000oIO(o1oIOiI11o02).I0001Ioi1lo(this.I00ilO0, this.I00ilI0I1, o11i0Ili, ilIi0Il, iiioilIl1Il, this.I00io1l, arrayList, OooiooIOO.I00000oIO(o11iO00I1o2), mapSingletonMap);
/* 982 */                       return ooiIlOl1iI;
                            } catch (Exception e) {
/* 987 */                       Log.e("AGLlmChatViewModel", "Error occurred while running inference", e);
/* 991 */                       o11iO00I1o2.I000iOII(false);
/* 994 */                       o11iO00I1o2.I000lI(false);
/* 997 */                       String message = e.getMessage();
/* 1005 */                      function1.invoke(message != null ? message : "");
/* 1261 */                      return ooiIlOl1iI;
                            }
                        }
/* 51 */                ooiIlOl1iI = ooiIlOl1iI2;
/* 53 */                long j = this.I00iOIl;
/* 55 */                lIoii1l01l0i.I00000oOI(obj);
/* 60 */                function1 = function12;
/* 61 */                jCurrentTimeMillis = j;
/* 63 */                o1oIOiI11o02 = o1oIOiI11o03;
/* 64 */                r3 = o11iO00I1o3;
/* 65 */                r4 = 0;
                    }
                    while (true) {
/* 175 */               if (o1oIOiI11o02.I00IlilI0i0i == null) {
/* 183 */                   if (System.currentTimeMillis() > jCurrentTimeMillis) {
/* 185 */                       r3.I000iOII(r4);
/* 188 */                       r3.I000lI(r4);
/* 193 */                       function1.invoke("Model initialization timed out");
/* 196 */                       return ooiIlOl1iI;
                            }
/* 197 */                   this.I00iiO = ii0110;
/* 199 */                   this.I00iOIl = jCurrentTimeMillis;
/* 202 */                   this.I00iiI = 1;
/* 210 */                   if (il0l1o1l.I00000oOI(100L, this) == ii0111o) {
                                break;
                            }
                        } else {
/* 213 */                   this.I00iiO = ii0110;
/* 215 */                   this.I00iOIl = jCurrentTimeMillis;
/* 218 */                   this.I00iiI = 2;
                            o11iO00I1o2 = r3;
                            b = r4;
                        }
                    }
/* 228 */           return ii0111o;
                }
            }
