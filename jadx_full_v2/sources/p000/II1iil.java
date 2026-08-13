            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II1iil implements Function1 {
                public final int I00iOIl;
                public II1o0111IO0 I00iiI;

                @Override
                public final Object invoke(Object obj) {
                    Object objI00000oIO;
/* 1 */             int i = this.I00iOIl;
/* 3 */             II1o0111IO0 iI1o0111IO0 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 42 */                    IIl10IOlll0 iIl10IOlll0 = (IIl10IOlll0) obj;
/* 48 */                    iI1o0111IO0.I0010o = iIl10IOlll0.I00000oOI();
/* 54 */                    iI1o0111IO0.I00111O = iIl10IOlll0.I0000Il00O();
/* 56 */                    int i2 = 0;
/* 57 */                    iI1o0111IO0.I001IO000 = false;
                            try {
/* 64 */                        IIlO1O0lOl iIlO1O0lOlI00000oIO = iIl10IOlll0.I00000oOI().I00000oIO();
/* 72 */                        lII1OI11o1I.I00000oIO("CameraControl doesn't contain Camera2 implementation.", iIlO1O0lOlI00000oIO instanceof IIlO0OOI1lI);
/* 77 */                        IIiloliili1I iIiloliili1I = ((IIlO0OOI1lI) iIlO1O0lOlI00000oIO).I000OOo1O;
/* 79 */                        OI0oiliol10O oI0oiliol10OI000OOo1O = OI0oiliol10O.I000OOo1O();
/* 94 */                        oI0oiliol10OI000OOo1O.I0010I0i(iOil1io0i00.I00000oIO(CaptureRequest.CONTROL_AF_MODE), 4);
/* 105 */                       IIloOI iIloOI = new IIloOI(OIil0iio0.I0001Ioi1lo(oI0oiliol10OI000OOo1O), 8);
/* 108 */                       IIio0010i1l iIio0010i1l = iIiloliili1I.I00000oIO;
                                synchronized (iIio0010i1l.I00iOIl) {
/* 118 */                           iIio0010i1l.I00iiO = new IIl0lo1oi(0);
                                }
/* 121 */                       iIio0010i1l.I00000oIO(iIloOI);
/* 131 */                       IOi10loi iOi10loiI00000oOI = iIiloliili1I.I00000oIO.I00000oOI(iIiloliili1I.I0000O, true);
/* 137 */                       IIoIil iIoIil = new IIoIil(3);
/* 140 */                       iIoIil.I00iiI = iOi10loiI00000oOI;
/* 142 */                       iIoIil.I00iiO = "setCaptureRequestOptions";
/* 144 */                       VarHandle.storeStoreFence();
/* 151 */                       objI00000oIO = iIllIoiiIO.I0000oI00(iOiiloIII0O.I00000oIO(iIoIil));
                            } catch (Throwable th) {
/* 160 */                       objI00000oIO = lIoii1l01l0i.I00000oIO(th);
                            }
/* 164 */                   Throwable thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 168 */                   if (thI00000oOI != null) {
/* 174 */                       Log.w("BoxAssistVM", "continuous-picture AF not applied", thI00000oOI);
                            }
/* 177 */                   OlIl0i olIl0i = iI1o0111IO0.I001IIilI0O;
/* 179 */                   IOoil1iiIilo iOoil1iiIilo = null;
/* 180 */                   if (olIl0i != null) {
/* 182 */                       olIl0i.I000II(null);
                            }
/* 198 */                   iI1o0111IO0.I001IIilI0O = iOi1II01i0.I0000O(OooiooIOO.I00000oIO(iI1o0111IO0), null, null, new II1liI(iI1o0111IO0, iOoil1iiIilo, i2), 3);
/* 200 */                   return OoiIlOl1iI.I00000oIO;
                        default:
/* 18 */                    String str = ((II1l1O1oi01) iI1o0111IO0.I0000Il00O.getValue()).I0000O;
/* 20 */                    int length = str.length();
/* 24 */                    I1OI0i1lo i1OI0i1lo = iI1o0111IO0.I000O01llI0;
/* 26 */                    if (length > 0) {
/* 28 */                        i1OI0i1lo.I00000oOI(str);
                            } else {
/* 36 */                        i1OI0i1lo.I00000oIO("Nothing to repeat yet.", Ool0lIo1o000.I00iiI);
                            }
/* 39 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }
            }
