            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import java.util.concurrent.CancellationException;
            
/* 10 */    public final class Il1ii1000 extends Oi10IOIi implements IlliIl1l11O {
                public final int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Il1ii1000(Object obj, Object obj2, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = i;
/* 3 */             this.I00ilI0I1 = obj;
/* 5 */             this.I00ilO0 = obj2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iiI;
/* 3 */             Object obj2 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 84 */                    Il1ii1000 il1ii1000 = new Il1ii1000((String) this.I00ilI0I1, (Il1iOloo) obj2, iOoil1iiIilo, 0);
/* 87 */                    il1ii1000.I00iio = obj;
/* 89 */                    return il1ii1000;
                        case 1:
/* 69 */                    Il1ii1000 il1ii10002 = new Il1ii1000((Ii00l101O) this.I00ilI0I1, (IlliIl1l11O) obj2, iOoil1iiIilo, 1);
/* 72 */                    il1ii10002.I00iio = obj;
/* 74 */                    return il1ii10002;
                        case 2:
/* 54 */                    Il1ii1000 il1ii10003 = new Il1ii1000((OlooOo) obj2, iOoil1iiIilo, 2);
/* 57 */                    il1ii10003.I00iio = obj;
/* 59 */                    return il1ii10003;
                        case 3:
/* 43 */                    Il1ii1000 il1ii10004 = new Il1ii1000((IllOOo00lI) obj2, iOoil1iiIilo, 3);
/* 46 */                    il1ii10004.I00ilI0I1 = obj;
/* 48 */                    return il1ii10004;
                        case 4:
/* 32 */                    Il1ii1000 il1ii10005 = new Il1ii1000((Oiill0lI1il1) this.I00ilI0I1, (OiiOol1OIOll) obj2, iOoil1iiIilo, 4);
/* 35 */                    il1ii10005.I00iio = obj;
/* 37 */                    return il1ii10005;
                        default:
/* 17 */                    Il1ii1000 il1ii10006 = new Il1ii1000((OO1i0l) this.I00ilI0I1, (OOo0ooi) obj2, iOoil1iiIilo, 5);
/* 20 */                    il1ii10006.I00iio = obj;
/* 22 */                    return il1ii10006;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iiI;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                    }
/* 18 */            return ((Il1ii1000) create((Oll11lOlo) obj, (IOoil1iiIilo) obj2)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:150:0x02cd, code lost:
                
                    if (r1 == r0) goto L151;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:181:?, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
                
                    if (r2 == r0) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:56:0x012c, code lost:
                
                    if (r2 == r0) goto L57;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:86:0x01bf, code lost:
                
                    if (r5 == r0) goto L91;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:0x01da, code lost:
                
                    if (r3 != r0) goto L92;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0245 A[PHI: r5
                  0x0245: PHI (r5v6 ??) = (r5v30 ??), (r5v31 ??), (r5v7 ??), (r5v32 ??) binds: [B:131:0x0277, B:126:0x0264, B:119:0x0244, B:111:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:122:0x024b A[Catch: CancellationException -> 0x0232, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0232, blocks: (B:122:0x024b, B:125:0x0259, B:111:0x022e, B:116:0x0239), top: B:156:0x0213 }] */
                /* JADX WARN: Removed duplicated region for block: B:15:0x004f A[PHI: r3 r5 r8
                  0x004f: PHI (r3v35 int) = (r3v40 int), (r3v0 int) binds: [B:13:0x004c, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]
                  0x004f: PHI (r5v23 Oll11lOlo) = (r5v24 Oll11lOlo), (r5v27 Oll11lOlo) binds: [B:13:0x004c, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]
                  0x004f: PHI (r8v6 java.lang.Object) = (r8v14 java.lang.Object), (r8v18 java.lang.Object) binds: [B:13:0x004c, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x0171  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
                /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r5v30 */
                /* JADX WARN: Type inference failed for: r5v31 */
                /* JADX WARN: Type inference failed for: r5v32 */
                /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r5v7 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:126:0x0264 -> B:120:0x0245). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0277 -> B:120:0x0245). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00aa -> B:34:0x00ae). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x017e -> B:75:0x017f). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:90:0x01da -> B:92:0x01de). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    Oll11lOlo oll11lOlo;
                    Object objI00000oOI;
                    Object objI000OiO;
                    Oll11lOlo oll11lOlo2;
                    Object objI00000oOI2;
                    Oll11lOlo oll11lOlo3;
                    Oll11lOlo oll11lOlo4;
                    int i;
                    Object objI00000oOI3;
                    Oll11lOlo oll11lOlo5;
                    OO1il00lI oO1il00lI;
                    Object objI00000oOI4;
                    OilO111 oilO111;
                    Object objInvoke;
                    Oll11lOlo oll11lOlo6;
                    Object objI0000Il00O;
                    Object objI00000oIO;
                    Oll11lOlo oll11lOlo7;
                    Object objI00000oOI5;
                    int size;
                    int i2;
