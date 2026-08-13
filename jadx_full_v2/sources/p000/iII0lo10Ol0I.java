            package p000;

            import android.app.PendingIntent;
            import android.content.ContentProviderClient;
            import android.content.Context;
            import android.content.Intent;
            import android.net.Uri;
            import android.os.Bundle;
            import android.os.RemoteException;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            
            public abstract class iII0lo10Ol0I {
                public static final Uri I00000oIO = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

                public static Intent I00000oIO(Context context, lOiI1l0o loii1l0o) throws RemoteException, iI0iiI00 {
                    Bundle bundleCall;
                    ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
/* 3 */             String str = loii1l0o.I00000oIO;
/* 5 */             Intent intent = null;
/* 6 */             if (str == null) {
/* 13 */                return new Intent().setComponent(null);
                    }
/* 20 */            if (loii1l0o.I00000oOI) {
/* 24 */                Bundle bundle = new Bundle();
/* 29 */                bundle.putString("serviceActionBundleKey", str);
                        try {
/* 38 */                    contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(I00000oIO);
                        } catch (RemoteException | IllegalArgumentException e) {
/* 79 */                    Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
/* 82 */                    bundleCall = null;
                        }
/* 42 */                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
/* 68 */                    throw new RemoteException("Failed to acquire ContentProviderClient");
                        }
                        try {
/* 46 */                    bundleCall = contentProviderClientAcquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle);
/* 50 */                    contentProviderClientAcquireUnstableContentProviderClient.release();
/* 83 */                    if (bundleCall != null) {
/* 92 */                        Intent intent2 = (Intent) bundleCall.getParcelable("serviceResponseIntentKey");
/* 94 */                        if (intent2 != null) {
/* 96 */                            intent = intent2;
                                } else {
/* 104 */                           PendingIntent pendingIntent = (PendingIntent) bundleCall.getParcelable("serviceMissingResolutionIntentKey");
/* 106 */                           if (pendingIntent != null) {
/* 128 */                               StringBuilder sb = new StringBuilder(str.length() + 72);
/* 133 */                               sb.append("Dynamic lookup for intent failed for action ");
/* 136 */                               sb.append(str);
/* 141 */                               sb.append(" but has possible resolution");
/* 148 */                               Log.w("ServiceBindIntentUtils", sb.toString());
/* 157 */                               IOlo10lO1iOl iOlo10lO1iOl = new IOlo10lO1iOl(25, pendingIntent, null);
/* 160 */                               iI0iiI00 ii0iii00 = new iI0iiI00();
/* 163 */                               ii0iii00.I00iOIl = iOlo10lO1iOl;
/* 165 */                               VarHandle.storeStoreFence();
/* 168 */                               throw ii0iii00;
                                    }
                                }
                            }
/* 108 */                   if (intent == null) {
/* 116 */                       Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(str));
                            }
                        } catch (Throwable th) {
/* 57 */                    contentProviderClientAcquireUnstableContentProviderClient.release();
/* 60 */                    throw th;
                        }
                    }
                    return intent == null ? new Intent(str).setPackage("com.google.android.gms") : intent;
                }
            }
