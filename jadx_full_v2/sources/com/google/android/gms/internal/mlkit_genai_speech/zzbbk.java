            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.UserHandle;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Set;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import p000.I000II;
            
            final class zzbbk extends zzayl {
                private static final zzatu zzb;
                private final Intent zzc;
                private final UserHandle zzd;
                private final Context zze;
                private final Executor zzf;
                private final Executor zzg;
                private final zzazm zzh;
                private final zzayj zzi;
                private zzbbj zzj;
                private boolean zzk;
                private boolean zzl;
                private zzayg zzm;
                private ListenableFuture zzn;

                static {
/* 1 */             zzatr zzatrVarZza = zzatu.zza();
/* 9 */             zzatrVarZza.zzb(zzazr.zzc, Boolean.TRUE);
/* 16 */            zzb = zzatrVarZza.zzc();
                }

                public zzbbk(Intent intent, zzayd zzaydVar) {
/* 4 */             this.zzc = intent;
/* 12 */            UserHandle userHandle = (UserHandle) zzaydVar.zzf(zzazr.zzb);
/* 14 */            this.zzd = userHandle;
/* 22 */            Context context = (Context) zzaydVar.zzf(zzazr.zza);
/* 26 */            zzgo.zzc(context, "SOURCE_ANDROID_CONTEXT");
/* 29 */            Context applicationContext = context.getApplicationContext();
/* 39 */            this.zze = userHandle != null ? zzl(applicationContext, userHandle) : applicationContext;
/* 41 */            Executor executorZzg = zzaydVar.zzg();
/* 47 */            zzgo.zzc(executorZzg, "NameResolver.Args.getOffloadExecutor()");
/* 50 */            this.zzf = executorZzg;
/* 56 */            this.zzg = zzji.zzb(executorZzg);
/* 62 */            this.zzh = zzaydVar.zze();
/* 68 */            this.zzi = zzaydVar.zzc();
                }

                public static zzayi zze(zzbbk zzbbkVar) throws zzaze {
/* 3 */             PackageManager packageManager = zzbbkVar.zze.getPackageManager();
/* 7 */             Intent intent = zzbbkVar.zzc;
/* 11 */            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 268435456);
/* 15 */            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 437 */               throw new zzaze(zzazd.zzh.zze("Service not found for intent ".concat(String.valueOf(intent))), null);
                    }
/* 25 */            Intent intent2 = new Intent();
/* 32 */            intent2.setAction(intent.getAction());
/* 39 */            intent2.setData(intent.getData());
/* 42 */            Set<String> categories = intent.getCategories();
/* 46 */            if (categories != null) {
/* 48 */                Iterator<String> it = categories.iterator();
/* 56 */                while (it.hasNext()) {
/* 64 */                    intent2.addCategory(it.next());
                        }
                    }
/* 70 */            ArrayList arrayList = new ArrayList();
/* 73 */            Iterator<ResolveInfo> it2 = listQueryIntentServices.iterator();
/* 81 */            while (it2.hasNext()) {
/* 91 */                ServiceInfo serviceInfo = it2.next().serviceInfo;
/* 100 */               intent2.setComponent(new ComponentName(serviceInfo.packageName, serviceInfo.name));
/* 107 */               zzazo zzazoVar = new zzazo();
/* 110 */               zzazoVar.zza(intent2);
/* 115 */               zzazoVar.zzb(zzbbkVar.zzd);
/* 118 */               zzazq zzazqVarZzc = zzazoVar.zzc();
/* 131 */               arrayList.add(new zzavj(Collections.singletonList(zzazqVarZzc), zzb));
                    }
