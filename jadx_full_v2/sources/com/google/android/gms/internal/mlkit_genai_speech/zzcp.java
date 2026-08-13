            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzcp extends zzagg implements zzaho {
                private static final zzcp zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;

                static {
/* 3 */             zzcp zzcpVar = new zzcp();
/* 6 */             zzb = zzcpVar;
/* 10 */            zzagg.zzD(zzcp.class, zzcpVar);
                }

                private zzcp() {
                }

                public static zzcp zzd() {
/* 1 */             return zzb;
                }

                public final zzco zza() {
/* 3 */             zzco zzcoVarZzb = zzco.zzb(this.zzg);
                    return zzcoVarZzb == null ? zzco.END_REASON_UNKNOWN : zzcoVarZzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 85 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 79 */                return zzagg.zzA(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzf", "zzg", zzcn.zza});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzcp();
                    }
/* 12 */            zzcs zzcsVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzcm(zzcsVar);
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
                    synchronized (zzcp.class) {
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
            }
