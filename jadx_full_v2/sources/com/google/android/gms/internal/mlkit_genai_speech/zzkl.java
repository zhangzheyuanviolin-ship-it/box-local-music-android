            package com.google.android.gms.internal.mlkit_genai_speech;

            import android.content.pm.PackageManager;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.Callable;
            import java.util.concurrent.Executor;
            import p000.Io0ii1o0;
            
            final class zzkl extends zzazs {
                final zzgu zza;
                final PackageManager zzb;
                final zzho zzc;
                final Executor zzd;

                public zzkl(zzgu zzguVar, PackageManager packageManager, zzho zzhoVar, Executor executor) {
/* 1 */             this.zza = zzguVar;
/* 3 */             this.zzb = packageManager;
/* 5 */             this.zzc = zzhoVar;
/* 7 */             this.zzd = executor;
                }

                @Override
                public final ListenableFuture zzb(final int i) {
/* 3 */             final zzgu zzguVar = this.zza;
/* 5 */             final PackageManager packageManager = this.zzb;
/* 7 */             final zzho zzhoVar = this.zzc;
/* 14 */            return zzja.zza(new Callable() {
                        @Override
                        public final Object call() {
/* 22 */                    return new zzkj(packageManager, zzhoVar, Io0ii1o0.I00000oIO(((zzki) zzguVar).zza)).zza(i);
                        }
                    }, this.zzd);
                }
            }
