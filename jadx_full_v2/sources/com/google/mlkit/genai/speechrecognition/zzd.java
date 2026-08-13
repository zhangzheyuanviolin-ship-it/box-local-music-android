            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzct;
            import p000.IOoil1iiIilo;
            import p000.IOoilo;
            
            public final class zzd extends IOoilo {
                Object zza;
                int zzb;
                final zze zzc;
                Object zzd;
                zzct zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzd(zze zzeVar, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.zzc = zzeVar;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.zza = obj;
                    this.zzb |= Integer.MIN_VALUE;
/* 13 */            return this.zzc.emit(null, this);
                }
            }
