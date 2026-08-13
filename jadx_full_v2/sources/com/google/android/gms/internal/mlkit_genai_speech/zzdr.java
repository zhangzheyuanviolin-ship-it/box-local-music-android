            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdr extends zzagg implements zzaho {
                private static final zzdr zzb;
                private static volatile zzahv zze;
                private Object zzg;
                private int zzf = 0;
                private byte zzh = 2;

                static {
/* 3 */             zzdr zzdrVar = new zzdr();
/* 6 */             zzb = zzdrVar;
/* 10 */            zzagg.zzD(zzdr.class, zzdrVar);
                }

                private zzdr() {
                }

                public static zzdd zza() {
/* 7 */             return (zzdd) zzb.zzo();
                }

                public static zzdr zzd() {
/* 1 */             return zzb;
                }

                public static void zze(zzdr zzdrVar, zzdj zzdjVar) {
/* 1 */             zzdjVar.getClass();
/* 4 */             zzdrVar.zzg = zzdjVar;
/* 7 */             zzdrVar.zzf = 1;
                }

                public static void zzf(zzdr zzdrVar, zzdl zzdlVar) {
/* 1 */             zzdlVar.getClass();
/* 4 */             zzdrVar.zzg = zzdlVar;
/* 7 */             zzdrVar.zzf = 2;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 102 */               return Byte.valueOf(this.zzh);
                    }
/* 6 */             if (i2 == 2) {
/* 95 */                return zzagg.zzA(zzb, "\u0004\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0001\u0001м\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"zzg", "zzf", zzdj.class, zzdl.class, zzdf.class, zzdh.class, zzdp.class});
                    }
/* 9 */             if (i2 == 3) {
/* 69 */                return new zzdr();
                    }
/* 12 */            zzdq zzdqVar = null;
/* 13 */            if (i2 == 4) {
/* 63 */                return new zzdd(zzdqVar);
                    }
/* 16 */            if (i2 == 5) {
/* 58 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 26 */                this.zzh = obj == null ? (byte) 0 : (byte) 1;
/* 12 */                return null;
                    }
/* 29 */            zzahv zzahvVar = zze;
/* 31 */            if (zzahvVar != null) {
/* 57 */                return zzahvVar;
                    }
                    synchronized (zzdr.class) {
                        try {
/* 36 */                    zzagbVar = zze;
/* 38 */                    if (zzagbVar == null) {
/* 44 */                        zzagbVar = new zzagb(zzb);
/* 47 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 56 */                    throw th;
                        }
                    }
/* 54 */            return zzagbVar;
                }
            }
