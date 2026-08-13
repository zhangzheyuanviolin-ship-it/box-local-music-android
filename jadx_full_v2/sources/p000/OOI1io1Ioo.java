            package p000;

            import android.os.Trace;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OOI1io1Ioo implements O0llilIO0 {
                public final int I00000oIO;
                public final IoIlOo1o0IIl I00000oOI;
                public final Function1 I0000Il00O;
                public IOo0oO11ll1O I0000O;
                public Oli1o0 I0000oI00;
                public Oli1llO I0001Ioi1lo;
                public boolean I000II;
                public boolean I000O01llI0;
                public boolean I000OOo1O;
                public Object I000OiO;
                public boolean I000iOII;
                public OOI1il I000l1;
                public boolean I000lI;
                public long I000o00OoI0I;
                public long I000oI1ioi;
                public long I00100l0 = OI0101io.I00000oIO();
                public boolean I00100o1O0lo;
                public final I1ii1l10IO I0010I0i;

                public OOI1io1Ioo(I1ii1l10IO i1ii1l10IO, int i, IoIlOo1o0IIl ioIlOo1o0IIl, Function1 function1) {
/* 4 */             this.I0010I0i = i1ii1l10IO;
/* 6 */             this.I00000oIO = i;
/* 8 */             this.I00000oOI = ioIlOo1o0IIl;
/* 10 */            this.I0000Il00O = function1;
                }

                @Override
                public final void I00000oIO() {
/* 2 */             this.I000lI = true;
                }

                public final void I00000oOI() {
/* 1 */             Oli1llO oli1llO = this.I0001Ioi1lo;
/* 3 */             if (oli1llO != null) {
/* 5 */                 oli1llO.cancel();
                    }
/* 9 */             this.I0001Ioi1lo = null;
/* 11 */            Oli1o0 oli1o0 = this.I0000oI00;
/* 13 */            if (oli1o0 != null) {
/* 15 */                oli1o0.I00000oOI();
                    }
/* 18 */            this.I0000oI00 = null;
/* 20 */            this.I000l1 = null;
                }

                public final boolean I0000Il00O(I0oo0IlI01li i0oo0IlI01li) {
                    boolean zI0000O;
/* 5 */             if (!this.I0010I0i.I00000oIO) {
/* 7 */                 return false;
                    }
/* 11 */            if (this.I000lI) {
/* 15 */                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                        try {
/* 18 */                    zI0000O = I0000O(i0oo0IlI01li);
                        } finally {
/* 27 */                    Trace.endSection();
                        }
                    } else {
/* 31 */                zI0000O = I0000O(i0oo0IlI01li);
                    }
/* 39 */            Trace.setCounter("compose:lazy:prefetch:execute:item", -1L);
/* 77 */            return zI0000O;
                }

                /* JADX WARN: Removed duplicated region for block: B:97:0x01c0  */
                /* JADX WARN: Type inference failed for: r12v10, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r12v11 */
                /* JADX WARN: Type inference failed for: r12v9 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean I0000O(I0oo0IlI01li i0oo0IlI01li) {
                    long j;
                    ?? r12;
                    List list;
/* 3 */             int i = this.I00000oIO;
                    long j2 = i;
/* 8 */             Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
/* 23 */            O0liilOIOii o0liilOIOii = (O0liilOIOii) ((O0liI0l) this.I0010I0i.I00000oOI).I00000oOI.invoke();
/* 28 */            if (!this.I000O01llI0) {
/* 30 */                int iI00000oIO = o0liilOIOii.I00000oIO();
/* 34 */                if (i >= 0 && i < iI00000oIO) {
/* 38 */                    Object objI00000oOI = o0liilOIOii.I00000oOI(i);
/* 42 */                    Object obj = this.I000OiO;
/* 44 */                    if (obj != null && !objI00000oOI.equals(obj)) {
/* 52 */                        I00000oOI();
/* 27 */                        return false;
                            }
/* 56 */                    Object objI0000Il00O = o0liilOIOii.I0000Il00O(i);
/* 60 */                    IoIlOo1o0IIl ioIlOo1o0IIl = this.I00000oOI;
/* 64 */                    I1li0IIIli i1li0IIIli = (I1li0IIIli) ioIlOo1o0IIl.I00iio;
/* 69 */                    if (ioIlOo1o0IIl.I00iiO != objI0000Il00O || i1li0IIIli == null) {
/* 76 */                        OI10I1IoI0Ol oI10I1IoI0Ol = (OI10I1IoI0Ol) ioIlOo1o0IIl.I00iiI;
/* 78 */                        Object objI000II = oI10I1IoI0Ol.I000II(objI0000Il00O);
                                Object obj2 = objI000II;
/* 82 */                        if (objI000II == null) {
/* 86 */                            I1li0IIIli i1li0IIIli2 = new I1li0IIIli();
/* 89 */                            i1li0IIIli2.I0000oI00 = -1;
/* 91 */                            oI10I1IoI0Ol.I000lI(objI0000Il00O, i1li0IIIli2);
                                    obj2 = i1li0IIIli2;
                                }
/* 95 */                        i1li0IIIli = (I1li0IIIli) obj2;
/* 97 */                        ioIlOo1o0IIl.I00iiO = objI0000Il00O;
/* 99 */                        ioIlOo1o0IIl.I00iio = i1li0IIIli;
                            }
/* 101 */                   I0000oI00();
/* 104 */                   long jI00000oIO = i0oo0IlI01li.I00000oIO();
/* 108 */                   this.I000o00OoI0I = jI00000oIO;
/* 114 */                   this.I00100l0 = OI0101io.I00000oIO();
/* 118 */                   this.I000oI1ioi = 0L;
/* 122 */                   Trace.setCounter("compose:lazy:prefetch:available_time_nanos", jI00000oIO);
/* 129 */                   if (I0000oI00()) {
/* 172 */                       j = 0;
                            } else {
/* 133 */                       j = 0;
/* 143 */                       if (I000O01llI0(this.I000o00OoI0I, i1li0IIIli.I00000oIO + i1li0IIIli.I00000oOI)) {
/* 147 */                           Trace.beginSection("compose:lazy:prefetch:compose");
                                    try {
/* 150 */                               I0001Ioi1lo(objI00000oOI, objI0000Il00O, i1li0IIIli);
                                    } finally {
                                    }
                                }
/* 166 */                       if (!I0000oI00()) {
/* 168 */                           return true;
                                }
                            }
/* 176 */                   if (this.I0001Ioi1lo != null) {
/* 186 */                       if (!I000O01llI0(this.I000o00OoI0I, i1li0IIIli.I0000Il00O)) {
/* 168 */                           return true;
                                }
/* 190 */                       Trace.beginSection("compose:lazy:prefetch:apply");
                                try {
/* 193 */                           Oli1llO oli1llO = this.I0001Ioi1lo;
/* 195 */                           if (oli1llO == null) {
/* 232 */                               throw new IllegalArgumentException("Nothing to apply!");
                                    }
/* 201 */                           this.I0000oI00 = oli1llO.apply();
/* 203 */                           this.I0001Ioi1lo = null;
/* 206 */                           this.I000OOo1O = true;
/* 208 */                           Trace.endSection();
/* 211 */                           I000OOo1O();
/* 222 */                           i1li0IIIli.I0000Il00O = I1li0IIIli.I00000oIO(this.I000oI1ioi, i1li0IIIli.I0000Il00O);
                                } finally {
                                }
                            }
/* 240 */                   if (!this.I000iOII) {
/* 246 */                       if (this.I000o00OoI0I <= j) {
/* 168 */                           return true;
                                }
/* 250 */                       Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                                try {
/* 257 */                           this.I000l1 = I000II();
/* 260 */                           this.I000iOII = true;
                                } finally {
                                }
                            }
/* 271 */                   OOI1il oOI1il = this.I000l1;
/* 273 */                   if (oOI1il != null) {
/* 275 */                       int i2 = i1li0IIIli.I0000oI00;
/* 277 */                       boolean z = this.I000lI;
/* 279 */                       List[] listArr = oOI1il.I00000oOI;
/* 281 */                       int i3 = oOI1il.I0000Il00O;
/* 283 */                       List list2 = oOI1il.I00000oIO;
/* 289 */                       if (i3 < list2.size()) {
/* 297 */                           if (oOI1il.I0001Ioi1lo.I000O01llI0) {
/* 301 */                               Ioll0IliO1l.I0000Il00O("Should not execute nested prefetch on canceled request");
                                    }
/* 306 */                           Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                                    try {
/* 312 */                               int size = list2.size();
/* 317 */                               for (int i4 = 0; i4 < size; i4++) {
/* 327 */                                   ((O0llioI1) list2.get(i4)).I0000O = i2;
                                        }
/* 332 */                               Trace.endSection();
/* 337 */                               Trace.beginSection("compose:lazy:prefetch:nested");
/* 346 */                               while (oOI1il.I0000Il00O < list2.size()) {
                                            try {
/* 352 */                                       if (listArr[oOI1il.I0000Il00O] == null) {
/* 360 */                                           if (i0oo0IlI01li.I00000oIO() <= j) {
/* 362 */                                               Trace.endSection();
/* 365 */                                               return true;
                                                    }
/* 368 */                                           int i5 = oOI1il.I0000Il00O;
/* 374 */                                           O0llioI1 o0llioI1 = (O0llioI1) list2.get(i5);
/* 376 */                                           Function1 function1 = o0llioI1.I00000oIO;
/* 378 */                                           if (function1 == null) {
/* 380 */                                               list = Il01100l.I00iOIl;
                                                    } else {
/* 385 */                                               int i6 = o0llioI1.I0000O;
/* 387 */                                               O0llO0 o0llO0 = new O0llO0();
/* 390 */                                               o0llO0.I0000Il00O = o0llioI1;
/* 392 */                                               o0llO0.I00000oIO = i6;
/* 396 */                                               ArrayList arrayList = new ArrayList();
/* 399 */                                               o0llO0.I00000oOI = arrayList;
/* 401 */                                               VarHandle.storeStoreFence();
/* 404 */                                               function1.invoke(o0llO0);
/* 411 */                                               o0llioI1.I0001Ioi1lo = arrayList.size();
/* 413 */                                               list = arrayList;
                                                    }
/* 414 */                                           listArr[i5] = list;
                                                }
/* 418 */                                       List list3 = listArr[oOI1il.I0000Il00O];
/* 426 */                                       while (oOI1il.I0000O < list3.size()) {
/* 434 */                                           OOI1io1Ioo oOI1io1Ioo = (OOI1io1Ioo) list3.get(oOI1il.I0000O);
/* 436 */                                           if (z) {
/* 442 */                                               OOI1io1Ioo oOI1io1Ioo2 = oOI1io1Ioo != null ? oOI1io1Ioo : null;
/* 443 */                                               if (oOI1io1Ioo2 != null) {
/* 445 */                                                   r12 = 1;
/* 446 */                                                   oOI1io1Ioo2.I000lI = true;
                                                        }
                                                    } else {
/* 449 */                                               r12 = 1;
                                                    }
/* 450 */                                           oOI1il.I0000oI00 = r12;
/* 458 */                                           if (oOI1io1Ioo.I0000Il00O(i0oo0IlI01li)) {
/* 463 */                                               return r12;
                                                    }
                                                    oOI1il.I0000O += r12;
                                                }
/* 472 */                                       oOI1il.I0000O = 0;
                                                oOI1il.I0000Il00O++;
                                            } finally {
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
/* 499 */                   OOI1il oOI1il2 = this.I000l1;
/* 501 */                   if (oOI1il2 != null && oOI1il2.I0000oI00) {
/* 508 */                       I000OOo1O();
/* 511 */                       Trace.setCounter("compose:lazy:prefetch:execute:item", j2);
/* 514 */                       OOI1il oOI1il3 = this.I000l1;
/* 516 */                       if (oOI1il3 != null) {
/* 518 */                           oOI1il3.I0000oI00 = false;
                                }
                            }
/* 520 */                   IOo0oO11ll1O iOo0oO11ll1O = this.I0000O;
/* 524 */                   if (!this.I000II && iOo0oO11ll1O != null) {
/* 536 */                       if (!I000O01llI0(this.I000o00OoI0I, i1li0IIIli.I0000O)) {
/* 168 */                           return true;
                                }
/* 540 */                       Trace.beginSection("compose:lazy:prefetch:measure");
                                try {
/* 543 */                           long j3 = iOo0oO11ll1O.I00000oIO;
/* 547 */                           if (this.I000O01llI0) {
/* 551 */                               Ioll0IliO1l.I00000oIO("Callers should check whether the request is still valid before calling performMeasure()");
                                    }
/* 556 */                           if (this.I000II) {
/* 560 */                               Ioll0IliO1l.I00000oIO("Request was already measured!");
                                    }
/* 564 */                           this.I000II = true;
/* 566 */                           Oli1o0 oli1o0 = this.I0000oI00;
/* 568 */                           if (oli1o0 == null) {
/* 613 */                               throw IlIi0I0.I0000oI00("performComposition() must be called before performMeasure()");
                                    }
/* 570 */                           int iI0000O = oli1o0.I0000O();
/* 575 */                           for (int i7 = 0; i7 < iI0000O; i7++) {
/* 577 */                               oli1o0.I0000oI00(i7, j3);
                                    }
/* 583 */                           Trace.endSection();
/* 586 */                           I000OOo1O();
/* 597 */                           i1li0IIIli.I0000O = I1li0IIIli.I00000oIO(this.I000oI1ioi, i1li0IIIli.I0000O);
/* 599 */                           Function1 function12 = this.I0000Il00O;
/* 601 */                           if (function12 != null) {
/* 603 */                               function12.invoke(this);
                                    }
                                } finally {
                                }
                            }
/* 620 */                   OOI1il oOI1il4 = this.I000l1;
/* 624 */                   if (this.I000II && this.I000iOII && oOI1il4 != null) {
/* 632 */                       List list4 = oOI1il4.I00000oIO;
/* 635 */                       List list5 = list4;
/* 637 */                       int size2 = list5.size();
/* 644 */                       int iMin = Integer.MAX_VALUE;
/* 646 */                       for (int i8 = 0; i8 < size2; i8++) {
/* 656 */                           iMin = Math.min(iMin, ((O0llioI1) list4.get(i8)).I0000oI00);
                                }
/* 663 */                       if (iMin == Integer.MAX_VALUE) {
/* 665 */                           iMin = 0;
                                }
/* 666 */                       int i9 = i1li0IIIli.I0000oI00;
/* 678 */                       i1li0IIIli.I0000oI00 = i9 == -1 ? iMin : ((i9 * 3) + iMin) / 4;
/* 680 */                       int size3 = list5.size();
/* 684 */                       int iMin2 = Integer.MAX_VALUE;
/* 686 */                       for (int i10 = 0; i10 < size3; i10++) {
/* 696 */                           iMin2 = Math.min(iMin2, ((O0llioI1) list4.get(i10)).I0001Ioi1lo);
                                }
/* 703 */                       if (iMin2 == Integer.MAX_VALUE) {
/* 705 */                           iMin2 = 0;
                                }
/* 706 */                       if (iMin2 < iMin) {
/* 709 */                           i1li0IIIli.I0000O = j;
                                }
                            }
/* 27 */                    return false;
                        }
                    }
/* 712 */           I00000oOI();
/* 27 */            return false;
                }

                public final boolean I0000oI00() {
                    Oli1llO oli1llO;
                    return this.I000OOo1O || ((oli1llO = this.I0001Ioi1lo) != null && oli1llO.I001IIilI0O());
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0001Ioi1lo(Object obj, Object obj2, I1li0IIIli i1li0IIIli) {
                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi;
/* 1 */             Oli1llO oli1llO = this.I0001Ioi1lo;
/* 3 */             if (oli1llO == null) {
/* 5 */                 I1ii1l10IO i1ii1l10IO = this.I0010I0i;
/* 13 */                IlliIl1l11O illiIl1l11OI00000oIO = ((O0liI0l) i1ii1l10IO.I00000oOI).I00000oIO(this.I00000oIO, obj, obj2);
/* 21 */                O0io0olo o0io0oloI00000oIO = ((Oli1o0i) i1ii1l10IO.I0000Il00O).I00000oIO();
/* 31 */                int i = 17;
/* 33 */                if (o0io0oloI00000oIO.I00iOIl.I00Io1lO()) {
/* 50 */                    o0io0oloI00000oIO.I000iOII(obj, illiIl1l11OI00000oIO, true);
/* 55 */                    I1I0i0Ilo1Oi i1I0i0Ilo1Oi2 = new I1I0i0Ilo1Oi(i);
/* 58 */                    i1I0i0Ilo1Oi2.I00iiI = o0io0oloI00000oIO;
/* 60 */                    i1I0i0Ilo1Oi2.I00iiO = obj;
/* 62 */                    VarHandle.storeStoreFence();
                            i1I0i0Ilo1Oi = i1I0i0Ilo1Oi2;
                        } else {
/* 37 */                    OlOO1i11110 olOO1i11110 = new OlOO1i11110(i);
/* 40 */                    olOO1i11110.I00iiI = o0io0oloI00000oIO;
/* 42 */                    olOO1i11110.I00iiO = obj;
/* 44 */                    VarHandle.storeStoreFence();
                            i1I0i0Ilo1Oi = olOO1i11110;
                        }
/* 47 */                oli1llO = i1I0i0Ilo1Oi;
/* 66 */                this.I0001Ioi1lo = oli1llO;
/* 68 */                this.I000OiO = obj;
                    }
/* 71 */            this.I00100o1O0lo = false;
/* 77 */            while (!oli1llO.I001IIilI0O() && !this.I00100o1O0lo) {
/* 87 */                IIoIil iIoIil = new IIoIil(12);
/* 90 */                iIoIil.I00iiI = this;
/* 92 */                iIoIil.I00iiO = i1li0IIIli;
/* 94 */                VarHandle.storeStoreFence();
/* 97 */                oli1llO.I000oI1ioi(iIoIil);
                    }
/* 101 */           I000OOo1O();
/* 104 */           boolean z = this.I00100o1O0lo;
/* 106 */           long j = this.I000oI1ioi;
/* 108 */           if (z) {
/* 116 */               i1li0IIIli.I00000oOI = I1li0IIIli.I00000oIO(j, i1li0IIIli.I00000oOI);
                    } else {
/* 125 */               i1li0IIIli.I00000oIO = I1li0IIIli.I00000oIO(j, i1li0IIIli.I00000oIO);
                    }
                }

                public final OOI1il I000II() {
/* 1 */             Oli1o0 oli1o0 = this.I0000oI00;
/* 3 */             if (oli1o0 == null) {
/* 110 */               throw IlIi0I0.I0000oI00("Should precompose before resolving nested prefetch states");
                    }
/* 7 */             OOo0ooi oOo0ooi = new OOo0ooi();
/* 13 */            I0lOo1lO i0lOo1lO = new I0lOo1lO(5);
/* 16 */            i0lOo1lO.I00iiI = oOo0ooi;
/* 18 */            VarHandle.storeStoreFence();
/* 21 */            oli1o0.I00000oIO(i0lOo1lO);
/* 26 */            List list = (List) oOo0ooi.I00iOIl;
/* 28 */            if (list == null) {
/* 68 */                return null;
                    }
/* 32 */            OOI1il oOI1il = new OOI1il();
/* 35 */            oOI1il.I0001Ioi1lo = this;
/* 37 */            oOI1il.I00000oIO = list;
/* 45 */            oOI1il.I00000oOI = new List[list.size()];
/* 53 */            if (!list.isEmpty()) {
/* 64 */                VarHandle.storeStoreFence();
/* 67 */                return oOI1il;
                    }
/* 57 */            Ioll0IliO1l.I00000oIO("NestedPrefetchController shouldn't be created with no states");
/* 60 */            VarHandle.storeStoreFence();
/* 63 */            return oOI1il;
                }

                public final boolean I000O01llI0(long j, long j2) {
/* 3 */             if (this.I000lI) {
/* 5 */                 j2 = 0;
                    }
                    return j > j2;
                }

                public final void I000OOo1O() {
                    long jI00000oIO;
/* 1 */             long jI00000oIO2 = OI0101io.I00000oIO();
/* 5 */             long j = this.I00100l0;
/* 7 */             Iio1llolooo iio1llolooo = Iio1llolooo.I00iiI;
/* 14 */            long j2 = Long.MAX_VALUE;
/* 21 */            if (((j - 1) | 1) != Long.MAX_VALUE) {
/* 53 */                jI00000oIO = (1 | (jI00000oIO2 - 1)) == Long.MAX_VALUE ? l11O00IiOiOi.I00000oIO(jI00000oIO2) : l11O00IiOiOi.I00000oOI(jI00000oIO2, j);
                    } else if (jI00000oIO2 == j) {
/* 27 */                IOO0o0I1l iOO0o0I1l = Iio1OlIo0.I00iiI;
/* 29 */                jI00000oIO = 0;
                    } else {
/* 36 */                jI00000oIO = Iio1OlIo0.I000O01llI0(l11O00IiOiOi.I00000oIO(j));
                    }
/* 58 */            long j3 = jI00000oIO >> 1;
/* 60 */            IOO0o0I1l iOO0o0I1l2 = Iio1OlIo0.I00iiI;
/* 64 */            if ((((int) jI00000oIO) & 1) == 0) {
/* 66 */                j2 = j3;
                    } else if (j3 <= 9223372036854L) {
/* 93 */                j2 = j3 < -9223372036854L ? Long.MIN_VALUE : j3 * 1000000;
                    }
/* 95 */            this.I000oI1ioi = j2;
/* 99 */            long j4 = this.I000o00OoI0I - j2;
/* 100 */           this.I000o00OoI0I = j4;
/* 102 */           this.I00100l0 = jI00000oIO2;
/* 106 */           Trace.setCounter("compose:lazy:prefetch:available_time_nanos", j4);
                }

                @Override
                public final void cancel() {
/* 3 */             if (this.I000O01llI0) {
/* 20 */                return;
                    }
/* 6 */             this.I000O01llI0 = true;
/* 8 */             I00000oOI();
                }

                public final String toString() {
/* 1 */             IOo0oO11ll1O iOo0oO11ll1O = this.I0000O;
/* 3 */             boolean zI0000oI00 = I0000oI00();
/* 7 */             boolean z = this.I000II;
/* 9 */             boolean z2 = this.I000O01llI0;
/* 15 */            StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
/* 20 */            sb.append(this.I00000oIO);
/* 25 */            sb.append(", constraints = ");
/* 28 */            sb.append(iOo0oO11ll1O);
/* 33 */            sb.append(", isComposed = ");
/* 36 */            sb.append(zI0000oI00);
/* 41 */            sb.append(", isMeasured = ");
/* 44 */            sb.append(z);
/* 49 */            sb.append(", isCanceled = ");
/* 54 */            return IIlIOloOOO.I0010o(sb, z2, " }");
                }
            }
