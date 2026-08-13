            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.OoOil11Ol1o;
            
            final class zzahd implements zzahl {
                private final zzahl[] zza;

                public zzahd(zzahl... zzahlVarArr) {
/* 4 */             this.zza = zzahlVarArr;
                }

                @Override
                public final zzahk zzb(Class cls) {
/* 3 */             for (int i = 0; i < 2; i++) {
/* 7 */                 zzahl zzahlVar = this.zza[i];
/* 13 */                if (zzahlVar.zzc(cls)) {
/* 15 */                    return zzahlVar.zzb(cls);
                        }
                    }
/* 33 */            OoOil11Ol1o.I000OiO("No factory is available for message type: ".concat(cls.getName()));
/* 36 */            return null;
                }

                @Override
                public final boolean zzc(Class cls) {
/* 4 */             for (int i = 0; i < 2; i++) {
/* 14 */                if (this.zza[i].zzc(cls)) {
/* 16 */                    return true;
                        }
                    }
/* 1 */             return false;
                }
            }
