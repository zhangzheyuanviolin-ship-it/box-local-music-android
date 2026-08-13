            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Locale;
            import java.util.Objects;
            
            final class zzbdx implements Runnable {
                final long zza;
                final String zzb = "CallOptions";
                final zzbek zzc;

                public zzbdx(zzbek zzbekVar, long j, String str) {
/* 1 */             this.zza = j;
/* 7 */             Objects.requireNonNull(zzbekVar);
/* 10 */            this.zzc = zzbekVar;
                }

                @Override
                public final void run() {
/* 1 */             long j = this.zza;
/* 10 */            long jAbs = Math.abs(j) / 1000000000;
/* 15 */            long jAbs2 = Math.abs(j) % 1000000000;
/* 18 */            StringBuilder sb = new StringBuilder();
/* 25 */            if (j < 0) {
/* 29 */                sb.append("ClientCall started after ");
/* 34 */                sb.append(this.zzb);
/* 39 */                sb.append(" deadline was exceeded. Deadline has been exceeded for ");
                    } else {
/* 45 */                sb.append("Deadline ");
/* 50 */                sb.append(this.zzb);
/* 55 */                sb.append(" was exceeded after ");
                    }
/* 58 */            sb.append(jAbs);
/* 77 */            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
/* 82 */            sb.append("s");
/* 2 */             this.zzc.zzn(zzazd.zzd.zze(sb.toString()), true);
                }
            }
