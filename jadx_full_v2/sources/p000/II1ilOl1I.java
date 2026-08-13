            package p000;

            import android.content.Context;
            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II1ilOl1I implements PointerInputEventHandler {
                public final int I00000oIO;
                public OooioIIoi0O I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;

                public II1ilOl1I(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object invoke(OO1io0l0 oO1io0l0, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00000oIO;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 46 */                    II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00000oOI;
/* 50 */                    Context context = (Context) this.I0000Il00O;
/* 54 */                    O1ol100o0O o1ol100o0O = (O1ol100o0O) this.I0000O;
/* 59 */                    II1iOOOOOl01 iI1iOOOOOl01 = new II1iOOOOOl01(2);
/* 62 */                    iI1iOOOOOl01.I00iiI = iI1o0111IO0;
/* 64 */                    iI1iOOOOOl01.I00iiO = context;
/* 66 */                    iI1iOOOOOl01.I00iio = o1ol100o0O;
/* 68 */                    VarHandle.storeStoreFence();
/* 74 */                    II1iil iI1iil = new II1iil(1);
/* 77 */                    iI1iil.I00iiI = iI1o0111IO0;
/* 79 */                    VarHandle.storeStoreFence();
/* 85 */                    II1iOOOOOl01 iI1iOOOOOl012 = new II1iOOOOOl01(3);
/* 88 */                    iI1iOOOOOl012.I00iiI = iI1o0111IO0;
/* 90 */                    iI1iOOOOOl012.I00iiO = context;
/* 92 */                    iI1iOOOOOl012.I00iio = o1ol100o0O;
/* 94 */                    VarHandle.storeStoreFence();
/* 99 */                    Object objI0000oI00 = OloI0l1i1oO.I0000oI00(oO1io0l0, iI1iOOOOOl01, iI1iil, null, iI1iOOOOOl012, iOoil1iiIilo, 4);
                            return objI0000oI00 == Ii0111o.I00iOIl ? objI0000oI00 : ooiIlOl1iI;
                        default:
/* 32 */                    Object objI0000oI002 = OloI0l1i1oO.I0000oI00(oO1io0l0, null, null, new I0i11IIo((Io1o01Ol0i01) this.I00000oOI, (Function1) this.I0000Il00O, (Function1) this.I0000O, null), null, iOoil1iiIilo, 11);
                            return objI0000oI002 == Ii0111o.I00iOIl ? objI0000oI002 : ooiIlOl1iI;
                    }
                }
            }
