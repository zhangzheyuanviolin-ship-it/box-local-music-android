            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.nio.charset.StandardCharsets;
            
            final class zzaxh extends zzaxk {
                private final zzaxi zzb;

                public zzaxh(String str, boolean z, zzaxi zzaxiVar, zzaxp zzaxpVar) {
/* 3 */             super(str, false, zzaxiVar, null);
/* 16 */            zzgo.zzk(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
/* 21 */            zzgo.zzc(zzaxiVar, "marshaller");
/* 24 */            this.zzb = zzaxiVar;
                }

                @Override
                public final Object zza(byte[] bArr) {
/* 10 */            return this.zzb.zza(new String(bArr, StandardCharsets.US_ASCII));
                }

                @Override
                public final byte[] zzb(Object obj) {
/* 3 */             String strZzb = this.zzb.zzb(obj);
/* 9 */             zzgo.zzc(strZzb, "null marshaller.toAsciiString()");
/* 14 */            return strZzb.getBytes(StandardCharsets.US_ASCII);
                }
            }
