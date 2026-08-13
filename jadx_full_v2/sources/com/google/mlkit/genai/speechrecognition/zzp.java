            package com.google.mlkit.genai.speechrecognition;

            import com.google.android.gms.internal.mlkit_genai_speech.zzdr;
            import p000.IOoil1iiIilo;
            import p000.Ii0111o;
            import p000.IllOOo00lI;
            import p000.IlliIl1l11O;
            import p000.OOIoO0IIOO0;
            import p000.OOIoOo0O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzp extends Oll0io implements IlliIl1l11O {
                public static final int zzc = 0;
                int zza;
                final SpeechRecognizer zzb;
                private Object zzd;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzp(SpeechRecognizer speechRecognizer, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(2, iOoil1iiIilo);
/* 1 */             this.zzb = speechRecognizer;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 5 */             zzp zzpVar = new zzp(this.zzb, iOoil1iiIilo);
/* 8 */             zzpVar.zzd = obj;
/* 89 */            return zzpVar;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzp) create((OOIoOo0O) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:10:0x004b, code lost:
                
                    if (p000.lIIl0IOilo0.I00000oIO(r1, r3, r5) == r0) goto L14;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OOIoOo0O oOIoOo0O;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.zza;
/* 7 */             if (i == 0) {
/* 23 */                lIoii1l01l0i.I00000oOI(obj);
/* 29 */                oOIoOo0O = (OOIoOo0O) this.zzd;
/* 31 */                SpeechRecognizer speechRecognizer = this.zzb;
/* 1 */                 speechRecognizer.zzk = new zzn(oOIoOo0O, speechRecognizer, null);
/* 41 */                zzdr zzdrVarZza = SpeechRecognizer.zza(speechRecognizer);
/* 45 */                this.zzd = oOIoOo0O;
/* 47 */                this.zza = 1;
/* 58 */                if (((OOIoO0IIOO0) oOIoOo0O).I00ilI0I1.I00000oOI(this, zzdrVarZza) != ii0111o) {
                        }
/* 186 */               return ii0111o;
                    }
/* 9 */             if (i != 1) {
/* 11 */                lIoii1l01l0i.I00000oOI(obj);
/* 79 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 17 */            oOIoOo0O = (OOIoOo0O) this.zzd;
/* 19 */            lIoii1l01l0i.I00000oOI(obj);
/* 60 */            final SpeechRecognizer speechRecognizer2 = this.zzb;
/* 64 */            IllOOo00lI illOOo00lI = new IllOOo00lI() {
                        @Override
                        public final Object invoke() {
/* 1 */                     speechRecognizer2.zzk = new zzo(null);
/* 12 */                    return OoiIlOl1iI.I00000oIO;
                        }
                    };
/* 67 */            this.zzd = null;
/* 70 */            this.zza = 2;
                }
            }
