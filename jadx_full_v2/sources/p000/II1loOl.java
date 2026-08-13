            package p000;

            import android.graphics.Bitmap;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            
/* 15 */    public final class II1loOl extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public boolean I00iiO;
                public boolean I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public II1loOl(IOoil1iiIilo iOoil1iiIilo, O1Iioo1 o1Iioo1, IOi10loi iOi10loi, boolean z, boolean z2) {
/* 13 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00ilI0I1 = o1Iioo1;
/* 6 */             this.I00ilO0 = iOi10loi;
/* 8 */             this.I00iiO = z;
/* 10 */            this.I00iio = z2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 32 */                    return new II1loOl((II1o0111IO0) obj2, iOoil1iiIilo);
                        default:
/* 23 */                    return new II1loOl(iOoil1iiIilo, (O1Iioo1) this.I00ilI0I1, (IOi10loi) obj2, this.I00iiO, this.I00iio);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((II1loOl) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0170 A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0174  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x017e  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x0182  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x019d  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String strI000iOII;
                    Object objI0000oI00;
                    boolean zBooleanValue;
                    Object objI0000oI002;
                    boolean zBooleanValue2;
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean zBooleanValue3;
                    Object objI00o0iI0io1;
/* 7 */             Object[] objArr = 0;
                    switch (this.I00iOIl) {
                        case 0:
/* 182 */                   OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 186 */                   II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00ilO0;
/* 188 */                   I1OI0i1lo i1OI0i1lo = iI1o0111IO0.I000O01llI0;
/* 190 */                   OlO0OIIl1 olO0OIIl1 = iI1o0111IO0.I0000Il00O;
/* 192 */                   O1loO10Ii0I o1loO10Ii0I = iI1o0111IO0.I0001Ioi1lo;
/* 194 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 196 */                   int i = this.I00iiI;
/* 200 */                   if (i == 0) {
/* 243 */                       lIoii1l01l0i.I00000oOI(obj);
/* 246 */                       O1oIOiI11o0 o1oIOiI11o0 = II1iIoo.I00000oIO;
/* 250 */                       String strI000iOII2 = iI1o0111IO0.I000iOII(o1oIOiI11o0, "yolox_m.tflite");
/* 256 */                       strI000iOII = iI1o0111IO0.I000iOII(o1oIOiI11o0, "midas_small_256_fp16.tflite");
/* 260 */                       if (strI000iOII2 == null || strI000iOII == null) {
/* 470 */                           olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Download the Box Assist Core models to begin.", null, false, 25));
/* 477 */                           i1OI0i1lo.I00000oIO("Please download the Box Assist models to begin.", Ool0lIo1o000.I00iiI);
/* 412 */                           return ooiIlOl1iI;
                                }
/* 266 */                       IIOo1i iIOo1i = iI1o0111IO0.I0000oI00;
/* 268 */                       this.I00ilI0I1 = strI000iOII;
/* 270 */                       this.I00iiI = 1;
/* 272 */                       iIOo1i.getClass();
/* 282 */                       objI0000oI00 = iOi1II01i0.I0000oI00(II1o1O1O1iIi.I00000oIO, new i01oo0lIil00(iIOo1i, strI000iOII2, null), this);
/* 286 */                       if (objI0000oI00 != ii0111o) {
                                }
/* 360 */                       return ii0111o;
                            }
/* 202 */                   if (i != 1) {
/* 204 */                       if (i != 2) {
/* 206 */                           if (i != 3) {
/* 219 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                                 return null;
                                    }
/* 208 */                           z2 = this.I00iio;
/* 210 */                           z = this.I00iiO;
/* 212 */                           lIoii1l01l0i.I00000oOI(obj);
/* 365 */                           zBooleanValue2 = z2;
/* 366 */                           zBooleanValue = z;
/* 373 */                           z3 = zBooleanValue && zBooleanValue2;
/* 400 */                           olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, z3, !z3 ? "Ready — Live mode" : "Model load failed — check logcat.", null, false, 25));
/* 403 */                           if (z3) {
/* 447 */                               iOi100.I00000oIO(Log.e("BoxAssistVM", "engine load failed (yolox=" + zBooleanValue + " midas=" + zBooleanValue2 + ")"));
                                    } else {
/* 409 */                               i1OI0i1lo.I00000oIO("Box Assist ready. Live mode.", Ool0lIo1o000.I00iiI);
                                    }
/* 412 */                           return ooiIlOl1iI;
                                }
/* 224 */                       zBooleanValue = this.I00iiO;
/* 226 */                       lIoii1l01l0i.I00000oOI(obj);
/* 229 */                       objI0000oI002 = obj;
/* 320 */                       zBooleanValue2 = ((Boolean) objI0000oI002).booleanValue();
/* 324 */                       if (zBooleanValue2) {
/* 330 */                           Bitmap bitmapCreateBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
/* 334 */                           this.I00ilI0I1 = null;
/* 336 */                           this.I00iiO = zBooleanValue;
/* 338 */                           this.I00iio = zBooleanValue2;
/* 340 */                           this.I00iiI = 3;
/* 342 */                           o1loO10Ii0I.getClass();
/* 358 */                           if (iOi1II01i0.I0000oI00(II1o1O1O1iIi.I00000oIO, new O00lOIIO(o1loO10Ii0I, bitmapCreateBitmap, objArr == true ? 1 : 0, 14), this) != ii0111o) {
/* 363 */                               z = zBooleanValue;
/* 364 */                               z2 = zBooleanValue2;
/* 365 */                               zBooleanValue2 = z2;
/* 366 */                               zBooleanValue = z;
                                    }
/* 360 */                           return ii0111o;
                                }
/* 373 */                       if (zBooleanValue) {
/* 400 */                           olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, z3, !z3 ? "Ready — Live mode" : "Model load failed — check logcat.", null, false, 25));
/* 403 */                           if (z3) {
                                    }
                                }
/* 412 */                       return ooiIlOl1iI;
                            }
