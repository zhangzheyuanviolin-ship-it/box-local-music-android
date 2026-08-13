            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.net.Uri;
            import java.util.List;
            
            public final class Iloio0Oi0 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public OI10i0Il I00iiI;
                public int I00iiO;
                public final Context I00iio;
                public final Uri I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final OI10i0Il I00io1l;
                public final OI10i0Il I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Iloio0Oi0(Context context, Uri uri, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = context;
/* 5 */             this.I00ilI0I1 = uri;
/* 7 */             this.I00ilO0 = oI10i0Il;
/* 9 */             this.I00io1l = oI10i0Il2;
/* 11 */            this.I00ioIO = oI10i0Il3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    return new Iloio0Oi0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo, 0);
                        default:
/* 20 */                    return new Iloio0Oi0(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo, 1);
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
/* 18 */            return ((Iloio0Oi0) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             OI10i0Il oI10i0Il = this.I00ioIO;
/* 9 */             OI10i0Il oI10i0Il2 = this.I00io1l;
/* 11 */            Uri uri = this.I00ilI0I1;
/* 13 */            Context context = this.I00iio;
/* 15 */            OI10i0Il oI10i0Il3 = this.I00ilO0;
                    switch (i) {
                        case 0:
/* 72 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 74 */                    int i2 = this.I00iiO;
/* 76 */                    if (i2 == 0) {
/* 91 */                        lIoii1l01l0i.I00000oOI(obj);
/* 94 */                        this.I00iiI = oI10i0Il3;
/* 96 */                        this.I00iiO = 1;
/* 98 */                        obj = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 102 */                       if (obj == ii0111o) {
                                    break;
                                }
                            } else if (i2 != 1) {
/* 86 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 80 */                        oI10i0Il3 = this.I00iiI;
/* 82 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 108 */                   List list = Iloo0ilo.I00000oIO;
/* 110 */                   oI10i0Il3.setValue((Bitmap) obj);
/* 113 */                   oI10i0Il2.setValue("");
/* 116 */                   oI10i0Il.setValue(null);
                            break;
                        default:
/* 24 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 26 */                    int i3 = this.I00iiO;
/* 28 */                    if (i3 == 0) {
/* 43 */                        lIoii1l01l0i.I00000oOI(obj);
/* 46 */                        this.I00iiI = oI10i0Il3;
/* 48 */                        this.I00iiO = 1;
/* 50 */                        obj = Iloo0ilo.I00IioO0OiOi(context, uri, this);
/* 54 */                        if (obj == ii0111o2) {
                                    break;
                                }
                            } else if (i3 != 1) {
/* 38 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
/* 32 */                        oI10i0Il3 = this.I00iiI;
/* 34 */                        lIoii1l01l0i.I00000oOI(obj);
                            }
/* 60 */                    List list2 = Iloo0ilo.I00000oIO;
/* 62 */                    oI10i0Il3.setValue((Bitmap) obj);
/* 65 */                    oI10i0Il2.setValue("");
/* 68 */                    oI10i0Il.setValue(null);
                            break;
                    }
/* 71 */            return ooiIlOl1iI;
                }
            }
