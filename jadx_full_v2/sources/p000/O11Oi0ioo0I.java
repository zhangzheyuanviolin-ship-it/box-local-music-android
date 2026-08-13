            package p000;

            import android.speech.tts.TextToSpeech;
            
            public final class O11Oi0ioo0I extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public int I00iiI;
                public final TextToSpeech I00iiO;
                public final I0O1OI I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI10i0Il I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O11Oi0ioo0I(TextToSpeech textToSpeech, I0O1OI i0o1oi, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 12 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iiO = textToSpeech;
/* 5 */             this.I00iio = i0o1oi;
/* 7 */             this.I00ilI0I1 = oI10i0Il;
/* 9 */             this.I00ilO0 = oI10i0Il2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 35 */                    return new O11Oi0ioo0I(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 0);
                        default:
/* 18 */                    return new O11Oi0ioo0I(this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, iOoil1iiIilo, 1);
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
/* 18 */            return ((O11Oi0ioo0I) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(300, r16) == r1) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
                
                    if (p000.il0l1o1l.I00000oOI(300, r16) == r1) goto L38;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 9 */             I0O1OI i0o1oi = this.I00iio;
/* 11 */            OI10i0Il oI10i0Il2 = this.I00ilO0;
/* 17 */            TextToSpeech textToSpeech = this.I00iiO;
                    switch (i) {
                        case 0:
/* 87 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 89 */                    int i2 = this.I00iiI;
/* 91 */                    if (i2 != 0 && i2 != 1) {
/* 95 */                        if (i2 != 2) {
/* 101 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
/* 97 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
                            } else {
/* 106 */                       lIoii1l01l0i.I00000oOI(obj);
                                while (true) {
/* 113 */                           if (!textToSpeech.isSpeaking()) {
/* 124 */                               this.I00iiI = 2;
                                        break;
                                    } else {
/* 115 */                               this.I00iiI = 1;
/* 121 */                               if (il0l1o1l.I00000oOI(150L, this) == ii0111o) {
                                        }
                                    }
                                }
                                break;
                            }
/* 138 */                   if (O11Oio.I00000oOI(oI10i0Il2)) {
/* 140 */                       i0o1oi.invoke();
                            }
/* 143 */                   oI10i0Il.setValue(null);
                            break;
                        default:
/* 27 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 29 */                    int i3 = this.I00iiI;
/* 31 */                    if (i3 != 0 && i3 != 1) {
/* 35 */                        if (i3 != 2) {
/* 41 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                    break;
                                } else {
/* 37 */                            lIoii1l01l0i.I00000oOI(obj);
                                }
                            } else {
/* 46 */                        lIoii1l01l0i.I00000oOI(obj);
                                while (true) {
/* 53 */                            if (!textToSpeech.isSpeaking()) {
/* 64 */                                this.I00iiI = 2;
                                        break;
                                    } else {
/* 55 */                                this.I00iiI = 1;
/* 61 */                                if (il0l1o1l.I00000oOI(150L, this) == ii0111o2) {
                                        }
                                    }
                                }
                                break;
                            }
/* 78 */                    if (O11Oio.I00000oOI(oI10i0Il2)) {
/* 80 */                        i0o1oi.invoke();
                            }
/* 83 */                    oI10i0Il.setValue(null);
                            break;
                    }
/* 86 */            return ooiIlOl1iI;
                }
            }
