            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class I10lOO0IOo extends O0iO10011II implements Function1 {
                public final int I00iOIl;
                public final I10li01 I00iiI;
                public final long I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I10lOO0IOo(I10li01 i10li01, long j, int i) {
/* 8 */             super(1);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiI = i10li01;
/* 5 */             this.I00iiO = j;
                }

                @Override
                public final Object invoke(Object obj) {
                    IlIoO1ilo1 ilIoO1ilo1;
/* 1 */             int i = this.I00iOIl;
/* 10 */            long j = this.I00iiO;
/* 12 */            I10li01 i10li01 = this.I00iiI;
                    switch (i) {
                        case 0:
/* 68 */                    OoI1O01lI ooI1O01lI = (OoI1O01lI) obj;
/* 84 */                    if (!O0000Ioio00.I0000O(ooI1O01lI.I00000oOI(), i10li01.I00oI0i.I00000oOI())) {
/* 110 */                       OlO01l1oOil olO01l1oOil = (OlO01l1oOil) i10li01.I00oI0i.I0000oI00.I000II(ooI1O01lI.I00000oOI());
/* 123 */                       j = olO01l1oOil != null ? ((IooOl0ol01) olO01l1oOil.getValue()).I00000oIO : 0L;
                            } else if (!IooOl0ol01.I0000Il00O(i10li01.I00oli, -9223372034707292160L)) {
/* 95 */                        j = i10li01.I00oli;
                            }
/* 136 */                   OlO01l1oOil olO01l1oOil2 = (OlO01l1oOil) i10li01.I00oI0i.I0000oI00.I000II(ooI1O01lI.I0000oI00());
/* 146 */                   j = olO01l1oOil2 != null ? ((IooOl0ol01) olO01l1oOil2.getValue()).I00000oIO : 0L;
/* 154 */                   Ol0iiil01 ol0iiil01 = (Ol0iiil01) i10li01.I00o101lO.getValue();
                            return (ol0iiil01 == null || (ilIoO1ilo1 = (IlIoO1ilo1) ol0iiil01.I00000oIO.invoke(IooOl0ol01.I00000oIO(j), IooOl0ol01.I00000oIO(j))) == null) ? iOO01lio0.I0000Il00O(0.0f, 400.0f, null, 5) : ilIoO1ilo1;
                        default:
/* 27 */                    if (O0000Ioio00.I0000O(obj, i10li01.I00oI0i.I00000oOI())) {
/* 39 */                        j = IooOl0ol01.I0000Il00O(i10li01.I00oli, -9223372034707292160L) ? j : i10li01.I00oli;
                            } else {
/* 51 */                        OlO01l1oOil olO01l1oOil3 = (OlO01l1oOil) i10li01.I00oI0i.I0000oI00.I000II(obj);
/* 53 */                        if (olO01l1oOil3 != null) {
/* 61 */                            j = ((IooOl0ol01) olO01l1oOil3.getValue()).I00000oIO;
                                }
                            }
/* 63 */                    return IooOl0ol01.I00000oIO(j);
                    }
                }
            }
