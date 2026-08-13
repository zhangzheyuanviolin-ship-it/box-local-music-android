            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class Ii0lo0iOoOO1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public OoI0Oii0Ol00 I00iiI;
                public int I00iiO;
                public Object I00iio;
                public final boolean I00ilI0I1;
                public final boolean I00ilO0;
                public final Oi1oIiOiIi0 I00io1l;
                public final Function1 I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii0lo0iOoOO1(boolean z, boolean z2, Oi1oIiOiIi0 oi1oIiOiIi0, IOoil1iiIilo iOoil1iiIilo, Function1 function1, int i) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00ilI0I1 = z;
/* 5 */             this.I00ilO0 = z2;
/* 7 */             this.I00io1l = oi1oIiOiIi0;
/* 9 */             this.I00ioIO = function1;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    Ii0lo0iOoOO1 ii0lo0iOoOO1 = new Ii0lo0iOoOO1(this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, this.I00ioIO, 0);
/* 41 */                    ii0lo0iOoOO1.I00iio = obj;
/* 43 */                    return ii0lo0iOoOO1;
                        default:
/* 18 */                    Ii0lo0iOoOO1 ii0lo0iOoOO12 = new Ii0lo0iOoOO1(this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo, this.I00ioIO, 1);
/* 21 */                    ii0lo0iOoOO12.I00iio = obj;
/* 23 */                    return ii0lo0iOoOO12;
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OO01Ol oO01Ol = (OO01Ol) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Ii0lo0iOoOO1) create(oO01Ol, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00a9 A[PHI: r1 r15
                  0x00a9: PHI (r1v21 OO01Ol) = (r1v18 OO01Ol), (r1v24 OO01Ol) binds: [B:37:0x00a6, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]
                  0x00a9: PHI (r15v30 java.lang.Object) = (r15v29 java.lang.Object), (r15v0 java.lang.Object) binds: [B:37:0x00a6, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0170 A[PHI: r1 r15
                  0x0170: PHI (r1v9 OO01Ol) = (r1v6 OO01Ol), (r1v12 OO01Ol) binds: [B:83:0x016d, B:58:0x00f7] A[DONT_GENERATE, DONT_INLINE]
                  0x0170: PHI (r15v13 java.lang.Object) = (r15v12 java.lang.Object), (r15v0 java.lang.Object) binds: [B:83:0x016d, B:58:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0172  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x0196  */
                /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OoI0Oii0Ol00 ooI0Oii0Ol00;
                    OO01Ol oO01Ol;
                    OO01Ol oO01Ol2;
                    OoI0Oii0Ol00 ooI0Oii0Ol002;
                    OO01Ol oO01Ol3;
                    Object obj2;
                    OoI0Oii0Ol00 ooI0Oii0Ol003;
                    OO01Ol oO01Ol4;
                    OO01Ol oO01Ol5;
                    OoI0Oii0Ol00 ooI0Oii0Ol004;
                    OO01Ol oO01Ol6;
                    Object obj3;
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj4 = OoiIlOl1iI.I00000oIO;
/* 5 */             boolean z = this.I00ilI0I1;
/* 12 */            boolean z2 = this.I00ilO0;
/* 14 */            Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00io1l;
/* 16 */            Function1 function1 = this.I00ioIO;
                    switch (i) {
                        case 0:
/* 221 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 223 */                   int i2 = this.I00iiO;
/* 225 */                   if (i2 == 0) {
/* 277 */                       lIoii1l01l0i.I00000oOI(obj);
/* 282 */                       OO01Ol oO01Ol7 = (OO01Ol) this.I00iio;
/* 284 */                       if (!z) {
/* 415 */                           return function1.invoke(oO01Ol7.I00000oOI());
                                }
/* 291 */                       ooI0Oii0Ol00 = z2 ? OoI0Oii0Ol00.I00iOIl : OoI0Oii0Ol00.I00iiI;
/* 293 */                       if (z2) {
/* 349 */                           oO01Ol = oO01Ol7;
/* 353 */                           Ii0llooiiIii ii0llooiiIii = new Ii0llooiiIii(0, null, function1);
/* 356 */                           this.I00iio = oO01Ol;
/* 358 */                           this.I00iiI = null;
/* 360 */                           this.I00iiO = 3;
/* 362 */                           obj = oO01Ol.I0000oI00(ooI0Oii0Ol00, ii0llooiiIii, this);
/* 366 */                           if (obj != ii0111o) {
                                    }
/* 381 */                           return ii0111o;
                                }
/* 295 */                       this.I00iio = oO01Ol7;
/* 297 */                       this.I00iiI = ooI0Oii0Ol00;
/* 299 */                       this.I00iiO = 1;
/* 301 */                       Boolean boolI0000Il00O = oO01Ol7.I0000Il00O(this);
/* 305 */                       if (boolI0000Il00O != ii0111o) {
/* 309 */                           oO01Ol2 = oO01Ol7;
/* 310 */                           obj = boolI0000Il00O;
                                }
/* 381 */                       return ii0111o;
                            }
/* 227 */                   if (i2 != 1) {
/* 229 */                       if (i2 == 2) {
/* 257 */                           ooI0Oii0Ol002 = this.I00iiI;
/* 261 */                           oO01Ol3 = (OO01Ol) this.I00iio;
/* 263 */                           lIoii1l01l0i.I00000oOI(obj);
/* 343 */                           OO01Ol oO01Ol8 = oO01Ol3;
/* 344 */                           ooI0Oii0Ol00 = ooI0Oii0Ol002;
/* 345 */                           oO01Ol = oO01Ol8;
/* 353 */                           Ii0llooiiIii ii0llooiiIii2 = new Ii0llooiiIii(0, null, function1);
/* 356 */                           this.I00iio = oO01Ol;
/* 358 */                           this.I00iiI = null;
/* 360 */                           this.I00iiO = 3;
/* 362 */                           obj = oO01Ol.I0000oI00(ooI0Oii0Ol00, ii0llooiiIii2, this);
/* 366 */                           if (obj != ii0111o) {
/* 369 */                               if (!z2) {
                                        }
                                    }
/* 381 */                           return ii0111o;
                                }
/* 231 */                       if (i2 != 3) {
/* 233 */                           if (i2 != 4) {
/* 243 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                                return null;
                                    }
/* 235 */                           Object obj5 = this.I00iio;
/* 237 */                           lIoii1l01l0i.I00000oOI(obj);
/* 240 */                           obj2 = obj5;
/* 391 */                           if (!((Boolean) obj).booleanValue()) {
/* 419 */                               return obj2;
                                    }
/* 393 */                           O00IOI11 o00ioi11I0001Ioi1lo = oi1oIiOiIi0.I0001Ioi1lo();
/* 403 */                           o00ioi11I0001Ioi1lo.I00000oOI.I000II(o00ioi11I0001Ioi1lo.I0000oI00, o00ioi11I0001Ioi1lo.I0001Ioi1lo);
/* 419 */                           return obj2;
                                }
/* 250 */                       oO01Ol = (OO01Ol) this.I00iio;
/* 252 */                       lIoii1l01l0i.I00000oOI(obj);
/* 369 */                       if (!z2) {
/* 407 */                           return obj;
                                }
/* 371 */                       this.I00iio = obj;
/* 373 */                       this.I00iiO = 4;
/* 375 */                       Boolean boolI0000Il00O2 = oO01Ol.I0000Il00O(this);
/* 379 */                       if (boolI0000Il00O2 != ii0111o) {
/* 383 */                           obj2 = obj;
/* 384 */                           obj = boolI0000Il00O2;
/* 391 */                           if (!((Boolean) obj).booleanValue()) {
                                    }
                                }
/* 381 */                       return ii0111o;
                            }
/* 267 */                   ooI0Oii0Ol00 = this.I00iiI;
/* 271 */                   oO01Ol2 = (OO01Ol) this.I00iio;
/* 273 */                   lIoii1l01l0i.I00000oOI(obj);
/* 317 */                   if (((Boolean) obj).booleanValue()) {
/* 347 */                       oO01Ol = oO01Ol2;
/* 353 */                       Ii0llooiiIii ii0llooiiIii22 = new Ii0llooiiIii(0, null, function1);
/* 356 */                       this.I00iio = oO01Ol;
/* 358 */                       this.I00iiI = null;
/* 360 */                       this.I00iiO = 3;
/* 362 */                       obj = oO01Ol.I0000oI00(ooI0Oii0Ol00, ii0llooiiIii22, this);
/* 366 */                       if (obj != ii0111o) {
                                }
/* 381 */                       return ii0111o;
                            }
/* 319 */                   O00IOI11 o00ioi11I0001Ioi1lo2 = oi1oIiOiIi0.I0001Ioi1lo();
/* 323 */                   this.I00iio = oO01Ol2;
/* 325 */                   this.I00iiI = ooI0Oii0Ol00;
/* 327 */                   this.I00iiO = 2;
/* 331 */                   Object objI000lI = o00ioi11I0001Ioi1lo2.I00000oOI.I000lI(this);
/* 335 */                   if (objI000lI == ii0111o) {
/* 337 */                       obj4 = objI000lI;
                            }
/* 338 */                   if (obj4 != ii0111o) {
/* 341 */                       ooI0Oii0Ol002 = ooI0Oii0Ol00;
/* 342 */                       oO01Ol3 = oO01Ol2;
/* 343 */                       OO01Ol oO01Ol82 = oO01Ol3;
/* 344 */                       ooI0Oii0Ol00 = ooI0Oii0Ol002;
/* 345 */                       oO01Ol = oO01Ol82;
/* 353 */                       Ii0llooiiIii ii0llooiiIii222 = new Ii0llooiiIii(0, null, function1);
/* 356 */                       this.I00iio = oO01Ol;
/* 358 */                       this.I00iiI = null;
/* 360 */                       this.I00iiO = 3;
/* 362 */                       obj = oO01Ol.I0000oI00(ooI0Oii0Ol00, ii0llooiiIii222, this);
/* 366 */                       if (obj != ii0111o) {
                                }
                            }
/* 381 */                   return ii0111o;
                        default:
/* 23 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 25 */                    int i3 = this.I00iiO;
/* 27 */                    if (i3 == 0) {
/* 79 */                        lIoii1l01l0i.I00000oOI(obj);
/* 84 */                        OO01Ol oO01Ol9 = (OO01Ol) this.I00iio;
/* 86 */                        if (!z) {
/* 216 */                           return function1.invoke(oO01Ol9.I00000oOI());
                                }
/* 93 */                        ooI0Oii0Ol003 = z2 ? OoI0Oii0Ol00.I00iOIl : OoI0Oii0Ol00.I00iiI;
/* 95 */                        if (z2) {
/* 151 */                           oO01Ol4 = oO01Ol9;
/* 154 */                           Ii0llooiiIii ii0llooiiIii3 = new Ii0llooiiIii(1, null, function1);
/* 157 */                           this.I00iio = oO01Ol4;
/* 159 */                           this.I00iiI = null;
/* 161 */                           this.I00iiO = 3;
/* 163 */                           obj = oO01Ol4.I0000oI00(ooI0Oii0Ol003, ii0llooiiIii3, this);
/* 167 */                           if (obj != ii0111o2) {
                                    }
/* 182 */                           return ii0111o2;
                                }
/* 97 */                        this.I00iio = oO01Ol9;
/* 99 */                        this.I00iiI = ooI0Oii0Ol003;
/* 101 */                       this.I00iiO = 1;
/* 103 */                       Boolean boolI0000Il00O3 = oO01Ol9.I0000Il00O(this);
/* 107 */                       if (boolI0000Il00O3 != ii0111o2) {
/* 111 */                           oO01Ol5 = oO01Ol9;
/* 112 */                           obj = boolI0000Il00O3;
                                }
/* 182 */                       return ii0111o2;
                            }
/* 29 */                    if (i3 != 1) {
/* 31 */                        if (i3 == 2) {
/* 59 */                            ooI0Oii0Ol004 = this.I00iiI;
/* 63 */                            oO01Ol6 = (OO01Ol) this.I00iio;
/* 65 */                            lIoii1l01l0i.I00000oOI(obj);
/* 145 */                           OO01Ol oO01Ol10 = oO01Ol6;
/* 146 */                           ooI0Oii0Ol003 = ooI0Oii0Ol004;
/* 147 */                           oO01Ol4 = oO01Ol10;
/* 154 */                           Ii0llooiiIii ii0llooiiIii32 = new Ii0llooiiIii(1, null, function1);
/* 157 */                           this.I00iio = oO01Ol4;
/* 159 */                           this.I00iiI = null;
/* 161 */                           this.I00iiO = 3;
/* 163 */                           obj = oO01Ol4.I0000oI00(ooI0Oii0Ol003, ii0llooiiIii32, this);
/* 167 */                           if (obj != ii0111o2) {
/* 170 */                               if (!z2) {
                                        }
                                    }
/* 182 */                           return ii0111o2;
                                }
/* 33 */                        if (i3 != 3) {
/* 35 */                            if (i3 != 4) {
/* 45 */                                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                                return null;
                                    }
/* 37 */                            Object obj6 = this.I00iio;
/* 39 */                            lIoii1l01l0i.I00000oOI(obj);
/* 42 */                            obj3 = obj6;
/* 192 */                           if (!((Boolean) obj).booleanValue()) {
/* 220 */                               return obj3;
                                    }
/* 194 */                           O00IOI11 o00ioi11I0001Ioi1lo3 = oi1oIiOiIi0.I0001Ioi1lo();
/* 204 */                           o00ioi11I0001Ioi1lo3.I00000oOI.I000II(o00ioi11I0001Ioi1lo3.I0000oI00, o00ioi11I0001Ioi1lo3.I0001Ioi1lo);
/* 220 */                           return obj3;
                                }
/* 52 */                        oO01Ol4 = (OO01Ol) this.I00iio;
/* 54 */                        lIoii1l01l0i.I00000oOI(obj);
/* 170 */                       if (!z2) {
/* 208 */                           return obj;
                                }
/* 172 */                       this.I00iio = obj;
/* 174 */                       this.I00iiO = 4;
/* 176 */                       Boolean boolI0000Il00O4 = oO01Ol4.I0000Il00O(this);
/* 180 */                       if (boolI0000Il00O4 != ii0111o2) {
/* 184 */                           obj3 = obj;
/* 185 */                           obj = boolI0000Il00O4;
/* 192 */                           if (!((Boolean) obj).booleanValue()) {
                                    }
                                }
/* 182 */                       return ii0111o2;
                            }
/* 69 */                    ooI0Oii0Ol003 = this.I00iiI;
/* 73 */                    oO01Ol5 = (OO01Ol) this.I00iio;
/* 75 */                    lIoii1l01l0i.I00000oOI(obj);
/* 119 */                   if (((Boolean) obj).booleanValue()) {
/* 149 */                       oO01Ol4 = oO01Ol5;
/* 154 */                       Ii0llooiiIii ii0llooiiIii322 = new Ii0llooiiIii(1, null, function1);
/* 157 */                       this.I00iio = oO01Ol4;
/* 159 */                       this.I00iiI = null;
/* 161 */                       this.I00iiO = 3;
/* 163 */                       obj = oO01Ol4.I0000oI00(ooI0Oii0Ol003, ii0llooiiIii322, this);
/* 167 */                       if (obj != ii0111o2) {
                                }
/* 182 */                       return ii0111o2;
                            }
/* 121 */                   O00IOI11 o00ioi11I0001Ioi1lo4 = oi1oIiOiIi0.I0001Ioi1lo();
/* 125 */                   this.I00iio = oO01Ol5;
/* 127 */                   this.I00iiI = ooI0Oii0Ol003;
/* 129 */                   this.I00iiO = 2;
/* 133 */                   Object objI000lI2 = o00ioi11I0001Ioi1lo4.I00000oOI.I000lI(this);
/* 137 */                   if (objI000lI2 == ii0111o2) {
/* 139 */                       obj4 = objI000lI2;
                            }
/* 140 */                   if (obj4 != ii0111o2) {
/* 143 */                       ooI0Oii0Ol004 = ooI0Oii0Ol003;
/* 144 */                       oO01Ol6 = oO01Ol5;
/* 145 */                       OO01Ol oO01Ol102 = oO01Ol6;
/* 146 */                       ooI0Oii0Ol003 = ooI0Oii0Ol004;
/* 147 */                       oO01Ol4 = oO01Ol102;
/* 154 */                       Ii0llooiiIii ii0llooiiIii3222 = new Ii0llooiiIii(1, null, function1);
/* 157 */                       this.I00iio = oO01Ol4;
/* 159 */                       this.I00iiI = null;
/* 161 */                       this.I00iiO = 3;
/* 163 */                       obj = oO01Ol4.I0000oI00(ooI0Oii0Ol003, ii0llooiiIii3222, this);
/* 167 */                       if (obj != ii0111o2) {
                                }
                            }
/* 182 */                   return ii0111o2;
                    }
                }
            }
