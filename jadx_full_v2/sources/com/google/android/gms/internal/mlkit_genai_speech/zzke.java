            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.HashMap;
            import java.util.Map;
            import p000.Il0IIIOll;
            import p000.Il0IO001iOOo;
            import p000.OIOi0lOI;
            import p000.OoloOoIl;
            
/* 10 */    public final class zzke implements Il0IIIOll {
                public static final int zza = 0;
                private static final OIOi0lOI zzb = new OIOi0lOI() {
                    @Override
                    public final void encode(Object obj, Object obj2) {
/* 3 */                 int i = zzke.zza;
/* 37 */                throw new Il0IO001iOOo("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
                    }
                };
                private final Map zzc = new HashMap();
                private final Map zzd = new HashMap();
                private final OIOi0lOI zze = zzb;

                @Override
                public final Il0IIIOll registerEncoder(Class cls, OIOi0lOI oIOi0lOI) {
/* 3 */             this.zzc.put(cls, oIOi0lOI);
/* 8 */             this.zzd.remove(cls);
/* 37 */            return this;
                }

                public final zzkf zza() {
/* 19 */            return new zzkf(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
                }

/* 11 */        public final Il0IIIOll registerEncoder(Class cls, OoloOoIl ooloOoIl) {
/* 12 */            this.zzd.put(cls, ooloOoIl);
/* 13 */            this.zzc.remove(cls);
                    return this;
                }
            }
