            package p000;

            import android.view.View;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II1iO0iiI implements Function1 {
                public final int I00iOIl;
                public View I00iiI;

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 4 */             View view = this.I00iiI;
                    switch (i) {
                        case 0:
/* 26 */                    view.setKeepScreenOn(true);
/* 32 */                    II1l10Ool1 iI1l10Ool1 = new II1l10Ool1(0);
/* 35 */                    iI1l10Ool1.I00000oOI = view;
/* 37 */                    VarHandle.storeStoreFence();
/* 40 */                    return iI1l10Ool1;
                        default:
/* 11 */                    view.setKeepScreenOn(true);
/* 17 */                    II1l10Ool1 iI1l10Ool12 = new II1l10Ool1(2);
/* 20 */                    iI1l10Ool12.I00000oOI = view;
/* 22 */                    VarHandle.storeStoreFence();
/* 25 */                    return iI1l10Ool12;
                    }
                }
            }
