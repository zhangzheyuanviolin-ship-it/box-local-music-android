            package p000;

            import android.os.Bundle;
            import android.os.Handler;
            import android.view.View;
            import android.view.ViewStructure;
            import android.view.autofill.AutofillId;
            import android.view.contentcapture.ContentCaptureSession;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public final class I0lo1oIo implements IiI00001oI, View.OnAttachStateChangeListener {
                public I0lio1O01i01 I00iOIl;
                public I0lii0I00 I00iiI;
                public IoloOio0I I00iiO;
                public ArrayList I00iio;
                public long I00ilI0I1;
                public I0lo0olOoii1 I00ilO0;
                public boolean I00io1l;
                public IIIII1OI1 I00ioIO;
                public OI0l1oli1I I00l0I0l0lO1;
                public long I00l0OO0IO;
                public OI0l1oli1I I00li1OI;
                public Oil000oIIO I00ll1;
                public boolean I00lli11;
                public I0100i I00lll10;

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(r5, r0) == r1) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0082 -> B:13:0x002b). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IOoilo iOoilo) throws Throwable {
                    I0lo1Iol0io i0lo1Iol0io;
                    IIII0iI10 it;
                    IIII0iI10 iIII0iI10;
                    Object objI00000oOI;
/* 3 */             if (iOoilo instanceof I0lo1Iol0io) {
/* 6 */                 i0lo1Iol0io = (I0lo1Iol0io) iOoilo;
/* 8 */                 int i = i0lo1Iol0io.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    i0lo1Iol0io.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    i0lo1Iol0io = new I0lo1Iol0io(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = i0lo1Iol0io.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = i0lo1Iol0io.I00iio;
/* 33 */            if (i2 == 0) {
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 64 */                it = this.I00ioIO.iterator();
/* 68 */                i0lo1Iol0io.I00iOIl = it;
/* 70 */                i0lo1Iol0io.I00iio = 1;
/* 72 */                objI00000oOI = it.I00000oOI(i0lo1Iol0io);
/* 76 */                if (objI00000oOI != ii0111o) {
                        }
/* 133 */               return ii0111o;
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 != 2) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                    return null;
                        }
/* 39 */                iIII0iI10 = i0lo1Iol0io.I00iOIl;
/* 41 */                lIoii1l01l0i.I00000oOI(obj);
/* 44 */                it = iIII0iI10;
/* 68 */                i0lo1Iol0io.I00iOIl = it;
/* 70 */                i0lo1Iol0io.I00iio = 1;
/* 72 */                objI00000oOI = it.I00000oOI(i0lo1Iol0io);
/* 76 */                if (objI00000oOI != ii0111o) {
/* 80 */                    iIII0iI10 = it;
/* 81 */                    obj = objI00000oOI;
/* 88 */                    if (((Boolean) obj).booleanValue()) {
/* 134 */                       return OoiIlOl1iI.I00000oIO;
                            }
/* 90 */                    iIII0iI10.I0000Il00O();
/* 97 */                    if (I0000O()) {
/* 99 */                        I0000oI00();
                            }
/* 104 */                   Handler handler = this.I00iOIl.getHandler();
/* 110 */                   if (!this.I00lli11 && handler != null) {
/* 114 */                       this.I00lli11 = true;
/* 118 */                       handler.post(this.I00lll10);
                            }
/* 121 */                   long j = this.I00ilI0I1;
/* 123 */                   i0lo1Iol0io.I00iOIl = iIII0iI10;
/* 125 */                   i0lo1Iol0io.I00iio = 2;
                        }
/* 133 */               return ii0111o;
                    }
/* 53 */            iIII0iI10 = i0lo1Iol0io.I00iOIl;
/* 55 */            lIoii1l01l0i.I00000oOI(obj);
/* 88 */            if (((Boolean) obj).booleanValue()) {
                    }
                }

                public final void I00000oOI(IooIolI iooIolI) {
                    int[] iArr;
                    long[] jArr;
                    int[] iArr2;
                    long[] jArr2;
                    long j;
                    char c;
                    long j2;
                    int i;
                    int i2;
                    long[] jArr3;
                    Oil000oIIO oil000oIIO;
                    int i3;
                    long[] jArr4;
                    Oil000oIIO oil000oIIO2;
                    String str;
                    long j3;
                    String str2;
                    int i4;
/* 3 */             IooIolI iooIolI2 = iooIolI;
/* 5 */             int[] iArr3 = iooIolI2.I00000oOI;
/* 7 */             long[] jArr5 = iooIolI2.I00000oIO;
                    int length = jArr5.length - 2;
/* 12 */            if (length < 0) {
/* 1261 */              return;
                    }
/* 14 */            int i5 = 0;
                    while (true) {
/* 15 */                long j4 = jArr5[i5];
/* 18 */                char c2 = 7;
/* 21 */                long j5 = -9187201950435737472L;
/* 29 */                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 36 */                    int i6 = 8;
/* 38 */                    int i7 = 8 - ((~(i5 - length)) >>> 31);
/* 40 */                    int i8 = 0;
/* 41 */                    while (i8 < i7) {
/* 51 */                        if ((j4 & 255) < 128) {
/* 57 */                            int i9 = iArr3[(i5 << 3) + i8];
/* 59 */                            c = c2;
/* 67 */                            Oil000oIIO oil000oIIO3 = (Oil000oIIO) this.I00li1OI.I00000oOI(i9);
/* 73 */                            Oil00l oil00l = (Oil00l) iooIolI2.I00000oOI(i9);
/* 82 */                            Oil000 oil000 = oil00l != null ? oil00l.I00000oIO : null;
/* 84 */                            if (oil000 == null) {
/* 477 */                               throw IIlIOloOOO.I000OOo1O("no value for specified key");
                                    }
/* 86 */                            j2 = j5;
/* 88 */                            int i10 = oil000.I0001Ioi1lo;
/* 92 */                            OI10I1IoI0Ol oI10I1IoI0Ol = oil000.I0000O.I00iOIl;
/* 94 */                            String str3 = "Invalid content capture ID";
/* 96 */                            if (oil000oIIO3 == null) {
/* 98 */                                Object[] objArr = oI10I1IoI0Ol.I00000oOI;
/* 102 */                               long[] jArr6 = oI10I1IoI0Ol.I00000oIO;
/* 104 */                               int i11 = i6;
                                        int length2 = jArr6.length - 2;
/* 109 */                               iArr2 = iArr3;
/* 111 */                               jArr2 = jArr5;
/* 113 */                               if (length2 >= 0) {
/* 115 */                                   int i12 = 0;
                                            while (true) {
/* 116 */                                       long j6 = jArr6[i12];
/* 118 */                                       j = j4;
/* 128 */                                       if ((((~j6) << c) & j6 & j2) != j2) {
/* 135 */                                           int i13 = 8 - ((~(i12 - length2)) >>> 31);
/* 137 */                                           int i14 = 0;
/* 138 */                                           while (i14 < i13) {
/* 144 */                                               if ((j6 & 255) < 128) {
/* 152 */                                                   j3 = j6;
/* 156 */                                                   Oil0IoooOio oil0IoooOio = (Oil0IoooOio) objArr[(i12 << 3) + i14];
/* 158 */                                                   Oil0IoooOio oil0IoooOio2 = Oil0I1O.I001lloI;
/* 164 */                                                   if (O0000Ioio00.I0000O(oil0IoooOio, oil0IoooOio2)) {
/* 166 */                                                       Object objI000II = oI10I1IoI0Ol.I000II(oil0IoooOio2);
/* 170 */                                                       if (objI000II == null) {
/* 172 */                                                           objI000II = null;
                                                                }
/* 174 */                                                       List list = (List) objI000II;
/* 187 */                                                       String strValueOf = String.valueOf(list != null ? (I1111OO10i) IOOi0Ool1i.I00II0Ol1O0l(list) : null);
/* 191 */                                                       IoloOio0I ioloOio0I = this.I00iiO;
/* 193 */                                                       if (ioloOio0I != null) {
/* 196 */                                                           str2 = str3;
/* 198 */                                                           i4 = i8;
/* 201 */                                                           AutofillId autofillIdI00IoiI = ioloOio0I.I00IoiI(i10);
/* 205 */                                                           if (autofillIdI00IoiI == null) {
/* 219 */                                                               throw IIlIOloOOO.I000OOo1O(str2);
                                                                    }
/* 211 */                                                           ((ContentCaptureSession) ioloOio0I.I00iiO).notifyViewTextChanged(autofillIdI00IoiI, strValueOf);
                                                                }
                                                            }
/* 226 */                                                   j6 = j3 >> i11;
/* 228 */                                                   i14++;
/* 230 */                                                   i8 = i4;
/* 232 */                                                   str3 = str2;
                                                        } else {
/* 220 */                                                   j3 = j6;
                                                        }
/* 222 */                                               str2 = str3;
/* 224 */                                               i4 = i8;
/* 226 */                                               j6 = j3 >> i11;
/* 228 */                                               i14++;
/* 230 */                                               i8 = i4;
/* 232 */                                               str3 = str2;
                                                    }
/* 235 */                                           str = str3;
/* 237 */                                           i = i8;
/* 241 */                                           if (i13 != i11) {
                                                        break;
                                                    }
                                                } else {
/* 244 */                                           str = str3;
/* 246 */                                           i = i8;
                                                }
/* 248 */                                       if (i12 == length2) {
                                                    break;
                                                }
/* 250 */                                       i12++;
/* 252 */                                       j4 = j;
/* 254 */                                       i8 = i;
/* 256 */                                       str3 = str;
/* 258 */                                       i11 = 8;
                                            }
                                        } else {
/* 262 */                                   j = j4;
/* 264 */                                   i = i8;
                                        }
                                    } else {
/* 268 */                               iArr2 = iArr3;
/* 270 */                               jArr2 = jArr5;
/* 272 */                               j = j4;
/* 276 */                               i = i8;
/* 280 */                               Object[] objArr2 = oI10I1IoI0Ol.I00000oOI;
/* 282 */                               long[] jArr7 = oI10I1IoI0Ol.I00000oIO;
                                        int length3 = jArr7.length - 2;
/* 287 */                               if (length3 >= 0) {
/* 289 */                                   int i15 = 0;
                                            while (true) {
/* 290 */                                       long j7 = jArr7[i15];
/* 292 */                                       Object[] objArr3 = objArr2;
/* 293 */                                       long[] jArr8 = jArr7;
/* 302 */                                       if ((((~j7) << c) & j7 & j2) != j2) {
/* 311 */                                           int i16 = 8 - ((~(i15 - length3)) >>> 31);
/* 313 */                                           int i17 = 0;
/* 314 */                                           while (i17 < i16) {
/* 320 */                                               if ((j7 & 255) < 128) {
/* 327 */                                                   Oil0IoooOio oil0IoooOio3 = (Oil0IoooOio) objArr3[(i15 << 3) + i17];
/* 329 */                                                   i3 = i17;
/* 331 */                                                   Oil0IoooOio oil0IoooOio4 = Oil0I1O.I001lloI;
/* 337 */                                                   if (O0000Ioio00.I0000O(oil0IoooOio3, oil0IoooOio4)) {
/* 343 */                                                       Object objI000II2 = oil000oIIO3.I00000oIO.I00iOIl.I000II(oil0IoooOio4);
/* 347 */                                                       if (objI000II2 == null) {
/* 349 */                                                           objI000II2 = null;
                                                                }
/* 351 */                                                       List list2 = (List) objI000II2;
/* 362 */                                                       I1111OO10i i1111OO10i = list2 != null ? (I1111OO10i) IOOi0Ool1i.I00II0Ol1O0l(list2) : null;
/* 364 */                                                       Object objI000II3 = oI10I1IoI0Ol.I000II(oil0IoooOio4);
/* 368 */                                                       if (objI000II3 == null) {
/* 370 */                                                           objI000II3 = null;
                                                                }
/* 372 */                                                       List list3 = (List) objI000II3;
/* 383 */                                                       I1111OO10i i1111OO10i2 = list3 != null ? (I1111OO10i) IOOi0Ool1i.I00II0Ol1O0l(list3) : null;
/* 389 */                                                       if (!O0000Ioio00.I0000O(i1111OO10i, i1111OO10i2)) {
/* 391 */                                                           String strValueOf2 = String.valueOf(i1111OO10i2);
/* 395 */                                                           IoloOio0I ioloOio0I2 = this.I00iiO;
/* 397 */                                                           if (ioloOio0I2 != null) {
/* 400 */                                                               jArr4 = jArr8;
/* 402 */                                                               oil000oIIO2 = oil000oIIO3;
/* 405 */                                                               AutofillId autofillIdI00IoiI2 = ioloOio0I2.I00IoiI(i10);
/* 409 */                                                               if (autofillIdI00IoiI2 == null) {
/* 423 */                                                                   throw IIlIOloOOO.I000OOo1O("Invalid content capture ID");
                                                                        }
/* 415 */                                                               ((ContentCaptureSession) ioloOio0I2.I00iiO).notifyViewTextChanged(autofillIdI00IoiI2, strValueOf2);
                                                                    }
                                                                }
                                                            }
/* 434 */                                                   j7 >>= 8;
/* 435 */                                                   i17 = i3 + 1;
/* 438 */                                                   oil000oIIO3 = oil000oIIO2;
/* 440 */                                                   jArr8 = jArr4;
                                                        } else {
/* 427 */                                                   i3 = i17;
                                                        }
/* 429 */                                               jArr4 = jArr8;
/* 431 */                                               oil000oIIO2 = oil000oIIO3;
/* 434 */                                               j7 >>= 8;
/* 435 */                                               i17 = i3 + 1;
/* 438 */                                               oil000oIIO3 = oil000oIIO2;
/* 440 */                                               jArr8 = jArr4;
                                                    }
/* 444 */                                           jArr3 = jArr8;
/* 446 */                                           oil000oIIO = oil000oIIO3;
/* 450 */                                           if (i16 != 8) {
                                                        break;
                                                    }
                                                } else {
/* 453 */                                           jArr3 = jArr8;
/* 455 */                                           oil000oIIO = oil000oIIO3;
                                                }
/* 457 */                                       if (i15 == length3) {
                                                    break;
                                                }
/* 459 */                                       i15++;
/* 461 */                                       objArr2 = objArr3;
/* 462 */                                       oil000oIIO3 = oil000oIIO;
/* 464 */                                       jArr7 = jArr3;
                                            }
                                        }
                                    }
/* 468 */                           i2 = 8;
                                } else {
/* 478 */                           iArr2 = iArr3;
/* 480 */                           jArr2 = jArr5;
/* 482 */                           j = j4;
/* 484 */                           c = c2;
/* 486 */                           j2 = j5;
/* 488 */                           i = i8;
/* 490 */                           i2 = i6;
                                }
/* 491 */                       j4 = j >> i2;
/* 493 */                       i8 = i + 1;
/* 495 */                       iooIolI2 = iooIolI;
/* 497 */                       i6 = i2;
/* 498 */                       c2 = c;
/* 500 */                       j5 = j2;
/* 502 */                       iArr3 = iArr2;
/* 504 */                       jArr5 = jArr2;
                            }
/* 508 */                   iArr = iArr3;
/* 510 */                   jArr = jArr5;
/* 513 */                   if (i7 != i6) {
/* 1261 */                      return;
                            }
                        } else {
/* 516 */                   iArr = iArr3;
/* 518 */                   jArr = jArr5;
                        }
/* 520 */               if (i5 == length) {
/* 1261 */                  return;
                        }
/* 522 */               i5++;
/* 524 */               iooIolI2 = iooIolI;
/* 526 */               iArr3 = iArr;
/* 528 */               jArr5 = jArr;
                    }
                }

                public final IooIolI I0000Il00O() {
/* 3 */             if (this.I00io1l) {
/* 6 */                 this.I00io1l = false;
/* 25 */                this.I00l0I0l0lO1 = iO0o00ili.I00000oIO(this.I00iOIl.getSemanticsOwner(), new I01OoIoio00O(20));
/* 31 */                this.I00l0OO0IO = System.currentTimeMillis();
                    }
/* 33 */            return this.I00l0I0l0lO1;
                }

                public final boolean I0000O() {
                    return this.I00iiO != null;
                }

                public final void I0000oI00() {
/* 1 */             ArrayList arrayList = this.I00iio;
/* 3 */             IoloOio0I ioloOio0I = this.I00iiO;
/* 5 */             if (ioloOio0I == null) {
/* 110 */               return;
                    }
/* 10 */            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) ioloOio0I.I00iiO;
/* 16 */            if (arrayList.isEmpty()) {
/* 110 */               return;
                    }
