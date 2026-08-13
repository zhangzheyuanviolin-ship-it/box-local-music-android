            package com.google.ai.edge.gallery.notifications;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Log;
            import p000.Ii110ilOil;
            import p000.O0000Ioio00;
            import p000.OIO1o0;
            import p000.OIOI0I;
            import p000.OIOI0lo;
            import p000.iOi1II01i0;
            import p000.ilII1li;
            
            public final class BootReceiver extends BroadcastReceiver {
                @Override
                public final void onReceive(Context context, Intent intent) {
/* 11 */            if (O0000Ioio00.I0000O(intent.getAction(), "android.intent.action.BOOT_COMPLETED")) {
                        try {
/* 33 */                    OIOI0I oioi0i = (OIOI0I) ((Ii110ilOil) ((OIOI0lo) ilII1li.I00000oIO(context.getApplicationContext(), OIOI0lo.class))).I000o00OoI0I.get();
/* 45 */                    iOi1II01i0.I0000O(oioi0i.I0000O, null, null, new OIO1o0(oioi0i, null, 1), 3);
                        } catch (Exception e) {
/* 54 */                    Log.e("BootReceiver", "Failed to reschedule notifications on boot", e);
                        }
                    }
                }
            }
