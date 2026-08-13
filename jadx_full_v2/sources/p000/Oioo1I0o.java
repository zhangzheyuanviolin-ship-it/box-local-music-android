            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import java.util.UUID;
            
            public class Oioo1I0o {
                public static final IOiIi0Oi COMPONENT;
                public static final String PREF_FILE = "com.google.mlkit.internal";
                protected final Context zza;

                static {
/* 3 */             IOiIOOl0lO iOiIOOl0lOI00000oOI = IOiIi0Oi.I00000oOI(Oioo1I0o.class);
/* 13 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(O1o0111OI00.class));
/* 22 */            iOiIOOl0lOI00000oOI.I00000oIO(IiIooooiilo.I00000oIO(Context.class));
/* 32 */            iOiIOOl0lOI00000oOI.I0001Ioi1lo = new l1I0oI(27);
/* 38 */            COMPONENT = iOiIOOl0lOI00000oOI.I00000oOI();
                }

                public Oioo1I0o(Context context) {
/* 4 */             this.zza = context;
                }

                public static Oioo1I0o getInstance(O1o0111OI00 o1o0111OI00) {
/* 7 */             return (Oioo1I0o) o1o0111OI00.I00000oIO(Oioo1I0o.class);
                }

                public synchronized void clearDownloadingModelInfo(Oi00100I00ii oi00100I00ii) {
/* 2 */             getDownloadingModelHash(oi00100I00ii);
/* 9 */             zza().edit();
/* 13 */            throw null;
                }

                public synchronized void clearIncompatibleModelInfo(Oi00100I00ii oi00100I00ii) {
/* 6 */             zza().edit();
/* 10 */            throw null;
                }

                public synchronized void clearLatestModelHash(Oi00100I00ii oi00100I00ii) {
/* 6 */             zza().edit();
/* 10 */            throw null;
                }

                public synchronized String getDownloadingModelHash(Oi00100I00ii oi00100I00ii) {
/* 2 */             zza();
/* 6 */             throw null;
                }

                public synchronized Long getDownloadingModelId(Oi00100I00ii oi00100I00ii) {
/* 2 */             zza();
/* 6 */             throw null;
                }

                public synchronized String getIncompatibleModelHash(Oi00100I00ii oi00100I00ii) {
/* 2 */             zza();
/* 6 */             throw null;
                }

                public synchronized String getLatestModelHash(Oi00100I00ii oi00100I00ii) {
/* 2 */             zza();
/* 6 */             throw null;
                }

                public synchronized String getMlSdkInstanceId() {
/* 9 */             String string = zza().getString("ml_sdk_instance_id", null);
/* 13 */            if (string != null) {
/* 16 */                return string;
                    }
/* 21 */            String string2 = UUID.randomUUID().toString();
/* 39 */            zza().edit().putString("ml_sdk_instance_id", string2).apply();
/* 43 */            return string2;
                }

                public synchronized long getModelDownloadBeginTimeMs(Oi00100I00ii oi00100I00ii) {
/* 2 */             zza();
/* 6 */             throw null;
                }

                public synchronized long getModelFirstUseTimeMs(Oi00100I00ii oi00100I00ii) {
/* 2 */             zza();
/* 6 */             throw null;
                }

                public synchronized String getPreviousAppVersion() {
/* 9 */             return zza().getString("app_version", null);
                }

                public synchronized void setDownloadingModelInfo(long j, O1oOiIOi0O o1oOiIOi0O) {
/* 3 */             throw null;
                }

                public synchronized void setIncompatibleModelInfo(Oi00100I00ii oi00100I00ii, String str, String str2) {
/* 6 */             zza().edit();
/* 10 */            throw null;
                }

                public synchronized void setLatestModelHash(Oi00100I00ii oi00100I00ii, String str) {
/* 6 */             zza().edit();
/* 10 */            throw null;
                }

                public synchronized void setModelFirstUseTimeMs(Oi00100I00ii oi00100I00ii, long j) {
/* 6 */             zza().edit();
/* 10 */            throw null;
                }

                public final SharedPreferences zza() {
/* 6 */             return this.zza.getSharedPreferences(PREF_FILE, 0);
                }

                public final synchronized String zzb(String str, long j) {
                    SharedPreferences sharedPreferencesZza;
/* 2 */             sharedPreferencesZza = zza();
/* 6 */             lII0I0I000I.I000II(str);
/* 24 */            return sharedPreferencesZza.getString(String.format("cached_local_model_hash_%1s_%2s", str, Long.valueOf(j)), null);
                }

                public final synchronized void zzc(String str, long j, String str2) {
/* 6 */             SharedPreferences.Editor editorEdit = zza().edit();
/* 10 */            lII0I0I000I.I000II(str);
/* 31 */            editorEdit.putString(String.format("cached_local_model_hash_%1s_%2s", str, Long.valueOf(j)), str2).apply();
                }
            }
