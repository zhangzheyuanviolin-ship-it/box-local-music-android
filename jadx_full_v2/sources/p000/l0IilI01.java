            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import java.lang.invoke.VarHandle;
            
            public final class l0IilI01 extends BroadcastReceiver {
                public lilOOl0 I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;

                public final void I00000oIO() {
/* 1 */             lilOOl0 lilool0 = this.I00000oIO;
/* 3 */             lilool0.I00iIi0i1o();
/* 10 */            lilool0.I00iOIl().I010II();
/* 17 */            lilool0.I00iOIl().I010II();
/* 22 */            if (this.I00000oOI) {
/* 33 */                lilool0.I00II0oii1o().I00lll10.I00000oOI("Unregistering connectivity change receiver");
/* 37 */                this.I00000oOI = false;
/* 39 */                this.I0000Il00O = false;
                        try {
/* 45 */                    lilool0.I00ll1.I00iOIl.unregisterReceiver(this);
                        } catch (IllegalArgumentException e) {
/* 58 */                    lilool0.I00II0oii1o().I00ilO0.I0000Il00O("Failed to unregister the network broadcast receiver", e);
                        }
                    }
                }

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 1 */             lilOOl0 lilool0 = this.I00000oIO;
/* 3 */             lilool0.I00iIi0i1o();
/* 6 */             String action = intent.getAction();
/* 18 */            lilool0.I00II0oii1o().I00lll10.I0000Il00O("NetworkBroadcastReceiver received action", action);
/* 27 */            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
/* 72 */                lilool0.I00II0oii1o().I00l0I0l0lO1.I0000Il00O("NetworkBroadcastReceiver received unknown action", action);
/* 106 */               return;
                    }
/* 29 */            l0I1IOo l0i1ioo = lilool0.I00iiI;
/* 31 */            lilOOl0.I00O0o1oo(l0i1ioo);
/* 34 */            boolean zI010ioo = l0i1ioo.I010ioo();
/* 40 */            if (this.I0000Il00O != zI010ioo) {
/* 42 */                this.I0000Il00O = zI010ioo;
/* 44 */                l0o10OoO0 l0o10ooo0I00iOIl = lilool0.I00iOIl();
/* 52 */                I0lil01 i0lil01 = new I0lil01(28);
/* 55 */                i0lil01.I00iiI = this;
/* 57 */                VarHandle.storeStoreFence();
/* 60 */                l0o10ooo0I00iOIl.I010o0o0oO(i0lil01);
                    }
                }
            }
