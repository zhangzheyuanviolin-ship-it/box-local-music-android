            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzdl;
            import com.google.android.gms.internal.mlkit_genai_speech.zzdr;
            import com.google.android.gms.internal.mlkit_genai_speech.zzds;
            import com.google.android.gms.internal.mlkit_genai_speech.zzdt;
            import kotlin.jvm.functions.Function1;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.OOIoO0IIOO0;
            import p000.OOIoOo0O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzn extends Oll0io implements Function1 {
                int zza;
                final OOIoOo0O zzb;
                final SpeechRecognizer zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzn(OOIoOo0O oOIoOo0O, SpeechRecognizer speechRecognizer, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(1, iOoil1iiIilo);
/* 1 */             this.zzb = oOIoOo0O;
/* 3 */             this.zzc = speechRecognizer;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new zzn(this.zzb, this.zzc, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj) {
/* 11 */            return ((zzn) create((IOoil1iiIilo) obj)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 5 */             lIoii1l01l0i.I00000oOI(obj);
/* 8 */             if (i == 0) {
/* 11 */                OOIoOo0O oOIoOo0O = this.zzb;
/* 17 */                zzdt zzdtVarZza = zzds.zza(zzdr.zza());
/* 25 */                zzdtVarZza.zzc(zzdl.zzc());
/* 28 */                zzdr zzdrVarZza = zzdtVarZza.zza();
/* 33 */                this.zza = 1;
/* 43 */                if (((OOIoO0IIOO0) oOIoOo0O).I00ilI0I1.I00000oOI(this, zzdrVarZza) == ii0111o) {
/* 45 */                    return ii0111o;
                        }
                    }
/* 46 */            return OoiIlOl1iI.I00000oIO;
                }
            }
