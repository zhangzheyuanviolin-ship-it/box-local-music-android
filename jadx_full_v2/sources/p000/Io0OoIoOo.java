            package p000;

            import android.accounts.Account;
            import android.content.Context;
            import android.os.Looper;
            import com.google.android.gms.common.api.Scope;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.Set;
            import java.util.concurrent.Executor;
            
            public abstract class Io0OoIoOo extends I1oIol10O {
                public final Set I001l0I00;

                public Io0OoIoOo(Context context, Looper looper, int i, I0Oi111ii i0Oi111ii, Io0iOIIio io0iOIIio, Io0iOll io0iOll) {
/* 1 */             ll0oOilllo ll0ooillloI00000oIO = ll0oOilllo.I00000oIO(context);
/* 5 */             Io0i1l io0i1l = Io0i1l.I0000oI00;
/* 7 */             lII0I0I000I.I000II(io0iOIIio);
/* 10 */            lII0I0I000I.I000II(io0iOll);
/* 15 */            i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 18 */            i0oi1l1oo.I00iOIl = io0iOIIio;
/* 20 */            VarHandle.storeStoreFence();
/* 27 */            I0IIiO0iI i0IIiO0iI = new I0IIiO0iI(27);
/* 30 */            i0IIiO0iI.I00iiI = io0iOll;
/* 32 */            VarHandle.storeStoreFence();
/* 44 */            super(context, looper, ll0ooillloI00000oIO, io0i1l, i, i0oi1l1oo, i0IIiO0iI, (String) i0Oi111ii.I00ilI0I1);
/* 49 */            Set set = (Set) i0Oi111ii.I00iiO;
/* 51 */            Iterator it = set.iterator();
/* 59 */            while (it.hasNext()) {
/* 71 */                if (!set.contains((Scope) it.next())) {
/* 76 */                    I000II.I001IO000("Expanding scopes is not permitted, use implied scopes instead");
/* 80 */                    throw null;
                        }
                    }
/* 81 */            this.I001l0I00 = set;
                }

                @Override
                public final Account I0000oI00() {
/* 1 */             return null;
                }

                @Override
                public final Executor I000II() {
/* 1 */             return null;
                }

                @Override
                public final Set I000iOII() {
/* 1 */             return this.I001l0I00;
                }
            }
