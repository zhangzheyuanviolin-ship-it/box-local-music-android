            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IIl001iO0Io;
            
            final class zzads extends zzadw {
                private final String zza;
                private final boolean zzb;
                private final int zzc;

                public zzads(String str, boolean z, int i, zzadr zzadrVar) {
/* 4 */             this.zza = str;
/* 6 */             this.zzb = z;
/* 8 */             this.zzc = i;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof zzadw) {
/* 10 */                zzadw zzadwVar = (zzadw) obj;
/* 22 */                if (this.zza.equals(zzadwVar.zzb()) && this.zzb == zzadwVar.zzc() && this.zzc == zzadwVar.zza()) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 10 */            int iHashCode = this.zza.hashCode() ^ 1000003;
/* 26 */            return this.zzc ^ (((iHashCode * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
/* 10 */            sb.append(this.zza);
/* 15 */            sb.append(", enableFirelog=");
/* 20 */            sb.append(this.zzb);
/* 25 */            sb.append(", firelogEventType=");
/* 32 */            return IIl001iO0Io.I000lI(this.zzc, "}", sb);
                }

                @Override
                public final int zza() {
/* 1 */             return this.zzc;
                }

                @Override
                public final String zzb() {
/* 1 */             return this.zza;
                }

                @Override
                public final boolean zzc() {
/* 1 */             return this.zzb;
                }
            }