/* 135 */           zzayh zzayhVarZzc = zzayi.zzc();
/* 143 */           zzayhVarZzc.zza(zzazf.zzc(arrayList));
/* 156 */           zzayhVarZzc.zzc(zzbbkVar.zzi.zza(zzhn.zzd()));
/* 159 */           return zzayhVarZzc.zzd();
                }

                public static void zzh(zzbbk zzbbkVar) {
/* 1 */             zzazm zzazmVar = zzbbkVar.zzh;
/* 3 */             zzazmVar.zzd();
/* 14 */            zzgo.zzm(zzbbkVar.zzn != null);
/* 23 */            zzgo.zzm(zzbbkVar.zzn.isDone());
/* 26 */            zzayg zzaygVar = zzbbkVar.zzm;
/* 28 */            zzaygVar.getClass();
/* 38 */            zzja.zzb(zzbbkVar.zzn, new zzbbg(zzbbkVar, zzaygVar), zzazmVar);
/* 42 */            zzbbkVar.zzn = null;
/* 46 */            if (zzbbkVar.zzl) {
/* 48 */                zzbbkVar.zzl = false;
/* 50 */                zzbbkVar.zzm();
                    }
                }

                public static void zzi(zzbbk zzbbkVar) {
/* 1 */             zzbbj zzbbjVar = zzbbkVar.zzj;
/* 3 */             if (zzbbjVar != null) {
/* 7 */                 zzbbkVar.zze.unregisterReceiver(zzbbjVar);
/* 11 */                zzbbkVar.zzj = null;
                    }
                }

                public static void zzj(zzbbk zzbbkVar) {
/* 10 */            zzgo.zzn(zzbbkVar.zzj == null, "Already registered!");
/* 18 */            zzbbkVar.zzj = new zzbbj(zzbbkVar);
/* 22 */            IntentFilter intentFilter = new IntentFilter();
/* 27 */            intentFilter.addDataScheme("package");
/* 32 */            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
/* 37 */            intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
/* 42 */            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
/* 47 */            intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
/* 50 */            Context context = zzbbkVar.zze;
/* 54 */            context.registerReceiver(zzbbkVar.zzj, intentFilter);
/* 66 */            context.registerReceiver(zzbbkVar.zzj, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }

                private static Context zzl(Context context, UserHandle userHandle) {
                    try {
/* 2 */                 return zzbch.zza(context, userHandle, 0);
                    } catch (ReflectiveOperationException unused) {
/* 9 */                 I000II.I000iOII("TARGET_ANDROID_USER NameResolver.Arg requires SDK_INT >= R and @SystemApi visibility");
/* 12 */                return null;
                    }
                }

                private final void zzm() {
/* 1 */             zzazm zzazmVar = this.zzh;
/* 3 */             zzazmVar.zzd();
/* 8 */             if (this.zzk) {
/* 10 */                return;
                    }
/* 13 */            if (this.zzn != null) {
/* 38 */                this.zzl = true;
/* 55 */                return;
                    }
/* 22 */            ListenableFuture listenableFutureZza = zzja.zza(new Callable() {
                        @Override
                        public final Object call() {
/* 3 */                     return zzbbk.zze(this.zza);
                        }
                    }, this.zzg);
/* 26 */            this.zzn = listenableFutureZza;
/* 33 */            listenableFutureZza.addListener(new Runnable() {
                        @Override
                        public final void run() {
/* 3 */                     zzbbk.zzh(this.zza);
                        }
                    }, zzazmVar);
                }

                @Override
                public final String zza() {
/* 1 */             return "localhost";
                }

                @Override
                public final void zzb() {
/* 10 */            zzgo.zzn(this.zzm != null, "Not started!");
/* 13 */            zzm();
                }

                @Override
                public final void zzc() {
/* 3 */             this.zzh.zzd();
/* 8 */             if (this.zzk) {
/* 55 */                return;
                    }
/* 11 */            this.zzk = true;
/* 20 */            this.zzg.execute(new Runnable() {
                        @Override
                        public final void run() {
/* 3 */                     zzbbk.zzi(this.zza);
                        }
                    });
                }

                @Override
                public final void zzd(zzayg zzaygVar) {
/* 11 */            zzgo.zzn(this.zzm == null, "Already started!");
/* 19 */            zzgo.zzn(!this.zzk, "Resolver is shutdown");
/* 22 */            this.zzm = zzaygVar;
/* 31 */            this.zzg.execute(new Runnable() {
                        @Override
                        public final void run() {
/* 3 */                     zzbbk.zzj(this.zza);
                        }
                    });
/* 34 */            zzm();
                }
            }
