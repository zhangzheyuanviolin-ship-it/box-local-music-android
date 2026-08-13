            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.CancellationException;
            import kotlin.jvm.functions.Function3;
            
/* 11 */    public final class I0i11IIlO extends Oll0io implements Function3 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0i11IIlO(Iililo00OiO iililo00OiO, I0l10OiIOil i0l10OiIOil, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             super(3, iOoil1iiIilo);
/* 2 */             this.I00iOIl = 1;
/* 4 */             this.I00iio = iililo00OiO;
/* 6 */             this.I00ilI0I1 = i0l10OiIOil;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 3;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 188 */                   I0i11IIlO i0i11IIlO = new I0i11IIlO((IlliIl1l11O) this.I00ilI0I1, (IOoil1iiIilo) obj3, 0);
/* 191 */                   i0i11IIlO.I00iiO = (OO11OoloI) obj;
/* 193 */                   i0i11IIlO.I00iio = (Ii1olII1lO1) obj2;
/* 195 */                   return i0i11IIlO.invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 165 */                   I0i11IIlO i0i11IIlO2 = new I0i11IIlO((Iililo00OiO) this.I00iio, (I0l10OiIOil) this.I00ilI0I1, (IOoil1iiIilo) obj3);
/* 168 */                   i0i11IIlO2.I00iiO = (I0l1I0I0i10I) obj;
/* 170 */                   return i0i11IIlO2.invokeSuspend(ooiIlOl1iI);
                        case 2:
/* 137 */                   I0i11IIlO i0i11IIlO3 = new I0i11IIlO(i2, (IOoil1iiIilo) obj3);
/* 140 */                   i0i11IIlO3.I00iiO = (OO11OoloI) obj;
/* 142 */                   i0i11IIlO3.I00iio = (Ii1olII1lO1) obj2;
/* 144 */                   return i0i11IIlO3.invokeSuspend(ooiIlOl1iI);
                        case 3:
/* 117 */                   I0i11IIlO i0i11IIlO4 = new I0i11IIlO((IoIlI1oli) this.I00ilI0I1, (IOoil1iiIilo) obj3, i2);
/* 120 */                   i0i11IIlO4.I00iiO = (OO11OoloI) obj;
/* 122 */                   i0i11IIlO4.I00iio = obj2;
/* 124 */                   return i0i11IIlO4.invokeSuspend(ooiIlOl1iI);
                        case 4:
/* 95 */                    I0i11IIlO i0i11IIlO5 = new I0i11IIlO((IOIooi0ol1i) this.I00ilI0I1, (IOoil1iiIilo) obj3, 4);
/* 98 */                    i0i11IIlO5.I00iiO = (Oil11Ii) obj;
/* 100 */                   i0i11IIlO5.I00iio = (IoO10oI0o) obj2;
/* 102 */                   return i0i11IIlO5.invokeSuspend(ooiIlOl1iI);
                        case 5:
/* 70 */                    I0i11IIlO i0i11IIlO6 = new I0i11IIlO((Function3) this.I00ilI0I1, (IOoil1iiIilo) obj3, 5);
/* 73 */                    i0i11IIlO6.I00iiO = (O00iOil) obj;
/* 75 */                    i0i11IIlO6.I00iio = (Oi0I01oil) obj2;
/* 77 */                    return i0i11IIlO6.invokeSuspend(ooiIlOl1iI);
                        case 6:
/* 45 */                    I0i11IIlO i0i11IIlO7 = new I0i11IIlO((String) this.I00ilI0I1, (IOoil1iiIilo) obj3, 6);
/* 48 */                    i0i11IIlO7.I00iiO = (IlOil1iooOO0) obj;
/* 50 */                    i0i11IIlO7.I00iio = (Throwable) obj2;
/* 52 */                    return i0i11IIlO7.invokeSuspend(ooiIlOl1iI);
                        default:
/* 22 */                    I0i11IIlO i0i11IIlO8 = new I0i11IIlO((IlliOIo0o10) this.I00ilI0I1, (IOoil1iiIilo) obj3, 7);
/* 25 */                    i0i11IIlO8.I00iiO = (OO11OoloI) obj;
/* 27 */                    return i0i11IIlO8.invokeSuspend(ooiIlOl1iI);
                    }
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IOlOl10 iOlOl10;
                    I0i11IIlO i0i11IIlO;
                    OoOO010 ooOO010;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 839 */                   OO11OoloI oO11OoloI = (OO11OoloI) this.I00iiO;
