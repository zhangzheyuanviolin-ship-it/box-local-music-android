            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.android.gms.internal.mlkit_genai_speech.zzip;
            import java.util.concurrent.Callable;
            import java.util.concurrent.RunnableFuture;
            import p000.IlIi0I0;
            
            final class zzjr extends zziw implements RunnableFuture {
                private volatile zzjg zzd;

                public zzjr(Callable callable) {
/* 9 */             this.zzd = new zzjq(this, callable);
                }

                @Override
                public final void run() {
/* 1 */             zzjg zzjgVar = this.zzd;
/* 3 */             if (zzjgVar != null) {
/* 5 */                 zzjgVar.run();
                    }
/* 9 */             this.zzd = null;
                }

                @Override
                public final String zzb() {
/* 1 */             zzjg zzjgVar = this.zzd;
                    return zzjgVar != null ? IlIi0I0.I000lI("task=[", zzjgVar.toString(), "]") : super.zzb();
                }

                @Override
                public final void zzd() {
                    zzjg zzjgVar;
/* 1 */             Object obj = this.valueField;
/* 5 */             if ((obj instanceof zzip.zza) && ((zzip.zza) obj).zzc && (zzjgVar = this.zzd) != null) {
/* 17 */                zzjgVar.zze();
                    }
/* 21 */            this.zzd = null;
                }
            }
