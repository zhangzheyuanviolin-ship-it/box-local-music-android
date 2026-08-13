            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.util.Log;
            import java.util.concurrent.ConcurrentHashMap;
            
            public final class llIIiO1oiI0o extends BroadcastReceiver {
                public static volatile iili011O1 I00000oIO;

                @Override
                public final void onReceive(Context context, Intent intent) {
/* 3 */             String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
/* 7 */             if (stringExtra == null) {
/* 60 */                return;
                    }
/* 18 */            if (stringExtra.contains("../") || stringExtra.contains("/..")) {
/* 69 */                StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
/* 74 */                sb.append("Got an invalid config package for P/H that includes '..': ");
/* 77 */                sb.append(stringExtra);
/* 82 */                sb.append(". Exiting.");
/* 89 */                Log.w("PhUpdateBroadcastRecv", sb.toString());
/* 106 */               return;
                    }
/* 29 */            iili011O1 iili011o1 = I00000oIO;
/* 31 */            if (iili011o1 == null) {
/* 35 */                Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
/* 38 */                return;
                    }
/* 51 */            liIol1oO liiol1oo = (liIol1oO) ((ConcurrentHashMap) ((Oi1ol0llI) iili011o1.I00iiI).I00iiI).get(stringExtra);
/* 53 */            if (liiol1oo != null) {
/* 57 */                liiol1oo.I00000oIO.I00000oOI();
                    }
                }
            }