/* 843 */                   Ii1olII1lO1 ii1olII1lO1 = (Ii1olII1lO1) this.I00iio;
/* 845 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 847 */                   int i2 = this.I00iiI;
/* 849 */                   if (i2 == 0) {
/* 868 */                       lIoii1l01l0i.I00000oOI(obj);
/* 873 */                       IlliIl1l11O illiIl1l11O = (IlliIl1l11O) this.I00ilI0I1;
/* 875 */                       this.I00iiO = oO11OoloI;
/* 877 */                       this.I00iio = null;
/* 879 */                       this.I00iiI = 1;
/* 881 */                       obj = illiIl1l11O.invoke(ii1olII1lO1, this);
/* 885 */                       if (obj != ii0111o) {
                                }
/* 904 */                       return ii0111o;
                            }
/* 851 */                   if (i2 != 1) {
/* 853 */                       if (i2 == 2) {
/* 855 */                           lIoii1l01l0i.I00000oOI(obj);
/* 905 */                           return ooiIlOl1iI;
                                }
/* 859 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 864 */                   lIoii1l01l0i.I00000oOI(obj);
/* 888 */                   Ii1olII1lO1 ii1olII1lO12 = (Ii1olII1lO1) obj;
/* 890 */                   if (ii1olII1lO12 == null) {
/* 905 */                       return ooiIlOl1iI;
                            }
/* 892 */                   this.I00iiO = null;
/* 894 */                   this.I00iio = null;
/* 896 */                   this.I00iiI = 2;
/* 902 */                   if (oO11OoloI.I0000oI00(this, ii1olII1lO12) != ii0111o) {
/* 905 */                       return ooiIlOl1iI;
                            }
/* 904 */                   return ii0111o;
                        case 1:
/* 780 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 782 */                   int i3 = this.I00iiI;
/* 784 */                   if (i3 != 0) {
/* 786 */                       if (i3 == 1) {
/* 788 */                           lIoii1l01l0i.I00000oOI(obj);
/* 835 */                           return ooiIlOl1iI;
                                }
/* 792 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 797 */                   lIoii1l01l0i.I00000oOI(obj);
/* 802 */                   I0l1I0I0i10I i0l1I0I0i10I = (I0l1I0I0i10I) this.I00iiO;
/* 806 */                   Iililo00OiO iililo00OiO = (Iililo00OiO) this.I00iio;
/* 810 */                   I0l10OiIOil i0l10OiIOil = (I0l10OiIOil) this.I00ilI0I1;
/* 816 */                   I00o101lO i00o101lO = new I00o101lO(10);
/* 819 */                   i00o101lO.I00iiI = i0l10OiIOil;
/* 821 */                   i00o101lO.I00iiO = i0l1I0I0i10I;
/* 823 */                   VarHandle.storeStoreFence();
/* 826 */                   this.I00iiI = 1;
                            return iililo00OiO.invoke(i00o101lO, this) == ii0111o2 ? ii0111o2 : ooiIlOl1iI;
                        case 2:
/* 523 */                   OO11OoloI oO11OoloI2 = (OO11OoloI) this.I00iiO;
/* 528 */                   Ii1olII1lO1 ii1olII1lO13 = (Ii1olII1lO1) this.I00iio;
/* 530 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 532 */                   int i4 = this.I00iiI;
                            try {
/* 536 */                       if (i4 == 0) {
/* 566 */                           lIoii1l01l0i.I00000oOI(obj);
/* 569 */                           IoIlIolo10o ioIlIolo10oI00iOIl = ii1olII1lO13.I00iOIl();
/* 573 */                           IOlOl10 attributes = ioIlIolo10oI00iOIl.getAttributes();
/* 587 */                           if (attributes.I0000Il00O().containsKey(IiioIIllI.I00000oIO)) {
/* 595 */                               O1I1OOiol o1I1OOiol = (O1I1OOiol) IiioIIllI.I0000Il00O.getValue();
/* 601 */                               if (!o1I1OOiol.I000II()) {
/* 741 */                                   return ooiIlOl1iI;
                                        }
/* 625 */                               o1I1OOiol.I000o00OoI0I("Skipping body saving for " + ioIlIolo10oI00iOIl.I0000O().getUrl());
/* 741 */                               return ooiIlOl1iI;
                                    }
/* 636 */                           O1I1OOiol o1I1OOiol2 = (O1I1OOiol) IiioIIllI.I0000Il00O.getValue();
/* 642 */                           if (o1I1OOiol2.I000II()) {
/* 664 */                               o1I1OOiol2.I000o00OoI0I("Saving body for " + ioIlIolo10oI00iOIl.I0000O().getUrl());
                                    }
/* 667 */                           this.I00iiO = oO11OoloI2;
/* 669 */                           this.I00iio = ii1olII1lO13;
/* 671 */                           this.I00ilI0I1 = attributes;
/* 673 */                           this.I00iiI = 1;
/* 675 */                           obj = lO0OOOl.I00000oIO(ioIlIolo10oI00iOIl, this);
/* 679 */                           if (obj == ii0111o3) {
/* 740 */                               return ii0111o3;
                                    }
/* 682 */                           iOlOl10 = attributes;
                                } else {
/* 538 */                           if (i4 != 1) {
/* 540 */                               if (i4 == 2) {
/* 542 */                                   lIoii1l01l0i.I00000oOI(obj);
/* 741 */                                   return ooiIlOl1iI;
                                        }
/* 547 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                                 return null;
                                    }
/* 555 */                           iOlOl10 = (IOlOl10) this.I00ilI0I1;
/* 557 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
/* 685 */                       Ii1olII1lO1 ii1olII1lO1I0000oI00 = ((IoIlIolo10o) obj).I0000oI00();
/* 689 */                       I1OoollI1Il1 i1OoollI1Il1 = IiioIIllI.I00000oIO;
/* 691 */                       IIIoloiiI1 iIIoloiiI1I0000Il00O = ii1olII1lO13.I0000Il00O();
/* 699 */                       if (!iIIoloiiI1I0000Il00O.I000O01llI0()) {
                                    try {
/* 701 */                               iIIoloiiI1I0000Il00O.I0000O(null);
                                    } catch (CancellationException e) {
/* 720 */                               throw e;
                                    } catch (Exception e2) {
/* 714 */                               ((O1I1OOiol) IiioIIllI.I0000Il00O.getValue()).I000iOII("Failed to cancel response body", e2);
                                    }
                                }
/* 723 */                       iOlOl10.I0000oI00(IiioIIllI.I00000oOI, ooiIlOl1iI);
/* 726 */                       this.I00iiO = null;
/* 728 */                       this.I00iio = null;
/* 730 */                       this.I00ilI0I1 = null;
/* 732 */                       this.I00iiI = 2;
/* 738 */                       if (oO11OoloI2.I0000oI00(this, ii1olII1lO1I0000oI00) != ii0111o3) {
/* 741 */                           return ooiIlOl1iI;
                                }
/* 740 */                       return ii0111o3;
                            } catch (Throwable th) {
                                try {
/* 742 */                           throw th;
                                } catch (Throwable th2) {
/* 745 */                           I1OoollI1Il1 i1OoollI1Il12 = IiioIIllI.I00000oIO;
/* 747 */                           IIIoloiiI1 iIIoloiiI1I0000Il00O2 = ii1olII1lO13.I0000Il00O();
/* 755 */                           if (iIIoloiiI1I0000Il00O2.I000O01llI0()) {
/* 778 */                               throw th2;
                                    }
                                    try {
/* 757 */                               iIIoloiiI1I0000Il00O2.I0000O(th);
/* 778 */                               throw th2;
                                    } catch (CancellationException e3) {
/* 777 */                               throw e3;
                                    } catch (Exception e4) {
/* 771 */                               ((O1I1OOiol) IiioIIllI.I0000Il00O.getValue()).I000iOII("Failed to cancel response body", e4);
/* 778 */                               throw th2;
                                    }
                                }
                            }
                        case 3:
/* 389 */                   OO11OoloI oO11OoloI3 = (OO11OoloI) this.I00iiO;
/* 391 */                   Object obj2 = this.I00iio;
/* 393 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 395 */                   int i5 = this.I00iiI;
/* 397 */                   if (i5 == 0) {
/* 416 */                       lIoii1l01l0i.I00000oOI(obj);
/* 421 */                       if (!(obj2 instanceof IoIlIolo10o)) {
/* 474 */                           StringBuilder sb = new StringBuilder("Error: HttpClientCall expected, but found ");
/* 477 */                           sb.append(obj2);
/* 486 */                           O0IOli0o0 o0IOli0o0I00000oOI = OOoOl0i.I00000oIO.I00000oOI(obj2.getClass());
/* 492 */                           sb.append('(');
/* 495 */                           sb.append(o0IOli0o0I00000oOI);
/* 500 */                           sb.append(").");
/* 516 */                           throw new IllegalStateException(sb.toString().toString());
                                }
/* 427 */                       IoO0l0Iiioll ioO0l0Iiioll = ((IoIlI1oli) this.I00ilI0I1).I00io1l;
/* 432 */                       Ii1olII1lO1 ii1olII1lO1I0000oI002 = ((IoIlIolo10o) obj2).I0000oI00();
/* 436 */                       this.I00iiO = oO11OoloI3;
/* 438 */                       this.I00iio = obj2;
/* 440 */                       this.I00iiI = 1;
/* 442 */                       obj = ioO0l0Iiioll.I00000oIO(ooiIlOl1iI, ii1olII1lO1I0000oI002, this);
/* 446 */                       if (obj != ii0111o4) {
                                }
/* 468 */                       return ii0111o4;
                            }
/* 399 */                   if (i5 != 1) {
/* 401 */                       if (i5 == 2) {
/* 403 */                           lIoii1l01l0i.I00000oOI(obj);
/* 469 */                           return ooiIlOl1iI;
                                }
/* 407 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 412 */                   lIoii1l01l0i.I00000oOI(obj);
/* 454 */                   ((IoIlIolo10o) obj2).I00iiO = (Ii1olII1lO1) obj;
/* 456 */                   this.I00iiO = null;
/* 458 */                   this.I00iio = null;
/* 460 */                   this.I00iiI = 2;
/* 466 */                   if (oO11OoloI3.I0000oI00(this, obj2) != ii0111o4) {
/* 469 */                       return ooiIlOl1iI;
                            }
/* 468 */                   return ii0111o4;
                        case 4:
/* 300 */                   Oil11Ii oil11Ii = (Oil11Ii) this.I00iiO;
/* 304 */                   IoO10oI0o ioO10oI0o = (IoO10oI0o) this.I00iio;
/* 306 */                   Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 308 */                   int i6 = this.I00iiI;
/* 310 */                   if (i6 == 0) {
/* 329 */                       lIoii1l01l0i.I00000oOI(obj);
/* 332 */                       this.I00iiO = oil11Ii;
/* 334 */                       this.I00iio = ioO10oI0o;
/* 336 */                       this.I00iiI = 1;
/* 340 */                       obj = oil11Ii.I00iOIl.I00000oIO(ioO10oI0o, this);
/* 344 */                       if (obj != ii0111o5) {
                                }
/* 384 */                       return ii0111o5;
                            }
/* 312 */                   if (i6 != 1) {
/* 314 */                       if (i6 == 2) {
/* 316 */                           lIoii1l01l0i.I00000oOI(obj);
/* 385 */                           return obj;
                                }
/* 320 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 325 */                   lIoii1l01l0i.I00000oOI(obj);
/* 347 */                   IoIlIolo10o ioIlIolo10o = (IoIlIolo10o) obj;
/* 363 */                   if (!IoO101.I00000oIO.contains(ioIlIolo10o.I0000O().getMethod())) {
/* 385 */                       return ioIlIolo10o;
                            }
/* 370 */                   IoIlI1oli ioIlI1oli = ((IOIooi0ol1i) this.I00ilI0I1).I00000oIO;
/* 372 */                   this.I00iiO = null;
/* 374 */                   this.I00iio = null;
/* 376 */                   this.I00iiI = 2;
/* 378 */                   Object objI00000oIO = IoO101.I00000oIO(oil11Ii, ioO10oI0o, ioIlIolo10o, ioIlI1oli, this);
/* 382 */                   if (objI00000oIO != ii0111o5) {
/* 385 */                       return objI00000oIO;
                            }
/* 384 */                   return ii0111o5;
                        case 5:
/* 212 */                   O00iOil o00iOil = (O00iOil) this.I00iiO;
/* 216 */                   Oi0I01oil oi0I01oil = (Oi0I01oil) this.I00iio;
/* 218 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 220 */                   int i7 = this.I00iiI;
/* 222 */                   if (i7 == 0) {
/* 234 */                       lIoii1l01l0i.I00000oOI(obj);
/* 237 */                       O011OoiO1 o011OoiO1I00000oIO = O01oO1I1O.I00000oIO();
/* 241 */                       O011OoiO1 o011OoiO1I00000oIO2 = O01oO1I1O.I00000oIO();
/* 245 */                       i1i0olI i1i0oli = o011OoiO1I00000oIO2.I00000oOI;
/* 255 */                       O01O0o1iI o01O0o1iII0000Il00O = o011OoiO1I00000oIO2.I0000Il00O(O00iOil.Companion.serializer(), o00iOil);
/* 259 */                       i1i0olI i1i0oli2 = o011OoiO1I00000oIO.I00000oOI;
/* 273 */                       Oi01i1OIl oi01i1OIl = (Oi01i1OIl) o011OoiO1I00000oIO.I00000oIO(Oi01i1OIl.Companion.serializer(), o01O0o1iII0000Il00O);
/* 277 */                       Function3 function3 = (Function3) this.I00ilI0I1;
/* 279 */                       this.I00iiO = o00iOil;
/* 281 */                       this.I00iio = oi0I01oil;
/* 283 */                       this.I00iiI = 1;
/* 285 */                       obj = function3.invoke(oi01i1OIl, oi0I01oil, this);
/* 289 */                       if (obj == ii0111o6) {
/* 291 */                           return ii0111o6;
                                }
                            } else {
/* 224 */                       if (i7 != 1) {
/* 230 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 226 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 294 */                   return (Oi0OO01oi) obj;
                        case 6:
/* 144 */                   IlOil1iooOO0 ilOil1iooOO0 = (IlOil1iooOO0) this.I00iiO;
/* 148 */                   Throwable th3 = (Throwable) this.I00iio;
/* 150 */                   Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 152 */                   int i8 = this.I00iiI;
/* 154 */                   if (i8 != 0) {
/* 156 */                       if (i8 == 1) {
/* 158 */                           lIoii1l01l0i.I00000oOI(obj);
/* 208 */                           return ooiIlOl1iI;
                                }
/* 162 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 167 */                   lIoii1l01l0i.I00000oOI(obj);
/* 182 */                   Log.e("RagIngest", "Ingest failed for ".concat((String) this.I00ilI0I1), th3);
/* 187 */                   OOl0l00Oii1I oOl0l00Oii1I = new OOl0l00Oii1I();
/* 190 */                   oOl0l00Oii1I.I00000oIO = th3;
/* 192 */                   VarHandle.storeStoreFence();
/* 195 */                   this.I00iiO = null;
/* 197 */                   this.I00iio = null;
/* 199 */                   this.I00iiI = 1;
                            return ilOil1iooOO0.emit(oOl0l00Oii1I, this) == ii0111o7 ? ii0111o7 : ooiIlOl1iI;
                        default:
/* 15 */                    OO11OoloI oO11OoloI4 = (OO11OoloI) this.I00iiO;
/* 17 */                    Ii0111o ii0111o8 = Ii0111o.I00iOIl;
/* 19 */                    int i9 = this.I00iiI;
/* 21 */                    if (i9 == 0) {
/* 47 */                        lIoii1l01l0i.I00000oOI(obj);
/* 54 */                        IoO1o1 ioO1o1 = (IoO1o1) oO11OoloI4.I0000Il00O();
/* 56 */                        OoOO010 ooOO0102 = ioO1o1.I00000oIO;
/* 58 */                        Object obj3 = ioO1o1.I00000oOI;
/* 62 */                        if (!(obj3 instanceof IIIoloiiI1)) {
/* 140 */                           return ooiIlOl1iI;
                                }
/* 68 */                        IlliOIo0o10 illiOIo0o10 = (IlliOIo0o10) this.I00ilI0I1;
/* 72 */                        OoI0l10ooi0 ooI0l10ooi0 = new OoI0l10ooi0();
/* 79 */                        Ii1olII1lO1 ii1olII1lO1I0000oI003 = ((IoIlIolo10o) oO11OoloI4.I00iOIl).I0000oI00();
/* 83 */                        this.I00iiO = oO11OoloI4;
/* 85 */                        this.I00iio = ooOO0102;
/* 87 */                        this.I00iiI = 1;
/* 89 */                        i0i11IIlO = this;
/* 90 */                        obj = illiOIo0o10.I0010I0i(ooI0l10ooi0, ii1olII1lO1I0000oI003, obj3, ooOO0102, i0i11IIlO);
/* 94 */                        if (obj != ii0111o8) {
/* 97 */                            ooOO010 = ooOO0102;
                                }
/* 139 */                       return ii0111o8;
                            }
/* 23 */                    if (i9 != 1) {
/* 25 */                        if (i9 == 2) {
/* 27 */                            lIoii1l01l0i.I00000oOI(obj);
/* 140 */                           return ooiIlOl1iI;
                                }
/* 32 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 40 */                    ooOO010 = (OoOO010) this.I00iio;
/* 42 */                    lIoii1l01l0i.I00000oOI(obj);
/* 45 */                    i0i11IIlO = this;
/* 98 */                    if (obj == null) {
/* 140 */                       return ooiIlOl1iI;
                            }
/* 103 */                   if (!(obj instanceof OIOIIioi) && !ooOO010.I00000oIO.I001i1O0Ol(obj)) {
/* 118 */                       IoOOl0iOl1io.I0010o("transformResponseBody returned ", obj, " but expected value of type ", ooOO010);
/* 9 */                         return null;
                            }
/* 124 */                   IoO1o1 ioO1o12 = new IoO1o1(ooOO010, obj);
/* 127 */                   i0i11IIlO.I00iiO = null;
/* 129 */                   i0i11IIlO.I00iio = null;
/* 131 */                   i0i11IIlO.I00iiI = 2;
/* 137 */                   if (oO11OoloI4.I0000oI00(i0i11IIlO, ioO1o12) != ii0111o8) {
/* 140 */                       return ooiIlOl1iI;
                            }
/* 139 */                   return ii0111o8;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 12 */        public I0i11IIlO(int i, IOoil1iiIilo iOoil1iiIilo) {
                    super(i, iOoil1iiIilo);
/* 13 */            this.I00iOIl = 2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public I0i11IIlO(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(3, iOoil1iiIilo);
/* 14 */            this.I00iOIl = i;
                    this.I00ilI0I1 = obj;
                }
            }
