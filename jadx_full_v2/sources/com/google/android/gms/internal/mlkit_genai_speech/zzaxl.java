            package com.google.android.gms.internal.mlkit_genai_speech;
            
            final class zzaxl extends zzaxk {
                private final zzaxj zzb;

                public zzaxl(String str, zzaxj zzaxjVar, zzaxp zzaxpVar) {
/* 3 */             super(str, false, zzaxjVar, null);
/* 14 */            zzgo.zzk(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
/* 27 */            zzgo.zzf(str.length() > 4, "empty key name");
/* 30 */            this.zzb = zzaxjVar;
                }

                @Override
                public final Object zza(byte[] bArr) {
/* 29 */            throw null;
                }

                @Override
                public final byte[] zzb(Object obj) {
/* 7 */             return zzaxq.zzg(this.zzb.zza(obj));
                }

                @Override
                public final boolean zzf() {
/* 1 */             return true;
                }
            }
