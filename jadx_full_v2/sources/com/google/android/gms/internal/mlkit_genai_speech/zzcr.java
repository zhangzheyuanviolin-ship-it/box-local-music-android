            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzcr extends zzagg implements zzaho {
                private static final zzcr zzb;
                private static volatile zzahv zze;
                private int zzf;
                private int zzg;
                private long zzh;
                private long zzi;

                static {
/* 3 */             zzcr zzcrVar = new zzcr();
/* 6 */             zzb = zzcrVar;
/* 10 */            zzagg.zzD(zzcr.class, zzcrVar);
                }

                private zzcr() {
                }

                public static zzcr zze() {
/* 1 */             return zzb;
                }

                public final long zza() {
/* 1 */             return this.zzh;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 87 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 81 */                return zzagg.zzA(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
                    }
/* 9 */             if (i2 == 3) {
/* 61 */                return new zzcr();
                    }
/* 12 */            zzcs zzcsVar = null;
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzcq(zzcsVar);
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
                    synchronized (zzcr.class) {
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

                public final long zzc() {
/* 1 */             return this.zzi;
                }
            }
