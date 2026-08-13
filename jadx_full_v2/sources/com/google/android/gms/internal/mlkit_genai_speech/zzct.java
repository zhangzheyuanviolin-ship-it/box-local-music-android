            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzct extends zzagg implements zzaho {
                private static final zzct zzb;
                private static volatile zzahv zze;
                private int zzf = 0;
                private Object zzg;

                static {
/* 3 */             zzct zzctVar = new zzct();
/* 6 */             zzb = zzctVar;
/* 10 */            zzagg.zzD(zzct.class, zzctVar);
                }

                private zzct() {
                }

                public static zzct zze() {
/* 1 */             return zzb;
                }

                public final zzcp zza() {
                    return this.zzf == 1 ? (zzcp) this.zzg : zzcp.zzd();
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzg", "zzf", zzcp.class, zzcr.class});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzct();
                    }
/* 12 */            zzcs zzcsVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzcl(zzcsVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 48 */                return zzahvVar;
                    }
                    synchronized (zzct.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzagbVar;
                }

                public final zzcr zzc() {
                    return this.zzf == 2 ? (zzcr) this.zzg : zzcr.zze();
                }

                public final boolean zzf() {
                    return this.zzf == 2;
                }
            }
