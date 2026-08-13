            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.text.ParseException;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            
            final class zzbjm {
                static final zzatx zza = zzatx.zza("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");
                final Long zzb;
                final Boolean zzc;
                final Integer zzd;
                final Integer zze;
                final zzbmk zzf;
                final zzbgs zzg;

                public zzbjm(Map map, boolean z, int i, int i2) throws NumberFormatException, ParseException {
                    long j;
                    zzbmk zzbmkVar;
                    zzbgs zzbgsVar;
/* 14 */            this.zzb = zzbhr.zzd(map, "timeout");
/* 22 */            this.zzc = zzbhr.zza(map, "waitForReady");
/* 26 */            Integer numZzc = zzbhr.zzc(map, "maxResponseMessageBytes");
/* 30 */            this.zzd = numZzc;
/* 32 */            if (numZzc != null) {
/* 45 */                zzgo.zzj(numZzc.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numZzc);
                    }
/* 50 */            Integer numZzc2 = zzbhr.zzc(map, "maxRequestMessageBytes");
/* 54 */            this.zze = numZzc2;
/* 56 */            if (numZzc2 != null) {
/* 69 */                zzgo.zzj(numZzc2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numZzc2);
                    }
/* 81 */            Map mapZzj = z ? zzbhr.zzj(map, "retryPolicy") : null;
/* 92 */            if (mapZzj == null) {
/* 94 */                j = 0;
/* 96 */                zzbmkVar = null;
                    } else {
/* 99 */                Integer numZzc3 = zzbhr.zzc(mapZzj, "maxAttempts");
/* 103 */               zzgo.zzc(numZzc3, "maxAttempts cannot be empty");
/* 106 */               int iIntValue = numZzc3.intValue();
/* 115 */               zzgo.zzh(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
/* 118 */               int iMin = Math.min(iIntValue, 5);
/* 124 */               Long lZzd = zzbhr.zzd(mapZzj, "initialBackoff");
/* 130 */               zzgo.zzc(lZzd, "initialBackoff cannot be empty");
/* 133 */               long jLongValue = lZzd.longValue();
/* 146 */               zzgo.zzi(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
/* 151 */               Long lZzd2 = zzbhr.zzd(mapZzj, "maxBackoff");
/* 157 */               zzgo.zzc(lZzd2, "maxBackoff cannot be empty");
/* 160 */               long jLongValue2 = lZzd2.longValue();
/* 173 */               zzgo.zzi(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
/* 178 */               Double dZzb = zzbhr.zzb(mapZzj, "backoffMultiplier");
/* 184 */               zzgo.zzc(dZzb, "backoffMultiplier cannot be empty");
/* 187 */               double dDoubleValue = dZzb.doubleValue();
/* 198 */               j = 0;
/* 205 */               zzgo.zzj(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", dZzb);
/* 210 */               Long lZzd3 = zzbhr.zzd(mapZzj, "perAttemptRecvTimeout");
/* 229 */               zzgo.zzj(lZzd3 == null || lZzd3.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", lZzd3);
/* 232 */               Set setZzb = zzbmy.zzb(mapZzj);
/* 249 */               zzgo.zzf((lZzd3 == null && setZzb.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
/* 260 */               zzbmkVar = new zzbmk(iMin, jLongValue, jLongValue2, dDoubleValue, lZzd3, setZzb);
                    }
/* 263 */           this.zzf = zzbmkVar;
/* 274 */           Map mapZzj2 = z ? zzbhr.zzj(map, "hedgingPolicy") : null;
/* 275 */           if (mapZzj2 == null) {
/* 277 */               zzbgsVar = null;
                    } else {
/* 279 */               Integer numZzc4 = zzbhr.zzc(mapZzj2, "maxAttempts");
/* 283 */               zzgo.zzc(numZzc4, "maxAttempts cannot be empty");
/* 286 */               int iIntValue2 = numZzc4.intValue();
/* 295 */               zzgo.zzh(iIntValue2 >= 2, "maxAttempts must be greater than 1: %s", iIntValue2);
/* 298 */               int iMin2 = Math.min(iIntValue2, 5);
/* 304 */               Long lZzd4 = zzbhr.zzd(mapZzj2, "hedgingDelay");
/* 310 */               zzgo.zzc(lZzd4, "hedgingDelay cannot be empty");
/* 313 */               long jLongValue3 = lZzd4.longValue();
/* 326 */               zzgo.zzi(jLongValue3 >= j, "hedgingDelay must not be negative: %s", jLongValue3);
/* 335 */               zzbgsVar = new zzbgs(iMin2, jLongValue3, zzbmy.zza(mapZzj2));
                    }
/* 339 */           this.zzg = zzbgsVar;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof zzbjm)) {
/* 3 */                 return false;
                    }
/* 7 */             zzbjm zzbjmVar = (zzbjm) obj;
                    return Objects.equals(this.zzb, zzbjmVar.zzb) && Objects.equals(this.zzc, zzbjmVar.zzc) && Objects.equals(this.zzd, zzbjmVar.zzd) && Objects.equals(this.zze, zzbjmVar.zze) && Objects.equals(this.zzf, zzbjmVar.zzf) && Objects.equals(this.zzg, zzbjmVar.zzg);
                }

                public final int hashCode() {
/* 17 */            return Objects.hash(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg);
                }

                public final String toString() {
/* 1 */             zzgk zzgkVarZzb = zzgm.zzb(this);
/* 9 */             zzgkVarZzb.zzd("timeoutNanos", this.zzb);
/* 16 */            zzgkVarZzb.zzd("waitForReady", this.zzc);
/* 23 */            zzgkVarZzb.zzd("maxInboundMessageSize", this.zzd);
/* 30 */            zzgkVarZzb.zzd("maxOutboundMessageSize", this.zze);
/* 37 */            zzgkVarZzb.zzd("retryPolicy", this.zzf);
/* 44 */            zzgkVarZzb.zzd("hedgingPolicy", this.zzg);
/* 47 */            return zzgkVarZzb.toString();
                }
            }
