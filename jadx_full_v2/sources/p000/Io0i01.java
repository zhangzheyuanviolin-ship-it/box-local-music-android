            package p000;

            import android.content.AttributionSource;
            import android.content.Context;
            import android.os.Looper;
            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Set;
            
            public abstract class Io0i01 {
                public final Context I00000oIO;
                public final String I00000oOI;
                public final O1OIll00i I0000Il00O;
                public final IoloOio0I I0000O;
                public final I11O1IlIl1I I0000oI00;
                public final I11Oil I0001Ioi1lo;
                public final Looper I000II;
                public final int I000O01llI0;
                public final lolIo0 I000OOo1O;
                public final Io0iOoo I000OiO;

                public Io0i01(Context context, IoloOio0I ioloOio0I, I11O1IlIl1I i11O1IlIl1I, Io0i00i0 io0i00i0) {
/* 6 */             lII0I0I000I.I000O01llI0("Null context is not permitted.", context);
/* 11 */            lII0I0I000I.I000O01llI0("Api must not be null.", ioloOio0I);
/* 16 */            lII0I0I000I.I000O01llI0("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", io0i00i0);
/* 19 */            Context applicationContext = context.getApplicationContext();
/* 25 */            lII0I0I000I.I000O01llI0("The provided context did not have an application context.", applicationContext);
/* 28 */            this.I00000oIO = applicationContext;
/* 30 */            String attributionTag = context.getAttributionTag();
/* 34 */            this.I00000oOI = attributionTag;
/* 38 */            AttributionSource attributionSource = context.getAttributionSource();
/* 43 */            O1OIll00i o1OIll00i = new O1OIll00i(4);
/* 46 */            o1OIll00i.I00iiI = attributionSource;
/* 48 */            VarHandle.storeStoreFence();
/* 51 */            this.I0000Il00O = o1OIll00i;
/* 53 */            this.I0000O = ioloOio0I;
/* 55 */            this.I0000oI00 = i11O1IlIl1I;
/* 59 */            this.I000II = io0i00i0.I00000oOI;
/* 63 */            I11Oil i11Oil = new I11Oil();
/* 66 */            i11Oil.I00000oOI = ioloOio0I;
/* 68 */            i11Oil.I0000Il00O = i11O1IlIl1I;
/* 70 */            i11Oil.I0000O = attributionTag;
/* 80 */            i11Oil.I00000oIO = Arrays.hashCode(new Object[]{ioloOio0I, i11O1IlIl1I, attributionTag});
/* 82 */            VarHandle.storeStoreFence();
/* 85 */            this.I0001Ioi1lo = i11Oil;
/* 89 */            Io0iOoo io0iOooI0000O = Io0iOoo.I0000O(applicationContext);
/* 93 */            this.I000OiO = io0iOooI0000O;
/* 101 */           this.I000O01llI0 = io0iOooI0000O.I00ioIO.getAndIncrement();
/* 105 */           this.I000OOo1O = io0i00i0.I00000oIO;
/* 107 */           O1oo1il01OoO o1oo1il01OoO = io0iOooI0000O.I00lli11;
/* 114 */           o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(7, this));
                }

                public final o01l1ioOo0 I00000oIO() {
/* 3 */             o01l1ioOo0 o01l1iooo0 = new o01l1ioOo0();
/* 8 */             o01l1iooo0.I00iio = Ol0III1O1.I00000oOI;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            Set set = Collections.EMPTY_SET;
/* 17 */            I1Io1oIoo i1Io1oIoo = (I1Io1oIoo) o01l1iooo0.I00iOIl;
/* 19 */            if (i1Io1oIoo == null) {
/* 24 */                i1Io1oIoo = new I1Io1oIoo(0);
/* 27 */                o01l1iooo0.I00iOIl = i1Io1oIoo;
                    }
/* 29 */            i1Io1oIoo.addAll(set);
/* 32 */            Context context = this.I00000oIO;
/* 42 */            o01l1iooo0.I00iiO = context.getClass().getName();
/* 48 */            o01l1iooo0.I00iiI = context.getPackageName();
/* 55 */            return o01l1iooo0;
                }

                public final o0IiOl I00000oOI(int i, IoilIilo ioilIilo) {
/* 3 */             OloIlI0ll oloIlI0ll = new OloIlI0ll();
/* 6 */             Io0iOoo io0iOoo = this.I000OiO;
/* 8 */             io0iOoo.getClass();
/* 13 */            io0iOoo.I00000oOI(oloIlI0ll, ioilIilo.I0000Il00O, this);
/* 18 */            i0Ooi0IO i0ooi0io = new i0Ooi0IO(i);
/* 21 */            i0ooi0io.I0000Il00O = oloIlI0ll;
/* 23 */            i0ooi0io.I00000oOI = ioilIilo;
/* 27 */            i0ooi0io.I0000O = this.I000OOo1O;
/* 30 */            if (i == 2 && ioilIilo.I0000O) {
/* 39 */                I000II.I000iOII("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
/* 42 */                return null;
                    }
/* 44 */            VarHandle.storeStoreFence();
/* 55 */            i0Oli1olIilo i0oli1oliilo = new i0Oli1olIilo(i0ooi0io, io0iOoo.I00l0I0l0lO1.get(), this);
/* 58 */            O1oo1il01OoO o1oo1il01OoO = io0iOoo.I00lli11;
/* 65 */            o1oo1il01OoO.sendMessage(o1oo1il01OoO.obtainMessage(4, i0oli1oliilo));
/* 68 */            return oloIlI0ll.I00000oIO;
                }
            }
