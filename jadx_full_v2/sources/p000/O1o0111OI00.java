            package p000;

            import android.content.Context;
            import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.concurrent.Executor;
            
            public final class O1o0111OI00 {
                public static final Object I00000oOI = new Object();
                public static O1o0111OI00 I0000Il00O;
                public IOiOol0 I00000oIO;

                public static O1o0111OI00 I0000Il00O() {
                    O1o0111OI00 o1o0111OI00;
                    synchronized (I00000oOI) {
/* 13 */                lII0I0I000I.I000OOo1O("MlKitContext has not been initialized", I0000Il00O != null);
/* 16 */                o1o0111OI00 = I0000Il00O;
/* 18 */                lII0I0I000I.I000II(o1o0111OI00);
                    }
/* 22 */            return o1o0111OI00;
                }

                public static O1o0111OI00 I0000O(Context context, Executor executor) {
                    O1o0111OI00 o1o0111OI00;
                    synchronized (I00000oOI) {
/* 15 */                lII0I0I000I.I000OOo1O("MlKitContext is already initialized", I0000Il00O == null);
/* 20 */                O1o0111OI00 o1o0111OI002 = new O1o0111OI00();
/* 23 */                I0000Il00O = o1o0111OI002;
/* 25 */                Context applicationContext = context.getApplicationContext();
/* 29 */                if (applicationContext != null) {
/* 31 */                    context = applicationContext;
                        }
/* 38 */                int i = 7;
/* 39 */                O1OIll00i o1OIll00i = new O1OIll00i(i);
/* 42 */                o1OIll00i.I00iiI = MlKitComponentDiscoveryService.class;
/* 44 */                VarHandle.storeStoreFence();
/* 47 */                IoloOio0I ioloOio0I = new IoloOio0I(i);
/* 50 */                ioloOio0I.I00iiI = context;
/* 52 */                ioloOio0I.I00iiO = o1OIll00i;
/* 54 */                VarHandle.storeStoreFence();
/* 57 */                ArrayList arrayListI001IIilI0O = ioloOio0I.I001IIilI0O();
/* 61 */                OillOo0 oillOo0I000l1 = IOiOol0.I000l1(executor);
/* 69 */                ((ArrayList) oillOo0I000l1.I00iiO).addAll(arrayListI001IIilI0O);
/* 80 */                oillOo0I000l1.I0001Ioi1lo(IOiIi0Oi.I0000O(context, Context.class, new Class[0]));
/* 91 */                oillOo0I000l1.I0001Ioi1lo(IOiIi0Oi.I0000O(o1o0111OI002, O1o0111OI00.class, new Class[0]));
/* 94 */                IOiOol0 iOiOol0I000II = oillOo0I000l1.I000II();
/* 98 */                o1o0111OI002.I00000oIO = iOiOol0I000II;
/* 100 */               iOiOol0I000II.I001IIilI0O(true);
/* 103 */               o1o0111OI00 = I0000Il00O;
                    }
/* 106 */           return o1o0111OI00;
                }

                public final Object I00000oIO(Class cls) {
/* 10 */            lII0I0I000I.I000OOo1O("MlKitContext has been deleted", I0000Il00O == this);
/* 15 */            lII0I0I000I.I000II(this.I00000oIO);
/* 20 */            return this.I00000oIO.I00000oIO(cls);
                }

                public final Context I00000oOI() {
/* 7 */             return (Context) I00000oIO(Context.class);
                }
            }
