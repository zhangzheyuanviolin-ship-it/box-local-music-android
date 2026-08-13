            package com.google.mlkit.genai.speechrecognition;

            import p000.IOoil1iiIilo;
            import p000.IOoilo;
            
            final class zzq extends IOoilo {
                Object zza;
                final SpeechRecognizer zzb;
                int zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzq(SpeechRecognizer speechRecognizer, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.zzb = speechRecognizer;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.zza = obj;
                    this.zzc |= Integer.MIN_VALUE;
/* 12 */            return this.zzb.stopRecognition(this);
                }
            }
