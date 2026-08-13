            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.content.pm.ResolveInfo;
            import android.content.pm.Signature;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            
            public abstract class il0iol {
                public static IliiOO1o I00000oIO(Context context) {
                    ProviderInfo providerInfo;
                    IliiOI0I0 iliiOI0I0;
                    ApplicationInfo applicationInfo;
/* 1 */             PackageManager packageManager = context.getPackageManager();
/* 7 */             lII1OI11o1I.I0000O("Package manager required to locate emoji font provider", packageManager);
/* 22 */            Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
                    while (true) {
/* 31 */                if (!it.hasNext()) {
/* 54 */                    providerInfo = null;
                            break;
                        }
/* 39 */                providerInfo = it.next().providerInfo;
/* 41 */                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                            break;
                        }
                    }
/* 55 */            if (providerInfo == null) {
/* 57 */                iliiOI0I0 = null;
                    } else {
                        try {
/* 59 */                    String str = providerInfo.authority;
/* 61 */                    String str2 = providerInfo.packageName;
/* 69 */                    Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
/* 73 */                    ArrayList arrayList = new ArrayList();
/* 77 */                    for (Signature signature : signatureArr) {
/* 85 */                        arrayList.add(signature.toByteArray());
                            }
/* 101 */                   iliiOI0I0 = new IliiOI0I0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
                        } catch (PackageManager.NameNotFoundException e) {
/* 108 */                   Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                        }
                    }
/* 112 */           if (iliiOI0I0 == null) {
/* 30 */                return null;
                    }
/* 119 */           IliiOIiill iliiOIiill = new IliiOIiill();
/* 127 */           iliiOIiill.I00iio = new Object();
/* 133 */           iliiOIiill.I00iOIl = context.getApplicationContext();
/* 135 */           iliiOIiill.I00iiI = iliiOI0I0;
/* 139 */           iliiOIiill.I00iiO = IliiOO1o.I0000O;
/* 141 */           VarHandle.storeStoreFence();
/* 144 */           return new IliiOO1o(iliiOIiill);
                }
            }
