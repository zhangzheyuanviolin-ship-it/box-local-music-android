            package p000;

            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.os.Bundle;
            import android.os.Handler;
            import com.google.android.play.core.assetpacks.bs;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashSet;
            import java.util.concurrent.Executor;
            
            public final class i0Iii1o10 {
                public OlOilIlol1 I00000oIO;
                public IntentFilter I00000oOI;
                public Context I0000Il00O;
                public HashSet I0000O;
                public I11o1li1O00 I0000oI00;
                public volatile boolean I0001Ioi1lo;
                public i0O1I1o I000II;
                public i0O0oI10I I000O01llI0;
                public i0Iooi1oi I000OOo1O;
                public i0O0oOiO11 I000OiO;
                public i0OI1IOoili1 I000iOII;
                public Handler I000l1;
                public i0IOo0i0 I000lI;
                public i0IOo0i0 I000o00OoI0I;
                public i0IOo0i0 I000oI1ioi;

                public final void I00000oIO() {
                    I11o1li1O00 i11o1li1O00;
/* 3 */             if ((this.I0001Ioi1lo || !this.I0000O.isEmpty()) && this.I0000oI00 == null) {
/* 20 */                I11o1li1O00 i11o1li1O002 = new I11o1li1O00(this, 2);
/* 23 */                this.I0000oI00 = i11o1li1O002;
/* 29 */                this.I0000Il00O.registerReceiver(i11o1li1O002, this.I00000oOI, 2);
                    }
/* 34 */            if (this.I0001Ioi1lo || !this.I0000O.isEmpty() || (i11o1li1O00 = this.I0000oI00) == null) {
/* 113 */               return;
                    }
/* 50 */            this.I0000Il00O.unregisterReceiver(i11o1li1O00);
/* 54 */            this.I0000oI00 = null;
                }

                public final void I00000oOI(Intent intent) {
/* 1 */             OlOilIlol1 olOilIlol1 = this.I00000oIO;
/* 5 */             Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.FLAGS");
/* 9 */             if (bundleExtra == null || !bundleExtra.getBoolean("enableWorkManager")) {
/* 23 */                Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
/* 28 */                if (bundleExtra2 == null) {
/* 34 */                    olOilIlol1.I00000oOI("Empty bundle received from broadcast.", new Object[0]);
/* 37 */                    return;
                        }
/* 40 */                ArrayList<String> stringArrayList = bundleExtra2.getStringArrayList("pack_names");
/* 44 */                if (stringArrayList == null || stringArrayList.size() != 1) {
/* 153 */                   olOilIlol1.I00000oOI("Corrupt bundle received from broadcast.", new Object[0]);
/* 186 */                   return;
                        }
/* 71 */                bs bsVarI00000oOI = bs.I00000oOI(bundleExtra2, stringArrayList.get(0), this.I000OiO, this.I000iOII, new Io1Oioii1111(17));
/* 81 */                olOilIlol1.I00000oIO("ListenerRegistryBroadcastReceiver.onReceive: %s", bsVarI00000oOI);
/* 92 */                if (((PendingIntent) bundleExtra2.getParcelable("confirmation_intent")) != null) {
/* 96 */                    this.I000OOo1O.getClass();
                        }
/* 105 */               Executor executor = (Executor) this.I000oI1ioi.I0000Il00O();
/* 109 */               int i = 3;
/* 110 */               O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(i);
/* 113 */               o10oO1IiI1.I00iiI = this;
/* 115 */               o10oO1IiI1.I00iiO = bundleExtra2;
/* 117 */               o10oO1IiI1.I00iio = bsVarI00000oOI;
/* 119 */               VarHandle.storeStoreFence();
/* 122 */               executor.execute(o10oO1IiI1);
/* 131 */               Executor executor2 = (Executor) this.I000o00OoI0I.I0000Il00O();
/* 135 */               l0001OI0 l0001oi0 = new l0001OI0(i);
/* 138 */               l0001oi0.I00iiI = this;
/* 140 */               l0001oi0.I00iiO = bundleExtra2;
/* 142 */               VarHandle.storeStoreFence();
/* 145 */               executor2.execute(l0001oi0);
                    }
                }
            }
