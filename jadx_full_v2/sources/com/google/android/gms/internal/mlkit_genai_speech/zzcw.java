            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzcw extends zzagg implements zzaho {
                private static final zzcw zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg = 0;
                private Object zzh;
                private int zzi;

                static {
/* 3 */             zzcw zzcwVar = new zzcw();
/* 6 */             zzb = zzcwVar;
/* 10 */            zzagg.zzD(zzcw.class, zzcwVar);
                }

                private zzcw() {
                }

                public static zzcu zza() {
/* 7 */             return (zzcu) zzb.zzo();
                }

                public static void zzd(zzcw zzcwVar, boolean z) {
/* 2 */             zzcwVar.zzg = 1;
/* 6 */             zzcwVar.zzh = Boolean.TRUE;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001:\u0000\u00027\u0000\u00037\u0000\u0004င\u0000", new Object[]{"zzh", "zzg", "zzf", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzcw();
                    }
/* 12 */            zzcv zzcvVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzcu(zzcvVar);
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
                    synchronized (zzcw.class) {
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
