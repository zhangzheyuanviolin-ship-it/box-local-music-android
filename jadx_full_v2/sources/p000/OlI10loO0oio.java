            package p000;

            import android.content.Context;
            import com.google.mlkit.vision.barcode.common.Barcode;
            
            public final class OlI10loO0oio extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public OlI0o1 I00iiI;
                public int I00iiO;
                public final Context I00iio;
                public final O1oIOiI11o0 I00ilI0I1;
                public final I0IO1io0I I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlI10loO0oio(int i, I0IO1io0I i0IO1io0I, IOoil1iiIilo iOoil1iiIilo, O1oIOiI11o0 o1oIOiI11o0, Context context) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = context;
/* 5 */             this.I00ilI0I1 = o1oIOiI11o0;
/* 7 */             this.I00ilO0 = i0IO1io0I;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 31 */                    return new OlI10loO0oio(0, this.I00ilO0, iOoil1iiIilo, this.I00ilI0I1, this.I00iio);
                        default:
/* 16 */                    return new OlI10loO0oio(1, this.I00ilO0, iOoil1iiIilo, this.I00ilI0I1, this.I00iio);
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
/* 18 */            return ((OlI10loO0oio) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OlI0o1 olI0o1;
                    OlI0o1 olI0o12;
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             Context context = this.I00iio;
/* 12 */            O1oIOiI11o0 o1oIOiI11o0 = this.I00ilI0I1;
/* 14 */            I0IO1io0I i0IO1io0I = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 91 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 93 */                    int i2 = this.I00iiO;
/* 95 */                    if (i2 == 0) {
/* 110 */                       lIoii1l01l0i.I00000oOI(obj);
/* 117 */                       OlI0o1 olI0o13 = new OlI0o1(Barcode.FORMAT_PDF417);
/* 120 */                       this.I00iiI = olI0o13;
/* 122 */                       this.I00iiO = 1;
/* 131 */                       Object objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OlI0lo1OOoiO(olI0o13, o1oIOiI11o0, context, null), this);
/* 135 */                       if (objI0000oI00 == ii0111o) {
                                    break;
                                } else {
/* 140 */                           obj = objI0000oI00;
/* 141 */                           olI0o1 = olI0o13;
                                }
                            } else if (i2 != 1) {
/* 105 */                       I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 99 */                        olI0o1 = this.I00iiI;
/* 101 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 148 */                   if (!((Boolean) obj).booleanValue()) {
/* 158 */                       i0IO1io0I.invoke("Failed to load SoundGen HD Long");
                                break;
                            } else {
/* 150 */                       o1oIOiI11o0.I00IlilI0i0i = olI0o1;
/* 152 */                       i0IO1io0I.invoke("");
                                break;
                            }
                        default:
/* 20 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 22 */                    int i3 = this.I00iiO;
/* 24 */                    if (i3 == 0) {
/* 39 */                        lIoii1l01l0i.I00000oOI(obj);
/* 46 */                        OlI0o1 olI0o14 = new OlI0o1(Barcode.FORMAT_QR_CODE);
/* 49 */                        this.I00iiI = olI0o14;
/* 51 */                        this.I00iiO = 1;
/* 60 */                        Object objI0000oI002 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new OlI0lo1OOoiO(olI0o14, o1oIOiI11o0, context, null), this);
/* 64 */                        if (objI0000oI002 == ii0111o2) {
                                    break;
                                } else {
/* 69 */                            obj = objI0000oI002;
/* 70 */                            olI0o12 = olI0o14;
                                }
                            } else if (i3 != 1) {
/* 34 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 28 */                        olI0o12 = this.I00iiI;
/* 30 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 77 */                    if (!((Boolean) obj).booleanValue()) {
/* 87 */                        i0IO1io0I.invoke("Failed to load SoundGen HD");
                                break;
                            } else {
/* 79 */                        o1oIOiI11o0.I00IlilI0i0i = olI0o12;
/* 81 */                        i0IO1io0I.invoke("");
                                break;
                            }
                    }
/* 90 */            return ooiIlOl1iI;
                }
            }
