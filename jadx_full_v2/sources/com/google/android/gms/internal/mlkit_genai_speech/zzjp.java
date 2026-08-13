            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Locale;
            import java.util.concurrent.Executors;
            import java.util.concurrent.ThreadFactory;
            import java.util.concurrent.atomic.AtomicLong;
            
            public final class zzjp {
                private String zza = null;
                private Boolean zzb = null;

                public final zzjp zza(boolean z) {
/* 3 */             this.zzb = Boolean.TRUE;
/* 29 */            return this;
                }

                public final zzjp zzb(String str) {
/* 12 */            String.format(Locale.ROOT, str, 0);
/* 15 */            this.zza = str;
/* 29 */            return this;
                }

                public final ThreadFactory zzc() {
/* 1 */             String str = this.zza;
/* 26 */            return new zzjo(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, this.zzb, null, null);
                }
            }
