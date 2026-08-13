            package com.google.android.gms.internal.mlkit_genai_speech;

            import com.google.common.util.concurrent.ListenableFuture;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ExecutionException;
            
            public abstract class zzazs extends zzbab {
                @Override
                @Deprecated
                public final zzazd zza(int i) {
                    try {
/* 9 */                 return (zzazd) zzb(i).get();
                    } catch (InterruptedException e) {
/* 17 */                Thread.currentThread().interrupt();
/* 22 */                return zzazd.zzb.zzd(e);
                    } catch (CancellationException e2) {
/* 30 */                return zzazd.zzb.zzd(e2);
                    } catch (ExecutionException e3) {
/* 36 */                return zzazd.zzc(e3);
                    }
                }

                public abstract ListenableFuture zzb(int i);
            }
