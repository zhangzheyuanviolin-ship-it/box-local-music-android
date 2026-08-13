            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Locale;
            import java.util.Objects;
            import java.util.concurrent.TimeUnit;
            import p000.I000II;
            import p000.Oi010OO0;
            
            public final class zzavf implements Comparable {
                public static final int zza = 0;
                private static final zzavd zzb = new zzavc(null);
                private static final long zzc = 3153600000000000000L;
                private static final long zzd = -3153600000000000000L;
                private static final long zze = 1000000000;
                private final zzavd zzf;
                private final long zzg;
                private volatile boolean zzh;

                private zzavf(zzavd zzavdVar, long j, long j2, boolean z) {
/* 4 */             this.zzf = zzavdVar;
/* 14 */            long jMin = Math.min(zzc, Math.max(zzd, j2));
/* 19 */            this.zzg = j + jMin;
/* 30 */            this.zzh = jMin <= 0;
                }

                public static zzavf zzc(long j, TimeUnit timeUnit) {
/* 1 */             zzavd zzavdVar = zzb;
/* 5 */             Objects.requireNonNull(timeUnit, "units");
/* 19 */            return new zzavf(zzavdVar, System.nanoTime(), timeUnit.toNanos(j), true);
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof zzavf)) {
/* 7 */                 return false;
                    }
/* 11 */            zzavf zzavfVar = (zzavf) obj;
                    return this.zzf == zzavfVar.zzf && this.zzg == zzavfVar.zzg;
                }

                public final int hashCode() {
/* 13 */            return Objects.hash(this.zzf, Long.valueOf(this.zzg));
                }

                public final String toString() {
/* 3 */             long jZzb = zzb(TimeUnit.NANOSECONDS);
/* 7 */             long jAbs = Math.abs(jZzb);
/* 11 */            long j = zze;
/* 13 */            long j2 = jAbs / j;
/* 18 */            long jAbs2 = Math.abs(jZzb) % j;
/* 21 */            StringBuilder sb = new StringBuilder();
/* 28 */            if (jZzb < 0) {
/* 32 */                sb.append('-');
                    }
/* 35 */            sb.append(j2);
/* 40 */            if (jAbs2 > 0) {
/* 58 */                sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
                    }
/* 63 */            sb.append("s from now");
/* 66 */            zzavd zzavdVar = this.zzf;
/* 70 */            if (zzavdVar != zzb) {
/* 95 */                sb.append(" (ticker=" + zzavdVar.toString() + ")");
                    }
/* 98 */            return sb.toString();
                }

                @Override
                public final int compareTo(zzavf zzavfVar) {
/* 1 */             zzavd zzavdVar = this.zzf;
/* 3 */             zzavd zzavdVar2 = zzavfVar.zzf;
/* 5 */             if (zzavdVar == zzavdVar2) {
/* 11 */                return Long.compare(this.zzg, zzavfVar.zzg);
                    }
/* 34 */            I000II.I000O01llI0(Oi010OO0.I001IO000("Tickers (", zzavdVar.toString(), " and ", zzavdVar2.toString(), ") don't match. Custom Ticker should only be used in tests!"));
/* 37 */            return 0;
                }

                public final long zzb(TimeUnit timeUnit) {
/* 1 */             long jNanoTime = System.nanoTime();
/* 7 */             if (!this.zzh && this.zzg - jNanoTime <= 0) {
/* 19 */                this.zzh = true;
                    }
/* 26 */            return timeUnit.convert(this.zzg - jNanoTime, TimeUnit.NANOSECONDS);
                }

                public final boolean zzd() {
/* 4 */             if (!this.zzh) {
/* 17 */                if (this.zzg - System.nanoTime() > 0) {
/* 22 */                    return false;
                        }
/* 19 */                this.zzh = true;
                    }
/* 3 */             return true;
                }
            }
