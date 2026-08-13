            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzaxn extends zzaxk {
                private final zzaxo zzb;

                public zzaxn(String str, boolean z, zzaxo zzaxoVar, zzaxp zzaxpVar) {
/* 2 */             super(str, z, zzaxoVar, null);
/* 15 */            zzgo.zzk(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
/* 20 */            zzgo.zzc(zzaxoVar, "marshaller");
/* 23 */            this.zzb = zzaxoVar;
                }

                @Override
                public final Object zza(byte[] bArr) {
/* 29 */            throw null;
                }

                @Override
                public final byte[] zzb(Object obj) {
/* 3 */             byte[] bArrZza = this.zzb.zza(obj);
/* 9 */             zzgo.zzc(bArrZza, "null marshaller.toAsciiString()");
/* 29 */            return bArrZza;
                }
            }
