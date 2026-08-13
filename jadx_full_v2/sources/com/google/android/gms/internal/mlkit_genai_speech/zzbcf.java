            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.app.admin.DevicePolicyManager;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.IBinder;
            import android.os.UserHandle;
            import java.util.concurrent.Executor;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.Oi010OO0;
            
            final class zzbcf implements ServiceConnection, zzbad {
                private static final Logger zza = Logger.getLogger(zzbcf.class.getName());
                private final Intent zzb;
                private final UserHandle zzc;
                private final int zzd;
                private final zzbac zze;
                private final Executor zzf;
                private Context zzg;
                private int zzh;
                private int zzi;

                public zzbcf(Executor executor, Context context, zzazx zzazxVar, Intent intent, UserHandle userHandle, int i, zzbac zzbacVar) {
                    synchronized (this) {
/* 5 */                 this.zzb = intent;
/* 7 */                 this.zzd = i;
/* 9 */                 this.zze = zzbacVar;
/* 11 */                this.zzg = context;
/* 13 */                this.zzf = executor;
/* 15 */                this.zzc = userHandle;
/* 18 */                this.zzh = 1;
/* 20 */                this.zzi = 1;
                    }
                }

                private final Context zzf(String str) throws zzaze {
/* 11 */            zzgo.zzn(this.zzg != null, "Already unbound!");
                    try {
/* 14 */                UserHandle userHandle = this.zzc;
/* 16 */                Context context = this.zzg;
                        return userHandle == null ? context : zzbch.zza(context, userHandle, 0);
                    } catch (ReflectiveOperationException unused) {
/* 77 */                throw new zzaze(zzazd.zzi.zze("Cross-user pre-auth".concat(" requires SDK_INT >= R and @SystemApi visibility")), null);
                    }
                }

                private final void zzg(zzazd zzazdVar) {
/* 1 */             Logger logger = zza;
/* 3 */             Level level = Level.FINEST;
/* 12 */            logger.logp(level, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound ", zzazdVar);
/* 16 */            this.zzg = null;
/* 21 */            if (this.zzi != 4) {
/* 23 */                this.zzi = 4;
/* 31 */                logger.logp(level, "io.grpc.binder.internal.ServiceBinding", "notifyUnbound", "notify unbound - notifying");
/* 36 */                this.zze.zzb(zzazdVar);
                    }
                }

                @Override
                public final void onBindingDied(ComponentName componentName) {
/* 25 */            zze(zzazd.zzj.zze(Oi010OO0.I001IO000("Remote Service component ", componentName.getClassName(), " was disabled, or its package ", componentName.getPackageName(), " was disabled, force-stopped, replaced or uninstalled (onBindingDied).")));
                }

                @Override
                public final void onNullBinding(ComponentName componentName) {
/* 1 */             Intent intent = this.zzb;
/* 39 */            zze(zzazd.zzh.zze("Remote Service returned null from onBind() for " + String.valueOf(intent) + " (onNullBinding): " + String.valueOf(componentName)));
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                    boolean z;
                    synchronized (this) {
                        try {
/* 7 */                     if (this.zzh == 2) {
/* 9 */                         this.zzh = 3;
/* 11 */                        z = true;
                            } else {
/* 15 */                        z = false;
                            }
                        } catch (Throwable th) {
/* 106 */                   throw th;
                        }
                    }
/* 17 */            if (z && this.zzi == 1) {
/* 23 */                this.zzi = 3;
/* 35 */                zza.logp(Level.FINEST, "io.grpc.binder.internal.ServiceBinding", "notifyBound", "notify bound - notifying");
/* 40 */                this.zze.zza(iBinder);
                    }
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 17 */            zze(zzazd.zzj.zze("Server process crashed, exited or was killed (onServiceDisconnected): ".concat(String.valueOf(componentName))));
                }

                @Override
                public final ServiceInfo zza() throws zzaze {
/* 7 */             PackageManager packageManager = zzf("Cross-user pre-auth").getPackageManager();
/* 11 */            Intent intent = this.zzb;
/* 15 */            ResolveInfo resolveInfoResolveService = packageManager.resolveService(intent, 268435456);
/* 19 */            if (resolveInfoResolveService != null) {
/* 21 */                return resolveInfoResolveService.serviceInfo;
                    }
/* 110 */           throw new zzaze(zzazd.zzh.zze(Oi010OO0.I001IO000("resolveService(", String.valueOf(intent), " / ", String.valueOf(this.zzc), ") was null")), null);
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0056 A[Catch: all -> 0x0041, RuntimeException -> 0x0044, SecurityException -> 0x0047, TryCatch #1 {all -> 0x0041, blocks: (B:37:0x0060, B:43:0x00bb, B:45:0x00c1, B:46:0x00c3, B:51:0x00d6, B:50:0x00c9, B:22:0x003c, B:36:0x005d, B:57:0x00e8, B:40:0x0089, B:42:0x00a3, B:33:0x0050, B:34:0x0056), top: B:59:0x0001, inners: #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:36:0x005d A[Catch: all -> 0x0041, RuntimeException -> 0x0044, SecurityException -> 0x0047, TryCatch #1 {all -> 0x0041, blocks: (B:37:0x0060, B:43:0x00bb, B:45:0x00c1, B:46:0x00c3, B:51:0x00d6, B:50:0x00c9, B:22:0x003c, B:36:0x005d, B:57:0x00e8, B:40:0x0089, B:42:0x00a3, B:33:0x0050, B:34:0x0056), top: B:59:0x0001, inners: #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0060 A[Catch: all -> 0x0041, RuntimeException -> 0x0044, SecurityException -> 0x0047, PHI: r6
                  0x0060: PHI (r6v16 com.google.android.gms.internal.mlkit_genai_speech.zzbcf) = 
                  (r6v15 com.google.android.gms.internal.mlkit_genai_speech.zzbcf)
                  (r6v19 com.google.android.gms.internal.mlkit_genai_speech.zzbcf)
                 binds: [B:35:0x005b, B:19:0x002f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:37:0x0060, B:43:0x00bb, B:45:0x00c1, B:46:0x00c3, B:51:0x00d6, B:50:0x00c9, B:22:0x003c, B:36:0x005d, B:57:0x00e8, B:40:0x0089, B:42:0x00a3, B:33:0x0050, B:34:0x0056), top: B:59:0x0001, inners: #2 }] */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00c1 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #1 {all -> 0x0041, blocks: (B:37:0x0060, B:43:0x00bb, B:45:0x00c1, B:46:0x00c3, B:51:0x00d6, B:50:0x00c9, B:22:0x003c, B:36:0x005d, B:57:0x00e8, B:40:0x0089, B:42:0x00a3, B:33:0x0050, B:34:0x0056), top: B:59:0x0001, inners: #2 }] */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final synchronized void zzb() throws Throwable {
                    final zzbcf zzbcfVar;
                    final zzazd zzazdVarZze;
                    zzbce zzbceVar;
                    int iOrdinal;
                    boolean zBindService;
                    try {
                        try {
/* 5 */                     if (this.zzh == 1) {
/* 8 */                         this.zzh = 2;
/* 10 */                        Context context = this.zzg;
/* 12 */                        Intent intent = this.zzb;
/* 14 */                        int i = this.zzd;
/* 16 */                        UserHandle userHandle = this.zzc;
/* 18 */                        zzbce zzbceVar2 = zzbce.BIND_SERVICE;
/* 20 */                        if (userHandle != null) {
                                    try {
/* 22 */                                zzbceVar2 = zzbce.BIND_SERVICE_AS_USER;
/* 24 */                                zzbceVar = zzbceVar2;
                                        try {
/* 38 */                                    iOrdinal = zzbceVar.ordinal();
                                            try {
                                            } catch (SecurityException e) {
/* 72 */                                        e = e;
/* 163 */                                       zzbceVar2 = zzbceVar;
/* 184 */                                       zzazdVarZze = zzazd.zze.zzd(e).zze("SecurityException from ".concat(String.valueOf(zzbceVar2.zza())));
/* 192 */                                       if (!zzazdVarZze.zzj()) {
                                                }
                                            } catch (RuntimeException e2) {
/* 69 */                                        e = e2;
/* 137 */                                       zzbceVar2 = zzbceVar;
/* 158 */                                       zzazdVarZze = zzazd.zzi.zzd(e).zze("RuntimeException from ".concat(String.valueOf(zzbceVar2.zza())));
/* 192 */                                       if (!zzazdVarZze.zzj()) {
                                                }
                                            }
                                        } catch (SecurityException e3) {
/* 78 */                                    e = e3;
/* 79 */                                    zzbcfVar = this;
                                        } catch (RuntimeException e4) {
/* 75 */                                    e = e4;
/* 76 */                                    zzbcfVar = this;
                                        }
                                    } catch (SecurityException e5) {
/* 34 */                                e = e5;
/* 35 */                                zzbcfVar = this;
/* 184 */                               zzazdVarZze = zzazd.zze.zzd(e).zze("SecurityException from ".concat(String.valueOf(zzbceVar2.zza())));
/* 192 */                               if (!zzazdVarZze.zzj()) {
                                        }
                                    } catch (RuntimeException e6) {
/* 30 */                                e = e6;
/* 31 */                                zzbcfVar = this;
/* 158 */                               zzazdVarZze = zzazd.zzi.zzd(e).zze("RuntimeException from ".concat(String.valueOf(zzbceVar2.zza())));
/* 192 */                               if (!zzazdVarZze.zzj()) {
                                        }
                                    }
/* 42 */                            if (iOrdinal != 0) {
/* 87 */                                zzbcfVar = this;
/* 88 */                                zBindService = context.bindService(intent, zzbcfVar, i);
                                    } else if (iOrdinal == 1) {
/* 81 */                                zzbcfVar = this;
/* 82 */                                zBindService = context.bindServiceAsUser(intent, zzbcfVar, i, userHandle);
                                    } else if (iOrdinal != 2) {
/* 48 */                                zzbcfVar = this;
/* 132 */                               zzazdVarZze = zzazd.zzh.zze(zzbceVar.zza() + "(" + String.valueOf(intent) + ") returned false");
/* 192 */                               if (!zzazdVarZze.zzj()) {
                                            try {
/* 196 */                                       zzbcfVar.zzg.unbindService(zzbcfVar);
                                            } catch (RuntimeException e7) {
/* 212 */                                       zza.logp(Level.FINE, "io.grpc.binder.internal.ServiceBinding", "handleBindServiceFailure", "Could not clean up after bindService() failure.", (Throwable) e7);
                                            }
/* 216 */                                   zzbcfVar.zzh = 4;
/* 225 */                                   zzbcfVar.zzf.execute(new Runnable() {
                                                @Override
                                                public final void run() {
/* 1 */                                             this.zza.zzg(zzazdVarZze);
                                                }
                                            });
/* 229 */                                   return;
                                        }
                                    } else {
/* 60 */                                zzbcfVar = this;
/* 61 */                                zBindService = ((DevicePolicyManager) context.getSystemService("device_policy")).bindDeviceAdminServiceAsUser((ComponentName) null, intent, zzbcfVar, i, userHandle);
                                    }
/* 92 */                            if (zBindService) {
/* 132 */                               zzazdVarZze = zzazd.zzh.zze(zzbceVar.zza() + "(" + String.valueOf(intent) + ") returned false");
                                    } else {
/* 94 */                                zzazdVarZze = zzazd.zza;
                                    }
/* 192 */                           if (!zzazdVarZze.zzj()) {
                                    }
                                } else {
/* 24 */                            zzbceVar = zzbceVar2;
/* 38 */                            iOrdinal = zzbceVar.ordinal();
/* 42 */                            if (iOrdinal != 0) {
                                    }
/* 92 */                            if (zBindService) {
                                    }
/* 192 */                           if (!zzazdVarZze.zzj()) {
                                    }
                                }
                            } else {
/* 230 */                       zzbcfVar = this;
                            }
                        } catch (Throwable th) {
/* 66 */                    th = th;
/* 245 */                   throw th;
                        }
                    } catch (Throwable th2) {
/* 26 */                th = th2;
/* 27 */                zzbcfVar = this;
/* 245 */               throw th;
                    }
                }

                public final void zze(final zzazd zzazdVar) {
                    Context context;
                    synchronized (this) {
/* 2 */                 int i = this.zzh;
/* 13 */                context = (i == 2 || i == 3) ? this.zzg : null;
/* 16 */                this.zzh = 4;
                    }
/* 26 */            this.zzf.execute(new Runnable() {
                        @Override
                        public final void run() {
/* 1 */                     this.zza.zzg(zzazdVar);
                        }
                    });
/* 29 */            if (context != null) {
/* 31 */                context.unbindService(this);
                    }
                }
            }
