            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.IIl001iO0Io;
            import p000.IIlIOloOOO;
            
            final class zzhl {
                private final Object zza;
                private final Object zzb;
                private final Object zzc;

                public zzhl(Object obj, Object obj2, Object obj3) {
/* 4 */             this.zza = obj;
/* 6 */             this.zzb = obj2;
/* 8 */             this.zzc = obj3;
                }

                public final IllegalArgumentException zza() {
/* 1 */             Object obj = this.zzc;
/* 3 */             Object obj2 = this.zzb;
/* 5 */             Object obj3 = this.zza;
/* 9 */             String strValueOf = String.valueOf(obj3);
/* 13 */            String strValueOf2 = String.valueOf(obj2);
/* 39 */            return new IllegalArgumentException(IIlIOloOOO.I0010I0i(IIl001iO0Io.I00111O("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
                }
            }
