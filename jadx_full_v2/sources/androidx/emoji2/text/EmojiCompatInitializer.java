            package androidx.emoji2.text;

            import android.content.Context;
            import androidx.lifecycle.ProcessLifecycleInitializer;
            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import p000.I01O1lIi;
            import p000.IOO000ilo;
            import p000.IiollO1llli;
            import p000.IiollioOOli;
            import p000.IioloOoI;
            import p000.IliiOO1o;
            import p000.IoliIlooo1oo;
            import p000.O0oiOi;
            
            public class EmojiCompatInitializer implements IoliIlooo1oo {
                @Override
                public final List I00000oIO() {
/* 3 */             return Collections.singletonList(ProcessLifecycleInitializer.class);
                }

                @Override
                public final Object I00000oOI(Context context) {
                    Object objI00100o1O0lo;
/* 5 */             IioloOoI iioloOoI = new IioloOoI();
/* 12 */            iioloOoI.I00iOIl = context.getApplicationContext();
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            IliiOO1o iliiOO1o = new IliiOO1o(iioloOoI);
/* 21 */            iliiOO1o.I00000oIO = 1;
/* 25 */            if (IiollO1llli.I000iOII == null) {
                        synchronized (IiollO1llli.I000OiO) {
                            try {
/* 32 */                        if (IiollO1llli.I000iOII == null) {
/* 39 */                            IiollO1llli.I000iOII = new IiollO1llli(iliiOO1o);
                                }
                            } finally {
                            }
                        }
                    }
/* 48 */            IOO000ilo iOO000iloI001IO000 = IOO000ilo.I001IO000(context);
/* 54 */            iOO000iloI001IO000.getClass();
                    synchronized (IOO000ilo.I00ilO0) {
                        try {
/* 64 */                    objI00100o1O0lo = ((HashMap) iOO000iloI001IO000.I00iiI).get(ProcessLifecycleInitializer.class);
/* 68 */                    if (objI00100o1O0lo == null) {
/* 75 */                        objI00100o1O0lo = iOO000iloI001IO000.I00100o1O0lo(ProcessLifecycleInitializer.class, new HashSet());
                            }
                        } finally {
                        }
                    }
/* 85 */            I01O1lIi i01O1lIiI000iOII = ((O0oiOi) objI00100o1O0lo).I000iOII();
/* 91 */            IiollioOOli iiollioOOli = new IiollioOOli();
/* 94 */            iiollioOOli.I00iOIl = i01O1lIiI000iOII;
/* 96 */            VarHandle.storeStoreFence();
/* 99 */            i01O1lIiI000iOII.I00li1OI(iiollioOOli);
/* 102 */           return Boolean.TRUE;
                }
            }
