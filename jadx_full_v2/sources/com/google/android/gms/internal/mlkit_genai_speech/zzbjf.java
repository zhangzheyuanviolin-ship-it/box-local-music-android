            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.net.SocketAddress;
            import java.util.Collections;
            import java.util.Objects;
            
/* 18 */    final class zzbjf extends zzayl {
                final zzbjg zzb;

                public zzbjf(zzbjg zzbjgVar) {
/* 1 */             Objects.requireNonNull(zzbjgVar);
/* 4 */             this.zzb = zzbjgVar;
                }

                @Override
                public final String zza() {
/* 3 */             return this.zzb.zzb;
                }

                @Override
                public final void zzd(zzayg zzaygVar) {
/* 3 */             SocketAddress socketAddress = this.zzb.zza;
/* 5 */             zzayh zzayhVarZzc = zzayi.zzc();
/* 11 */            zzatu zzatuVar = zzatu.zza;
/* 28 */            zzayhVarZzc.zza(zzazf.zzc(Collections.singletonList(new zzavj(Collections.singletonList(socketAddress), zzatuVar))));
/* 31 */            zzayhVarZzc.zzb(zzatuVar);
/* 38 */            zzaygVar.zza(zzayhVarZzc.zzd());
                }

                @Override
/* 19 */        public final void zzc() {
                }
            }