/* 3 */             int i3 = this.I00iiI;
/* 5 */             int i4 = 2;
/* 6 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             Oll11lOlo oll11lOlo8 = "call to 'resume' before 'invoke' with coroutine";
/* 11 */            Object obj2 = this.I00ilO0;
                    switch (i3) {
                        case 0:
/* 638 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 640 */                   int i5 = this.I00iiO;
/* 642 */                   if (i5 == 0) {
/* 670 */                       lIoii1l01l0i.I00000oOI(obj);
/* 675 */                       oll11lOlo = (Oll11lOlo) this.I00iio;
/* 677 */                       OO1i0l oO1i0l = OO1i0l.I00iOIl;
/* 679 */                       this.I00iio = oll11lOlo;
/* 681 */                       this.I00iiO = 1;
/* 683 */                       objI00000oOI = OloI0l1i1oO.I00000oOI(oll11lOlo, this, 1);
/* 687 */                       if (objI00000oOI != ii0111o) {
                                }
/* 720 */                       return ii0111o;
                            }
/* 644 */                   if (i5 != 1) {
/* 647 */                       if (i5 != 2) {
/* 655 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 649 */                       lIoii1l01l0i.I00000oOI(obj);
/* 652 */                       objI000OiO = obj;
/* 724 */                       if (((OO1il00lI) objI000OiO) == null) {
/* 731 */                           return ooiIlOl1iI;
                                }
/* 728 */                       ((Il1iOloo) obj2).invoke();
/* 731 */                       return ooiIlOl1iI;
                            }
/* 662 */                   oll11lOlo = (Oll11lOlo) this.I00iio;
/* 664 */                   lIoii1l01l0i.I00000oOI(obj);
/* 667 */                   objI00000oOI = obj;
/* 690 */                   OO1il00lI oO1il00lI2 = (OO1il00lI) objI00000oOI;
/* 702 */                   if (((String) this.I00ilI0I1).equals("SecondaryEditable")) {
/* 704 */                       oO1il00lI2.I00000oIO();
                            }
/* 707 */                   OO1i0l oO1i0l2 = OO1i0l.I00iOIl;
/* 709 */                   this.I00iio = null;
/* 712 */                   this.I00iiO = 2;
/* 714 */                   objI000OiO = OloI0l1i1oO.I000OiO(oll11lOlo, oO1i0l2, this);
                            break;
                        case 1:
/* 525 */                   Ii00l101O ii00l101O = (Ii00l101O) this.I00ilI0I1;
/* 527 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 529 */                   int i6 = this.I00iiO;
                            try {
                            } catch (CancellationException e) {
/* 620 */                       if (!l01oO1iOo.I000II(ii00l101O)) {
/* 636 */                           throw e;
                                }
/* 622 */                       this.I00iio = oll11lOlo8;
/* 624 */                       this.I00iiO = 3;
/* 628 */                       Object objI00000oOI6 = ililI0.I00000oOI(oll11lOlo8, OO1i0l.I00iiO, this);
                                oll11lOlo8 = oll11lOlo8;
/* 632 */                       if (objI00000oOI6 != ii0111o2) {
                                }
                            }
/* 532 */                   if (i6 == 0) {
/* 574 */                       lIoii1l01l0i.I00000oOI(obj);
/* 579 */                       oll11lOlo3 = (Oll11lOlo) this.I00iio;
                            } else {
/* 534 */                       if (i6 == 1) {
/* 568 */                           Oll11lOlo oll11lOlo9 = (Oll11lOlo) this.I00iio;
/* 570 */                           lIoii1l01l0i.I00000oOI(obj);
                                    oll11lOlo2 = oll11lOlo9;
/* 602 */                           this.I00iio = oll11lOlo2;
/* 605 */                           this.I00iiO = 2;
/* 609 */                           objI00000oOI2 = ililI0.I00000oOI(oll11lOlo2, OO1i0l.I00iiO, this);
                                    oll11lOlo8 = oll11lOlo2;
/* 613 */                           if (objI00000oOI2 != ii0111o2) {
                                    }
/* 634 */                           return ii0111o2;
                                }
/* 537 */                       if (i6 == 2) {
/* 557 */                           Oll11lOlo oll11lOlo10 = (Oll11lOlo) this.I00iio;
/* 559 */                           lIoii1l01l0i.I00000oOI(obj);
                                    oll11lOlo8 = oll11lOlo10;
/* 586 */                           if (l01oO1iOo.I000II(ii00l101O)) {
/* 591 */                               this.I00iio = oll11lOlo8;
/* 593 */                               this.I00iiO = 1;
/* 595 */                               Object objInvoke2 = ((IlliIl1l11O) obj2).invoke(oll11lOlo8, this);
                                        oll11lOlo2 = oll11lOlo8;
/* 599 */                               if (objInvoke2 != ii0111o2) {
/* 602 */                                   this.I00iio = oll11lOlo2;
/* 605 */                                   this.I00iiO = 2;
/* 609 */                                   objI00000oOI2 = ililI0.I00000oOI(oll11lOlo2, OO1i0l.I00iiO, this);
                                            oll11lOlo8 = oll11lOlo2;
/* 613 */                                   if (objI00000oOI2 != ii0111o2) {
/* 586 */                                       if (l01oO1iOo.I000II(ii00l101O)) {
/* 637 */                                           return ooiIlOl1iI;
                                                }
                                            }
                                        }
/* 634 */                               return ii0111o2;
                                    }
                                } else {
/* 539 */                           if (i6 != 3) {
/* 549 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 543 */                           oll11lOlo3 = (Oll11lOlo) this.I00iio;
/* 545 */                           lIoii1l01l0i.I00000oOI(obj);
                                }
                            }
/* 581 */                   oll11lOlo8 = oll11lOlo3;
/* 586 */                   if (l01oO1iOo.I000II(ii00l101O)) {
                            }
                        case 2:
/* 388 */                   OlooOo olooOo = (OlooOo) obj2;
/* 390 */                   Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 392 */                   int i7 = this.I00iiO;
/* 394 */                   if (i7 == 0) {
/* 432 */                       lIoii1l01l0i.I00000oOI(obj);
/* 437 */                       oll11lOlo4 = (Oll11lOlo) this.I00iio;
/* 439 */                       this.I00iio = oll11lOlo4;
/* 441 */                       this.I00iiO = 1;
/* 443 */                       i = 2;
/* 444 */                       objI00000oOI3 = OloI0l1i1oO.I00000oOI(oll11lOlo4, this, 2);
                                break;
                            } else {
/* 396 */                       if (i7 != 1) {
/* 399 */                           if (i7 != 2) {
/* 416 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                                return null;
                                    }
/* 403 */                           oO1il00lI = (OO1il00lI) this.I00ilI0I1;
/* 407 */                           Oll11lOlo oll11lOlo11 = (Oll11lOlo) this.I00iio;
/* 409 */                           lIoii1l01l0i.I00000oOI(obj);
/* 412 */                           oll11lOlo5 = oll11lOlo11;
/* 413 */                           objI00000oOI4 = obj;
/* 481 */                           List list = ((OO1Oooio101) objI00000oOI4).I00000oIO;
/* 486 */                           int size2 = list.size();
/* 491 */                           for (int i8 = 0; i8 < size2; i8++) {
/* 497 */                               OO1il00lI oO1il00lI3 = (OO1il00lI) list.get(i8);
/* 507 */                               if (lI1ioiO0.I00000oIO(oO1il00lI3.I00000oIO, oO1il00lI.I00000oIO) && oO1il00lI3.I0000O) {
/* 513 */                                   i = 2;
/* 463 */                                   this.I00iio = oll11lOlo5;
/* 465 */                                   this.I00ilI0I1 = oO1il00lI;
/* 467 */                                   this.I00iiO = i;
/* 471 */                                   objI00000oOI4 = oll11lOlo5.I00000oOI(OO1i0l.I00iiI, this);
                                            break;
                                        }
                                    }
/* 518 */                           olooOo.I0000Il00O();
/* 521 */                           return ooiIlOl1iI;
                                }
/* 423 */                       oll11lOlo4 = (Oll11lOlo) this.I00iio;
/* 425 */                       lIoii1l01l0i.I00000oOI(obj);
/* 428 */                       objI00000oOI3 = obj;
/* 430 */                       i = 2;
                            }
/* 451 */                   OO1il00lI oO1il00lI4 = (OO1il00lI) objI00000oOI3;
/* 453 */                   long j = oO1il00lI4.I0000Il00O;
/* 455 */                   olooOo.I0000O();
/* 460 */                   oll11lOlo5 = oll11lOlo4;
/* 461 */                   oO1il00lI = oO1il00lI4;
/* 463 */                   this.I00iio = oll11lOlo5;
/* 465 */                   this.I00ilI0I1 = oO1il00lI;
/* 467 */                   this.I00iiO = i;
/* 471 */                   objI00000oOI4 = oll11lOlo5.I00000oOI(OO1i0l.I00iiI, this);
                            break;
                        case 3:
/* 330 */                   Ii0111o ii0111o4 = Ii0111o.I00iOIl;
/* 332 */                   int i9 = this.I00iiO;
/* 334 */                   if (i9 == 0) {
/* 353 */                       lIoii1l01l0i.I00000oOI(obj);
/* 358 */                       oilO111 = (OilO111) this.I00ilI0I1;
/* 364 */                       objInvoke = ((IllOOo00lI) obj2).invoke();
/* 368 */                       if (objInvoke != null) {
                                }
                            } else {
/* 336 */                       if (i9 != 1) {
/* 348 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 338 */                       Object obj3 = this.I00iio;
/* 342 */                       oilO111 = (OilO111) this.I00ilI0I1;
/* 344 */                       lIoii1l01l0i.I00000oOI(obj);
/* 384 */                       if (obj3 == null) {
/* 386 */                           return ooiIlOl1iI;
                                }
/* 364 */                       objInvoke = ((IllOOo00lI) obj2).invoke();
/* 368 */                       if (objInvoke != null) {
/* 370 */                           this.I00ilI0I1 = oilO111;
/* 372 */                           this.I00iio = objInvoke;
/* 374 */                           this.I00iiO = 1;
/* 376 */                           oilO111.I00000oOI(this, objInvoke);
/* 379 */                           Ii0111o ii0111o5 = Ii0111o.I00iOIl;
/* 381 */                           return ii0111o4;
                                }
/* 383 */                       obj3 = null;
/* 384 */                       if (obj3 == null) {
                                }
/* 364 */                       objInvoke = ((IllOOo00lI) obj2).invoke();
/* 368 */                       if (objInvoke != null) {
                                }
                            }
                        case 4:
/* 234 */                   Ii0111o ii0111o6 = Ii0111o.I00iOIl;
/* 236 */                   int i10 = this.I00iiO;
/* 238 */                   if (i10 == 0) {
/* 266 */                       lIoii1l01l0i.I00000oOI(obj);
/* 271 */                       oll11lOlo6 = (Oll11lOlo) this.I00iio;
/* 273 */                       this.I00iio = oll11lOlo6;
/* 275 */                       this.I00iiO = 1;
/* 277 */                       IillI1lo11l0 iillI1lo11l0 = OloI0l1i1oO.I00000oIO;
/* 281 */                       objI0000Il00O = OloI0l1i1oO.I0000Il00O(oll11lOlo6, OO1i0l.I00iiI, this);
/* 285 */                       if (objI0000Il00O != ii0111o6) {
                                }
/* 303 */                       return ii0111o6;
                            }
/* 240 */                   if (i10 != 1) {
/* 243 */                       if (i10 != 2) {
/* 251 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                            return null;
                                }
/* 245 */                       lIoii1l01l0i.I00000oOI(obj);
/* 248 */                       objI00000oIO = obj;
/* 311 */                       if (((Boolean) objI00000oIO).booleanValue() || ((Oiill0lI1il1) this.I00ilI0I1).I000O01llI0() != null) {
/* 329 */                           return ooiIlOl1iI;
                                }
/* 326 */                       ((OiiOol1OIOll) obj2).invoke();
/* 329 */                       return ooiIlOl1iI;
                            }
/* 258 */                   oll11lOlo6 = (Oll11lOlo) this.I00iio;
/* 260 */                   lIoii1l01l0i.I00000oOI(obj);
/* 263 */                   objI0000Il00O = obj;
/* 290 */                   OO1i0l oO1i0l3 = OO1i0l.I00iOIl;
/* 292 */                   this.I00iio = null;
/* 295 */                   this.I00iiO = 2;
/* 297 */                   objI00000oIO = IilOo0l01l.I00000oIO(oll11lOlo6, (OO1il00lI) objI0000Il00O, oO1i0l3, this);
                            break;
                        default:
/* 17 */                    OOo0ooi oOo0ooi = (OOo0ooi) obj2;
/* 19 */                    Ii0111o ii0111o7 = Ii0111o.I00iOIl;
/* 21 */                    int i11 = this.I00iiO;
/* 23 */                    O1IO1iOO0oo0 o1IO1iOO0oo0 = O1IO1iOO0oo0.I00000oIO;
/* 25 */                    if (i11 == 0) {
/* 58 */                        lIoii1l01l0i.I00000oOI(obj);
/* 63 */                        oll11lOlo7 = (Oll11lOlo) this.I00iio;
/* 67 */                        OO1i0l oO1i0l4 = (OO1i0l) this.I00ilI0I1;
/* 69 */                        this.I00iio = oll11lOlo7;
/* 71 */                        this.I00iiO = 1;
/* 73 */                        objI00000oOI5 = oll11lOlo7.I00000oOI(oO1i0l4, this);
/* 77 */                        if (objI00000oOI5 != ii0111o7) {
                                }
/* 173 */                       return ii0111o7;
                            }
/* 27 */                    if (i11 == 1) {
/* 50 */                        oll11lOlo7 = (Oll11lOlo) this.I00iio;
/* 52 */                        lIoii1l01l0i.I00000oOI(obj);
/* 55 */                        objI00000oOI5 = obj;
/* 80 */                        OO1Oooio101 oO1Oooio101 = (OO1Oooio101) objI00000oOI5;
/* 82 */                        List list2 = oO1Oooio101.I00000oIO;
/* 87 */                        size = list2.size();
/* 91 */                        i2 = 0;
/* 92 */                        while (i2 < size) {
                                }
/* 221 */                       OO1il00lI oO1il00lI5 = (OO1il00lI) list2.get(0);
/* 223 */                       O1IO1li0Io11 o1IO1li0Io11 = new O1IO1li0Io11();
/* 226 */                       o1IO1li0Io11.I00000oIO = oO1il00lI5;
/* 228 */                       VarHandle.storeStoreFence();
/* 231 */                       oOo0ooi.I00iOIl = o1IO1li0Io11;
/* 233 */                       return ooiIlOl1iI;
                            }
/* 29 */                    if (i11 != 2) {
/* 42 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                        return null;
                            }
/* 33 */                    oll11lOlo7 = (Oll11lOlo) this.I00iio;
/* 35 */                    lIoii1l01l0i.I00000oOI(obj);
/* 38 */                    Object objI00000oOI7 = obj;
/* 177 */                   List list3 = ((OO1Oooio101) objI00000oOI7).I00000oIO;
/* 182 */                   int size3 = list3.size();
/* 187 */                   for (int i12 = 0; i12 < size3; i12++) {
/* 199 */                       if (((OO1il00lI) list3.get(i12)).I0000Il00O()) {
/* 201 */                           oOo0ooi.I00iOIl = o1IO1iOO0oo0;
/* 233 */                           return ooiIlOl1iI;
                                }
                            }
/* 207 */                   i4 = 2;
/* 67 */                    OO1i0l oO1i0l42 = (OO1i0l) this.I00ilI0I1;
/* 69 */                    this.I00iio = oll11lOlo7;
/* 71 */                    this.I00iiO = 1;
/* 73 */                    objI00000oOI5 = oll11lOlo7.I00000oOI(oO1i0l42, this);
/* 77 */                    if (objI00000oOI5 != ii0111o7) {
/* 80 */                        OO1Oooio101 oO1Oooio1012 = (OO1Oooio101) objI00000oOI5;
/* 82 */                        List list22 = oO1Oooio1012.I00000oIO;
/* 87 */                        size = list22.size();
/* 91 */                        i2 = 0;
/* 92 */                        while (i2 < size) {
/* 104 */                           if (lI1Ol11OOlll.I0000Il00O((OO1il00lI) list22.get(i2))) {
/* 210 */                               i2++;
/* 212 */                               i4 = 2;
                                    } else {
/* 108 */                               if (oO1Oooio1012.I0000Il00O == i4) {
/* 112 */                                   oOo0ooi.I00iOIl = O1IOIIo1i.I00000oIO;
/* 233 */                                   return ooiIlOl1iI;
                                        }
/* 119 */                               int size4 = list22.size();
/* 124 */                               for (int i13 = 0; i13 < size4; i13++) {
/* 130 */                                   OO1il00lI oO1il00lI6 = (OO1il00lI) list22.get(i13);
/* 136 */                                   if (oO1il00lI6.I0000Il00O() || lI1Ol11OOlll.I0000oI00(oO1il00lI6, oll11lOlo7.I00ilO0.I00olI, oll11lOlo7.I0000Il00O())) {
/* 157 */                                       oOo0ooi.I00iOIl = o1IO1iOO0oo0;
/* 233 */                                       return ooiIlOl1iI;
                                            }
                                        }
/* 160 */                               OO1i0l oO1i0l5 = OO1i0l.I00iiO;
/* 162 */                               this.I00iio = oll11lOlo7;
/* 165 */                               this.I00iiO = 2;
/* 167 */                               objI00000oOI7 = oll11lOlo7.I00000oOI(oO1i0l5, this);
                                        break;
                                    }
                                }
/* 221 */                       OO1il00lI oO1il00lI52 = (OO1il00lI) list22.get(0);
/* 223 */                       O1IO1li0Io11 o1IO1li0Io112 = new O1IO1li0Io11();
/* 226 */                       o1IO1li0Io112.I00000oIO = oO1il00lI52;
/* 228 */                       VarHandle.storeStoreFence();
/* 231 */                       oOo0ooi.I00iOIl = o1IO1li0Io112;
/* 233 */                       return ooiIlOl1iI;
                            }
/* 173 */                   return ii0111o7;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public Il1ii1000(Object obj, IOoil1iiIilo iOoil1iiIilo, int i) {
                    super(2, iOoil1iiIilo);
/* 12 */            this.I00iiI = i;
                    this.I00ilO0 = obj;
                }
            }
