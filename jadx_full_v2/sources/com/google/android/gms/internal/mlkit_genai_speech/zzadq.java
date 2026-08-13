            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            
            final class zzadq extends zzadv {
                private String zza;
                private boolean zzb;
                private int zzc;
                private byte zzd;

                @Override
                public final zzadv zza(boolean z) {
/* 2 */             this.zzb = true;
/* 8 */             this.zzd = (byte) (1 | this.zzd);
/* 29 */            return this;
                }

                @Override
                public final zzadv zzb(int i) {
/* 2 */             this.zzc = 1;
/* 9 */             this.zzd = (byte) (this.zzd | 2);
/* 29 */            return this;
                }

                public final zzadv zzc(String str) {
/* 3 */             this.zza = "genai-speech-recognition";
/* 29 */            return this;
                }

                @Override
                public final zzadw zzd() {
                    String str;
/* 4 */             zzadr zzadrVar = null;
/* 5 */             if (this.zzd == 3 && (str = this.zza) != null) {
/* 18 */                return new zzads(str, this.zzb, this.zzc, zzadrVar);
                    }
/* 24 */            StringBuilder sb = new StringBuilder();
/* 29 */            if (this.zza == null) {
/* 33 */                sb.append(" libraryName");
                    }
/* 40 */            if ((this.zzd & 1) == 0) {
/* 44 */                sb.append(" enableFirelog");
                    }
/* 51 */            if ((this.zzd & 2) == 0) {
/* 55 */                sb.append(" firelogEventType");
                    }
/* 68 */            I000II.I001IO000("Missing required properties:".concat(sb.toString()));
/* 4 */             return null;
                }
            }
