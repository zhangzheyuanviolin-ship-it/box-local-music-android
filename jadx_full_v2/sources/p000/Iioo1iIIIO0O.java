            package p000;

            import android.text.Editable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            
            public final class Iioo1iIIIO0O extends Editable.Factory {
                public static final Object I00000oIO = new Object();
                public static volatile Iioo1iIIIO0O I00000oOI;
                public static Class I0000Il00O;

                @Override
                public final Editable newEditable(CharSequence charSequence) {
/* 1 */             Class cls = I0000Il00O;
/* 3 */             if (cls == null) {
/* 23 */                return super.newEditable(charSequence);
                    }
/* 7 */             OlIIiioli01 olIIiioli01 = new OlIIiioli01(charSequence);
/* 15 */            olIIiioli01.I00iiI = new ArrayList();
/* 17 */            olIIiioli01.I00iOIl = cls;
/* 19 */            VarHandle.storeStoreFence();
/* 22 */            return olIIiioli01;
                }
            }
