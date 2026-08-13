            package com.google.android.play.core.assetpacks;

            import android.app.PendingIntent;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import androidx.work.impl.model.WorkSpec;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.concurrent.Executor;
            import p000.I1ii1l10IO;
            import p000.Il1OO1ilo0o1;
            import p000.Io1Oioii1111;
            import p000.O10oO1IiI1;
            import p000.OIi0i0;
            import p000.OIio0Ii1Ii;
            import p000.OlOilIlol1;
            import p000.i01I0IOOI10;
            import p000.i01IlOO;
            import p000.i0IOo0i0;
            import p000.i0O0il111;
            import p000.i0O0lO1il0;
            import p000.liO0I1oOII;
            
            public final class SessionStateBroadcastReceiver extends BroadcastReceiver {
                public static final OlOilIlol1 I00000oIO = new OlOilIlol1("SessionStateBroadcastReceiver");

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 3 */             Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.FLAGS");
/* 7 */             OlOilIlol1 olOilIlol1 = I00000oIO;
/* 10 */            if (bundleExtra == null) {
/* 16 */                olOilIlol1.I00000oOI("Empty flags bundle received from broadcast.", new Object[0]);
/* 19 */                return;
                    }
/* 26 */            if (bundleExtra.getBoolean("enableWorkManager")) {
/* 31 */                Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
/* 35 */                if (bundleExtra2 == null) {
/* 41 */                    olOilIlol1.I00000oOI("Empty bundle received from broadcast.", new Object[0]);
/* 44 */                    return;
                        }
/* 57 */                i0O0il111 i0o0il111 = (i0O0il111) ((i0IOo0i0) i0O0lO1il0.I0000O(context).I00iio).I0000Il00O();
/* 61 */                Bundle bundleExtra3 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_NOTIFICATION_OPTIONS");
/* 65 */                i0IOo0i0 i0ioo0i0 = i0o0il111.I0001Ioi1lo;
/* 67 */                OlOilIlol1 olOilIlol12 = i0O0il111.I000OOo1O;
/* 71 */                ArrayList<String> stringArrayList = bundleExtra2.getStringArrayList("pack_names");
/* 75 */                if (stringArrayList == null || stringArrayList.size() != 1) {
/* 291 */                   olOilIlol12.I00000oOI("Corrupt packStateBundle.", new Object[0]);
/* 551 */                   return;
                        }
/* 88 */                boolean z = bundleExtra.getBoolean("enableExpeditedWork");
/* 92 */                if (z && bundleExtra3 == null) {
/* 101 */                   olOilIlol12.I00000oOI("Notification options must be present when expedited work is enabled.", new Object[0]);
/* 104 */                   return;
                        }
/* 122 */               bs bsVarI00000oOI = bs.I00000oOI(bundleExtra2, stringArrayList.get(0), i0o0il111.I00000oOI, i0o0il111.I0000Il00O, new Io1Oioii1111(17));
/* 132 */               olOilIlol12.I00000oIO("ExtractionWorkScheduler.scheduleExtraction: %s", bsVarI00000oOI);
/* 143 */               if (((PendingIntent) bundleExtra2.getParcelable("confirmation_intent")) != null) {
/* 147 */                   i0o0il111.I0000O.getClass();
                        }
/* 156 */               Executor executor = (Executor) i0o0il111.I000O01llI0.I0000Il00O();
/* 161 */               O10oO1IiI1 o10oO1IiI1 = new O10oO1IiI1(4);
/* 164 */               o10oO1IiI1.I00iiI = i0o0il111;
/* 166 */               o10oO1IiI1.I00iiO = bundleExtra2;
/* 168 */               o10oO1IiI1.I00iio = bsVarI00000oOI;
/* 170 */               VarHandle.storeStoreFence();
/* 173 */               executor.execute(o10oO1IiI1);
/* 180 */               if (!z) {
/* 239 */                   I1ii1l10IO i1ii1l10IO = new I1ii1l10IO(ExtractionWorker.class);
/* 255 */                   ((WorkSpec) i1ii1l10IO.I0000Il00O).input = liO0I1oOII.I00000oIO(bundleExtra2, new Bundle());
/* 262 */                   i01IlOO i01iloo = (i01IlOO) i0ioo0i0.I0000Il00O();
/* 264 */                   Il1OO1ilo0o1 il1OO1ilo0o1 = Il1OO1ilo0o1.I00iiO;
/* 266 */                   OIi0i0 oIi0i0I00000oIO = i1ii1l10IO.I00000oIO();
/* 270 */                   i01iloo.getClass();
/* 283 */                   new i01I0IOOI10(i01iloo, "extractAssetPacks", il1OO1ilo0o1, Collections.singletonList(oIi0i0I00000oIO), null).I00000oIO();
/* 286 */                   return;
                        }
/* 184 */               I1ii1l10IO i1ii1l10IO2 = new I1ii1l10IO(ExtractionWorker.class);
/* 187 */               OIio0Ii1Ii oIio0Ii1Ii = OIio0Ii1Ii.I00iOIl;
/* 191 */               WorkSpec workSpec = (WorkSpec) i1ii1l10IO2.I0000Il00O;
/* 193 */               workSpec.expedited = true;
/* 195 */               workSpec.outOfQuotaPolicy = oIio0Ii1Ii;
/* 205 */               ((WorkSpec) i1ii1l10IO2.I0000Il00O).input = liO0I1oOII.I00000oIO(bundleExtra2, bundleExtra3);
/* 212 */               i01IlOO i01iloo2 = (i01IlOO) i0ioo0i0.I0000Il00O();
/* 214 */               Il1OO1ilo0o1 il1OO1ilo0o12 = Il1OO1ilo0o1.I00iiO;
/* 216 */               OIi0i0 oIi0i0I00000oIO2 = i1ii1l10IO2.I00000oIO();
/* 220 */               i01iloo2.getClass();
/* 233 */               new i01I0IOOI10(i01iloo2, "extractAssetPacks", il1OO1ilo0o12, Collections.singletonList(oIi0i0I00000oIO2), null).I00000oIO();
                    }
                }
            }
