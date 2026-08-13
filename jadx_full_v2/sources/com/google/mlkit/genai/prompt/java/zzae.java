            package com.google.mlkit.genai.prompt.java;

            import com.google.mlkit.genai.prompt.GenerateContentRequest;
            import com.google.mlkit.genai.prompt.GenerativeModel;
            import p000.IIiOOI;
            import p000.IOoil1iiIilo;
            import p000.Ii0110;
            import p000.Ii0111o;
            import p000.IlliIl1l11O;
            import p000.Oll0io;
            import p000.OoiIlOl1iI;
            import p000.lIoii1l01l0i;
            
            final class zzae extends Oll0io implements IlliIl1l11O {
                Object zza;
                int zzb;
                final IIiOOI zzc;
                final zzal zzd;
                final GenerateContentRequest zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzae(IIiOOI iIiOOI, zzal zzalVar, GenerateContentRequest generateContentRequest, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.zzc = iIiOOI;
/* 3 */             this.zzd = zzalVar;
/* 5 */             this.zze = generateContentRequest;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new zzae(this.zzc, this.zzd, this.zze, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzae) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IIiOOI iIiOOI;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
                    try {
/* 5 */                 if (this.zzb != 0) {
/* 9 */                     iIiOOI = (IIiOOI) this.zza;
/* 11 */                    lIoii1l01l0i.I00000oOI(obj);
                        } else {
/* 17 */                    lIoii1l01l0i.I00000oOI(obj);
/* 20 */                    IIiOOI iIiOOI2 = this.zzc;
/* 1 */                     GenerativeModel generativeModel = this.zzd.zza;
/* 28 */                    GenerateContentRequest generateContentRequest = this.zze;
/* 30 */                    this.zza = iIiOOI2;
/* 33 */                    this.zzb = 1;
/* 35 */                    Object objGenerateContent = generativeModel.generateContent(generateContentRequest, this);
/* 39 */                    if (objGenerateContent == ii0111o) {
/* 47 */                        return ii0111o;
                            }
/* 41 */                    iIiOOI = iIiOOI2;
/* 42 */                    obj = objGenerateContent;
                        }
/* 43 */                iIiOOI.I00000oOI(obj);
                    } catch (Exception e) {
/* 50 */                this.zzc.I0000O(e);
                    }
/* 53 */            return OoiIlOl1iI.I00000oIO;
                }
            }