/* 18 */            int size = arrayList.size();
/* 25 */            for (int i = 0; i < size; i++) {
/* 31 */                IOoIOi iOoIOi = (IOoIOi) arrayList.get(i);
/* 35 */                int iOrdinal = iOoIOi.I0000Il00O.ordinal();
/* 39 */                if (iOrdinal == 0) {
/* 60 */                    IIloOI iIloOI = iOoIOi.I0000O;
/* 62 */                    if (iIloOI != null) {
/* 68 */                        contentCaptureSession.notifyViewAppeared((ViewStructure) iIloOI.I00iiI);
                            }
                        } else if (iOrdinal != 1) {
/* 56 */                    I000II.I00000oIO();
/* 59 */                    return;
                        } else {
/* 46 */                    AutofillId autofillIdI00IoiI = ioloOio0I.I00IoiI(iOoIOi.I00000oIO);
/* 50 */                    if (autofillIdI00IoiI != null) {
/* 52 */                        contentCaptureSession.notifyViewDisappeared(autofillIdI00IoiI);
                            }
                        }
                    }
/* 92 */            contentCaptureSession.notifyViewsDisappeared((AutofillId) li1iI1ill1.I00000oIO((View) ioloOio0I.I00iiI).I00iiI, new long[]{Long.MIN_VALUE});
/* 95 */            arrayList.clear();
                }

                public final void I0001Ioi1lo(Oil000 oil000, Oil000oIIO oil000oIIO) {
/* 1 */             OI0l1oli1I oI0l1oli1I = this.I00li1OI;
/* 6 */             I0Il0I1o i0Il0I1o = new I0Il0I1o(3);
/* 9 */             i0Il0I1o.I00iiO = oil000oIIO;
/* 11 */            i0Il0I1o.I00iiI = this;
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            oil000.getClass();
/* 18 */            List listI000OOo1O = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 27 */            int size = listI000OOo1O.size();
/* 33 */            int i = 0;
/* 34 */            for (int i2 = 0; i2 < size; i2++) {
/* 36 */                Object obj = listI000OOo1O.get(i2);
/* 53 */                if (I0000Il00O().I00000oIO(((Oil000) obj).I0001Ioi1lo)) {
/* 59 */                    i0Il0I1o.invoke(Integer.valueOf(i), obj);
/* 62 */                    i++;
                        }
                    }
/* 18 */            List listI000OOo1O2 = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 74 */            int size2 = listI000OOo1O2.size();
/* 78 */            for (int i3 = 0; i3 < size2; i3++) {
/* 84 */                Oil000 oil0002 = (Oil000) listI000OOo1O2.get(i3);
/* 86 */                IooIolI iooIolII0000Il00O = I0000Il00O();
/* 90 */                int i4 = oil0002.I0001Ioi1lo;
/* 96 */                if (iooIolII0000Il00O.I00000oIO(i4) && oI0l1oli1I.I00000oIO(i4)) {
/* 104 */                   Object objI00000oOI = oI0l1oli1I.I00000oOI(i4);
/* 108 */                   if (objI00000oOI == null) {
/* 122 */                       throw IIlIOloOOO.I000OOo1O("node not present in pruned tree before this change");
                            }
/* 112 */                   I0001Ioi1lo(oil0002, (Oil000oIIO) objI00000oOI);
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x0181  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000O01llI0(int i, Oil000 oil000) {
                    Function1 function1;
                    AutofillId autofillIdI00IoiI;
                    OOo0IO oOo0IOI00000oIO;
                    IIloOI iIloOI;
                    String strI0000O;
                    Function1 function12;
/* 9 */             if (I0000O()) {
/* 14 */                OI10I1IoI0Ol oI10I1IoI0Ol = oil000.I0000O.I00iOIl;
/* 18 */                Object objI000II = oI10I1IoI0Ol.I000II(Oil0I1O.I00II0oii1o);
/* 23 */                if (objI000II == null) {
/* 25 */                    objI000II = null;
                        }
/* 26 */                Boolean bool = (Boolean) objI000II;
/* 32 */                if (this.I00ilO0 == I0lo0olOoii1.I00iOIl && O0000Ioio00.I0000O(bool, Boolean.TRUE)) {
/* 44 */                    Object objI000II2 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000lI);
/* 48 */                    if (objI000II2 == null) {
/* 50 */                        objI000II2 = null;
                            }
/* 51 */                    I01lOOlO0o i01lOOlO0o = (I01lOOlO0o) objI000II2;
/* 53 */                    if (i01lOOlO0o != null && (function12 = (Function1) i01lOOlO0o.I00000oOI) != null) {
                            }
                        } else if (this.I00ilO0 == I0lo0olOoii1.I00iiI && O0000Ioio00.I0000O(bool, Boolean.FALSE)) {
/* 86 */                    Object objI000II3 = oI10I1IoI0Ol.I000II(Oiioi1IoIIli.I000lI);
/* 90 */                    if (objI000II3 == null) {
/* 92 */                        objI000II3 = null;
                            }
/* 93 */                    I01lOOlO0o i01lOOlO0o2 = (I01lOOlO0o) objI000II3;
/* 95 */                    if (i01lOOlO0o2 != null && (function1 = (Function1) i01lOOlO0o2.I00000oOI) != null) {
                            }
                        }
/* 111 */               int i2 = oil000.I0001Ioi1lo;
/* 113 */               IoloOio0I ioloOio0I = this.I00iiO;
/* 116 */               if (ioloOio0I == null) {
/* 118 */                   iIloOI = null;
                        } else {
/* 123 */                   IIloOI iIloOII00000oIO = li1iI1ill1.I00000oIO(this.I00iOIl);
/* 127 */                   Oil000 oil000I000l1 = oil000.I000l1();
/* 131 */                   int i3 = oil000.I0001Ioi1lo;
/* 133 */                   if (oil000I000l1 != null) {
/* 138 */                       autofillIdI00IoiI = ioloOio0I.I00IoiI(oil000I000l1.I0001Ioi1lo);
/* 142 */                       if (autofillIdI00IoiI == null) {
                                }
                            } else {
/* 147 */                       autofillIdI00IoiI = (AutofillId) iIloOII00000oIO.I00iiI;
                            }
/* 154 */                   ViewStructure viewStructureNewVirtualViewStructure = ((ContentCaptureSession) ioloOio0I.I00iiO).newVirtualViewStructure(autofillIdI00IoiI, i3);
/* 162 */                   IIloOI iIloOI2 = new IIloOI(28);
/* 165 */                   iIloOI2.I00iiI = viewStructureNewVirtualViewStructure;
/* 167 */                   VarHandle.storeStoreFence();
/* 170 */                   OiioiIIlooo oiioiIIlooo = oil000.I0000O;
/* 172 */                   Oil0IoooOio oil0IoooOio = Oil0I1O.I00IoO0;
/* 174 */                   OI10I1IoI0Ol oI10I1IoI0Ol2 = oiioiIIlooo.I00iOIl;
/* 180 */                   if (!oI10I1IoI0Ol2.I0000Il00O(oil0IoooOio)) {
/* 183 */                       Bundle extras = viewStructureNewVirtualViewStructure.getExtras();
/* 187 */                       if (extras != null) {
/* 193 */                           extras.putLong("android.view.contentcapture.EventTimestamp", this.I00l0OO0IO);
/* 200 */                           extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                                }
/* 205 */                       Object objI000II4 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001lIiIIo1O);
/* 209 */                       if (objI000II4 == null) {
/* 211 */                           objI000II4 = null;
                                }
/* 212 */                       String str = (String) objI000II4;
/* 214 */                       if (str != null) {
/* 216 */                           viewStructureNewVirtualViewStructure.setId(i3, null, null, str);
                                }
/* 221 */                       Object objI000II5 = oI10I1IoI0Ol2.I000II(Oil0I1O.I000o00OoI0I);
/* 225 */                       if (objI000II5 == null) {
/* 227 */                           objI000II5 = null;
                                }
/* 230 */                       if (((Boolean) objI000II5) != null) {
/* 234 */                           viewStructureNewVirtualViewStructure.setClassName("android.widget.ViewGroup");
                                }
/* 239 */                       Object objI000II6 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001lloI);
/* 243 */                       if (objI000II6 == null) {
/* 245 */                           objI000II6 = null;
                                }
/* 246 */                       List list = (List) objI000II6;
/* 252 */                       if (list != null) {
/* 256 */                           viewStructureNewVirtualViewStructure.setClassName("android.widget.TextView");
/* 263 */                           viewStructureNewVirtualViewStructure.setText(O10lllI0o0.I00000oIO(list, "\n", null, 62));
                                }
/* 268 */                       Object objI000II7 = oI10I1IoI0Ol2.I000II(Oil0I1O.I00IO1oi11O);
/* 272 */                       if (objI000II7 == null) {
/* 274 */                           objI000II7 = null;
                                }
/* 275 */                       I1111OO10i i1111OO10i = (I1111OO10i) objI000II7;
/* 277 */                       if (i1111OO10i != null) {
/* 281 */                           viewStructureNewVirtualViewStructure.setClassName("android.widget.EditText");
/* 284 */                           viewStructureNewVirtualViewStructure.setText(i1111OO10i);
                                }
/* 289 */                       Object objI000II8 = oI10I1IoI0Ol2.I000II(Oil0I1O.I00000oIO);
/* 293 */                       if (objI000II8 == null) {
/* 295 */                           objI000II8 = null;
                                }
/* 296 */                       List list2 = (List) objI000II8;
/* 298 */                       if (list2 != null) {
/* 304 */                           viewStructureNewVirtualViewStructure.setContentDescription(O10lllI0o0.I00000oIO(list2, "\n", null, 62));
                                }
/* 309 */                       Object objI000II9 = oI10I1IoI0Ol2.I000II(Oil0I1O.I001l0I00);
/* 313 */                       if (objI000II9 == null) {
/* 315 */                           objI000II9 = null;
                                }
/* 316 */                       Oi1o00lo oi1o00lo = (Oi1o00lo) objI000II9;
/* 318 */                       if (oi1o00lo != null && (strI0000O = lO1i1O.I0000O(oi1o00lo.I00000oIO)) != null) {
/* 328 */                           viewStructureNewVirtualViewStructure.setClassName(strI0000O);
                                }
/* 331 */                       Oo0iil0o0oI oo0iil0o0oII00000oOI = lO1i1O.I00000oOI(oiioiIIlooo);
/* 335 */                       if (oo0iil0o0oII00000oOI != null) {
/* 337 */                           Oo0iiO1 oo0iiO1 = oo0iil0o0oII00000oOI.I00000oIO;
/* 339 */                           Oo0lloOiiIOI oo0lloOiiIOI = oo0iiO1.I00000oOI;
/* 341 */                           IiIooOOOI iiIooOOOI = oo0iiO1.I000II;
/* 361 */                           viewStructureNewVirtualViewStructure.setTextStyle(iiIooOOOI.I00Ol00() * iiIooOOOI.I00000oIO() * Oo0o1OiIo.I0000O(oo0lloOiiIOI.I00000oIO.I00000oOI), 0, 0, 0);
                                }
/* 364 */                       OIIlIII0Ili oIIlIII0IliI0000O = oil000.I0000O();
/* 368 */                       if (oIIlIII0IliI0000O == null) {
/* 386 */                           oOo0IOI00000oIO = OOo0IO.I0000oI00;
/* 388 */                           float f = oOo0IOI00000oIO.I00000oIO;
/* 391 */                           float f2 = oOo0IOI00000oIO.I00000oOI;
/* 408 */                           viewStructureNewVirtualViewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (oOo0IOI00000oIO.I0000Il00O - f), (int) (oOo0IOI00000oIO.I0000O - f2));
/* 411 */                           iIloOI = iIloOI2;
                                } else {
/* 376 */                           OIIlIII0Ili oIIlIII0Ili = oIIlIII0IliI0000O.I0110OiO().I00lll10 ? oIIlIII0IliI0000O : null;
/* 379 */                           if (oIIlIII0Ili != null) {
/* 381 */                               oOo0IOI00000oIO = oil000.I00000oIO(oIIlIII0Ili);
                                    }
/* 388 */                           float f3 = oOo0IOI00000oIO.I00000oIO;
/* 391 */                           float f22 = oOo0IOI00000oIO.I00000oOI;
/* 408 */                           viewStructureNewVirtualViewStructure.setDimens((int) f3, (int) f22, 0, 0, (int) (oOo0IOI00000oIO.I0000Il00O - f3), (int) (oOo0IOI00000oIO.I0000O - f22));
/* 411 */                           iIloOI = iIloOI2;
                                }
                            }
                        }
/* 412 */               if (iIloOI != null) {
/* 426 */                   this.I00iio.add(new IOoIOi(i2, this.I00l0OO0IO, IOoIiIOliiO1.I00iOIl, iIloOI));
                        }
/* 18 */                List listI000OOo1O = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 437 */               int size = listI000OOo1O.size();
/* 441 */               int i4 = 0;
/* 442 */               for (int i5 = 0; i5 < size; i5++) {
/* 444 */                   Object obj = listI000OOo1O.get(i5);
/* 461 */                   if (I0000Il00O().I00000oIO(((Oil000) obj).I0001Ioi1lo)) {
/* 465 */                       I000O01llI0(i4, (Oil000) obj);
/* 468 */                       i4++;
                            }
                        }
                    }
                }

                public final void I000OOo1O(Oil000 oil000) {
/* 5 */             if (I0000O()) {
/* 22 */                this.I00iio.add(new IOoIOi(oil000.I0001Ioi1lo, this.I00l0OO0IO, IOoIiIOliiO1.I00iiI, null));
/* 18 */                List listI000OOo1O = oil000.I000OOo1O((4 & 1) != 0 ? !oil000.I00000oOI : false, (4 & 2) == 0);
/* 33 */                int size = listI000OOo1O.size();
/* 38 */                for (int i = 0; i < size; i++) {
/* 46 */                    I000OOo1O((Oil000) listI000OOo1O.get(i));
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OiO() {
/* 3 */             OI0l1oli1I oI0l1oli1I = this.I00li1OI;
/* 5 */             oI0l1oli1I.I0000Il00O();
/* 8 */             IooIolI iooIolII0000Il00O = I0000Il00O();
/* 12 */            int[] iArr = iooIolII0000Il00O.I00000oOI;
/* 14 */            Object[] objArr = iooIolII0000Il00O.I0000Il00O;
/* 16 */            long[] jArr = iooIolII0000Il00O.I00000oIO;
                    int length = jArr.length - 2;
/* 21 */            if (length >= 0) {
/* 23 */                int i = 0;
                        while (true) {
/* 24 */                    long j = jArr[i];
/* 38 */                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 47 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 50 */                        for (int i3 = 0; i3 < i2; i3++) {
/* 59 */                            if ((255 & j) < 128) {
/* 63 */                                int i4 = (i << 3) + i3;
/* 81 */                                oI0l1oli1I.I000OOo1O(iArr[i4], new Oil000oIIO(((Oil00l) objArr[i4]).I00000oIO, I0000Il00O()));
                                    }
/* 84 */                            j >>= 8;
                                }
/* 88 */                        if (i2 != 8) {
                                    break;
                                } else if (i == length) {
                                    break;
                                } else {
/* 92 */                            i++;
                                }
                            }
                        }
                    }
/* 114 */           this.I00ll1 = new Oil000oIIO(this.I00iOIl.getSemanticsOwner().I00000oIO(), I0000Il00O());
                }

                @Override
                public final void onStart(O0oiOi o0oiOi) {
/* 9 */             this.I00iiO = (IoloOio0I) this.I00iiI.invoke();
/* 22 */            I000O01llI0(-1, this.I00iOIl.getSemanticsOwner().I00000oIO());
/* 25 */            I0000oI00();
                }

                @Override
                public final void onStop(O0oiOi o0oiOi) {
/* 11 */            I000OOo1O(this.I00iOIl.getSemanticsOwner().I00000oIO());
/* 14 */            I0000oI00();
/* 18 */            this.I00iiO = null;
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 9 */             this.I00iOIl.getHandler().removeCallbacks(this.I00lll10);
/* 13 */            this.I00iiO = null;
                }

                @Override
/* 28 */        public final void onViewAttachedToWindow(View view) {
                }
            }
