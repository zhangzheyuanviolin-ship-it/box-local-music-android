            package p000;

            import android.view.View;
            import android.view.autofill.AutofillId;
            import java.lang.invoke.VarHandle;
            
            public abstract class li1iI1ill1 {
                public static IIloOI I00000oIO(View view) {
/* 1 */             AutofillId autofillId = view.getAutofillId();
/* 8 */             IIloOI iIloOI = new IIloOI(5);
/* 11 */            iIloOI.I00iiI = autofillId;
/* 13 */            VarHandle.storeStoreFence();
/* 29 */            return iIloOI;
                }
            }