/* 234 */                   String str = (String) this.I00ilI0I1;
/* 236 */                   lIoii1l01l0i.I00000oOI(obj);
/* 239 */                   strI000iOII = str;
/* 240 */                   objI0000oI00 = obj;
/* 291 */                   zBooleanValue = ((Boolean) objI0000oI00).booleanValue();
/* 295 */                   this.I00ilI0I1 = null;
/* 297 */                   this.I00iiO = zBooleanValue;
/* 299 */                   this.I00iiI = 2;
/* 301 */                   o1loO10Ii0I.getClass();
/* 311 */                   objI0000oI002 = iOi1II01i0.I0000oI00(II1o1O1O1iIi.I00000oIO, new O1loIil1(o1loO10Ii0I, strI000iOII, null), this);
/* 315 */                   if (objI0000oI002 != ii0111o) {
/* 320 */                       zBooleanValue2 = ((Boolean) objI0000oI002).booleanValue();
/* 324 */                       if (zBooleanValue2) {
                                }
/* 373 */                       if (zBooleanValue) {
                                }
/* 412 */                       return ooiIlOl1iI;
                            }
/* 360 */                   return ii0111o;
                        default:
/* 11 */                    boolean z4 = this.I00iiO;
/* 15 */                    IOi10loi iOi10loi = (IOi10loi) this.I00ilO0;
/* 19 */                    O1Iioo1 o1Iioo1 = (O1Iioo1) this.I00ilI0I1;
/* 21 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 23 */                    int i2 = this.I00iiI;
/* 25 */                    if (i2 == 0) {
/* 42 */                        lIoii1l01l0i.I00000oOI(obj);
/* 45 */                        IiIOI1ol0o iiIOI1ol0o = o1Iioo1.I000OOo1O;
/* 47 */                        if (iiIOI1ol0o == null) {
/* 67 */                            zBooleanValue3 = false;
/* 69 */                            if (zBooleanValue3) {
/* 87 */                                o1Iioo1.I0000oI00 = z4;
/* 89 */                                if (!z4) {
/* 93 */                                    o1Iioo1.I0000Il00O(o1Iioo1.I0001Ioi1lo, -1);
                                        }
/* 98 */                                if (o1Iioo1.I0000Il00O != null) {
/* 100 */                                   if (z4) {
/* 104 */                                       o1Iioo1.I0000Il00O(o1Iioo1.I0001Ioi1lo, 0);
                                            }
/* 107 */                                   boolean z5 = this.I00iio;
/* 109 */                                   IOi10loi iOi10loi2 = o1Iioo1.I000O01llI0;
/* 111 */                                   if (z5) {
/* 113 */                                       if (iOi10loi2 != null) {
/* 117 */                                           IIl001iO0Io.I001l0I00("There is a new enableLowLightBoost being set", iOi10loi2);
                                                }
/* 120 */                                       o1Iioo1.I000O01llI0 = null;
                                            } else if (iOi10loi2 != null) {
/* 125 */                                       iiolOOio1.I0000Il00O(iOi10loi, iOi10loi2);
                                            }
/* 128 */                                   o1Iioo1.I000O01llI0 = iOi10loi;
/* 130 */                                   OlO01I1 olO01I1 = o1Iioo1.I00000oIO;
/* 137 */                                   Integer num = z4 ? new Integer(6) : null;
                                            synchronized (olO01I1.I0000O) {
/* 143 */                                       olO01I1.I000iOII = num;
                                            }
/* 150 */                                   iiolOOio1.I0000Il00O(olO01I1.I0001Ioi1lo(), iOi10loi);
/* 157 */                                   I01i01OoI i01i01OoI = new I01i01OoI(18);
/* 160 */                                   i01i01OoI.I00iiI = iOi10loi;
/* 162 */                                   i01i01OoI.I00iiO = o1Iioo1;
/* 164 */                                   VarHandle.storeStoreFence();
/* 167 */                                   iOi10loi.I00iiI(i01i01OoI);
                                        } else {
/* 176 */                                   IIl001iO0Io.I001l0I00("Camera is not active.", iOi10loi);
                                        }
                                    } else {
/* 73 */                                o1Iioo1.I0000Il00O(o1Iioo1.I0001Ioi1lo, -1);
/* 83 */                                iOi10loi.I00iIO(new IllegalStateException("Low Light Boost is disabled when expected frame rate range exceeds 30."));
                                    }
/* 179 */                           return OoiIlOl1iI.I00000oIO;
                                }
/* 49 */                        this.I00iiI = 1;
/* 51 */                        objI00o0iI0io1 = iiIOI1ol0o.I00o0iI0io1(this);
/* 55 */                        if (objI00o0iI0io1 == ii0111o2) {
/* 57 */                            return ii0111o2;
                                }
                            } else {
/* 27 */                        if (i2 != 1) {
/* 37 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                             return null;
                                }
/* 29 */                        lIoii1l01l0i.I00000oOI(obj);
/* 32 */                        objI00o0iI0io1 = obj;
                            }
/* 62 */                    zBooleanValue3 = ((Boolean) objI00o0iI0io1).booleanValue();
/* 69 */                    if (zBooleanValue3) {
                            }
/* 179 */                   return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 16 */        public II1loOl(II1o0111IO0 iI1o0111IO0, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 17 */            this.I00ilO0 = iI1o0111IO0;
                }
            }
