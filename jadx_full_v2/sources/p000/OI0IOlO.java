            package p000;
            
            public final class OI0IOlO extends Oll0io implements IlliIl1l11O {
                public OOo0l0ii10l I00iOIl;
                public OOo0l0ii10l I00iiI;
                public int I00iiO;
                public int I00iio;
                public Object I00ilI0I1;
                public final OOo0lO I00ilO0;
                public final OOo0ooi I00io1l;
                public final OOo0ooi I00ioIO;
                public final float I00l0I0l0lO1;
                public final OI0Iio01O I00l0OO0IO;
                public final float I00li1OI;
                public final Oii00o1ll I00ll1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI0IOlO(OOo0lO oOo0lO, OOo0ooi oOo0ooi, OOo0ooi oOo0ooi2, float f, OI0Iio01O oI0Iio01O, float f2, Oii00o1ll oii00o1ll, IOoil1iiIilo iOoil1iiIilo) {
/* 16 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00ilO0 = oOo0lO;
/* 3 */             this.I00io1l = oOo0ooi;
/* 5 */             this.I00ioIO = oOo0ooi2;
/* 7 */             this.I00l0I0l0lO1 = f;
/* 9 */             this.I00l0OO0IO = oI0Iio01O;
/* 11 */            this.I00li1OI = f2;
/* 13 */            this.I00ll1 = oii00o1ll;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 18 */            OI0IOlO oI0IOlO = new OI0IOlO(this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, this.I00li1OI, this.I00ll1, iOoil1iiIilo);
/* 21 */            oI0IOlO.I00ilI0I1 = obj;
/* 37 */            return oI0IOlO;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OI0IOlO) create((OiOol0il0il) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x009d, code lost:
                
                    r1 = java.lang.Math.signum(r1) * r4;
                    r3.I0000Il00O(r0, r1);
                    r2 = (p000.I110IiI1I1) r14.I00iOIl;
                    r1 = p000.iOO0I0.I00000oOI(r2, ((java.lang.Number) r2.I00iiI.getValue()).floatValue() + r1, 0.0f, 30);
                    r14.I00iOIl = r1;
                    r1 = p000.O1OooO0IlOo.I000II(java.lang.Math.abs(r11.I00iOIl - ((java.lang.Number) r1.I00iiI.getValue()).floatValue()) / r7.I00li1OI);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x00db, code lost:
                
                    if (r1 <= 100) goto L23;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:22:0x00dd, code lost:
                
                    r1 = 100;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x00de, code lost:
                
                    r2 = (p000.I110IiI1I1) r14.I00iOIl;
                    r4 = r11.I00iOIl;
                    r5 = new p000.I0IO1io0I(12);
                    r5.I00iiO = r3;
                    r5.I00iio = r6;
                    r5.I00ilI0I1 = r11;
                    r5.I00ilO0 = r7.I00ll1;
                    r5.I00iiI = r15;
                    java.lang.invoke.VarHandle.storeStoreFence();
                    r7.I00ilI0I1 = r0;
                    r7.I00iOIl = r15;
                    r7.I00iiI = r9;
                    r7.I00iiO = r1;
                    r7.I00iio = r12;
                    r13 = new p000.OOo0lO();
                    r13.I00iOIl = ((java.lang.Number) r2.I00iiI.getValue()).floatValue();
                    r9 = new java.lang.Float(r4);
                    r4 = p000.iOO01lio0.I0000O(r1, r12, p000.IioO00o.I0000O);
                    r4 = new p000.I0O1IO(18);
                    r4.I00iiI = r13;
                    r4.I00iiO = r3;
                    r4.I00iio = r0;
                    r4.I00ilI0I1 = r5;
                    java.lang.invoke.VarHandle.storeStoreFence();
                    r5 = r7;
                    r7 = r1;
                    r9 = r0;
                    r0 = p000.lOiIo0.I0000oI00(r2, r9, r4, true, r4, r5);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:24:0x0144, code lost:
                
                    if (r0 != p000.Ii0111o.I00iOIl) goto L26;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:26:0x0147, code lost:
                
                    r0 = r16;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0149, code lost:
                
                    if (r0 != r8) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x014d, code lost:
                
                    r0 = r7;
                 */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0174 -> B:36:0x0175). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0187 -> B:37:0x0181). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OiOol0il0il oiOol0il0il;
                    OOo0l0ii10l oOo0l0ii10l;
                    OiOol0il0il oiOol0il0il2;
                    Object objI0000oI00;
                    OOo0ooi oOo0ooi;
                    OOo0lO oOo0lO;
                    OOo0ooi oOo0ooi2;
                    OOo0l0ii10l oOo0l0ii10l2;
