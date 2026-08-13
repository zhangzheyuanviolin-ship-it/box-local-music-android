            package p000;

            import java.lang.invoke.VarHandle;
            
/* 10 */    public final class Ii1O0l extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public Object I00iio;
                public int I00ilI0I1;
                public Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1O0l(Ii1OIIlOi ii1OIIlOi, int i, IOoil1iiIilo iOoil1iiIilo, int i2) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i2;
/* 3 */             this.I00iio = ii1OIIlOi;
/* 5 */             this.I00ilI0I1 = i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 45 */                    Ii1O0l ii1O0l = new Ii1O0l((Ii1OIIlOi) this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 0);
/* 54 */                    ii1O0l.I00iiO = ((Boolean) obj).booleanValue();
/* 56 */                    return ii1O0l;
                        case 1:
/* 24 */                    Ii1O0l ii1O0l2 = new Ii1O0l((Ii1OIIlOi) this.I00iio, this.I00ilI0I1, iOoil1iiIilo, 1);
/* 33 */                    ii1O0l2.I00iiO = ((Boolean) obj).booleanValue();
/* 35 */                    return ii1O0l2;
                        default:
/* 9 */                     Ii1O0l ii1O0l3 = new Ii1O0l(2, iOoil1iiIilo);
/* 12 */                    ii1O0l3.I00iio = obj;
/* 14 */                    return ii1O0l3;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 41 */                    Boolean bool = (Boolean) obj;
/* 43 */                    bool.booleanValue();
/* 54 */                    return ((Ii1O0l) create(bool, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        case 1:
/* 23 */                    Boolean bool2 = (Boolean) obj;
/* 25 */                    bool2.booleanValue();
/* 36 */                    return ((Ii1O0l) create(bool2, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                        default:
/* 18 */                    return ((Ii1O0l) create((Ii1olII1lO1) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                    }
                }

                /* JADX WARN: Can't wrap try/catch for region: R(8:4|(1:(1:(8:8|105|9|31|35|(2:40|(1:(1:49)(1:48))(1:44))(1:39)|50|51)(2:11|52))(1:12))(4:13|(1:15)(2:17|(2:19|(4:22|(1:25)|29|110)))|16|109)|26|103|27|(6:30|31|35|(2:40|(1:(2:46|49)(0))(0))(0)|50|51)|29|110) */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
                
                    r12 = r13;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00d6 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0128  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x017e  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x01d2  */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0261  */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r2v30 */
                /* JADX WARN: Type inference failed for: r2v31 */
                /* JADX WARN: Type inference failed for: r2v6 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    int iIntValue;
                    Throwable th;
                    boolean z;
                    OlO00iO01io oOlIilOIlOi1;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    int iIntValue2;
                    Object obj2;
                    boolean zBooleanValue;
                    int i;
                    Ii1olII1lO1 ii1olII1lO1;
                    String str;
                    IOIoIlIlO iOIoIlIlO;
/* 4 */             boolean z5 = "call to 'resume' before 'invoke' with coroutine";
/* 6 */             IOoil1iiIilo iOoil1iiIilo = null;
                    switch (this.I00iOIl) {
                        case 0:
/* 620 */                   Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) this.I00iio;
/* 622 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 624 */                   int i2 = this.I00iiI;
                            try {
                            } catch (Throwable th2) {
/* 673 */                       if (z5 != 0) {
/* 675 */                           Ol0Oiooo ol0OioooI0000Il00O = ii1OIIlOi.I0000Il00O();
/* 679 */                           this.I00ilO0 = th2;
/* 681 */                           this.I00iiO = z5;
/* 683 */                           this.I00iiI = 2;
/* 685 */                           Integer numI00000oIO = ol0OioooI0000Il00O.I00000oIO();
/* 689 */                           if (numI00000oIO != ii0111o) {
/* 694 */                               obj = numI00000oIO;
/* 695 */                               th = th2;
/* 696 */                               z = z5 ? 1 : 0;
                                    }
                                } else {
/* 705 */                           iIntValue = this.I00ilI0I1;
/* 709 */                           th = th2;
                                    z3 = z5;
                                }
                            }
/* 626 */                   if (i2 == 0) {
/* 654 */                       lIoii1l01l0i.I00000oOI(obj);
/* 657 */                       boolean z6 = this.I00iiO;
/* 659 */                       this.I00iiO = z6;
/* 661 */                       this.I00iiI = 1;
/* 663 */                       obj = ii1OIIlOi.I000O01llI0(z6, this);
                                z5 = z6;
/* 667 */                       if (obj == ii0111o) {
/* 691 */                           return ii0111o;
                                }
                            } else {
/* 628 */                       if (i2 != 1) {
/* 630 */                           if (i2 != 2) {
/* 642 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                                 return null;
                                    }
/* 632 */                           z = this.I00iiO;
/* 636 */                           th = (Throwable) this.I00ilO0;
/* 638 */                           lIoii1l01l0i.I00000oOI(obj);
/* 699 */                           iIntValue = ((Number) obj).intValue();
/* 703 */                           z3 = z;
/* 712 */                           oOlIilOIlOi1 = new OOlIilOIlOi1(th, iIntValue);
                                    z2 = z3;
/* 722 */                           return new OIoi0IIoi(oOlIilOIlOi1, Boolean.valueOf(z2));
                                }
/* 646 */                       boolean z7 = this.I00iiO;
/* 648 */                       lIoii1l01l0i.I00000oOI(obj);
                                z5 = z7;
                            }
/* 670 */                   oOlIilOIlOi1 = (OlO00iO01io) obj;
                            z2 = z5;
/* 722 */                   return new OIoi0IIoi(oOlIilOIlOi1, Boolean.valueOf(z2));
                        case 1:
/* 515 */                   Ii1OIIlOi ii1OIIlOi2 = (Ii1OIIlOi) this.I00iio;
/* 517 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 519 */                   int i3 = this.I00iiI;
/* 521 */                   if (i3 == 0) {
/* 543 */                       lIoii1l01l0i.I00000oOI(obj);
/* 546 */                       z4 = this.I00iiO;
/* 548 */                       this.I00iiO = z4;
/* 550 */                       this.I00iiI = 1;
/* 566 */                       obj = ((IlIi1o0I110) ii1OIIlOi2.I000OiO.getValue()).I00000oIO(new IOIllll(3, iOoil1iiIilo), this);
/* 570 */                       if (obj != ii0111o2) {
                                }
/* 589 */                       return ii0111o2;
                            }
/* 523 */                   if (i3 != 1) {
/* 525 */                       if (i3 != 2) {
/* 533 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 527 */                       obj2 = this.I00ilO0;
/* 529 */                       lIoii1l01l0i.I00000oOI(obj);
/* 596 */                       iIntValue2 = ((Number) obj).intValue();
/* 614 */                       return new Ii11I1iOiIo(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue2);
                            }
/* 537 */                   z4 = this.I00iiO;
/* 539 */                   lIoii1l01l0i.I00000oOI(obj);
/* 573 */                   if (!z4) {
/* 603 */                       Object obj3 = obj;
/* 601 */                       iIntValue2 = this.I00ilI0I1;
/* 605 */                       obj2 = obj3;
/* 614 */                       return new Ii11I1iOiIo(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue2);
                            }
/* 575 */                   Ol0Oiooo ol0OioooI0000Il00O2 = ii1OIIlOi2.I0000Il00O();
/* 579 */                   this.I00ilO0 = obj;
/* 581 */                   this.I00iiI = 2;
/* 583 */                   Integer numI00000oIO2 = ol0OioooI0000Il00O2.I00000oIO();
/* 587 */                   if (numI00000oIO2 != ii0111o2) {
/* 591 */                       Object obj4 = obj;
/* 592 */                       obj = numI00000oIO2;
/* 593 */                       obj2 = obj4;
/* 596 */                       iIntValue2 = ((Number) obj).intValue();
/* 614 */                       return new Ii11I1iOiIo(obj2, obj2 != null ? obj2.hashCode() : 0, iIntValue2);
                            }
/* 589 */                   return ii0111o2;
                        default:
/* 14 */                    Ii1olII1lO1 ii1olII1lO12 = (Ii1olII1lO1) this.I00iio;
/* 16 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 18 */                    int i4 = this.I00ilI0I1;
/* 22 */                    OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 24 */                    if (i4 == 0) {
/* 54 */                        lIoii1l01l0i.I00000oOI(obj);
/* 73 */                        zBooleanValue = ((Boolean) ii1olII1lO12.I00iOIl().getAttributes().I00000oOI(IoIiolOl00.I0000Il00O)).booleanValue();
/* 77 */                        if (zBooleanValue) {
/* 117 */                           int i5 = ii1olII1lO12.I0000O().I00iOIl;
/* 119 */                           IoIlIolo10o ioIlIolo10oI00iOIl = ii1olII1lO12.I00iOIl();
/* 123 */                           if (i5 >= 300) {
/* 139 */                               if (!ioIlIolo10oI00iOIl.getAttributes().I0000Il00O().containsKey(IiI0loiioIlO.I00000oIO)) {
/* 142 */                                   this.I00iio = ii1olII1lO12;
/* 144 */                                   this.I00iiO = zBooleanValue;
/* 146 */                                   this.I00iiI = i5;
/* 148 */                                   this.I00ilI0I1 = 1;
/* 150 */                                   Object objI00000oIO = lO0OOOl.I00000oIO(ioIlIolo10oI00iOIl, this);
/* 154 */                                   if (objI00000oIO != ii0111o3) {
/* 158 */                                       i = i5;
/* 159 */                                       obj = objI00000oIO;
                                            }
/* 193 */                                   return ii0111o3;
                                        }
                                    }
                                } else {
/* 107 */                           IiI0loiioIlO.I00000oOI.I000o00OoI0I("Skipping default response validation for " + ii1olII1lO12.I00iOIl().I0000O().getUrl());
                                }
/* 110 */                       return ooiIlOl1iI;
                            }
/* 26 */                    if (i4 != 1) {
/* 28 */                        if (i4 != 2) {
/* 41 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 6 */                             return null;
                                }
/* 30 */                        i = this.I00iiI;
/* 34 */                        ii1olII1lO1 = (Ii1olII1lO1) this.I00ilO0;
                                try {
/* 36 */                            lIoii1l01l0i.I00000oOI(obj);
/* 199 */                           str = (String) obj;
                                } catch (Oo1O0iO1O unused) {
/* 203 */                           str = "<body failed decoding>";
/* 213 */                           if (300 > i) {
                                    }
/* 508 */                           IiI0loiioIlO.I00000oOI.I000o00OoI0I("Default response validation for " + ii1olII1lO12.I00iOIl().I0000O().getUrl() + " failed with " + iOIoIlIlO);
/* 511 */                           throw iOIoIlIlO;
                                }
/* 213 */                       if (300 > i && i < 400) {
/* 220 */                           IOO01OO ioo01oo = new IOO01OO(ii1olII1lO1, str, 1);
/* 290 */                           ioo01oo.I00iiO = "Unhandled redirect: " + ii1olII1lO1.I00iOIl().I0000O().getMethod().I00000oIO + ' ' + ii1olII1lO1.I00iOIl().I0000O().getUrl() + ". Status: " + ii1olII1lO1.I0000O() + ". Text: \"" + str + '\"';
/* 292 */                           VarHandle.storeStoreFence();
                                    iOIoIlIlO = ioo01oo;
                                } else if (400 > i && i < 500) {
/* 306 */                           IOO01OO ioo01oo2 = new IOO01OO(ii1olII1lO1, str, 0);
/* 376 */                           ioo01oo2.I00iiO = "Client request(" + ii1olII1lO1.I00iOIl().I0000O().getMethod().I00000oIO + ' ' + ii1olII1lO1.I00iOIl().I0000O().getUrl() + ") invalid: " + ii1olII1lO1.I0000O() + ". Text: \"" + str + '\"';
/* 378 */                           VarHandle.storeStoreFence();
/* 381 */                           iOIoIlIlO = ioo01oo2;
                                } else if (500 <= i || i >= 600) {
/* 469 */                           iOIoIlIlO = new IOIoIlIlO(ii1olII1lO1, str);
                                } else {
/* 391 */                           IOO01OO ioo01oo3 = new IOO01OO(ii1olII1lO1, str, 2);
/* 461 */                           ioo01oo3.I00iiO = "Server error(" + ii1olII1lO1.I00iOIl().I0000O().getMethod().I00000oIO + ' ' + ii1olII1lO1.I00iOIl().I0000O().getUrl() + ": " + ii1olII1lO1.I0000O() + ". Text: \"" + str + '\"';
/* 463 */                           VarHandle.storeStoreFence();
                                    iOIoIlIlO = ioo01oo3;
                                }
/* 508 */                       IiI0loiioIlO.I00000oOI.I000o00OoI0I("Default response validation for " + ii1olII1lO12.I00iOIl().I0000O().getUrl() + " failed with " + iOIoIlIlO);
/* 511 */                       throw iOIoIlIlO;
                            }
/* 46 */                    i = this.I00iiI;
/* 48 */                    zBooleanValue = this.I00iiO;
/* 50 */                    lIoii1l01l0i.I00000oOI(obj);
/* 160 */                   IoIlIolo10o ioIlIolo10o = (IoIlIolo10o) obj;
/* 168 */                   ioIlIolo10o.getAttributes().I0000oI00(IiI0loiioIlO.I00000oIO, ooiIlOl1iI);
/* 171 */                   Ii1olII1lO1 ii1olII1lO1I0000oI00 = ioIlIolo10o.I0000oI00();
/* 175 */                   this.I00iio = ii1olII1lO12;
/* 177 */                   this.I00ilO0 = ii1olII1lO1I0000oI00;
/* 179 */                   this.I00iiO = zBooleanValue;
/* 181 */                   this.I00iiI = i;
/* 183 */                   this.I00ilI0I1 = 2;
/* 187 */                   Object objI00000oOI = io0OoioI0O1.I00000oOI(ii1olII1lO1I0000oI00, IO1IOI.I00000oIO, this);
/* 191 */                   if (objI00000oOI != ii0111o3) {
/* 197 */                       obj = objI00000oOI;
/* 198 */                       ii1olII1lO1 = ii1olII1lO1I0000oI00;
/* 199 */                       str = (String) obj;
/* 213 */                       if (300 > i) {
/* 299 */                           if (400 > i) {
/* 383 */                               if (500 <= i) {
/* 469 */                                   iOIoIlIlO = new IOIoIlIlO(ii1olII1lO1, str);
                                        }
                                    }
                                }
/* 508 */                       IiI0loiioIlO.I00000oOI.I000o00OoI0I("Default response validation for " + ii1olII1lO12.I00iOIl().I0000O().getUrl() + " failed with " + iOIoIlIlO);
/* 511 */                       throw iOIoIlIlO;
                            }
/* 193 */                   return ii0111o3;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public Ii1O0l(int i, IOoil1iiIilo iOoil1iiIilo) {
                    super(i, iOoil1iiIilo);
/* 12 */            this.I00iOIl = 2;
                }
            }
