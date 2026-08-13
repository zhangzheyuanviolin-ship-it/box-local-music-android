            package p000;

            import android.util.Log;
            import kotlin.jvm.functions.Function1;
            
            public final class Iil01ll01I01 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final boolean I00iiI;
                public final O1oIOiI11o0 I00iiO;
                public final O1ol100o0O I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final Function1 I00io1l;
                public final OI10i0Il I00ioIO;
                public final IllOOo00lI I00l0I0l0lO1;
                public final IllOOo00lI I00l0OO0IO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iil01ll01I01(boolean z, O1oIOiI11o0 o1oIOiI11o0, O1ol100o0O o1ol100o0O, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, Function1 function1, OI10i0Il oI10i0Il3, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IOoil1iiIilo iOoil1iiIilo) {
/* 20 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = z;
/* 3 */             this.I00iiO = o1oIOiI11o0;
/* 5 */             this.I00iio = o1ol100o0O;
/* 7 */             this.I00ilI0I1 = oI10i0Il;
/* 9 */             this.I00ilO0 = oI10i0Il2;
/* 11 */            this.I00io1l = function1;
/* 13 */            this.I00ioIO = oI10i0Il3;
/* 15 */            this.I00l0I0l0lO1 = illOOo00lI;
/* 17 */            this.I00l0OO0IO = illOOo00lI2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 22 */            return new Iil01ll01I01(this.I00iiI, this.I00iiO, this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, this.I00l0I0l0lO1, this.I00l0OO0IO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Iil01ll01I01) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Removed duplicated region for block: B:52:0x0106 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0107 A[RETURN] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 41 */                    lIoii1l01l0i.I00000oOI(obj);
/* 47 */                    if (this.I00iiI) {
/* 49 */                        OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 52 */                        Iil0O0iOiIil.I00000oOI(oI10i0Il, true);
/* 55 */                        O1oIOiI11o0 o1oIOiI11o0 = this.I00iiO;
/* 62 */                        boolean zI000l1 = OlOolloIIOl0.I000l1(o1oIOiI11o0.I000O01llI0, "https://huggingface.co", false);
/* 66 */                        Function1 function1 = this.I00io1l;
/* 68 */                        if (zI000l1) {
/* 70 */                            OI10i0Il oI10i0Il2 = this.I00ilO0;
/* 72 */                            Iil0O0iOiIil.I0000Il00O(oI10i0Il2, true);
/* 75 */                            O1ol100o0O o1ol100o0O = this.I00iio;
/* 77 */                            o1ol100o0O.getClass();
/* 80 */                            int iI001IO000 = O1ol100o0O.I001IO000(o1oIOiI11o0, null);
/* 86 */                            if (iI001IO000 == 200) {
/* 88 */                                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 90 */                                Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 94 */                                Iil010OO iil010OO = new Iil010OO(0, null, function1);
/* 97 */                                this.I00iOIl = 1;
                                        return iOi1II01i0.I0000oI00(io11l1li, iil010OO, this) == ii0111o ? ii0111o : ooiIlOl1iI;
                                    }
/* 107 */                           if (iI001IO000 < 0) {
/* 109 */                               Boolean bool = Boolean.FALSE;
/* 111 */                               oI10i0Il2.setValue(bool);
/* 114 */                               oI10i0Il.setValue(bool);
/* 121 */                               Log.e("AGDownloadAndTryButton", "Unknown network error");
/* 128 */                               this.I00ioIO.setValue(Boolean.TRUE);
/* 131 */                               return ooiIlOl1iI;
                                    }
/* 132 */                           Oo1O0Ol0ll oo1O0Ol0llI001iOo1i0O = o1ol100o0O.I001iOo1i0O();
/* 138 */                           int iOrdinal = oo1O0Ol0llI001iOo1i0O.I00000oIO.ordinal();
/* 142 */                           IllOOo00lI illOOo00lI = this.I00l0I0l0lO1;
/* 144 */                           if (iOrdinal == 0 || iOrdinal == 1) {
/* 206 */                               IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 208 */                               Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 212 */                               Iil01I1I iil01I1I = new Iil01I1I(illOOo00lI, null, 0);
/* 215 */                               this.I00iOIl = 2;
/* 221 */                               if (iOi1II01i0.I0000oI00(io11l1li2, iil01I1I, this) == ii0111o) {
                                        }
                                    } else {
/* 148 */                               if (iOrdinal != 2) {
/* 202 */                                   I000II.I00000oIO();
/* 7 */                                     return null;
                                        }
/* 160 */                               if (O1ol100o0O.I001IO000(o1oIOiI11o0, oo1O0Ol0llI001iOo1i0O.I00000oOI.I0010I0i()) == 200) {
/* 162 */                                   IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 164 */                                   Io11l1li io11l1li3 = O1OI1l011OO1.I00000oIO;
/* 170 */                                   I1iIil1I i1iIil1I = new I1iIil1I(function1, oo1O0Ol0llI001iOo1i0O, null, 19);
/* 174 */                                   this.I00iOIl = 3;
/* 180 */                                   if (iOi1II01i0.I0000oI00(io11l1li3, i1iIil1I, this) == ii0111o) {
                                            }
                                        } else {
/* 183 */                                   IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 185 */                                   Io11l1li io11l1li4 = O1OI1l011OO1.I00000oIO;
/* 189 */                                   Iil01I1I iil01I1I2 = new Iil01I1I(illOOo00lI, null, 1);
/* 193 */                                   this.I00iOIl = 4;
/* 199 */                                   if (iOi1II01i0.I0000oI00(io11l1li4, iil01I1I2, this) == ii0111o) {
                                            }
                                        }
                                    }
                                } else {
/* 224 */                           IiI0oillOO10 iiI0oillOO105 = IiiIil1lOIO.I00000oIO;
/* 226 */                           Io11l1li io11l1li5 = O1OI1l011OO1.I00000oIO;
/* 230 */                           Iil010OO iil010OO2 = new Iil010OO(1, null, function1);
/* 234 */                           this.I00iOIl = 5;
/* 240 */                           if (iOi1II01i0.I0000oI00(io11l1li5, iil010OO2, this) == ii0111o) {
                                    }
                                }
                            } else {
/* 243 */                       IiI0oillOO10 iiI0oillOO106 = IiiIil1lOIO.I00000oIO;
/* 245 */                       Io11l1li io11l1li6 = O1OI1l011OO1.I00000oIO;
/* 251 */                       Iil01I1I iil01I1I3 = new Iil01I1I(this.I00l0OO0IO, null, 2);
/* 255 */                       this.I00iOIl = 6;
/* 261 */                       if (iOi1II01i0.I0000oI00(io11l1li6, iil01I1I3, this) == ii0111o) {
                                }
                            }
                        case 1:
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 40 */                    return ooiIlOl1iI;
                        case 2:
/* 33 */                    lIoii1l01l0i.I00000oOI(obj);
/* 36 */                    return ooiIlOl1iI;
                        case 3:
/* 29 */                    lIoii1l01l0i.I00000oOI(obj);
/* 32 */                    return ooiIlOl1iI;
                        case 4:
/* 25 */                    lIoii1l01l0i.I00000oOI(obj);
/* 28 */                    return ooiIlOl1iI;
                        case 5:
/* 21 */                    lIoii1l01l0i.I00000oOI(obj);
/* 24 */                    return ooiIlOl1iI;
                        case 6:
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 20 */                    return ooiIlOl1iI;
                        default:
/* 13 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 7 */                     return null;
                    }
                }
            }