/* 1 */             OI0IOlO oI0IOlO = this;
/* 3 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 5 */             int i = oI0IOlO.I00iio;
/* 7 */             OOo0l0ii10l oOo0l0ii10l3 = null;
/* 8 */             OOo0ooi oOo0ooi3 = oI0IOlO.I00ioIO;
/* 11 */            OOo0lO oOo0lO2 = oI0IOlO.I00ilO0;
/* 13 */            int i2 = 2;
/* 15 */            OOo0ooi oOo0ooi4 = oI0IOlO.I00io1l;
/* 17 */            if (i == 0) {
/* 89 */                lIoii1l01l0i.I00000oOI(obj);
/* 94 */                oiOol0il0il = (OiOol0il0il) oI0IOlO.I00ilI0I1;
/* 98 */                OOo0l0ii10l oOo0l0ii10l4 = new OOo0l0ii10l();
/* 101 */               oOo0l0ii10l4.I00iOIl = true;
/* 103 */               oOo0l0ii10l = oOo0l0ii10l4;
                    } else if (i == 1) {
/* 67 */                OOo0l0ii10l oOo0l0ii10l5 = oI0IOlO.I00iiI;
/* 69 */                OOo0l0ii10l oOo0l0ii10l6 = oI0IOlO.I00iOIl;
/* 73 */                OiOol0il0il oiOol0il0il3 = (OiOol0il0il) oI0IOlO.I00ilI0I1;
/* 75 */                lIoii1l01l0i.I00000oOI(obj);
/* 429 */               oOo0l0ii10l5.I00iOIl = ((Boolean) obj).booleanValue();
/* 431 */               oI0IOlO = this;
/* 433 */               oOo0ooi3 = oOo0ooi3;
/* 434 */               oOo0l0ii10l = oOo0l0ii10l6;
/* 435 */               oOo0ooi4 = oOo0ooi4;
/* 436 */               oiOol0il0il = oiOol0il0il3;
/* 438 */               oOo0l0ii10l3 = null;
/* 439 */               i2 = 2;
/* 440 */               oOo0lO2 = oOo0lO2;
                    } else if (i == 2) {
/* 51 */                int i3 = oI0IOlO.I00iiO;
/* 53 */                OOo0l0ii10l oOo0l0ii10l7 = oI0IOlO.I00iOIl;
/* 57 */                OiOol0il0il oiOol0il0il4 = (OiOol0il0il) oI0IOlO.I00ilI0I1;
/* 59 */                lIoii1l01l0i.I00000oOI(obj);
/* 62 */                oOo0l0ii10l = oOo0l0ii10l7;
/* 63 */                oiOol0il0il2 = oiOol0il0il4;
/* 64 */                OI0IOlO oI0IOlO2 = oI0IOlO;
/* 337 */               if (!oOo0l0ii10l.I00iOIl) {
/* 343 */                   oI0IOlO2.I00ilI0I1 = oiOol0il0il2;
/* 345 */                   oI0IOlO2.I00iOIl = oOo0l0ii10l;
/* 347 */                   oI0IOlO2.I00iiI = oOo0l0ii10l;
/* 349 */                   oI0IOlO2.I00iio = 3;
/* 355 */                   oI0IOlO = oI0IOlO2;
/* 356 */                   OOo0ooi oOo0ooi5 = oOo0ooi4;
/* 359 */                   OOo0ooi oOo0ooi6 = oOo0ooi3;
/* 362 */                   OOo0lO oOo0lO3 = oOo0lO2;
/* 363 */                   objI0000oI00 = OI0Iio01O.I0000oI00(oI0IOlO2.I00l0OO0IO, oOo0ooi6, oOo0lO3, oI0IOlO2.I00ll1, oOo0ooi5, 50 - i3, oI0IOlO);
/* 367 */                   oOo0ooi = oOo0ooi5;
/* 368 */                   oOo0lO = oOo0lO3;
/* 369 */                   oOo0ooi2 = oOo0ooi6;
/* 370 */                   if (objI0000oI00 != ii0111o) {
/* 373 */                       oOo0l0ii10l2 = oOo0l0ii10l;
/* 380 */                       oOo0l0ii10l.I00iOIl = ((Boolean) objI0000oI00).booleanValue();
/* 382 */                       oOo0l0ii10l = oOo0l0ii10l2;
/* 383 */                       oOo0ooi3 = oOo0ooi2;
/* 384 */                       oOo0lO2 = oOo0lO;
/* 385 */                       oOo0ooi4 = oOo0ooi;
/* 386 */                       oiOol0il0il = oiOol0il0il2;
/* 387 */                       oOo0l0ii10l3 = null;
/* 388 */                       i2 = 2;
                            }
/* 421 */                   return ii0111o;
                        }
/* 392 */               oI0IOlO = oI0IOlO2;
/* 386 */               oiOol0il0il = oiOol0il0il2;
/* 387 */               oOo0l0ii10l3 = null;
/* 388 */               i2 = 2;
                    } else {
/* 23 */                if (i != 3) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                        }
/* 25 */                OOo0l0ii10l oOo0l0ii10l8 = oI0IOlO.I00iiI;
/* 27 */                oOo0l0ii10l2 = oI0IOlO.I00iOIl;
/* 31 */                OiOol0il0il oiOol0il0il5 = (OiOol0il0il) oI0IOlO.I00ilI0I1;
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 36 */                oOo0l0ii10l = oOo0l0ii10l8;
/* 37 */                oiOol0il0il2 = oiOol0il0il5;
/* 38 */                oOo0ooi2 = oOo0ooi3;
/* 39 */                oOo0lO = oOo0lO2;
/* 40 */                oOo0ooi = oOo0ooi4;
/* 41 */                objI0000oI00 = obj;
/* 380 */               oOo0l0ii10l.I00iOIl = ((Boolean) objI0000oI00).booleanValue();
/* 382 */               oOo0l0ii10l = oOo0l0ii10l2;
/* 383 */               oOo0ooi3 = oOo0ooi2;
/* 384 */               oOo0lO2 = oOo0lO;
/* 385 */               oOo0ooi4 = oOo0ooi;
/* 386 */               oiOol0il0il = oiOol0il0il2;
/* 387 */               oOo0l0ii10l3 = null;
/* 388 */               i2 = 2;
                    }
                    while (true) {
/* 104 */               boolean z = oOo0l0ii10l.I00iOIl;
/* 106 */               OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 108 */               if (!z) {
/* 1261 */                  return ooiIlOl1iI;
                        }
/* 111 */               oOo0l0ii10l.I00iOIl = false;
/* 131 */               float fFloatValue = oOo0lO2.I00iOIl - ((Number) ((I110IiI1I1) oOo0ooi4.I00iOIl).I00iiI.getValue()).floatValue();
/* 136 */               boolean z2 = ((OI0IOO0iO0Oo) oOo0ooi3.I00iOIl).I0000Il00O;
/* 138 */               OI0Iio01O oI0Iio01O = oI0IOlO.I00l0OO0IO;
/* 140 */               if (!z2) {
/* 142 */                   float fAbs = Math.abs(fFloatValue);
/* 146 */                   float f = oI0IOlO.I00l0I0l0lO1;
/* 150 */                   if (fAbs >= f) {
                                break;
                            }
/* 152 */                   OiOol0il0il oiOol0il0il6 = oiOol0il0il;
/* 153 */                   OOo0ooi oOo0ooi7 = oOo0ooi3;
/* 154 */                   OOo0lO oOo0lO4 = oOo0lO2;
/* 155 */                   OOo0ooi oOo0ooi8 = oOo0ooi4;
/* 394 */                   oI0Iio01O.I0000Il00O(oiOol0il0il6, fFloatValue);
/* 397 */                   oI0IOlO.I00ilI0I1 = oiOol0il0il6;
/* 399 */                   oI0IOlO.I00iOIl = oOo0l0ii10l;
/* 401 */                   oI0IOlO.I00iiI = oOo0l0ii10l;
/* 404 */                   oI0IOlO.I00iio = 1;
/* 415 */                   Object objI0000oI002 = OI0Iio01O.I0000oI00(oI0IOlO.I00l0OO0IO, oOo0ooi7, oOo0lO4, oI0IOlO.I00ll1, oOo0ooi8, 50L, oI0IOlO);
/* 419 */                   if (objI0000oI002 == ii0111o) {
                                break;
                            }
/* 422 */                   OOo0l0ii10l oOo0l0ii10l9 = oOo0l0ii10l;
/* 429 */                   oOo0l0ii10l.I00iOIl = ((Boolean) objI0000oI002).booleanValue();
/* 431 */                   oI0IOlO = this;
/* 433 */                   oOo0ooi3 = oOo0ooi7;
/* 434 */                   oOo0l0ii10l = oOo0l0ii10l9;
/* 435 */                   oOo0ooi4 = oOo0ooi8;
/* 436 */                   oiOol0il0il = oiOol0il0il6;
/* 438 */                   oOo0l0ii10l3 = null;
/* 439 */                   i2 = 2;
/* 440 */                   oOo0lO2 = oOo0lO4;
                        }
                    }
                }
            }
