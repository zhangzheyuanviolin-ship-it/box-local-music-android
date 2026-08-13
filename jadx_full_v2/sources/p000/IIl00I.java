            package p000;

            import android.content.SharedPreferences;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.mlkit.genai.imagedescription.ImageDescriber;
            import com.google.mlkit.genai.proofreading.Proofreader;
            import com.google.mlkit.genai.rewriting.Rewriter;
            import com.google.mlkit.genai.summarization.Summarizer;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function1;
            
            public final class IIl00I extends Oll0io implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public final Object I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IIl00I(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 6 */             super(1, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = obj;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiO;
                    switch (i) {
                        case 0:
/* 116 */                   return new IIl00I((IIl0001i1o01) obj, iOoil1iiIilo, 0);
                        case 1:
/* 107 */                   return new IIl00I((IO01o11o0lI0) obj, iOoil1iiIilo, 1);
                        case 2:
/* 98 */                    return new IIl00I((OiooIIlO) obj, iOoil1iiIilo, 2);
                        case 3:
/* 89 */                    return new IIl00I((Ii1O1I) obj, iOoil1iiIilo, 3);
                        case 4:
/* 80 */                    return new IIl00I((ImageDescriber) obj, iOoil1iiIilo, 4);
                        case 5:
/* 71 */                    return new IIl00I((Proofreader) obj, iOoil1iiIilo, 5);
                        case 6:
/* 62 */                    return new IIl00I((Rewriter) obj, iOoil1iiIilo, 6);
                        case 7:
/* 53 */                    return new IIl00I((Summarizer) obj, iOoil1iiIilo, 7);
                        case 8:
/* 44 */                    return new IIl00I((Oiill0lI1il1) obj, iOoil1iiIilo, 8);
                        case 9:
/* 34 */                    return new IIl00I((Oo0IOoOi01) obj, iOoil1iiIilo, 9);
                        case 10:
/* 24 */                    return new IIl00I((Oo1o1iil) obj, iOoil1iiIilo, 10);
                        default:
/* 14 */                    return new IIl00I((OolI1lo) obj, iOoil1iiIilo, 11);
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                    }
/* 16 */            return ((IIl00I) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:59:0x00f4, code lost:
                
                    if (r0 == r1) goto L60;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object objI00000oIO;
                    Object objI00000oIO2;
                    Object objI00000oIO3;
                    Object objI00000oIO4;
                    Object objI0000Il00O;
/* 3 */             int i = this.I00iOIl;
/* 5 */             int i2 = 5;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Object obj2 = this.I00iiO;
/* 13 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 676 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 678 */                   int i3 = this.I00iiI;
/* 680 */                   if (i3 != 0) {
/* 682 */                       if (i3 == 1) {
/* 684 */                           lIoii1l01l0i.I00000oOI(obj);
/* 713 */                           return ooiIlOl1iI;
                                }
/* 688 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 693 */                   lIoii1l01l0i.I00000oOI(obj);
/* 698 */                   this.I00iiI = 1;
/* 702 */                   Object objI0010o = ((IIl0001i1o01) obj2).I000l1.I0010o(this);
/* 706 */                   if (objI0010o != ii0111o) {
/* 709 */                       objI0010o = ooiIlOl1iI;
                            }
                            return objI0010o == ii0111o ? ii0111o : ooiIlOl1iI;
                        case 1:
/* 642 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 644 */                   int i4 = this.I00iiI;
/* 646 */                   if (i4 == 0) {
/* 661 */                       lIoii1l01l0i.I00000oOI(obj);
/* 666 */                       this.I00iiI = 1;
/* 668 */                       Object objI000II = ((IO01o11o0lI0) obj2).I000II(this);
                                return objI000II == ii0111o2 ? ii0111o2 : objI000II;
                            }
/* 648 */                   if (i4 == 1) {
/* 650 */                       lIoii1l01l0i.I00000oOI(obj);
/* 653 */                       return obj;
                            }
/* 656 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 2:
/* 528 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 530 */                   int i5 = this.I00iiI;
/* 532 */                   if (i5 == 0) {
/* 545 */                       lIoii1l01l0i.I00000oOI(obj);
/* 548 */                       OiooIIlO oiooIIlO = (OiooIIlO) obj2;
/* 550 */                       this.I00iiI = 1;
/* 560 */                       SharedPreferences.Editor editorEdit = ((SharedPreferences) oiooIIlO.I0000oI00.getValue()).edit();
/* 564 */                       Set set = oiooIIlO.I0001Ioi1lo;
/* 566 */                       if (set == null) {
/* 568 */                           editorEdit.clear();
                                } else {
/* 575 */                           Iterator it = set.iterator();
/* 583 */                           while (it.hasNext()) {
/* 591 */                               editorEdit.remove((String) it.next());
                                    }
                                }
/* 599 */                       if (editorEdit.commit()) {
/* 617 */                           if (((SharedPreferences) oiooIIlO.I0000oI00.getValue()).getAll().isEmpty()) {
/* 623 */                               oiooIIlO.I0000Il00O.deleteSharedPreferences(oiooIIlO.I0000O);
                                    }
/* 626 */                           if (set != null) {
/* 628 */                               set.clear();
                                    }
                                    return ooiIlOl1iI == ii0111o3 ? ii0111o3 : ooiIlOl1iI;
                                }
/* 637 */                       IioIoO10iOiI.I000OOo1O("Unable to delete migrated keys from SharedPreferences.");
                            } else {
/* 534 */                       if (i5 == 1) {
/* 536 */                           lIoii1l01l0i.I00000oOI(obj);
/* 641 */                           return ooiIlOl1iI;
                                }
/* 540 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                            }
/* 13 */                    return null;
                        case 3:
/* 494 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 496 */                   int i6 = this.I00iiI;
/* 498 */                   if (i6 == 0) {
/* 513 */                       lIoii1l01l0i.I00000oOI(obj);
/* 518 */                       this.I00iiI = 1;
/* 520 */                       Object objInvoke = ((Ii1O1I) obj2).invoke(this);
                                return objInvoke == ii0111o4 ? ii0111o4 : objInvoke;
                            }
/* 500 */                   if (i6 == 1) {
/* 502 */                       lIoii1l01l0i.I00000oOI(obj);
/* 505 */                       return obj;
                            }
/* 508 */                   I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        case 4:
/* 455 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 457 */                   int i7 = this.I00iiI;
/* 459 */                   if (i7 == 0) {
/* 473 */                       lIoii1l01l0i.I00000oOI(obj);
/* 478 */                       ListenableFuture listenableFutureCheckFeatureStatus = ((ImageDescriber) obj2).checkFeatureStatus();
/* 482 */                       this.I00iiI = 1;
/* 484 */                       objI00000oIO = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus, this);
/* 488 */                       if (objI00000oIO == ii0111o5) {
/* 490 */                           return ii0111o5;
                                }
                            } else {
/* 461 */                       if (i7 != 1) {
/* 469 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 463 */                       lIoii1l01l0i.I00000oOI(obj);
/* 466 */                       objI00000oIO = obj;
                            }
/* 492 */                   return objI00000oIO;
                        case 5:
/* 416 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 418 */                   int i8 = this.I00iiI;
/* 420 */                   if (i8 == 0) {
/* 434 */                       lIoii1l01l0i.I00000oOI(obj);
/* 439 */                       ListenableFuture listenableFutureCheckFeatureStatus2 = ((Proofreader) obj2).checkFeatureStatus();
/* 443 */                       this.I00iiI = 1;
/* 445 */                       objI00000oIO2 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus2, this);
/* 449 */                       if (objI00000oIO2 == ii0111o6) {
/* 451 */                           return ii0111o6;
                                }
                            } else {
/* 422 */                       if (i8 != 1) {
/* 430 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 424 */                       lIoii1l01l0i.I00000oOI(obj);
/* 427 */                       objI00000oIO2 = obj;
                            }
/* 453 */                   return objI00000oIO2;
                        case 6:
/* 377 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 379 */                   int i9 = this.I00iiI;
/* 381 */                   if (i9 == 0) {
/* 395 */                       lIoii1l01l0i.I00000oOI(obj);
/* 400 */                       ListenableFuture listenableFutureCheckFeatureStatus3 = ((Rewriter) obj2).checkFeatureStatus();
/* 404 */                       this.I00iiI = 1;
/* 406 */                       objI00000oIO3 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus3, this);
/* 410 */                       if (objI00000oIO3 == ii0111o7) {
/* 412 */                           return ii0111o7;
                                }
                            } else {
/* 383 */                       if (i9 != 1) {
/* 391 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 385 */                       lIoii1l01l0i.I00000oOI(obj);
/* 388 */                       objI00000oIO3 = obj;
                            }
/* 414 */                   return objI00000oIO3;
                        case 7:
/* 338 */                   Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 340 */                   int i10 = this.I00iiI;
/* 342 */                   if (i10 == 0) {
/* 356 */                       lIoii1l01l0i.I00000oOI(obj);
/* 361 */                       ListenableFuture listenableFutureCheckFeatureStatus4 = ((Summarizer) obj2).checkFeatureStatus();
/* 365 */                       this.I00iiI = 1;
/* 367 */                       objI00000oIO4 = l10o1ollO.I00000oIO(listenableFutureCheckFeatureStatus4, this);
/* 371 */                       if (objI00000oIO4 == ii0111o8) {
/* 373 */                           return ii0111o8;
                                }
                            } else {
/* 344 */                       if (i10 != 1) {
/* 352 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 346 */                       lIoii1l01l0i.I00000oOI(obj);
/* 349 */                       objI00000oIO4 = obj;
                            }
/* 375 */                   return objI00000oIO4;
                        case 8:
/* 252 */                   Oiill0lI1il1 oiill0lI1il1 = (Oiill0lI1il1) obj2;
/* 254 */                   Ii0111o ii0111o9 = Ii0111o.I00iOIl;
/* 256 */                   int i11 = this.I00iiI;
/* 258 */                   if (i11 != 0) {
/* 260 */                       if (i11 == 1) {
/* 262 */                           lIoii1l01l0i.I00000oOI(obj);
/* 337 */                           return ooiIlOl1iI;
                                }
/* 266 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 271 */                   lIoii1l01l0i.I00000oOI(obj);
/* 274 */                   OIoi0IIoi oIoi0IIoiI000II = oiill0lI1il1.I000II();
/* 278 */                   if (oIoi0IIoiI000II == null) {
/* 337 */                       return ooiIlOl1iI;
                            }
/* 283 */                   I1111OO10i i1111OO10i = (I1111OO10i) oIoi0IIoiI000II.I00iOIl;
/* 289 */                   long j = ((Oo0lI00l) oIoi0IIoiI000II.I00iiI).I00000oIO;
/* 291 */                   OO1O0I oo1o0i = oiill0lI1il1.I00oO101o;
/* 293 */                   if (oo1o0i == null) {
/* 337 */                       return ooiIlOl1iI;
                            }
/* 295 */                   this.I00iiI = 1;
/* 326 */                   Object objI0000oI00 = (i1111OO10i.length() == 0 || Oo0lI00l.I0000O(j)) ? ooiIlOl1iI : iOi1II01i0.I0000oI00(oo1o0i.I00000oIO, new O1o1iI(oo1o0i, new I00oO101o(oo1o0i, i1111OO10i, j, (IOoil1iiIilo) null, 4), iOoil1iiIilo, i2), this);
/* 330 */                   if (objI0000oI00 != ii0111o9) {
/* 333 */                       objI0000oI00 = ooiIlOl1iI;
                            }
                            return objI0000oI00 == ii0111o9 ? ii0111o9 : ooiIlOl1iI;
                        case 9:
/* 146 */                   Oo0IOoOi01 oo0IOoOi01 = (Oo0IOoOi01) obj2;
/* 148 */                   Ii0111o ii0111o10 = Ii0111o.I00iOIl;
/* 150 */                   int i12 = this.I00iiI;
/* 153 */                   if (i12 == 0) {
/* 172 */                       lIoii1l01l0i.I00000oOI(obj);
/* 175 */                       this.I00iiI = 1;
/* 181 */                       if (oo0IOoOi01.I00111O(this) != ii0111o10) {
                                }
/* 247 */                       return ii0111o10;
                            }
/* 155 */                   if (i12 != 1) {
/* 157 */                       if (i12 != 2) {
/* 163 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 159 */                       lIoii1l01l0i.I00000oOI(obj);
/* 249 */                       oo0IOoOi01.I001lllioOl = true;
/* 251 */                       return ooiIlOl1iI;
                            }
/* 168 */                   lIoii1l01l0i.I00000oOI(obj);
/* 184 */                   OIoi0IIoi oIoi0IIoiI0001Ioi1lo = oo0IOoOi01.I0001Ioi1lo();
/* 188 */                   if (oIoi0IIoiI0001Ioi1lo != null) {
/* 193 */                       String str = (String) oIoi0IIoiI0001Ioi1lo.I00iOIl;
/* 199 */                       long j2 = ((Oo0lI00l) oIoi0IIoiI0001Ioi1lo.I00iiI).I00000oIO;
/* 201 */                       OO1O0I oo1o0i2 = oo0IOoOi01.I000OiO;
/* 203 */                       if (oo1o0i2 != null) {
/* 205 */                           this.I00iiI = 2;
/* 237 */                           Object objI0000oI002 = (str.length() == 0 || Oo0lI00l.I0000O(j2)) ? ooiIlOl1iI : iOi1II01i0.I0000oI00(oo1o0i2.I00000oIO, new O1o1iI(oo1o0i2, new I00oO101o(oo1o0i2, str, j2, (IOoil1iiIilo) null, 4), iOoil1iiIilo, i2), this);
/* 241 */                           if (objI0000oI002 != ii0111o10) {
/* 244 */                               objI0000oI002 = ooiIlOl1iI;
                                        break;
                                    }
                                }
                            }
/* 249 */                   oo0IOoOi01.I001lllioOl = true;
/* 251 */                   return ooiIlOl1iI;
                        case 10:
/* 91 */                    Ii0111o ii0111o11 = Ii0111o.I00iOIl;
/* 93 */                    int i13 = this.I00iiI;
/* 95 */                    if (i13 != 0) {
/* 97 */                        if (i13 == 1) {
/* 99 */                            lIoii1l01l0i.I00000oOI(obj);
/* 145 */                           return ooiIlOl1iI;
                                }
/* 103 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 108 */                   lIoii1l01l0i.I00000oOI(obj);
/* 111 */                   Oo1o1iil oo1o1iil = (Oo1o1iil) obj2;
/* 113 */                   this.I00iiI = 1;
/* 121 */                   IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(this));
/* 124 */                   iIoOoIol0Io0.I00111O();
/* 133 */                   oo1o1iil.I00000oOI.I00iiO.setValue(Boolean.TRUE);
/* 136 */                   oo1o1iil.I0000Il00O = iIoOoIol0Io0;
                            return iIoOoIol0Io0.I0010I0i() == ii0111o11 ? ii0111o11 : ooiIlOl1iI;
                        default:
/* 17 */                    Ii0111o ii0111o12 = Ii0111o.I00iOIl;
/* 19 */                    int i14 = this.I00iiI;
                            try {
/* 24 */                        if (i14 == 0) {
/* 38 */                            lIoii1l01l0i.I00000oOI(obj);
/* 41 */                            l11I11lO.I0000O(3, "CXCP");
/* 48 */                            IIll0oO iIll0oOI00000oIO = ((OolI1lo) obj2).I0000Il00O.I00000oIO();
/* 52 */                            this.I00iiI = 1;
/* 54 */                            objI0000Il00O = iIll0oOI00000oIO.I0000Il00O(this);
/* 58 */                            if (objI0000Il00O == ii0111o12) {
/* 60 */                                return ii0111o12;
                                    }
                                } else {
/* 26 */                            if (i14 != 1) {
/* 34 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 28 */                            lIoii1l01l0i.I00000oOI(obj);
/* 31 */                            objI0000Il00O = obj;
                                }
/* 63 */                        AutoCloseable autoCloseable = (AutoCloseable) objI0000Il00O;
                                try {
/* 68 */                            IOi10loi iOi10loiI000O01llI0 = ((IIll1i) autoCloseable).I000O01llI0();
/* 72 */                            iOOl00.I00000oIO(autoCloseable, null);
/* 75 */                            return iOi10loiI000O01llI0;
                                } finally {
                                }
                            } catch (CancellationException unused) {
/* 85 */                        l11I11lO.I0000O(3, "CXCP");
/* 88 */                        return OolI1lo.I000l1;
                            }
                    }
                }
            }
